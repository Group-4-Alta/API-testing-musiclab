package starter.StepDef.Genre;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.GenreAPI;
import starter.Utils.Constants;

import java.io.File;

public class GetGenreByMentorIdStepDef {
    @Steps
    GenreAPI genreAPI;

    @And("Get all genres with valid parameter mentorId {int}")
    public void getAllInstrumentValidPath(int id){
        genreAPI.getAllGenreWithValidParamId(id);
    }
    @When("Send GET request for all genres")
    public void sendGETRequestForAllGenres() {
        SerenityRest.when().get(GenreAPI.GET_GENRE_BY_MENTOR_ID);
    }

    @And("Validate get all genres by mentorId JSON Schema")
    public void validateGetAllGenresByMentorIdJSONSchema() {
        File json = new File(Constants.JSON_SCHEMA_DIR+"GetAllGenreByMentorIdJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @And("Get all genres with invalid parameter mentorId {string}")
    public void getAllGenresWithInvalidParameterMentorId(String id) {
        genreAPI.getAllGenreWithInvalidParamId(id);
    }

    @And("Get all genres with exceed parameter mentorId {int}")
    public void getAllGenresWithExceedParameterMentorId(int id) {
        genreAPI.getAllGenreWithExceedParamId(id);
    }
}
