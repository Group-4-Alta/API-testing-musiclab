package starter.StepDef.Mentor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.MentorAPI;
import starter.Utils.Constants;

import java.io.File;

public class GetTopMentorStepDef {
    @Steps
    MentorAPI mentorAPI;

    //GET ALL MENTORS BY RATING WITH VALID PATH
    @And("Get Top mentor by rating per weeks with valid path {string}")
    public void getTopMentorByRatingPerWeeksWithValidPath(String path) {
        mentorAPI.getAllMentorsByRating(path);
    }

    @When("Send GET request for top rating mentors with valid path")
    public void sendGETRequestForTopRatingMentors() {
        SerenityRest.when().get(MentorAPI.GET_TOP_MENTOR_PATH);
    }


    //GET ALL MENTORS BY RATING WITH INVALID PATH
    @And("Get Top mentor by rating per weeks with invalid path {string}")
    public void getTopMentorByRatingPerWeeksWithInvalidPath(String path) {
        mentorAPI.getAllMentorsByRating(path);
    }

    @When("Send GET request for top rating mentors with invalid path")
    public void sendGETRequestForTopRatingMentorsWithInvalidPath() {
        SerenityRest.when().get(MentorAPI.GET_TOP_MENTOR_PATH);
    }
}
