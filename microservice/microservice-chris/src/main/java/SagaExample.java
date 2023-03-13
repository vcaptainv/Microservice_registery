import calculator.CalculatorService;
import calculator.LocalCalculatorService;
import lombok.Data;
import microservice.MicroserviceApp;
import random.LocalRandomService;
import random.RandomService;
import saga.Saga;

import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

public class SagaExample implements SagaInitializer {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        System.out.println("Starting SagaExample...");
        SagaFramework.initialize(new SagaExample());
        SagaFramework.registerService(RandomService.class, new LocalRandomService());
        SagaFramework.registerService(CalculatorService.class, new LocalCalculatorService());
        Saga<MultiplyRandomNumbersSagaData> multiplyRandomNumbersSaga = new MultiplyRandomNumbersSaga();

        // example of what has to happen
        RandomService randomService = SagaFramework.getService(RandomService.class);
        CalculatorService calculatorService = SagaFramework.getService(CalculatorService.class);


        /* start */
        int random1 = randomService.getRandomInteger(10,20);
        int random2 = randomService.getRandomInteger(5,8);
        float result = calculatorService.multiply(random1, random2);
        System.out.println("Result: " + result);
        /* end */

        /* start */
        SagaFramework.invokeSaga(multiplyRandomNumbersSaga, MultiplyRandomNumbersSagaData.class);
        /* end */

        System.out.println("SagaExample finished");
    }
}
