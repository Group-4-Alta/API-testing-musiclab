package starter.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import starter.Utils.Constants;


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
}

