package starter.StepDef.Class;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.ClassAPI;
import starter.MusicLab.MusiclabResponses;
import static org.hamcrest.Matchers.equalTo;

public class GetClassDetailStepDef {
    @Steps
    ClassAPI classAPI;

    @And("Get a mentor class with valid parameter page {}")
    public void getAMentorClassWithValidParameterPage(int id) {
        classAPI.getClassDetail(id);
    }

    @When("Send GET request for mentor class")
    public void sendGETRequestForMentorClass() {
        SerenityRest.when().get(ClassAPI.GET_CLASS_DETAIL);
    }

    @And("Validate response body id should be id {}")
    public void validateResponseBodyIdShouldBeId(int id) {
        SerenityRest.and()
                .body("data.id", equalTo(id));
    }

    @And("Get a mentor class with invalid parameter page {}")
    public void getAMentorClassWithInvalidParameterPage(String id) {
        classAPI.getClassDetailInv(id);
    }

    @And("Get a mentor class with blank parameter page")
    public void getAMentorClassWithBlankParameterPage(String id) {
        classAPI.getClassDetailInv(id);
    }
}
