import calculator.CalculatorService;
import calculator.LocalCalculatorService;
import random.LocalRandomService;
import random.RandomService;
import saga.Saga;

import java.lang.reflect.InvocationTargetException;

public class SagaExample implements SagaInitializer {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        System.out.println("Starting SagaExample...");
        SagaFramework.initialize(new SagaExample());
        SagaFramework.registerService(RandomService.class, new LocalRandomService());
        SagaFramework.registerService(CalculatorService.class, new LocalCalculatorService());

        // example of what has to happen
        RandomService randomService = SagaFramework.getService(RandomService.class);
        CalculatorService calculatorService = SagaFramework.getService(CalculatorService.class);

        // big multiline print saying running normally
        System.out.println(" ###########################################\n" +
                " ###########################################\n" +
                " ###########################################\n" +
                " ################## running normally ############\n" +
                " ###########################################\n" +
                " ###########################################\n" +
                " ###########################################\n");




        /* start */
        int random1 = randomService.getRandomInteger(10,20);
        int random2 = randomService.getRandomInteger(5,8);
        float result = calculatorService.multiply(random1, random2);
        System.out.println("Result: " + result);
        /* end */
        System.out.println(" ###########################################\n" +
                " ###########################################\n" +
                " ###########################################\n" +
                " ################## running saga ############\n" +
                " ###########################################\n" +
                " ###########################################\n" +
                " ###########################################\n");

        Saga<MultiplyRandomNumbersSagaData> multiplyRandomNumbersSaga = new MultiplyRandomNumbersSaga();
        Saga<MultiplyRandomNumbersSagaData> multiplyRandomNumbersSagaFailed = new MultiplyRandomNumbersSagaFailed();
        /* start */
        //SagaFramework.invokeSaga(multiplyRandomNumbersSaga, MultiplyRandomNumbersSagaData.class);
        /* end */

        SagaFramework.invokeSaga(multiplyRandomNumbersSagaFailed, MultiplyRandomNumbersSagaData.class);

        System.out.println("SagaExample finished");
    }
}
