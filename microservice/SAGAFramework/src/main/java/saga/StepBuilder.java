package saga;

import java.util.Optional;
import java.util.function.Consumer;

public class StepBuilder<Data> {
    private Optional<Consumer<Data>> compensation = Optional.empty();
    private Consumer<Data> localFunction;

    public StepBuilder(Consumer<Data> localFunction) {
        this.localFunction = localFunction;
    }

    public StepBuilder() {
    }

    public StepBuilder<Data> invokeLocal(Consumer<Data> localFunction) {
        return new StepBuilder<Data>(localFunction);
    }

    public StepBuilder<Data> withCompensation(Consumer<Data> localCompensation) {
        this.compensation = Optional.of(localCompensation);
        return this;
    }


    public StepBuilder<Data> step() {
        return new StepBuilder();
    }

    public SagaDefinition<Data> build() {
        return null;
    }
}
