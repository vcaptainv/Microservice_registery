import lombok.Data;
import saga.Saga;

import java.util.UUID;

public class SagaFramework {
    private SagaInitializer sagaInitializer;
    private AppRegistry appRegistry;


    private static SagaFramework sagaFramework;

    public SagaFramework(SagaInitializer sagaInitializer) {
        this.sagaInitializer = sagaInitializer;
        this.appRegistry = AppRegistry.getInstance();
    }
    public static void initialize(SagaInitializer initializer) {
        System.out.println("SagaFramework.initialize() called");
        SagaFramework sagaFramework = new SagaFramework(initializer);

        setInstance(sagaFramework);
    }

    private static void setInstance(SagaFramework sagaFramework) {
        SagaFramework.sagaFramework = sagaFramework;
    }

    public static SagaFramework getInstance() {
        return sagaFramework;
    }

    public static UUID registerSaga(String sagaName, Saga saga) {
        System.out.println("SagaFramework.registerSaga() called");

        return UUID.randomUUID();
    }

    public static void registerService(Class<?> randomServiceClass, Object localRandomService) {
        System.out.println("SagaFramework.registerService() called");
        getInstance().getAppRegistry().registerService(randomServiceClass, localRandomService);
    }

    // return service with generic type
    public static <T> T getService(Class<T> serviceClass) {
        System.out.println("SagaFramework.getService() called");
        return getInstance().getAppRegistry().getService(serviceClass);
    }

    public static void invokeSaga(Saga<?> multiplyRandomNumbersSaga) {

    }

    private AppRegistry getAppRegistry() {
        return appRegistry;
    }
}