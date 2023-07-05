package starter.StepDef.Auth;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.jruby.ext.fiber.ThreadFiber;
import starter.MusicLab.AuthAPI;
import starter.Utils.Constants;

import java.io.File;

public class PostRegisterStepDef {
    @Steps
    AuthAPI authAPI;
    @Given("Post register student with valid and complete JSON body")
    public void postRegisterStudentWithValidAndCompleteJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostRegisterStudentReqBody.json");
        authAPI.postRegister(json);
    }

    @When("Send POST request for register")
    public void sendPOSTRequestForRegister() {
        SerenityRest.when().post(AuthAPI.POST_REGISTER);
    }

    @Given("Post register student with invalid data")
    public void postRegisterStudentWithInvalidData() {
        File json = new File(Constants.REQ_BODY_DIR+"PostRegisterStudentInvReqBody.json");
        authAPI.postRegister(json);
    }

    @Given("Post register student with incomplete JSON body")
    public void postRegisterStudentWithIncompleteJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostRegisterStudentIncReqBody.json");
        authAPI.postRegister(json);
    }

    @Given("Post register student with invalid JSON body")
    public void postRegisterStudentWithInvalidJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostRegisterStudentInvJSONReqBody.json");
        authAPI.postRegister(json);
    }

    @Given("Post register student with blank JSON body")
    public void postRegisterStudentWithBlankJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"BlankRegisterReqBody.json");
        authAPI.postRegister(json);
    }

    @Given("Post register student with invalid parameter page")
    public void postRegisterStudentWithInvalidParameterPage() {
        File json = new File(Constants.REQ_BODY_DIR+"PostRegisterStudentReqBody.json");
        authAPI.postRegister(json);
    }

    @When("Send POST request for register invalid")
    public void sendPOSTRequestForRegisterInvalid() {
        SerenityRest.when().post(AuthAPI.POST_REGISTER_INV);
    }

    @Given("Post register mentor with valid and complete JSON body")
    public void postRegisterMentorWithValidAndCompleteJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostRegisterMentorReqBody.json");
        authAPI.postRegister(json);

    }

    @Given("Post register mentor with invalid data")
    public void postRegisterMentorWithInvalidData() {
        File json = new File(Constants.REQ_BODY_DIR+"PostRegisterMentorInvReqBody.json");
        authAPI.postRegister(json);
    }

    @Given("Post register mentor with incomplete JSON body")
    public void postRegisterMentorWithIncompleteJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostRegisterMentorIncReqBody.json");
        authAPI.postRegister(json);
    }

    @Given("Post register mentor with invalid JSON body")
    public void postRegisterMentorWithInvalidJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostRegisterMentorInvJSONReqBody.json");
        authAPI.postRegister(json);
    }

    @Given("Post register mentor with blank JSON body")
    public void postRegisterMentorWithBlankJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"BlankRegisterReqBody.json");
        authAPI.postRegister(json);
    }

    @Given("Post register mentor with invalid parameter page")
    public void postRegisterMentorWithInvalidParameterPage() {
        File json = new File(Constants.REQ_BODY_DIR+"PostRegisterMentorReqBody.json");
        authAPI.postRegister(json);
    }
}
