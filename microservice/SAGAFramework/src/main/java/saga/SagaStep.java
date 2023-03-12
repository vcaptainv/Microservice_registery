package saga;

public class SagaStep {
    public <Data> SagaActions<Data> execute(Data sagaData, SagaActions<Data> actions) {
        return null;
    }
    // we need an invocation and a compensation.
}
