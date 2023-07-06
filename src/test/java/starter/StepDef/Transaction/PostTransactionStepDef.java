package starter.StepDef.Transaction;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.TransactionAPI;
import starter.Utils.Constants;

import java.io.File;

public class PostTransactionStepDef {
    @Steps
    TransactionAPI transactionAPI;

    @And("Post a transaction with valid and complete JSON body")
    public void postATransactionWithValidAndCompleteJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostTransactionReqBody.json");
        transactionAPI.postTransaction(json);
    }

    @When("Send POST request for transactions")
    public void sendPOSTRequestForTransactions() {
        SerenityRest.when().post(TransactionAPI.POST_TRANSACTION);
    }

    @And("Validate Transaction Message JSON Schema")
    public void validateTransactionMessageJSONSchema() {
        File json = new File(Constants.JSON_SCHEMA_DIR+"TransactionMessage.json");
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @And("Post a transaction with incomplete JSON body")
    public void postATransactionWithIncompleteJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostTransactionIncReqBody.json");
        transactionAPI.postTransaction(json);
    }

    @And("Post a transaction with invalid JSON body")
    public void postATransactionWithInvalidJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"PostTransactionInvReqBody.json");
        transactionAPI.postTransaction(json);
    }

    @And("Post a transaction with blank JSON body")
    public void postATransactionWithBlankJSONBody() {
        File json = new File(Constants.REQ_BODY_DIR+"BlankTransactionReqBody.json");
        transactionAPI.postTransaction(json);
    }

    @And("Post a transaction with invalid parameter page")
    public void postATransactionWithInvalidParameterPage() {
        File json = new File(Constants.REQ_BODY_DIR+"PostTransactionReqBody.json");
        transactionAPI.postTransaction(json);
    }

    @When("Send POST request for transactions invalid")
    public void sendPOSTRequestForTransactionsInvalid() {
        SerenityRest.when().post(TransactionAPI.POST_TRANSACTION_INV);
    }
}
