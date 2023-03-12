package saga;


import org.jboss.logging.Message;

public interface SagaDefinition<Data> {

    SagaActions<Data> start(Data sagaData);

    SagaActions<Data> handleReply(String sagaType, String sagaId, String currentState, Data sagaData, Message message);

}

