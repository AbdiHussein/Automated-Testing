package com.qa.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculatorSteps {

    private Calculator calculator;
    private int additionNumber;
    private int subtractionNumber;
    private int multiplicationNumber;
    private int divisionNumber;

    @Given("^A calculator$")
    public void createCalculator(){
        calculator = new Calculator();
    }

    @When("^I use the addition functionality for numbers 5 and 5$")
    public void addTwoNumbers(){
        additionNumber = calculator.addition(5,5);
    }

    @Then("^the result will be 10$")
    public void numberEqualsA(){
        assertEquals(additionNumber, 10);
    }

    @When("^I use the subtraction functionality for numbers 6 and 5$")
    public void subtractTwoNumbers() {subtractionNumber= calculator.subtraction(6, 5);}

    @Then("^the result will be 1$")
    public void numberEqualsS() {assertEquals(subtractionNumber, 1);}

    @When("^I use the multiplication functionality for numbers 2 and 3$")
    public void multiplyTwoNumbers() {multiplicationNumber = calculator.multiplication(2,3);}

    @Then("^the result will be 6$")
    public void numberEqualsM() {assertEquals(multiplicationNumber, 6);}

    @When("^I use the division functionality for numbers 6 and 3")
    public void divideTwoNumbers() {divisionNumber = calculator.division(6,3);}

    @Then("^the result will be 2$")
    public void numberEqualsD() {assertEquals(divisionNumber,2);}

}
