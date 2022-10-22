package steps.listUsers;

import steps.common.Request;
import steps.common.Response;
import base.BasePath;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ListUsersStep {
    @Steps
    Request request;

    @Steps
    Response response;

    @When("send request to get list users")
    public void getListUsers(){
        request.get(BasePath.USERS);
    }
}
