package starter.StepDef.Instrument;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.InstrumentAPI;
import starter.MusicLab.StudentAPI;
import starter.Utils.Constants;

import java.io.File;

public class PostMentorInstrumentStepDef {
    @Steps
    InstrumentAPI instrumentAPI;

    @And("Post mentor instrument with valid request body")
    public void postMentorInstrumentValidReqBody(){
        File json = new File(Constants.REQ_BODY_DIR+"PostMentorInstrumentValidReqBody.json");
        instrumentAPI.postMentorInstrument(json);
    }
    @When("Send POST request for mentor instrument")
    public void sendPostMentorInstrument(){
        SerenityRest.when().post(InstrumentAPI.POST_MENTOR_INSTRUMENT_PATH);
    }

    @And("Post mentor instrument with invalid request body")
    public void postMentorInstrumentWithInvalidReqBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostMentorInstrumentInvalidReqBody.json");
        instrumentAPI.postMentorInstrument(json);
    }

    @And("Post mentor instrument with exceed request body instrumentId")
    public void postMentorInstrumentWithExceedRequestBodyInstrumentId() {
        File json = new File(Constants.REQ_BODY_DIR+"PostMentorInstrumentExceedInstrumentIdReqBody.json");
        instrumentAPI.postMentorInstrument(json);
    }
}
