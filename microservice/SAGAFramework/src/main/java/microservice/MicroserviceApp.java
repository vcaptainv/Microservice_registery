package microservice;


import java.util.List;
import java.util.UUID;

public class MicroserviceApp {
    private String name;
    private String url;
    private UUID id;

    private List<MicroserviceMethod> methods;

    public MicroserviceApp(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<MicroserviceMethod> getMethods() {
        return methods;
    }

    public void setMethods(List<MicroserviceMethod> methods) {
        this.methods = methods;
    }
}
