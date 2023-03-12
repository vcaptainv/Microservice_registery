package saga;

import org.jboss.logging.Message;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class SimpleSagaDefinition<Data> implements SagaDefinition<Data> {

    private final List<SagaStep> steps;
    public SimpleSagaDefinition(List<SagaStep> steps) {
        this.steps = steps;
    }

    @Override
    public SagaActions<Data> start(Data sagaData) {
        SagaActions<Data> actions = new SagaActions<Data>();
        for (SagaStep step : steps) {
            actions = step.execute(sagaData, actions);
        }
        return actions;
    }

    @Override
    public SagaActions<Data> handleReply(String sagaType, String sagaId, String currentState, Data sagaData, Message message) {
        return null;
    }
}
