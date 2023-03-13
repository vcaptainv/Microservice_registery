package saga;

import org.jboss.logging.Message;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class SimpleSagaDefinition<Data> implements SagaDefinition<Data> {

    private final SagaStep<Data> firstStep;
    public SimpleSagaDefinition(SagaStep<Data> firstStep) {
        this.firstStep = firstStep;
    }

    @Override
    public SagaActions<Data> start(Data sagaData) {
        SagaActions<Data> actions = new SagaActions<Data>();
        SagaStep<Data> currentStep = firstStep;
        while(currentStep != null) {
            actions = currentStep.execute(sagaData, actions);
            currentStep = currentStep.getNextStep();
        }
        return actions;
    }

    @Override
    public SagaActions<Data> handleReply(String sagaType, String sagaId, String currentState, Data sagaData, Message message) {
        return null;
    }
}
