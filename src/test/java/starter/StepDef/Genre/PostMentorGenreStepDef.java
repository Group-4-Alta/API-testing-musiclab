package starter.StepDef.Genre;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.GenreAPI;
import starter.Utils.Constants;

import java.io.File;

public class PostMentorGenreStepDef {
    @Steps
    GenreAPI genreAPI;

    @And("Post mentor genre with valid request body")
    public void postMentorGenreValidReqBody(){
        File json = new File(Constants.REQ_BODY_DIR+"PostMentorGenreValidReqBody.json");
        genreAPI.postMentorGenre(json);
    }
    @When("Send POST request for mentor genre")
    public void sendPOSTRequestForMentorGenre() {
        SerenityRest.when().post(GenreAPI.POST_MENTOR_GENRE_PATH);
    }

    @And("Post mentor genre with invalid request body")
    public void postMentorGenreWithInvalidRequestBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostMentorGenreInvalidReqBody.json");
        genreAPI.postMentorGenre(json);
    }

    @And("Post mentor genre with exceed request body genreId")
    public void postMentorGenreWithExceedRequestBodyGenreId() {
        File json = new File(Constants.REQ_BODY_DIR+"PostMentorGenreExceedGenreIdReqBody.json");
        genreAPI.postMentorGenre(json);
    }
}
