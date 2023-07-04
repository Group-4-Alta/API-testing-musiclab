package starter.StepDef.Mentor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.MentorAPI;
import starter.Utils.Constants;

import java.io.File;

public class PutEditMentorPasswordStepDef {
    @Steps
    MentorAPI mentorAPI;

    // PUT EDIT MENTOR PASSWORD VALID REQ BODY
    @And("Put edit mentor password with valid request body")
    public void putEditMentorPasswordWithValidRequestBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PutEditMentorPasswordReqBody.json");
        mentorAPI.putEditMentorPassword(json);
    }

    @When("Send PUT request for edit mentor password with valid request body")
    public void sendPUTRequestForEditMentorPasswordWithValidRequestBody() {
        SerenityRest.when().put(MentorAPI.PUT_EDIT_PASS_MENTOR);
    }

    // PUT EDIT MENTOR PASSWORD INVALID REQ BODY
    @And("Put edit mentor password with invalid request body")
    public void putEditMentorPasswordWithInvalidRequestBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PutEditPassMentorWithInvReqBody.json");
        mentorAPI.putEditMentorPassword(json);
    }

    @When("Send PUT request for edit mentor password")
    public void sendPUTRequestForEditMentorPassword() {
        SerenityRest.when().put(MentorAPI.PUT_EDIT_PASS_MENTOR);
    }

    // PUT EDIT MENTOR PASSWORD EMPTY OLD PASS
    @And("Put edit mentor password with empty old password")
    public void putEditMentorPasswordWithEmptyOldPassword() {
        File json = new File(Constants.REQ_BODY_DIR+"PutMentorEditPassEmptyOldPassReqBody.json");
        mentorAPI.putEditMentorPassword(json);
    }

    // PUT EDIT MENTOR PASSWORD EMPTY CONFIRMATION PASS
    @And("Put edit mentor password with empty confirmation password")
    public void putEditMentorPasswordWithEmptyConfirmationPassword() {
        File json = new File(Constants.REQ_BODY_DIR+"PutMentorEditPassEmptyConfirmPassReqBody.json");
        mentorAPI.putEditMentorPassword(json);
    }
}
