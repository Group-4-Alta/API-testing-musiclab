package starter.StepDef.Chat;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.ChatAPI;
import starter.Utils.Constants;

import java.io.File;

public class GetAllChatGroupStepDef {
    @Steps
    ChatAPI chatAPI;

    // CHAT GROUP WITH VALID PARAMETER
    @And("Get all chat group by student with valid parameter page {int}, limit {int}")
    public void getAllChatGroupByStudentWithValidParameterPageLimit(int page, int limit) {
        chatAPI.getAllChatGroup(page, limit);
    }

    @When("Send GET request for all chat group by student")
    public void sendGETRequestForAllChatGroupByStudent() {
        SerenityRest.when().get(ChatAPI.GET_ALL_CHAT_GROUP);
    }

    @And("Validate get all chat group JSON Schema")
    public void validateGetAllChatGroupJSONSchema() {
        File json = new File(Constants.JSON_SCHEMA_DIR + "GetAllChatGroup.json");
    }

    // CHAT GROUP WITH INVALID PARAMETER
    @And("Get all chat group by student with valid parameter page {string}, limit {string}")
    public void getAllChatGroupByStudentWithValidParameterPageLima(String page, String limit) {
        chatAPI.getAllChatGroupInvalidParam(page, limit);
    }

    @When("Send GET request for all chat group by student with invalid parameter")
    public void sendGETRequestForAllChatGroupByStudentWithInvalidParameter() {
        SerenityRest.when().get(ChatAPI.GET_ALL_CHAT_GROUP);
    }

}
