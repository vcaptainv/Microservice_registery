package calculator;

import calculator.CalculatorGrpc;
import calculator.CalculatorOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.netty.NettyChannelBuilder;

public class RemoteCalculatorService implements CalculatorService{
    private final CalculatorGrpc.CalculatorBlockingStub blockingStub;

    public RemoteCalculatorService(String target) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(
                "localhost", 50051).usePlaintext()
                .build();
        blockingStub = CalculatorGrpc.newBlockingStub(channel);
    }

    @Override
    public float add(float a, float b) {
        CalculatorOuterClass.Request request = CalculatorOuterClass.Request.newBuilder()
                .setFirstNumber((int) a)
                .setSecondNumber((int) b)
                .build();
        CalculatorOuterClass.Response response = blockingStub.add(request);
        return response.getResult();
    }

    @Override
    public float subtract(float a, float b) {
        CalculatorOuterClass.Request request = CalculatorOuterClass.Request.newBuilder()
                .setFirstNumber((int) a)
                .setSecondNumber((int) b)
                .build();
        CalculatorOuterClass.Response response = blockingStub.subtract(request);
        return response.getResult();
    }

    @Override
    public float multiply(float a, float b) {
        CalculatorOuterClass.Request request = CalculatorOuterClass.Request.newBuilder()
                .setFirstNumber((int) a)
                .setSecondNumber((int) b)
                .build();
        System.out.println("here");
        CalculatorOuterClass.Response response = blockingStub.multiply(request);
        System.out.println("Response: " + response.getResult());
        return response.getResult();
    }

    @Override
    public float divide(float a, float b) {
        CalculatorOuterClass.Request request = CalculatorOuterClass.Request.newBuilder()
                .setFirstNumber((int) a)
                .setSecondNumber((int) b)
                .build();
        CalculatorOuterClass.Response response = blockingStub.divide(request);
        return response.getResult();
    }
}
