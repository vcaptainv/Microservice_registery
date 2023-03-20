package saga;

import java.util.Optional;
import java.util.function.Consumer;

public class StepBuilder<Data> {
    private SimpleSagaDefinitionBuilder<Data> builder;
    private Optional<Consumer<Data>> compensation = Optional.empty();
    private Consumer<Data> localFunction;

    public StepBuilder(Consumer<Data> localFunction) {
        this.localFunction = localFunction;
    }

    public StepBuilder(SimpleSagaDefinitionBuilder<Data> builder) {
        this.builder = builder;
    }

    public StepBuilder() {
    }

    public StepBuilder<Data> invokeLocal(Consumer<Data> localFunction) {
       this.localFunction = localFunction;
       return this;
    }

    public StepBuilder<Data> withCompensation(Consumer<Data> localCompensation) {
        this.compensation = Optional.of(localCompensation);
        return this;
    }


    public StepBuilder<Data> step() {
        buildCurrentStep();
        return new StepBuilder<>(builder);
    }

    public SagaDefinition<Data> build() {
        buildCurrentStep();
        return builder.build();
    }

    private void buildCurrentStep(){
        SagaStep<Data> step = new SagaStep<>(this.localFunction, this.compensation.orElse(null));
        SagaStep<Data> currentBuilderStep = builder.getCurrentStep();
        step.setPreviousStep(currentBuilderStep);
        if(currentBuilderStep != null){
            currentBuilderStep.setNextStep(step);
        } else {
            builder.setFirstStep(step);
        }
        builder.setCurrentStep(step);
    }

    public StepBuilder<Data> invokeFinally(Consumer<Data> cleanupFunction) {
        builder.setCleanupFunction(cleanupFunction);
        return this;
    }
}
