package starter.StepDef.Class;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.ClassAPI;
import starter.Utils.Constants;

import java.io.File;

public class PutEditClassStepDef {
    @Steps
    ClassAPI classAPI;

    @And("Put edit a class with valid and complete data {}")
    public void putEditAClassWithValidAndCompleteData(int id) {
        File json = new File(Constants.REQ_BODY_DIR+"PutEditClassReqBody.json");
        classAPI.putEditClass(id,json);
    }

    @When("Send PUT request for edit a class")
    public void sendPUTRequestForEditAClass() {
        SerenityRest.when().put(ClassAPI.PUT_EDIT_CLASS);
    }

    @And("Put edit a class with invalid parameter page {}")
    public void putEditAClassWithInvalidParameterPage(String id) {
        File json = new File(Constants.REQ_BODY_DIR+"PutEditClassReqBody.json");
        classAPI.putEditClassInv(id,json);
    }

    @And("Put edit a class with blank parameter page {string}")
    public void putEditAClassWithBlankParameterPage(String id) {
        File json = new File(Constants.REQ_BODY_DIR+"PutEditClassReqBody.json");
        classAPI.putEditClassInv(id, json);
    }

    @And("Put edit a class with incomplete JSON body {}")
    public void putEditAClassWithIncompleteJSONBody(int id) {
        File json = new File(Constants.REQ_BODY_DIR+"PutEditClassIncReqBody.json");
        classAPI.putEditClass(id,json);
    }

    @And("Put edit a class with invalid JSON body {}")
    public void putEditAClassWithInvalidJSONBody(int id) {
        File json = new File(Constants.REQ_BODY_DIR+"PutEditClassInvReqBody.json");
        classAPI.putEditClass(id,json);
    }

    @And("Put edit a class with blank JSON body {}")
    public void putEditAClassWithBlankJSONBody(int id) {
        File json = new File(Constants.REQ_BODY_DIR+"BlankClassReqBody.json");
        classAPI.putEditClass(id,json);
    }
}
