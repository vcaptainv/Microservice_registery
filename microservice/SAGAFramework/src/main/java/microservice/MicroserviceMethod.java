package microservice;

import java.util.List;
import java.util.UUID;

public class MicroserviceMethod {
    private String name;
    private UUID id;

    private List<MicroserviceParameter> parameters;

    public MicroserviceMethod(String name) {
        this.name = name;
    }

}
