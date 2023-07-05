package starter.StepDef.Schedule;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.ScheduleAPI;
import starter.Utils.Constants;

import java.io.File;

public class PostCheckScheduleStepDef {
    @Steps
    ScheduleAPI scheduleAPI;

    @And("Post a mentor schedule with valid and complete JSON body")
    public void postAMentorScheduleWithValidAndCompleteJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostCheckScheduleReqBody.json");
        scheduleAPI.postCheckSchedule(json);
    }

    @When("Send POST request for mentor schedule")
    public void sendPOSTRequestForMentorSchedule() {
        SerenityRest.when().post(ScheduleAPI.POST_CHECK_SCHEDULE);
    }

    @And("Post a mentor schedule with incomplete JSON body")
    public void postAMentorScheduleWithIncompleteJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostCheckScheduleIncReqBody.json");
        scheduleAPI.postCheckSchedule(json);
    }

    @And("Post a mentor schedule with invalid JSON body")
    public void postAMentorScheduleWithInvalidJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostCheckScheduleInvReqBody.json");
        scheduleAPI.postCheckSchedule(json);
    }

    @And("Post a mentor schedule with blank JSON body")
    public void postAMentorScheduleWithBlankJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"BlankScheduleReqBody.json");
        scheduleAPI.postCheckSchedule(json);
    }

    @And("Post a mentor schedule with invalid parameter page")
    public void postAMentorScheduleWithInvalidParameterPage() {
        File json = new File(Constants.REQ_BODY_DIR+"PostCheckScheduleReqBody.json");
        scheduleAPI.postCheckSchedule(json);
    }

    @When("Send POST request for mentor schedule invalid")
    public void sendPOSTRequestForMentorScheduleInvalid() {
        SerenityRest.when().post(ScheduleAPI.POST_CHECK_SCHEDULE_INV);
    }
}
