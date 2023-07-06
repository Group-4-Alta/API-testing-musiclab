package starter.StepDef.Review;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.ReviewAPI;
import starter.Utils.Constants;

import java.io.File;

public class GetMentorReviewStepDef {
    @Steps
    ReviewAPI reviewAPI;


    @And("Get mentor review with available id mentor {int}")
    public void getMentorReviewWithAvailableIdMentor(int id) {
        reviewAPI.getMentorReview(id);
    }

    @When("Send GET request for get mentor review")
    public void sendGETRequestForGetMentorReview() {
        SerenityRest.when().get(ReviewAPI.REVIEW_MENTOR);
    }

    @And("Validate get mentor review JSON Schema")
    public void validateGetMentorReviewJSONSchema() {
        File json = new File(Constants.JSON_SCHEMA_DIR + "GetMentorReviewJSONSchema.json");
    }

    @And("Get mentor review with exceed id mentor {int}")
    public void getMentorReviewWithExceedIdMentor(int id) {
        reviewAPI.getMentorReview(id);
    }
}
