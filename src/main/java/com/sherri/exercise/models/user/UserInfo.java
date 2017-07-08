
package com.sherri.exercise.models.user;

import java.util.HashMap;
import java.util.Map;

public class UserInfo {

    private Persona persona;
    private String userId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
