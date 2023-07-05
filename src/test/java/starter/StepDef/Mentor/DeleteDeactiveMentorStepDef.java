package starter.StepDef.Mentor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.MentorAPI;
import starter.Utils.Constants;

import javax.print.attribute.standard.MediaName;
import java.io.File;

public class DeleteDeactiveMentorStepDef {
    @Steps
    MentorAPI mentorAPI;

    // DELETE DEACTIVE MENTOR
    @And("Detele deactive mentor with valid path")
    public void deteleDeactiveMentorWithValidPath() {
        mentorAPI.deleteDeactiveMentor();
    }
    @When("Send DELETE request for deactive mentor")
    public void sendDELETERequestForDeactiveMentor() {
        SerenityRest.when().delete(MentorAPI.DELETE_DEACTIVE_MENTOR);
    }


}
