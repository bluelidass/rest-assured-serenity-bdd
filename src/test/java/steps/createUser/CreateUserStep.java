package steps.createUser;

import com.github.javafaker.Faker;

import base.BasePath;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.common.Request;
import steps.common.Response;
import static steps.common.Header.*;

public class CreateUserStep {
    @Steps
    Request request;

    @Steps
    Response response;

    Faker data = new Faker();
    User user = new User();

    @Given("a {string} user with status to {string}")
    public void setUserStatus(String gender, String status) {
        user.setName(data.name().fullName());
        user.setEmail(data.internet().emailAddress());
        user.setGender(gender.toLowerCase());
        user.setStatus(status);
    }

    @When("send request to create the user")
    public void createUser() {
        request.post(user.payloadCreateUser().toString(), BasePath.USERS, addHeaderWithAuth());
    }

    @When("send request to create the user without auth token")
    public void createUserWithoutAuth() {
        request.post(user.payloadCreateUser().toString(), BasePath.USERS, addBasicHeader());
    }

    @When("send request to create user with empty payload")
    public void createUserWithoutPayload() {
        request.post("", BasePath.USERS, addHeaderWithAuth());
    }

    @When("send request to create user without name")
    public void createUserWithoutName() {
        String payload = (user.payloadCreateUser().put("name", "")).toString();
        System.out.println(payload);
        request.post(payload, BasePath.USERS, addHeaderWithAuth());
    }

    @Then("the message properties are can't be blank")
    public void verifyResponseWithEmptyPayload() {
        response.verifyResponsePropertyItemsContains("message", "can't be blank", "can be male of female");
    }

    @Then("the {string} field contains message to {string}")
    public void verifyErrorMessage(String expectedField, String expectedString){
        response.verifyResponsePropertyContains("[0].field", expectedField);
        response.verifyResponsePropertyContains("[0].message", expectedString);
    }
}
