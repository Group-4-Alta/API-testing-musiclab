package starter.MusicLab;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

import static starter.Utils.Constants.BASE_URL;

public class AuthAPI {
public static String POST_LOGIN = BASE_URL+"/login";
public static String POST_LOGIN_INV = BASE_URL+"/logi";

//    Steps
    @Step("Post login")
    public void postLogin (File json) {
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }
}
