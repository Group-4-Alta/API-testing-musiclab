package starter.MusicLab;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

import static starter.Utils.Constants.BASE_URL;

public class ClassAPI {
    public static String POST_MAKE_CLASS = BASE_URL+"/mentors/classes";
    public static String POST_MAKE_CLASS_INV = BASE_URL+"/mentors/classess";
    public static String GET_CLASSES = BASE_URL+"/mentors/{id}/class?page={page}&limit={limit}";
    public static String GET_CLASS_DETAIL = BASE_URL+"/class/{id}";
    public static String PUT_EDIT_CLASS = BASE_URL+"/class/{id}";
    public static String DELETE_CLASS = BASE_URL+"/class/{id}";

//    Steps
    @Step("Post make new class with JSON")
    public void postMakeClass (File json) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Post make new class (Auth only)")
    public void setPostMakeClass () {
        SerenityRest.given()
                .header("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR);
    }

    @Step("Get classes by mentor id")
    public void getClassesMentor (int id, int page, int limit) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam(MusiclabResponses.ID, id)
                .pathParam(MusiclabResponses.PAGE, page)
                .pathParam(MusiclabResponses.LIMIT, limit);
    }

    @Step("Get classes by mentor id invalid")
    public void getClassesMentorInv (String id, String page, String limit) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam(MusiclabResponses.ID, id)
                .pathParam(MusiclabResponses.PAGE, page)
                .pathParam(MusiclabResponses.LIMIT, limit);
    }

    @Step("Get class detail")
    public void getClassDetail (int id) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam(MusiclabResponses.ID, id);
    }

    @Step("Get class detail invalid")
    public void getClassDetailInv (String id) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam(MusiclabResponses.ID, id);
    }

    @Step("Put edit class")
    public void putEditClass (int id, File json) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam(MusiclabResponses.ID, id)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Put edit class invalid")
    public void putEditClassInv (String id, File json) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam(MusiclabResponses.ID, id)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Put edit class blank")
    public void putEditClassBlank (File json) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Delete class")
    public void deleteClass (int id) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam(MusiclabResponses.ID, id);
    }

    @Step("Delete class invalid")
    public void deleteClassInv (String id) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_MENTOR)
                .pathParam(MusiclabResponses.ID, id);
    }
}
