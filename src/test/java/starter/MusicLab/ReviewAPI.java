package starter.MusicLab;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

public class ReviewAPI {
    public static String REVIEW_MENTOR = Constants.BASE_URL + "/mentors/{id}/reviews";

    @Step("Post make a review in mentor class with valid request body")
    public void postMakeAReview(int id, File json){
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.ACCESS_TOKEN_STUDENT)
                .pathParam("id", id)
                .contentType(ContentType.JSON).body(json);
    }

    @Step("Post make a review in mentor class with invalid request body")
    public void postMakeAReviewInvalid(int id, File json){
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.ACCESS_TOKEN_STUDENT)
                .pathParam("id", id)
                .contentType(ContentType.JSON).body(json);
    }

    @Step("Get mentor review")
    public void getMentorReview(int id) {
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.ACCESS_TOKEN_STUDENT)
                .pathParam("id", id);
    }
}
