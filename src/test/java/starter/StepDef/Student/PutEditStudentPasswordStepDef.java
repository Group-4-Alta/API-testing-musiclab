package starter.StepDef.Student;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.StudentAPI;
import starter.Utils.Constants;

import java.io.File;

public class PutEditStudentPasswordStepDef {
    @Steps
    StudentAPI studentAPI;

    @And("Put edit student password with valid request body")
    public void putEditStudentPasswordValidReqBody(){
        File json = new File(Constants.REQ_BODY_DIR+"PutEditStudentPasswordValidReqBody.json");
        studentAPI.putEditStudentPassword(json);
    }
    @When("Send PUT request for edit student password")
    public void sendPutEditStudentPassword(){
        SerenityRest.when().put(StudentAPI.PUT_EDIT_STUDENT_PASSWORD_PATH);
    }

    @And("Put edit student password with invalid request body")
    public void putEditStudentPasswordWithInvalidReqBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PutEditStudentPasswordInvalidReqBody.json");
        studentAPI.putEditStudentPassword(json);
    }

    @And("Put edit student password with empty request body")
    public void putEditStudentPasswordWithEmptyReqBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PutEditStudentPasswordEmptyReqBody.json");
        studentAPI.putEditStudentPassword(json);
    }

    @And("Put edit student password with empty new password on request body")
    public void putEditStudentPasswordWithEmptyNewPasswordOnReqBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PutEditStudentPasswordEmptyNewPassReqBody.json");
        studentAPI.putEditStudentPassword(json);
    }

    @And("Put edit student password with empty old password on request body")
    public void putEditStudentPasswordWithEmptyOldPasswordOnReqBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PutEditStudentPasswordEmptyOldPassReqBody.json");
        studentAPI.putEditStudentPassword(json);
    }

    @And("Put edit student password with empty confirmation password on request body")
    public void putEditStudentPasswordWithEmptyConfirmPasswordOnReqBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PutEditStudentPasswordEmptyConfirmPassReqBody.json");
        studentAPI.putEditStudentPassword(json);
    }
}
