package starter.StepDef.Transaction;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.MusicLab.TransactionAPI;

public class GetTransactionStepDef {
    @Steps
    TransactionAPI transactionAPI;

    @And("Get mentor transactions with valid parameter {} {}")
    public void getMentorTransactionsWithValidParameter(int page, int limit) {
        transactionAPI.getTransactionMentor(page, limit);
    }

    @When("Send GET request for mentor transactions")
    public void sendGETRequestForMentorTransactions() {
        SerenityRest.when().get(TransactionAPI.GET_TRANSACTION);
    }

    @And("Get mentor transactions with invalid parameter {} {}")
    public void getMentorTransactionsWithInvalidParameter(String page, String limit) {
        transactionAPI.getTransactionMentorInv(page, limit);
    }

    @And("Get mentor transactions with blank parameter page {string} {string}")
    public void getMentorTransactionsWithBlankParameterPage(String page, String limit) {
        transactionAPI.getTransactionMentorInv(page, limit);
    }

    @And("Get student transactions with valid parameter {} {}")
    public void getStudentTransactionsWithValidParameter(int page, int limit) {
        transactionAPI.getTransactionStudent(page, limit);
    }

    @And("Get student transactions with invalid parameter {} {}")
    public void getStudentTransactionsWithInvalidParameter(String page, String limit) {
        transactionAPI.getTransactionStudentInv(page, limit);
    }

    @And("Get student transactions with blank parameter page {string} {string}")
    public void getStudentTransactionsWithBlankParameterPage(String page, String limit) {
        transactionAPI.getTransactionStudentInv(page, limit);
    }
}
