package starter.StepDef.Mentor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.MentorAPI;
import starter.Utils.Constants;

import java.io.File;

public class GetMentorProfileByIdMentorStepDef {
    @Steps
    MentorAPI mentorAPI;

    // GET MENTOR PROFILE BY AVAILABLE ID
    @And("Get mentor profile by id mentor with available id parameter {int}")
    public void getMentorProfileByIdMentorWithAvailableIdParameter(int id) {
        mentorAPI.getMentorProfileByIdMentor(id);
    }

    @When("Send GET request with available id mentor")
    public void sendGETRequestWithAvailableIdMentor() {
        SerenityRest.when().get(MentorAPI.GET_PROFILE_MENTOR_BY_ID);
    }

    // GET MENTOR PROFILE BY UNAVAILABLE ID
    @And("mentor profile by id mentor with unavailable id parameter {int}")
    public void mentorProfileByIdMentorWithUnavailableIdParameter(int id) {
        mentorAPI.getMentorProfileByIdMentor(id);
    }

    @When("Send GET request with unavailable id mentor")
    public void sendGETRequestWithUnavailableIdMentor() {
        SerenityRest.when().get(MentorAPI.GET_PROFILE_MENTOR_BY_ID);
    }

}
