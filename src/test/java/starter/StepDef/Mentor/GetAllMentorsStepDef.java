package starter.StepDef.Mentor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.AuthAPI;
import starter.MusicLab.MentorAPI;
import starter.MusicLab.MusiclabResponses;
import starter.Utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class GetAllMentorsStepDef {
    @Steps
    MentorAPI mentorAPI;

    // GET ALL MENTORS VALID PARAM A
    @And("Get all mentors with valid page {int}, limit {int}, name {string} parameter")
    public void getAllMentorsWithValidPageLimitNameParameter(int page, int limit, String name){
    mentorAPI.getAllMentorsA(page, limit, name);
    }

    @When("Send GET request for all mentors path A")
    public void sendGETRequestForAllMentors() {
        SerenityRest.when().get(MentorAPI.GET_ALL_MENTORS_PATH_1);
    }

    @And("Validate response body for message should be {string}")
    public void validateResponseBodyForMessageShouldBe(String message) {
        SerenityRest.and().body(MusiclabResponses.MESSAGE, equalTo(message));
    }

    //GET ALL MENTORS INVALID PARAM A

    @And("Get all mentors with invalid path, with page {int}, limit {int}, name {string}")
    public void getAllMentorsWithInvalidPageLimitNameParameter(int page, int limit, String name) {
        mentorAPI.getAllMentorsA(page, limit, name);
    }
    @When("Send GET request for invalid path all mentors A")
    public void sendGETRequestForInvalidPathAllMentors() {
        SerenityRest.when().get(MentorAPI.GET_ALL_MENTORS_INVALID_PATH_1);
    }

    // GET ALL MENTORS VALID PARAM B
    @And("Get all mentors with valid page {int}, limit {int}, instrument {int}, genre {int} parameter")
    public void getAllMentorsWithValidPageLimitInstrumentGenreParameter(int page, int limit, int instrument, int genre) {
        mentorAPI.getAllMentorsB(page, limit, instrument, genre);
    }

    @When("Send GET request for all mentors path B")
    public void sendGETRequestForAllMentorsPath() {
        SerenityRest.when().get(MentorAPI.GET_ALL_MENTORS_PATH_2);
    }

    //GET ALL MENTORS INVALID PARAM B

    @And("Get all mentors with invalid path, with page {int}, limit {int}, instrument {int}, genre {int}")
    public void getAllMentorsWithInvalidPathWithPageLimitInstrumentGenre(int page, int limit, int instrument, int genre) {
        mentorAPI.getAllMentorsB(page, limit, instrument, genre);
    }
    @When("Send GET request for invalid path all mentors B")
    public void sendGETRequestForInvalidPathAllMentorsB() {
        SerenityRest.when().get(MentorAPI.GET_ALL_MENTORS_INVALID_PATH_2);
    }

    // GET ALL MENTORS VALID PARAM C

    @And("Get all mentors with valid rating {int}, qualification {string}")
    public void getAllMentorsWithValidRatingQualification(int rating, String qualification) {
        mentorAPI.getAllMentorsC(rating, qualification);
    }

    @When("Send GET request for all mentors path C")
    public void sendGETRequestForAllMentorsPathC() {
        SerenityRest.when().get(MentorAPI.GET_ALL_MENTORS_PATH_3);
    }

    //GET ALL MENTORS INVALID PARAM C
    @And("Get all mentors with unavailable parameter, with rating {int}, qualification {string}")
    public void getAllMentorsWithUnavailableParameterWithRatingQualification(int rating, String qualification) {
        mentorAPI.getAllMentorsC(rating, qualification);
    }

    @When("Send GET request for unavailable parameter all mentors C")
    public void sendGETRequestForUnavailableParameterAllMentorsC() {
        SerenityRest.when().get(MentorAPI.GET_ALL_MENTORS_PATH_3);
    }

    //GET ALL MENTORS EMPTY PARAMETER
    @And("Get all mentors with all parameter are empty")
    public void getAllMentorsWithAllParameterAreEmpty() {
        mentorAPI.getAllMentorsWithEmptyParam();
    }

    @When("Send GET request for all mentors empty path")
    public void sendGETRequestForAllMentorsEmptyPath() {
        SerenityRest.when().get(MentorAPI.GET_EMPTY_PARAM);
    }

}
