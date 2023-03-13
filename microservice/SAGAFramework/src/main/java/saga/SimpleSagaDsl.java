package saga;
public interface SimpleSagaDsl<Data> {
    default StepBuilder<Data> step() {
        SimpleSagaDefinitionBuilder<Data> builder = new SimpleSagaDefinitionBuilder<Data>();
        return new StepBuilder<>(builder);
    }
}