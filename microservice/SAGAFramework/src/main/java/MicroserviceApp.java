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

}
