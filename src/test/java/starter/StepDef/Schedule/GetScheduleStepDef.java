package starter.StepDef.Schedule;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.ScheduleAPI;
import starter.Utils.Constants;

public class GetScheduleStepDef {
    @Steps
    ScheduleAPI scheduleAPI;

    @And("Get a schedule with valid parameter page {}")
    public void getAScheduleWithValidParameterPage(int id) {
        scheduleAPI.getSchedule(id);
    }

    @When("Send GET request for mentor schedules")
    public void sendGETRequestForMentorSchedules() {
        SerenityRest.when().get(ScheduleAPI.GET_SCHEDULE);
    }

    @And("Get a schedule with invalid parameter page {}")
    public void getAScheduleWithInvalidParameterPage(String id) {
        scheduleAPI.getScheduledInv(id);
    }

    @And("Get a schedule with blank parameter page {string}")
    public void getAScheduleWithBlankParameterPage(String id) {
        scheduleAPI.getScheduledInv(id);
    }
}
