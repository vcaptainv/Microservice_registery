import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import registry.RegistryServiceGrpc;
import registry.Registry.RegistryRequest;
import registry.Registry.RegistryResponse;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class RegistryServer {

        public static class Service {
                private String serviceName;
                private String serviceAddress;
                private int servicePort;

                public Service(String serviceName, String serviceAddress, int servicePort) {
                        this.serviceName = serviceName;
                        this.serviceAddress = serviceAddress;
                        this.servicePort = servicePort;
                }

                public String getServiceName() {
                        return serviceName;
                }

                public String getServiceAddress() {
                        return serviceAddress;
                }

                public int getServicePort() {
                        return servicePort;
                }
        }

        public static class RegistryServiceImpl extends RegistryServiceGrpc.RegistryServiceImplBase {

                @Override
                public void registerService(RegistryRequest request,
                                StreamObserver<RegistryResponse> responseObserver) {
                        // Extract data from the request
                        String serviceName = request.getServiceName();
                        String serviceAddress = request.getServiceAddress();
                        int servicePort = request.getServicePort();
                        String serviceID = UUID.randomUUID().toString();
                        // TODO: Save the received service information to a data structure, like a
                        // HashMap.
                        // The key should be the service name, and the value should be a Service
                        // object.
                        // You can use the Service class defined above.
                        Map<String, Service> services = new HashMap<>();
                        services.put(serviceID, new Service(serviceName, serviceAddress, servicePort));

                        // Build the response
                        RegistryResponse response = RegistryResponse.newBuilder()
                                        .setServiceID(serviceID)
                                        .build();

                        // Send the response
                        responseObserver.onNext(response);
                        responseObserver.onCompleted();
                }
        }

        public static void main(String[] args) throws IOException, InterruptedException {
                int port = 40001;
                Server server = ServerBuilder.forPort(port)
                                .addService(new RegistryServiceImpl())
                                .build()
                                .start();
                System.out.println("Server started, listening on " + port);

                Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                        System.out.println("Received shutdown request. Stopping server...");
                        server.shutdown();
                        System.out.println("Server stopped.");
                }));

                server.awaitTermination();
        }
}
