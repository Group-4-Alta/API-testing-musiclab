package starter.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import starter.MusicLab.AuthAPI;
import starter.Utils.Constants;


import javax.security.auth.login.AccountException;
import java.io.File;

public class ConstantsStepDef {
    // 200 OK
    @Then("API response should return {int} OK status code")
    public void statusCodeShouldBeOK(int OK) {
        SerenityRest.then().statusCode(OK);
    }

    // 404 Not Found
    @Then("API response should return {int} Not Found status code")
    public void statusCodeShouldBeNotFound(int notFound) {
        SerenityRest.then().statusCode(notFound);
    }

    // 400 Bad Request
    @Then("API response should return {int} Bad Request status code")
    public void statusCodeShouldBeBadRequest(int badReq) {
        SerenityRest.then().statusCode(badReq);
    }

    // 201 Created
    @Then("API response should return {int} Created status code")
    public void statusCodeShouldBeCreated(int created) {
        SerenityRest.then().statusCode(created);
    }

    // 405 Method Not Allowed
    @Then("API response should return {int} Method Not Allowed status code")
    public void statusCodeShouldBeMethodNotAllowed(int notAllowed) {
        SerenityRest.then().statusCode(notAllowed);
    }

    // Validate Message JSON Schema
    @And("Validate Message JSON Schema")
    public void validateMessageJSONSchema() {
        File json = new File(Constants.JSON_SCHEMA_DIR+"MessageJSONSchema.json");
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

//    Student Normal Account
    @Given("User login student normal account")
    public void userLoginStudentNormal() {
        File json = new File(Constants.REQ_BODY_DIR+"LoginStudent/LoginStudent.json");
        Response response = SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json)
                .post(AuthAPI.POST_LOGIN);

        JsonPath jsonPath = response.jsonPath();
        String accessToken = jsonPath.getString("data.token");
        Constants.ACCESS_TOKEN_STUDENT = accessToken;
    }

//    Student Trial Account
    @Given("User login student trial account")
    public void userLoginStudentTrial() {
        File json = new File(Constants.REQ_BODY_DIR+"LoginStudent/LoginStudentTrial.json");
        Response response = SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json)
                .post(AuthAPI.POST_LOGIN);

        JsonPath jsonPath = response.jsonPath();
        String accessToken = jsonPath.getString("data.token");
        Constants.ACCESS_STUDENT = accessToken;
    }

//    Mentor Normal Account
    @Given("User login mentor normal account")
    public void userLoginMentorNormal() {
        File json = new File(Constants.REQ_BODY_DIR+"LoginMentor/LoginMentor.json");
        Response response = SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json)
                .post(AuthAPI.POST_LOGIN);

        JsonPath jsonPath = response.jsonPath();
        String accessToken = jsonPath.getString("data.token");
        Constants.ACCESS_TOKEN_MENTOR = accessToken;
    }

//    Mentor Trial Account
@Given("User login mentor trial account")
public void userLoginMentorTrial() {
    File json = new File(Constants.REQ_BODY_DIR+"LoginMentor/LoginMentorTrial.json");
    Response response = SerenityRest.given()
            .contentType(ContentType.JSON)
            .body(json)
            .post(AuthAPI.POST_LOGIN);

    JsonPath jsonPath = response.jsonPath();
    String accessToken = jsonPath.getString("data.token");
    Constants.ACCESS_MENTOR = accessToken;
    }
}