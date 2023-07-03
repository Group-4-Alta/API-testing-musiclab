package starter.StepDef.Student;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.MusiclabResponses;
import starter.MusicLab.StudentAPI;
import starter.Utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class GetStudentProfileStepDef {
    @Steps
    StudentAPI studentAPI;

    @And("Get show student profile with valid path {string}")
    public void getShowStudentProfileValidPath(String path){
        studentAPI.getShowStudentProfile(path);
    }
    @When("Send GET request for show student profile valid path")
    public void sendGetStudentProfileValidPath() {
        SerenityRest.when().get(StudentAPI.GET_STUDENT_VALID_PATH);
    }

    @And("Validate response body for message should be {string}")
    public void responseBodyMessage(String message){
        SerenityRest.and().body(MusiclabResponses.MESSAGE, equalTo(message));
    }

    @And("Validate get student profile JSON Schema")
    public void validatePostCreateAlbumsJSONSchema() {
        File json = new File(Constants.JSON_SCHEMA_DIR+"GetStudentProfileJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get show student profile with wrong path {string}")
    public void getShowStudentProfileInvalidPath(String path){
        studentAPI.getShowStudentProfile(path);
    }
    @When("Send GET request for show student profile invalid path")
    public void sendGetStudentProfileInvalidPath(){
        SerenityRest.when().get(StudentAPI.GET_STUDENT_INVALID_PATH);
    }
}
