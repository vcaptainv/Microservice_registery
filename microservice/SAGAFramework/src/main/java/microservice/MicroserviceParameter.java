package microservice;

public class MicroserviceParameter {
    private String name;
    private String type;
    private String defaultValue;

    private String value;

    public MicroserviceParameter(String name, String type, String defaultValue) {
        this.name = name;
        this.type = type;
        this.defaultValue = defaultValue;
    }
}
