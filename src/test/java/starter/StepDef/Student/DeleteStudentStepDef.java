package starter.StepDef.Student;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.StudentAPI;

public class DeleteStudentStepDef {
    @Steps
    StudentAPI studentAPI;

    @And("Delete student with valid path {string}")
    public void deleteStudentValidPath(String path){
        studentAPI.deleteStudent(path);
    }

    @When("Send DELETE request for delete student valid path")
    public void sendDELETERequestForDeleteStudentValidPath() {
        SerenityRest.when().delete(StudentAPI.DELETE_STUDENT_VALID_PATH);
    }

    @And("Delete student with wrong path {string}")
    public void deleteStudentInvalidPath(String path){
        studentAPI.deleteStudent(path);
    }
    @When("Send DELETE request for delete student wrong path")
    public void sendDELETERequestForDeleteStudentInvalidPath() {
        SerenityRest.when().delete(StudentAPI.DELETE_STUDENT_INVALID_PATH);
    }
}
