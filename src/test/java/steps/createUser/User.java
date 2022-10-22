package steps.createUser;

import org.json.JSONObject;

import com.github.javafaker.Faker;

public class User {
    Faker data = new Faker();
    String name;
    String gender;
    String email;
    String status;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public JSONObject payloadCreateUser() {    
        JSONObject payload = new JSONObject();
        payload.put("name", getName());
        payload.put("gender", getGender());
        payload.put("email", getEmail());
        payload.put("status", getStatus());
        return payload;
    }
}
