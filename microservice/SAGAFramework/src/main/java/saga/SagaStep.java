package saga;

import lombok.Getter;
import lombok.Setter;

import java.util.function.Consumer;

public class SagaStep<T> {

    private Consumer<T> method;
    private Consumer<T> compensation;

    @Setter
    @Getter
    private SagaStep<T> nextStep;
    @Setter
    private SagaStep<T> previousStep;

    public SagaStep(Consumer<T> method, Consumer<T> compensation) {
        this.method = method;
        this.compensation = compensation;
    }

    public <Data> SagaActions<Data> execute(T sagaData, SagaActions<Data> actions) {
        this.method.accept(sagaData);
        return actions;
    }



    // we need an invocation and a compensation.
}
