package starter.StepDef.Class;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.ClassAPI;
import starter.Utils.Constants;

import java.io.File;

public class PostMakeClassStepDef {
    @Steps
    ClassAPI classAPI;

    @And("Post class with valid and complete JSON body")
    public void postClassWithValidAndCompleteJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostMakeClassReqBody.json");
        classAPI.postMakeClass(json);
    }

    @When("Send POST request for class")
    public void sendPOSTRequestForClass() {
        SerenityRest.when().post(ClassAPI.POST_MAKE_CLASS);
    }

    @And("Post class with incomplete JSON body")
    public void postClassWithIncompleteJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostMakeClassIncReqBody.json");
        classAPI.postMakeClass(json);
    }

    @And("Post class with invalid JSON body")
    public void postClassWithInvalidJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostMakeClassInvReqBody.json");
        classAPI.postMakeClass(json);
    }

    @And("Post class with blank JSON body")
    public void postClassWithBlankJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"BlankClassReqBody.json");
        classAPI.postMakeClass(json);
    }

    @And("Post class with invalid parameter page")
    public void postClassWithInvalidParameterPage() {
        classAPI.setPostMakeClass();
    }

    @When("Send POST request for class invalid")
    public void sendPOSTRequestForClassInvalid() {
        SerenityRest.when().post(ClassAPI.POST_MAKE_CLASS_INV);
    }
}
