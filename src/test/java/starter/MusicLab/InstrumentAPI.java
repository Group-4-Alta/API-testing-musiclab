package starter.MusicLab;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

public class InstrumentAPI {

    public static String GET_INSTRUMENTS_VALID_PATH = Constants.BASE_URL+"/{path}";
    public static String GET_INSTRUMENTS_INVALID_PATH = Constants.BASE_URL+"/{path}";
    public static String POST_MENTOR_INSTRUMENT_PATH = Constants.BASE_URL+"/mentors/instruments";
    public static String GET_INSTRUMENT_BY_MENTOR_ID = Constants.BASE_URL+"/mentors/{id}/instruments";
    public static String DELETE_INSTRUMENT_BY_INSTRUMENT_ID = Constants.BASE_URL+"/mentors/instruments/{id}";

    @Step("Get all instrument list with path")
    public void getAllInstrumentList(String path){
        SerenityRest.given()
                .headers("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("path", path);
    }
    @Step("Post mentor instrument with request body")
    public void postMentorInstrument(File json){
        SerenityRest.given().headers("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .contentType(ContentType.JSON).body(json);
    }
    @Step("Get all instrument with valid parameter mentorId")
    public void getAllInstrumentWithValidParamId(int id){
        SerenityRest.given()
                .headers("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("id", id);
    }
    @Step("Get all instrument with invalid parameter mentorId")
    public void getAllInstrumentWithInvalidParamId(String id){
        SerenityRest.given()
                .headers("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("id", id);
    }
    @Step("Get all instrument with exceed parameter mentorId")
    public void getAllInstrumentWithExceedParamId(int id){
        SerenityRest.given()
                .headers("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("id", id);
    }
    @Step("Delete mentor instrument with valid parameter instrumentId")
    public void deleteMentorInstrumentValidParamId(int id){
        SerenityRest.given().headers("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("id", id);
    }
    @Step("Delete mentor instrument with invalid parameter instrumentId")
    public void deleteMentorInstrumentInvalidParamId(String id){
        SerenityRest.given().headers("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("id", id);
    }
    @Step("Delete mentor instrument with exceed parameter instrumentId")
    public void deleteMentorInstrumentExceedParamId(int id){
        SerenityRest.given().headers("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("id", id);
    }
}
