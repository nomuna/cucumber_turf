package org.example;

import io.cucumber.java8.En;
import static junit.framework.TestCase.assertEquals;

public class ShoppingStepsDef implements En {

    private int budget = 0;

    public ShoppingStepsDef() {
        Given("I have (\\d+) in my wallet", (Integer money) -> budget = money);
        When("I buy .* with (\\d+)", (Integer price) -> budget -= price);
        Then("I should have (\\d+) in my wallet", (Integer finalBudget) ->
                assertEquals(budget, finalBudget.intValue()));
    }
}
