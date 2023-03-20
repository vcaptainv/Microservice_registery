package saga;


public class SimpleSagaDefinitionBuilder<Data> {

    private SagaStep<Data> firstStep;

    private SagaStep<Data> currentStep;

    public SimpleSagaDefinitionBuilder() {
    }

    public SagaDefinition<Data> build() {
        return new SimpleSagaDefinition<>(firstStep);
    }

    public void setFirstStep(SagaStep<Data> firstStep) {
        this.firstStep = firstStep;
    }

    public SagaStep<Data> getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(SagaStep<Data> currentStep) {
        this.currentStep = currentStep;
    }
}
