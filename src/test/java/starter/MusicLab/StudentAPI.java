package starter.MusicLab;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

public class StudentAPI {
    public static String GET_STUDENT_VALID_PATH = Constants.BASE_URL+"/students/{path}";
    public static String GET_STUDENT_INVALID_PATH = Constants.BASE_URL+"/students/{path}";
    public static String PUT_EDIT_STUDENT_PROFILE_PATH = Constants.BASE_URL+"/students";
    public static String PUT_EDIT_STUDENT_PASSWORD_PATH = Constants.BASE_URL+"/students/password";
    public static String DELETE_STUDENT_VALID_PATH = Constants.BASE_URL+"/{path}";
    public static String DELETE_STUDENT_INVALID_PATH = Constants.BASE_URL+"/{path}";

    @Step("Get show student profile with path")
    public void getShowStudentProfile(String path){
        SerenityRest.given()
                .headers("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_STUDENT)
                .pathParam("path", path);
    }
    @Step("Put edit student profile with request body")
    public void putEditStudentProfile(File json){
        SerenityRest.given().headers("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_STUDENT)
                .contentType(ContentType.JSON).body(json);
    }
    @Step("Put edit student password with request body")
    public void putEditStudentPassword(File json){
        SerenityRest.given().headers("Authorization", "Bearer "+ Constants.ACCESS_TOKEN_STUDENT)
                .contentType(ContentType.JSON).body(json);
    }
    @Step("Delete student with path")
    public void deleteStudent(String path){
        SerenityRest.given().headers("Authorization", "Bearer "+ Constants.ACCESS_STUDENT)
                .pathParam("path", path);
    }
}
