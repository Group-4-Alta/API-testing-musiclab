package starter.StepDef.Mentor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.MentorAPI;
import starter.Utils.Constants;

import java.io.File;

public class GetMentorProfileStepDef {
    @Steps
    MentorAPI mentorAPI;

    // GET PROFILE MENTOR WITH VALID PATH
    @And("Get profile mentor with valid path {string}")
    public void getProfileMentorWithValidPath(String path) {
        mentorAPI.getProfileMentor(path);
    }


    @When("Send GET request for profile mentor with valid path")
    public void sendGETRequestForProfileMentorWithValidPath() {
        SerenityRest.when().get(MentorAPI.GET_PROFILE_MENTOR_PATH);
    }

    // GET PROFILE MENTOR WITH INVALID PATH
    @And("Get profile mentor with invalid path {string}")
    public void getProfileMentorWithInvalidPath(String path) {
        mentorAPI.getProfileMentor(path);
    }

    @When("Send GET request for profile mentor with invalid path")
    public void sendGETRequestForProfileMentorWithInvalidPath() {
        SerenityRest.when().get(MentorAPI.GET_PROFILE_MENTOR_PATH);
    }



}
