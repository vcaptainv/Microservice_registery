

import calculator.CalculatorService;
import random.RandomService;
import saga.SagaDefinition;
import saga.SimpleSaga;

import java.util.List;

/**
 * Create and define the process of an orchestration-based order saga which implements
 * SimpleSaga with order saga data object.
 */
public class MultiplyRandomNumbersSaga implements SimpleSaga<MultiplyRandomNumbersSagaData> {

    public MultiplyRandomNumbersSaga() {
        System.out.println("MultiplyRandomNumbersSaga constructor");
    }

    private final SagaDefinition<MultiplyRandomNumbersSagaData> sagaDefinition = step()
            .invokeLocal(this::generateRandomNumbers)
            .withCompensation(this::compensate)
            .step()
            .invokeLocal(this::multiplyRandomNumbers)
            .withCompensation(this::compensate)
            .step()
            .invokeLocal(this::printResult)
            .build();

    private void printResult(MultiplyRandomNumbersSagaData multiplyRandomNumbersSagaData) {
        System.out.println("Number 1: " + multiplyRandomNumbersSagaData.getNumber1());
        System.out.println("Number 2: " + multiplyRandomNumbersSagaData.getNumber2());
        System.out.println("Result: " + multiplyRandomNumbersSagaData.getResult());
    }

    private void multiplyRandomNumbers(MultiplyRandomNumbersSagaData multiplyRandomNumbersSagaData) {
        System.out.println("Multiply random numbers");
        CalculatorService service = SagaFramework.getService(CalculatorService.class);
        float result = service.multiply(multiplyRandomNumbersSagaData.getNumber1(), multiplyRandomNumbersSagaData.getNumber2());
        multiplyRandomNumbersSagaData.setResult((int) result);
    }

    private void compensate(MultiplyRandomNumbersSagaData multiplyRandomNumbersSagaData) {
        System.out.println("Compensate");
    }

    private void generateRandomNumbers(MultiplyRandomNumbersSagaData multiplyRandomNumbersSagaData) {
        System.out.println("Generate random numbers");
        RandomService service = SagaFramework.getService(RandomService.class);
        int randomInteger = service.getRandomInteger(10, 20);
        int randomInteger2 = service.getRandomInteger(10, 20);
        multiplyRandomNumbersSagaData.setNumber1(randomInteger);
        multiplyRandomNumbersSagaData.setNumber2(randomInteger2);
    }

    /**
     * Get saga definition that defined every step in the orchestration
     *
     * @return SagaDefinition
     */
    @Override
    public SagaDefinition<MultiplyRandomNumbersSagaData> getSagaDefinition() {
        return this.sagaDefinition;
    }


}