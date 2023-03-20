package saga;

import java.util.Optional;
import java.util.function.Consumer;

public class SagaStep<T> {

    private Consumer<T> method;
    private Consumer<T> compensation;

    private SagaStep<T> nextStep;

    private SagaStep<T> previousStep;

    public SagaStep(Consumer<T> method, Consumer<T> compensation) {
        this.method = method;
        this.compensation = compensation;
    }

    public <Data> SagaActions<Data> execute(T sagaData, SagaActions<Data> actions) {
        this.method.accept(sagaData);
        return actions;
    }


    protected <Data> SagaActions<Data> runCompensation(T sagaData, SagaActions<Data> actions) {
        if(this.compensation != null) {
            this.compensation.accept(sagaData);
        }
        return actions;
    }

    public SagaStep<T> getNextStep() {
        return nextStep;
    }
    public SagaStep<T> getPreviousStep() {
        return previousStep;
    }

    public void setNextStep(SagaStep<T> nextStep) {
        this.nextStep = nextStep;
    }

    public void setPreviousStep(SagaStep<T> previousStep) {
        this.previousStep = previousStep;
    }


    // we need an invocation and a compensation.
}
