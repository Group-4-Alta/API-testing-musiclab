package starter.StepDef.Mentor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.MentorAPI;
import starter.Utils.Constants;

import java.io.File;

public class PutEditMentorProfileStepDef {
    @Steps
    MentorAPI mentorAPI;

    // PUT EDIT MENTOR PROFILE VALID BODY REQ
    @And("Put edit mentor profile with valid body request")
    public void putEditMentorProfileWithValidBodyRequest() {
        File json = new File(Constants.REQ_BODY_DIR+"EditMentorProfileReqBody.json");
        mentorAPI.putEditMentorProfile(json);
    }

    @When("Send PUT request for edit mentor profile")
    public void sendPUTRequestForEditMentorProfile() {
        SerenityRest.when().put(MentorAPI.PUT_EDIT_MENTOR);

    }
    // PUT EDIT MENTOR PROFILE INVALID BODY REQ
    @And("Put edit mentor profile with invalid body request")
    public void putEditMentorProfileWithInvalidBodyRequest() {
        File json = new File(Constants.REQ_BODY_DIR+"PutEditMentorProfileInvalidReqBody.json");
        mentorAPI.putEditMentorProfile(json);
    }

    // PUT EDIT MENTOR PROFILE INVALID PATH
    @And("Put edit mentor profile with invalid path")
    public void putEditMentorProfileWithInvalidPath() {
        mentorAPI.putEditMentorWithInvalidPath();
    }
    @When("Send PUT request for edit mentor profile with invalid path")
    public void sendPUTRequestForEditMentorProfileWithInvalidPath() {
        SerenityRest.when().get(MentorAPI.PUT_EDIT_MENTOR_INV_PATH);
    }

}
