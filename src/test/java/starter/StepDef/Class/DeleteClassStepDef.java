package starter.StepDef.Class;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.ClassAPI;

public class DeleteClassStepDef {
    @Steps
    ClassAPI classAPI;
    @And("Delete a class with valid parameter page {}")
    public void deleteAClassWithValidParameterPage(int id) {
        classAPI.deleteClass(id);
    }

    @When("Send DELETE request for a class")
    public void sendDELETERequestForAClass() {
        SerenityRest.when().delete(ClassAPI.DELETE_CLASS);
    }

    @And("Delete a class with invalid parameter page {}")
    public void deleteAClassWithInvalidParameterPage(String id) {
        classAPI.deleteClassInv(id);
    }

    @And("Delete a class with blank parameter page {string}")
    public void deleteAClassWithBlankParameterPage(String id) {
        classAPI.deleteClassInv(id);
    }
}
