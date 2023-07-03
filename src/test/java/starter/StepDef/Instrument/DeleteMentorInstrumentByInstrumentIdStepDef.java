package starter.StepDef.Instrument;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.InstrumentAPI;

public class DeleteMentorInstrumentByInstrumentIdStepDef {
    @Steps
    InstrumentAPI instrumentAPI;

    @And("Delete mentor instrument with valid parameter instrumentId {int}")
    public void deleteMentorInstrumentValidParamId(int id){
        instrumentAPI.deleteMentorInstrumentValidParamId(id);
    }
    @When("Send DELETE request for delete mentor instrument")
    public void sendDELETERequestForDeleteMentorInstrument() {
        SerenityRest.when().delete(InstrumentAPI.DELETE_INSTRUMENT_BY_INSTRUMENT_ID);
    }

    @And("Delete mentor instrument with invalid parameter instrumentId {string}")
    public void deleteMentorInstrumentInvalidParamId(String id){
        instrumentAPI.deleteMentorInstrumentInvalidParamId(id);
    }

    @And("Delete mentor instrument with exceed parameter instrumentId {int}")
    public void deleteMentorInstrumentWithExceedParamId(int id) {
        instrumentAPI.deleteMentorInstrumentExceedParamId(id);
    }
}
