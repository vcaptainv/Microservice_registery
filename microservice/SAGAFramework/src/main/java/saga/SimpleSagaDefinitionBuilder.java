package saga;


import java.util.function.Consumer;

public class SimpleSagaDefinitionBuilder<Data> {

    private SagaStep<Data> firstStep;

    private SagaStep<Data> currentStep;

    private Consumer<Data> cleanupFunction;

    public SimpleSagaDefinitionBuilder() {
    }

    public SagaDefinition<Data> build() {
        return new SimpleSagaDefinition<>(firstStep, cleanupFunction);
    }

    public void setFirstStep(SagaStep<Data> firstStep) {
        this.firstStep = firstStep;
    }

    public SagaStep<Data> getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(SagaStep<Data> currentStep) {
        this.currentStep = currentStep;
    }

    public void setCleanupFunction(Consumer<Data> cleanupFunction) {
        this.cleanupFunction = cleanupFunction;
    }
}
