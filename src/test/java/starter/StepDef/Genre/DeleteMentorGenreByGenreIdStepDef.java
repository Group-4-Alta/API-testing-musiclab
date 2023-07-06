package starter.StepDef.Genre;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.GenreAPI;

public class DeleteMentorGenreByGenreIdStepDef {
    @Steps
    GenreAPI genreAPI;
    @And("Delete mentor genre with valid parameter genreId {int}")
    public void deleteMentorGenreValidParamId(int id){
        genreAPI.deleteMentorGenreValidParamId(id);
    }
    @When("Send DELETE request for delete mentor genre")
    public void sendDELETERequestForDeleteMentorGenre() {
        SerenityRest.when().delete(GenreAPI.DELETE_GENRE_BY_GENRE_ID);
    }

    @And("Delete mentor genre with invalid parameter genreId {string}")
    public void deleteMentorGenreWithInvalidParameterGenreId(String id) {
        genreAPI.deleteMentorGenreInvalidParamId(id);
    }

    @And("Delete mentor genre with exceed parameter genreId {int}")
    public void deleteMentorGenreWithExceedParameterGenreId(int id) {
        genreAPI.deleteMentorGenreExceedParamId(id);
    }
}
