package starter.StepDef.Class;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.ClassAPI;

public class GetClassesStepDef {
    @Steps
    ClassAPI classAPI;

    @And("Get classes with valid parameter page {} {} {}")
    public void getClassesWithValidParameterPage(int id, int page, int limit) {
        classAPI.getClassesMentor(id, page, limit);
    }

    @When("Send GET request for classes")
    public void sendGETRequestForClasses() {
        SerenityRest.when().get(ClassAPI.GET_CLASSES);
    }

    @And("Get classes with invalid parameter page {} {} {}")
    public void getClassesWithInvalidParameterPage(String id, String page, String limit) {
        classAPI.getClassesMentorInv(id, page, limit);
    }

    @And("Get classes with blank parameter page {string} {string} {string}")
    public void getClassesWithBlankParameterPage(String id, String page, String limit) {
        classAPI.getClassesMentorInv(id, page, limit);
    }
}
