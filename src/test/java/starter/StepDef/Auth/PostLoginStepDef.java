package starter.StepDef.Auth;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.AuthAPI;
import starter.Utils.Constants;

import java.io.File;

public class PostLoginStepDef {
    @Steps
    AuthAPI authAPI;

    @Given("Post login student with valid and complete JSON body")
    public void postLoginStudentWithValidAndCompleteJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostLoginStudentReqBody.json");
        authAPI.postLogin(json);
    }

    @When("Send POST request for login")
    public void sendPOSTRequestForLogin() {
        SerenityRest.when().post(AuthAPI.POST_LOGIN);
    }

    @Given("Post login student with invalid data")
    public void postLoginStudentWithInvalidData() {
        File json = new File(Constants.REQ_BODY_DIR+"PostLoginStudentInvReqBody.json");
        authAPI.postLogin(json);
    }

    @Given("Post login student with incomplete JSON body")
    public void postLoginStudentWithIncompleteJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostLoginStudentIncReqBody.json");
        authAPI.postLogin(json);
    }

    @Given("Post login student with invalid JSON body")
    public void postLoginStudentWithInvalidJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostLoginStudentInvJSONReqBody.json");
        authAPI.postLogin(json);
    }

    @Given("Post login student with blank JSON body")
    public void postLoginStudentWithBlankJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"BlankLoginReqBody.json");
        authAPI.postLogin(json);
    }

    @Given("Post login student with invalid parameter page")
    public void postLoginStudentWithInvalidParameterPage() {
        File json = new File(Constants.REQ_BODY_DIR+"PostLoginStudentReqBody.json");
        authAPI.postLogin(json);
    }

    @When("Send POST request for login invalid")
    public void sendPOSTRequestForLoginInvalid() {
        SerenityRest.when().post(AuthAPI.POST_LOGIN_INV);
    }

    @Given("Post login mentor with valid and complete JSON body")
    public void postLoginMentorWithValidAndCompleteJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostLoginMentorReqBody.json");
        authAPI.postLogin(json);
    }

    @Given("Post login mentor with invalid data")
    public void postLoginMentorWithInvalidData() {
        File json = new File(Constants.REQ_BODY_DIR+"PostLoginMentorInvReqBody.json");
        authAPI.postLogin(json);
    }

    @Given("Post login mentor with incomplete JSON body")
    public void postLoginMentorWithIncompleteJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostLoginMentorIncReqBody.json");
        authAPI.postLogin(json);
    }

    @Given("Post login mentor with invalid JSON body")
    public void postLoginMentorWithInvalidJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostLoginMentorInvJSONReqBody.json");
        authAPI.postLogin(json);
    }

    @Given("Post login mentor with blank JSON body")
    public void postLoginMentorWithBlankJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"BlankLoginReqBody.json");
        authAPI.postLogin(json);
    }

    @Given("Post login mentor with invalid parameter page")
    public void postLoginMentorWithInvalidParameterPage() {
        File json = new File(Constants.REQ_BODY_DIR+"PostLoginMentorReqBody.json");
        authAPI.postLogin(json);
    }
}
