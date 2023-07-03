package starter.StepDef.Instrument;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.InstrumentAPI;

public class GetInstrumentByMentorIdStepDef {
    @Steps
    InstrumentAPI instrumentAPI;

    @And("Get all instruments with valid parameter mentorId {int}")
    public void getAllInstrumentValidPath(int id){
        instrumentAPI.getAllInstrumentWithValidParamId(id);
    }

    @When("Send GET request for all instruments")
    public void sendGETRequestForAllInstruments() {
        SerenityRest.when().get(InstrumentAPI.GET_INSTRUMENT_BY_MENTOR_ID);
    }

    @And("Get all instruments with invalid parameter mentorId {string}")
    public void getAllInstrumentsWithInvalidParameterMentorId(String id) {
        instrumentAPI.getAllInstrumentWithInvalidParamId(id);
    }

    @And("Get all instruments with exceed parameter mentorId {int}")
    public void getAllInstrumentsWithExceedParameterMentorId(int id) {
        instrumentAPI.getAllInstrumentWithExceedParamId(id);
    }
}
