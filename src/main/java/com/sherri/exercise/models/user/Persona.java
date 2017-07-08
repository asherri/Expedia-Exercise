
package com.sherri.exercise.models.user;

import java.util.HashMap;
import java.util.Map;

public class Persona {

    private String personaType;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getPersonaType() {
        return personaType;
    }

    public void setPersonaType(String personaType) {
        this.personaType = personaType;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
