import calculator.CalculatorService;
import calculator.LocalCalculatorService;
import lombok.Data;
import random.LocalRandomService;
import random.RandomService;
import saga.Saga;

import java.util.UUID;

public class SagaExample implements SagaInitializer {
    public static void main(String[] args) {
        System.out.println("Starting SagaExample...");
        SagaFramework.initialize(new SagaExample());
        SagaFramework.registerService(RandomService.class, new LocalRandomService());
        SagaFramework.registerService(CalculatorService.class, new LocalCalculatorService());
        Saga<?> multiplyRandomNumbersSaga = new MultiplyRandomNumbersSaga();
        UUID sagaID = SagaFramework.registerSaga("multiplyRandomNumbers", multiplyRandomNumbersSaga);

        // example of what has to happen
        RandomService randomService = SagaFramework.getService(RandomService.class);
        CalculatorService calculatorService = SagaFramework.getService(CalculatorService.class);

        int random1 = randomService.getRandomInteger(10,20);
        int random2 = randomService.getRandomInteger(5,8);
        float result = calculatorService.multiply(random1, random2);
        System.out.println("Result: " + result);


        SagaFramework.invokeSaga(multiplyRandomNumbersSaga);
        System.out.println("SagaExample finished");
    }
}
