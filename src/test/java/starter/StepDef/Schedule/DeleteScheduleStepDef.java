package starter.StepDef.Schedule;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.ScheduleAPI;

import java.util.Scanner;

public class DeleteScheduleStepDef {
    @Steps
    ScheduleAPI scheduleAPI;

    @And("Delete a schedule with valid parameter page {}")
    public void deleteAScheduleWithValidParameterPage(int id) {
        scheduleAPI.deleteSchedule(id);
    }

    @When("Send DELETE request for a schedule")
    public void sendDELETERequestForASchedule() {
        SerenityRest.when().delete(ScheduleAPI.DELETE_SCHEDULE);
    }

    @And("Delete a schedule with invalid parameter page {}")
    public void deleteAScheduleWithInvalidParameterPage(String id) {
        scheduleAPI.deleteScheduleInv(id);
    }

    @And("Delete a schedule with blank parameter page {string}")
    public void deleteAScheduleWithBlankParameterPage(String id) {
        scheduleAPI.deleteScheduleInv(id);
    }
}
