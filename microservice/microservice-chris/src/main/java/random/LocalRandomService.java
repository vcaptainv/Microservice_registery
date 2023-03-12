package random;

import java.util.Random;

public class LocalRandomService implements RandomService {
    private final Random random;

    public LocalRandomService() {
        random = new Random();
    }

    @Override
    public int getRandomInteger(int min, int max) {
        System.out.println("LocalRandomService.getRandomInteger(" + min + ", " + max + ")");
        return random.nextInt(max - min) + min;
    }

    @Override
    public float getRandomFloat(float min, float max) {
        return random.nextFloat() * (max - min) + min;
    }

    @Override
    public double getRandomDouble(double min, double max) {
        return random.nextDouble() * (max - min) + min;
    }

}
