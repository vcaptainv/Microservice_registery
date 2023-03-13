import microservice.MicroserviceApp;
import microservice.MicroserviceMethod;
import microservice.MicroserviceParameter;

import java.util.HashMap;
import java.util.Map;

/**
 * Singleton class to register the application
 * with the SAGA framework
 */
public class AppRegistry {
    private static AppRegistry instance;


    // Map of services
    private Map<Class<?>, Object> services;
    private Map<String, MicroserviceApp> remoteServices;
    private AppRegistry() {
        this.services = new HashMap<>();
    }
    public static AppRegistry getInstance() {
        if (instance == null) {
            instance = new AppRegistry();
        }
        return instance;
    }
    public void registerMicroserviceApp(String appName, String appUrl) {
        System.out.println("AppRegistry.registerMicroserviceApp() called");
    }


    public void registerService(Class<?> randomServiceClass, Object localRandomService) {
        System.out.println("AppRegistry.registerService() called");
        services.put(randomServiceClass, localRandomService);
    }

    public <T> T getService(Class<T> serviceClass) {
        System.out.println("AppRegistry.getService() called");
        if(services.containsKey(serviceClass)){
            Object service = services.get(serviceClass);
            if(service != null){
                return (T) service;
            }
        }
        return null;
    }

    public MicroserviceApp getService(String appName) {
        return remoteServices.get(appName);
    }
}
