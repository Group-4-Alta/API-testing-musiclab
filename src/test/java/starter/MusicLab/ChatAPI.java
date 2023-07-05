package starter.MusicLab;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

public class ChatAPI {
    public static String POST_SEND_MESSAGE = Constants.BASE_URL + "/chats";
    public static String GET_ALL_CHAT_VALID_PATH = Constants.BASE_URL + "/chats?mentor={mentor}&student={student}";
    public static String GET_ALL_CHAT_INVALID_PATH = Constants.BASE_URL + "/chats?mentor={mentor}/student={student}";
    public static String GET_ALL_CHAT_GROUP = Constants.BASE_URL + "/inbox?page={page}&limit={limit}";

    @Step("Post Send Message by Mentor")
    public void postSendMessageByMentor(File json) {
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.ACCESS_TOKEN_MENTOR)
                .contentType(ContentType.JSON).body(json);
    }

    @Step("Post Send Message by Student")
    public void postSendMessageByStudent(File json) {
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.ACCESS_TOKEN_STUDENT)
                .contentType(ContentType.JSON).body(json);
    }

    @Step("Get All Chat with Valid Path")
    public void getAllChatValidPath(int mentor, int student) {
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("mentor", mentor)
                .pathParam("student", student);
    }

    @Step("Get All Chat with Invalid Path")
    public void getAllChatInvalidPath(int mentor, int student) {
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("mentor", mentor)
                .pathParam("student", student);
    }

    @Step("Get All Chat Group with Valid Parameter")
    public void getAllChatGroup(int page, int limit) {
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("page", page)
                .pathParam("limit", limit);
    }

    @Step("Get All Chat Group with Invalid Parameter")
    public void getAllChatGroupInvalidParam(String page, String limit) {
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("page", page)
                .pathParam("limit", limit);
    }
}