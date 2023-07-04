package starter.MusicLab;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

import static starter.Utils.Constants.BASE_URL;

public class TransactionAPI {
    public static String POST_TRANSACTION = BASE_URL+"/transactions";
    public static String POST_TRANSACTION_INV = BASE_URL+"/transaction";
    public static String GET_TRANSACTION = BASE_URL+"/mentors/transactions?page={page}&limit={limit}";

//    Steps
    @Step("Post a transaction")
    public void postTransaction (File json) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+Constants.ACCESS_STUDENT)
                .contentType(ContentType.JSON).body(json);
    }

    @Step("Get a transaction Mentor")
    public void getTransactionMentor (int page, int limit) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+Constants.ACCESS_TOKEN_MENTOR)
                .pathParam(MusiclabResponses.PAGE, page)
                .pathParam(MusiclabResponses.LIMIT, limit);
    }

    @Step("Get a transaction Mentor invalid")
    public void getTransactionMentorInv (String page, String limit) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+Constants.ACCESS_TOKEN_MENTOR)
                .pathParam(MusiclabResponses.PAGE, page)
                .pathParam(MusiclabResponses.LIMIT, limit);
    }

    @Step("Get a transaction Student")
    public void getTransactionStudent (int page, int limit) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+Constants.ACCESS_TOKEN_STUDENT)
                .pathParam(MusiclabResponses.PAGE, page)
                .pathParam(MusiclabResponses.LIMIT, limit);
    }

    @Step("Get a transaction Student invalid")
    public void getTransactionStudentInv (String page, String limit) {
        SerenityRest.given()
                .header("Authorization", "Bearer "+Constants.ACCESS_TOKEN_STUDENT)
                .pathParam(MusiclabResponses.PAGE, page)
                .pathParam(MusiclabResponses.LIMIT, limit);
    }
}
