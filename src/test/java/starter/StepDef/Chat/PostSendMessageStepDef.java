package starter.StepDef.Chat;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.ChatAPI;
import starter.Utils.Constants;

import java.io.File;

public class PostSendMessageStepDef {
    @Steps
    ChatAPI chatAPI;


    // POST MENTOR SEND MESSAGE AVAILABLE ID
    @Given("Post mentor send message to student with available id")
    public void postMentorSendMessageToStudentWithAvailableId() {
        File json = new File(Constants.REQ_BODY_DIR+"PostSendMessageMentorReqBody.json");
        chatAPI.postSendMessageByMentor(json);
    }

    @When("Send POST request for message to student")
    public void sendPOSTRequestForMessageToStudentOrTeacher() {
        SerenityRest.when().post(ChatAPI.POST_SEND_MESSAGE);
    }

    // POST MENTOR SEND MESSAGE EXCEED ID
    @And("Post mentor send message to student with exceed id")
    public void postMentorSendMessageToStudentWithExceedId() {
        File json = new File(Constants.REQ_BODY_DIR+"PostSendMessageMentorExceedIdReqBody.json");
        chatAPI.postSendMessageByMentor(json);
    }

    // POST STUDENT SEND MESSAGE AVAILABLE ID
    @And("Post student send message to mentor with available id")
    public void postStudentSendMessageToMentorWithAvailableId() {
        File json = new File(Constants.REQ_BODY_DIR+"PostSendMessageStudentReqBody.json");
        chatAPI.postSendMessageByStudent(json);
    }

    @When("Send POST request for message to mentor")
    public void sendPOSTRequestForMessageToMentor() {
        SerenityRest.when().post(ChatAPI.POST_SEND_MESSAGE);
    }

    // POST STUDENT SEND MESSAGE EXCEED ID
    @And("Post student send message to mentor with exceed id")
    public void postStudentSendMessageToMentorWithExceedId() {
        File json = new File(Constants.REQ_BODY_DIR+"PostSendMessageStudentExceedIdReqBody.json");
        chatAPI.postSendMessageByStudent(json);
    }

}
