package steps.common;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static base.EnvironmentVariable.*;

import java.util.Map;

public class Request {
    @Step
    public void get(String basePath) {
        SerenityRest.given().baseUri(BASE_URL).get(basePath);
    }

    @Step
    public void post(String payload, String basePath, Map<String, String> headers) {
        SerenityRest.given().baseUri(BASE_URL)
                .headers(headers)
                .body(payload)
                .when().post(basePath);
    }
}
