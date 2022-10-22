package steps.common;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;
import base.ResponseProperty.Property;

import io.cucumber.java.en.Then;

public class Response {
    @Then("the response status code is {int}")
    public void verifyResponseStatusCode(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

    @Then("the response message is {string}")
    public void verifyResponseMessage(String expectedMessage) {
        restAssuredThat(response -> response
                .body(Property.MESSAGE.toString(), containsStringIgnoringCase(expectedMessage)));
    }

    @Then("the response property {string} contains {string}")
    public void verifyResponsePropertyContains(String jsonPath, String expectedMessage) {
        restAssuredThat(response -> response
                .body(jsonPath, containsStringIgnoringCase(expectedMessage)));
    }

    @Then("the {string} items are all matched by {string}")
    public void verifyResponsePropertyItemsContains(String jsonPath, String expectedString1, String expectedString2) {
        restAssuredThat(response -> response.body(jsonPath,
                everyItem(either(containsString(expectedString1)).or(containsString(expectedString2)))));
    }
}
