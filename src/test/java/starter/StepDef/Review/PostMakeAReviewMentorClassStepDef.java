package starter.StepDef.Review;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.ReviewAPI;
import starter.Utils.Constants;

import java.io.File;


public class PostMakeAReviewMentorClassStepDef {
    @Steps
    ReviewAPI reviewAPI;

    @And ("Post make a review in mentor {int} class with valid request body")
        public void postMakeAReview(int id){
        File json = new File(Constants.REQ_BODY_DIR + "PostMakeAReviewValidReqBody.json");
        reviewAPI.postMakeAReview(id, json);
    }

    @When("Send POST request for make a review in mentor class with valid request body")
    public void sendPOSTRequestForMakeAReviewInMentorClassWithValidRequestBody() {
        SerenityRest.when().post(ReviewAPI.REVIEW_MENTOR);
    }

    @And("Post make a review in mentor {int} class with invalid request body")
    public void postMakeAReviewInMentorClassWithInvalidRequestBody(int id) {
        File json = new File(Constants.REQ_BODY_DIR + "PostMakeAReviewInvalidReqBody.json");
        reviewAPI.postMakeAReviewInvalid(id, json);
    }

    @When("Send POST request for make a review in mentor class with invalid request body")
    public void sendPOSTRequestForMakeAReviewInMentorClassWithInvalidRequestBody() {
        SerenityRest.when().post(ReviewAPI.REVIEW_MENTOR);
    }


}
