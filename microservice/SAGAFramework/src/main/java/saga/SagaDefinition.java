package saga;

public interface SagaDefinition<Data> {

    SagaActions<Data> start(Data sagaData);

    SagaActions<Data> startCompensation(SagaStep<Data> currentStep, Data sagaData, SagaActions<Data> actions);

    SagaActions<Data> handleReply(String sagaType, String sagaId, String currentState, Data sagaData);

}

