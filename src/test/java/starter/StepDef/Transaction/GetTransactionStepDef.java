package starter.StepDef.Transaction;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class GetTransactionStepDef {
    @And("Get mentor transactions with valid parameter {} {}")
    public void getMentorTransactionsWithValidParameter(int page, int limit) {
    }

    @When("Send GET request for mentor transactions")
    public void sendGETRequestForMentorTransactions() {
    }
}
