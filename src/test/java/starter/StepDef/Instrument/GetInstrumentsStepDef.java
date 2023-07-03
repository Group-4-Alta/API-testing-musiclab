package starter.StepDef.Instrument;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.InstrumentAPI;
import starter.Utils.Constants;

import java.io.File;

public class GetInstrumentsStepDef {
    @Steps
    InstrumentAPI instrumentAPI;

    @And("Get all instruments list with valid path {string}")
    public void getAllInstrumentValidPath(String path){
        instrumentAPI.getAllInstrumentList(path);
    }

    @When("Send GET request for all instruments valid path")
    public void sendGetAllInstrumentValidPath() {
        SerenityRest.when().get(InstrumentAPI.GET_INSTRUMENTS_VALID_PATH);
    }
    @And("Validate get all instruments JSON Schema")
    public void validateGetAllInstrumentJSONSchema() {
        File json = new File(Constants.JSON_SCHEMA_DIR+"GetAllInstrumentJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @And("Get all instruments list with wrong path {string}")
    public void getAllInstrumentWrongPath(String path){
        instrumentAPI.getAllInstrumentList(path);
    }
    @When("Send GET request for all instruments wrong path")
    public void sendGetAllInstrumentWrongPath() {
        SerenityRest.when().get(InstrumentAPI.GET_INSTRUMENTS_INVALID_PATH);
    }
}
