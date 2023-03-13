package saga;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class SimpleSagaDefinitionBuilder<Data> {
    @Setter
    private SagaStep<Data> firstStep;

    @Getter
    @Setter
    private SagaStep<Data> currentStep;

    public SimpleSagaDefinitionBuilder() {
    }

    public SagaDefinition<Data> build() {
        return new SimpleSagaDefinition<>(firstStep);
    }
}
