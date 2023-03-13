import microservice.MicroserviceApp;
import saga.Saga;
import saga.SagaActions;

import java.lang.reflect.InvocationTargetException;

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


        // TODO create gRPC server


        setInstance(sagaFramework);
    }

    private static void setInstance(SagaFramework sagaFramework) {
        SagaFramework.sagaFramework = sagaFramework;
    }

    public static SagaFramework getInstance() {
        return sagaFramework;
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

    public static <Data> SagaActions<Data> invokeSaga(Saga<Data> saga, Class<Data> dataClass) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        System.out.println("SagaFramework.invokeSaga() called");
        Data data = dataClass.getDeclaredConstructor().newInstance();
        return saga.getSagaDefinition().start(data);
    }


    private AppRegistry getAppRegistry() {
        return appRegistry;
    }
}