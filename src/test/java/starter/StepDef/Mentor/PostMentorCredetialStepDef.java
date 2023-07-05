package starter.StepDef.Mentor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.MentorAPI;
import starter.Utils.Constants;

import java.io.File;

public class PostMentorCredetialStepDef {
    @Steps
    MentorAPI mentorAPI;

    // POST MENTOR CREDENTIAL VALID BODY REQ
    @Given("Post mentor credential with valid body request")
    public void postMentorCredentialWithValidBodyRequest() {
        File json = new File(Constants.REQ_BODY_DIR+"PostMentorCredentialReqBody.json");
        mentorAPI.postMentorCredetial(json);
    }

    @When("Send POST request for mentor credential")
    public void sendPOSTRequestForMentorCredential() {
        SerenityRest.when().post(MentorAPI.POST_MENTOR_CREDENTIAL);
    }

    // POST MENTOR CREDENTIAL INVALID BODY REQ
    @And("Post mentor credetial with invalid body request")
    public void postMentorCredetialWithInvalidBodyRequest() {
        File json = new File(Constants.REQ_BODY_DIR+"PostMentorCredentialInvalidReqBody.json");
        mentorAPI.postMentorCredetial(json);
    }
}
