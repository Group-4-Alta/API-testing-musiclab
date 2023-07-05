package starter.StepDef.Chat;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.ChatAPI;
import starter.Utils.Constants;

import java.io.File;

public class GetAllChatByIdStepDef {
    @Steps
    ChatAPI chatAPI;

    // GET ALL CHAT VALID
    @And("Get all chat by id student {int} and id mentor {int} that available")
    public void getAllChatByIdStudentAndIdMentorThatAvailable(int student, int mentor) {
        chatAPI.getAllChatValidPath(student, mentor);
    }

    @When("Send GET request for all chat by id student and id mentor")
    public void sendGETRequestForAllChatByIdStudentAndIdMentor() {
        SerenityRest.when().get(ChatAPI.GET_ALL_CHAT_VALID_PATH);
    }

    @And("Validate get all chat by id student and id mentor JSON Schema")
    public void validateGetAllChatByIdStudentAndIdMentorJSONSchema() {
        File json = new File(Constants.REQ_BODY_DIR+"PostSendMessageStudentExceedIdReqBody.json");
    }

    // GET ALL CHAT INVALID
    @And("Get all chat by id student {int} and id mentor {int} with invalid path")
    public void getAllChatByIdStudentAndIdMentorThatInvalidParameter(int student, int mentor) {
        chatAPI.getAllChatInvalidPath(student, mentor);
    }

    @When("Send GET request for all chat by id student and id mentor with invalid parameter")
    public void sendGETRequestForAllChatByIdStudentAndIdMentorWithInvalidParameter() {
        SerenityRest.when().get(ChatAPI.GET_ALL_CHAT_INVALID_PATH);
    }

}
