package fizzBuzz;

import io.cucumber.java8.En;
import fizzBuzz.FizzBuzz;
import org.junit.Assert;


public class IsItFizzOrBuzzSteps implements En {

    private int number;

    private String answer;

    public IsItFizzOrBuzzSteps() {
        Given("The number is 1" , () -> {
            this.number = 1;
        });
        Given("The number is 4" , () -> {
            this.number = 4;
        });
        Given("The number is 19" , () -> {
            this.number = 19;
        });
        Given("The number is 3" , () -> {
            this.number = 3;
        });
        Given("The number is 9" , () -> {
            this.number = 9;
        });
        Given("The number is 12" , () -> {
            this.number = 12;
        });
        Given("The number is 20" , () -> {
            this.number = 20;
        });
        Given("The number is 5" , () -> {
            this.number = 5;
        });
        Given("The number is 50" , () -> {
            this.number = 50;
        });
        Given("The number is 30" , () -> {
            this.number = 30;
        });
        Given("The number is 15" , () -> {
            this.number = 15;
        });
        Given("The number is 45" , () -> {
            this.number = 45;
        });

        When("I ask is it Fizz, Buzz or FizzBuzz?", () -> {
            FizzBuzz fizzBuzz = new FizzBuzz();
            this.answer = fizzBuzz.fizzBuzz(number);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
