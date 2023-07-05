package starter.MusicLab;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

import static starter.Utils.Constants.BASE_URL;
public class ScheduleAPI {
    public static String POST_SCHEDULE = BASE_URL+"/mentors/schedules";
    public static String POST_SCHEDULE_INV = BASE_URL+"/mentors/schedule";
    public static String GET_SCHEDULE = BASE_URL+"/mentors/{id}/schedules";
    public static String POST_CHECK_SCHEDULE = BASE_URL+"/schedules/check";
    public static String POST_CHECK_SCHEDULE_INV = BASE_URL+"/schedules/cek";
    public static String DELETE_SCHEDULE = BASE_URL+"/schedules/{id}";

//    Steps
    @Step("Post a Schedule")
    public void postSchedule (File json) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+Constants.ACCESS_MENTOR)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Get Schedule")
    public void getSchedule (int id) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+Constants.ACCESS_MENTOR)
                .pathParam(MusiclabResponses.ID, id);
    }

    @Step("Get Schedule invalid")
    public void getScheduledInv (String id) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+Constants.ACCESS_MENTOR)
                .pathParam(MusiclabResponses.ID, id);
    }

    @Step("Post check schedule")
    public void postCheckSchedule (File json) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+Constants.ACCESS_MENTOR)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Delete schedule")
    public void deleteSchedule (int id) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+Constants.ACCESS_MENTOR)
                .pathParam(MusiclabResponses.ID, id);
    }

    @Step("Delete schedule invalid")
    public void deleteScheduleInv (String id) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+Constants.ACCESS_MENTOR)
                .pathParam(MusiclabResponses.ID, id);
    }
}
