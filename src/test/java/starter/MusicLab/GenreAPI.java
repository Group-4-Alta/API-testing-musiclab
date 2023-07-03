package starter.MusicLab;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

public class GenreAPI {
    public static String GET_GENRES_VALID_PATH = Constants.BASE_URL+"/{path}";
    public static String GET_GENRES_INVALID_PATH = Constants.BASE_URL+"/{path}";
    public static String POST_MENTOR_GENRE_PATH = Constants.BASE_URL+"/mentors/genres";
    public static String GET_GENRE_BY_MENTOR_ID = Constants.BASE_URL+"/mentors/{id}/genres";
    public static String DELETE_GENRE_BY_GENRE_ID = Constants.BASE_URL+"/mentors/genres/{id}";

    @Step("Get all genre list with path")
    public void getAllGenreList(String path){
        SerenityRest.given()
                .headers("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("path", path);
    }
    @Step("Post mentor genre with request body")
    public void postMentorGenre(File json){
        SerenityRest.given().headers("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .contentType(ContentType.JSON).body(json);
    }
    @Step("Get all genre with valid parameter mentorId")
    public void getAllGenreWithValidParamId(int id){
        SerenityRest.given()
                .headers("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("id", id);
    }
    @Step("Get all genre with invalid parameter mentorId")
    public void getAllGenreWithInvalidParamId(String id){
        SerenityRest.given()
                .headers("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("id", id);
    }
    @Step("Get all genre with exceed parameter mentorId")
    public void getAllGenreWithExceedParamId(int id){
        SerenityRest.given()
                .headers("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("id", id);
    }
    @Step("Delete mentor genre with valid parameter genreId")
    public void deleteMentorGenreValidParamId(int id){
        SerenityRest.given().headers("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("id", id);
    }
    @Step("Delete mentor genre with invalid parameter genreId")
    public void deleteMentorGenreInvalidParamId(String id){
        SerenityRest.given().headers("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("id", id);
    }
    @Step("Delete mentor genre with exceed parameter genreId")
    public void deleteMentorGenreExceedParamId(int id){
        SerenityRest.given().headers("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("id", id);
    }
}
