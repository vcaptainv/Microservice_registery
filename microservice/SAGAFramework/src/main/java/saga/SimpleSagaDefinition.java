package saga;


import java.util.Optional;
import java.util.function.Consumer;

public class SimpleSagaDefinition<Data> implements SagaDefinition<Data> {

    private final SagaStep<Data> firstStep;

    private final Consumer<Data> cleanupFunction;

    public SimpleSagaDefinition(SagaStep<Data> firstStep, Consumer<Data> cleanupFunction) {
        this.firstStep = firstStep;
        this.cleanupFunction = cleanupFunction;
    }

    @Override
    public SagaActions<Data> start(Data sagaData) {
        SagaActions<Data> actions = new SagaActions<>();
        SagaStep<Data> currentStep = firstStep;
        while(currentStep != null) {
            try {
                actions = currentStep.execute(sagaData, actions);
            } catch (RuntimeException e){
                System.out.println("FAILED");
                System.out.println(e.getMessage());
                actions.setFailed(true);
                actions.setLocalException(Optional.of(e));
                return this.startCompensation(currentStep, sagaData, actions);
            }
            currentStep = currentStep.getNextStep();
        }
        if(cleanupFunction != null) {
            cleanupFunction.accept(sagaData);
        }
        return actions;
    }

    @Override
    public SagaActions<Data> startCompensation(SagaStep<Data> currentStep, Data sagaData, SagaActions<Data> actions) {
        while(currentStep != null) {
            actions = currentStep.runCompensation(sagaData, actions);
            currentStep = currentStep.getPreviousStep();
        }
        if(cleanupFunction != null) {
            cleanupFunction.accept(sagaData);
        }
        return actions;
    }

    @Override
    public SagaActions<Data> handleReply(String sagaType, String sagaId, String currentState, Data sagaData) {
        return null;
    }
}
