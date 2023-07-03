package starter.StepDef.Genre;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.GenreAPI;
import starter.Utils.Constants;

import java.io.File;

public class GetAllGenresStepDef {
    @Steps
    GenreAPI genreAPI;

    @And("Get all genres list with valid path {string}")
    public void getAllGenreValidPath(String path){
        genreAPI.getAllGenreList(path);
    }

    @When("Send GET request for all genres valid path")
    public void sendGETRequestForAllGenresValidPath() {
        SerenityRest.when().get(GenreAPI.GET_GENRES_VALID_PATH);
    }

    @And("Validate get all genres JSON Schema")
    public void validateGetAllGenresJSONSchema() {
        File json = new File(Constants.JSON_SCHEMA_DIR+"GetAllGenreJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @And("Get all genres list with wrong path {string}")
    public void getAllGenresListWithWrongPath(String path) {
        genreAPI.getAllGenreList(path);
    }

    @When("Send GET request for all genres wrong path")
    public void sendGETRequestForAllGenresWrongPath() {
        SerenityRest.when().get(GenreAPI.GET_GENRES_INVALID_PATH);
    }
}
