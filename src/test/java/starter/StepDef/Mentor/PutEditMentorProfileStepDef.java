package starter.StepDef.Mentor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.MentorAPI;

public class PutEditMentorProfileStepDef {
    @Steps
    MentorAPI mentorAPI;

    // PUT EDIT MENTOR PROFILE VALID BODY REQ
    @And("Put edit mentor profile with valid body request")
    public void putEditMentorProfileWithValidBodyRequest() {
        mentorAPI.putEditMentorProfile();
    }

    @When("Send PUT request for edit mentor profile with valid body request")
    public void sendPUTRequestForEditMentorProfileWithValidBodyRequest() {
        SerenityRest.when().get(MentorAPI.PUT_EDIT_MENTOR);
    }

}
