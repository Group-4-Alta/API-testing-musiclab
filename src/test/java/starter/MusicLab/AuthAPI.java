package starter.MusicLab;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

import static starter.Utils.Constants.BASE_URL;

public class AuthAPI {
    public static String POST_LOGIN = BASE_URL+"/login";
    public static String POST_LOGIN_INV = BASE_URL+"/logi";
    public static String POST_REGISTER = BASE_URL+"/register";
    public static String POST_REGISTER_INV = BASE_URL+"/registeer";

//    Steps
    @Step("Post login")
    public void postLogin (File json) {
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Post register")
    public void postRegister (File json) {
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }
}
