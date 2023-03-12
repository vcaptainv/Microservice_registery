package com.microservice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MicroserviceRegistry {
    public Map<String, Microservice> microserviceMap;

    public MicroserviceRegistry() {
        microserviceMap = new HashMap<>();
    }

    public void registerMicroservice(Microservice microservice) {
        microserviceMap.put(microservice.id, microservice);
    }
}

class Microservice {
    String id;
    List<MicroserviceMethod> methodList;
}

class MicroserviceMethod {
    String name;
    String id;
    String returnType;
    List<MicroserviceMethodParameter> parameterList;
}

class MicroserviceMethodParameter {
    String name;
    String type;

    Object defaultValue;
}
