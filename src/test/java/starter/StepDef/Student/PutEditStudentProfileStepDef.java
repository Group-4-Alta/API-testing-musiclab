package starter.StepDef.Student;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.StudentAPI;
import starter.Utils.Constants;

import java.io.File;

public class PutEditStudentProfileStepDef {
    @Steps
    StudentAPI studentAPI;

    @And("Put edit student profile with valid request body")
    public void putEditStudentProfileValidReqBody(){
        File json = new File(Constants.REQ_BODY_DIR+"PutEditStudentProfileValidReqBody.json");
        studentAPI.putEditStudentProfile(json);
    }

    @When("Send PUT request for edit student profile")
    public void sendPutEditStudentProfile() {
        SerenityRest.when().put(StudentAPI.PUT_EDIT_STUDENT_PROFILE_PATH);
    }

    @And("Put edit student profile with invalid request body")
    public void putEditStudentProfileWithInvalidReqBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PutEditStudentProfileInvalidReqBody.json");
        studentAPI.putEditStudentProfile(json);
    }

    @And("Put edit student profile with empty name on request body")
    public void putEditStudentProfileWithEmptyNameOnRequestBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PutEditStudentProfileEmptyNameReqBody.json");
        studentAPI.putEditStudentProfile(json);
    }

    @And("Put edit student profile for only request body address with valid request body")
    public void putEditStudentProfileOnlyRequestBodyAddressWithValidReqBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PutEditStudentProfileValidAddressReqBody.json");
        studentAPI.putEditStudentProfile(json);
    }

    @And("Put edit student profile with empty request body")
    public void putEditStudentProfileWithEmptyRequestBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PutEditStudentProfileEmptyReqBody.json");
        studentAPI.putEditStudentProfile(json);
    }
}
