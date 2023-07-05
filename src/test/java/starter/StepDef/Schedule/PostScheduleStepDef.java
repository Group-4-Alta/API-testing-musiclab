package starter.StepDef.Schedule;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.ScheduleAPI;
import starter.Utils.Constants;

import java.io.File;

public class PostScheduleStepDef {
    @Steps
    ScheduleAPI scheduleAPI;

    @And("Post a schedule with valid and complete JSON body")
    public void postAScheduleWithValidAndCompleteJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostScheduleReqBody.json");
        scheduleAPI.postSchedule(json);
    }

    @When("Send POST request for schedules")
    public void sendPOSTRequestForSchedules() {
        SerenityRest.when().post(ScheduleAPI.POST_SCHEDULE);
    }

    @And("Post a schedule with incomplete JSON body")
    public void postAScheduleWithIncompleteJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostScheduleIncReqBody.json");
        scheduleAPI.postSchedule(json);
    }

    @And("Post a schedule with invalid JSON body")
    public void postAScheduleWithInvalidJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostScheduleInvReqBody.json");
        scheduleAPI.postSchedule(json);
    }

    @And("Post a schedule with blank JSON body")
    public void postAScheduleWithBlankJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"BlankScheduleReqBody.json");
        scheduleAPI.postSchedule(json);
    }

    @And("Post a schedule with invalid parameter page")
    public void postAScheduleWithInvalidParameterPage() {
        File json = new File(Constants.REQ_BODY_DIR+"PostScheduleReqBody.json");
        scheduleAPI.postSchedule(json);
    }

    @When("Send POST request for schedules invalid")
    public void sendPOSTRequestForSchedulesInvalid() {
        SerenityRest.when().post(ScheduleAPI.POST_SCHEDULE_INV);
    }
}
