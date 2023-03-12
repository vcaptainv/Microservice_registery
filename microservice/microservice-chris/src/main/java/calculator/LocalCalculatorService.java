package calculator;

public class LocalCalculatorService implements CalculatorService{
    @Override
    public float add(float a, float b) {
        return a + b;
    }

    @Override
    public float subtract(float a, float b) {
        return a - b;
    }

    @Override
    public float multiply(float a, float b) {
        System.out.println("LocalCalculatorService.multiply(" + a + ", " + b + ")");
        return a * b;
    }

    @Override
    public float divide(float a, float b) {
        return a / b;
    }
}
