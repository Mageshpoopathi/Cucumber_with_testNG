package stepDef;



import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDef1 {
	

	    private int total;

	    private Helper1 calculator;

	    @Before
	    private void init() {
	        total = -999;
	    }

	    @Given("^I have a calculator$")
	    public void initializeCalculator() throws Throwable {
	        calculator = new Helper1();
	    }

	    @When("I add {int} and {int}")
	    public void testAdd(int num1, int num2) throws Throwable {
	        total = calculator.add(num1, num2);
	    }

	    @Then("the result should be {int}")
	    public void validateResult(int result) throws Throwable {
	    	System.out.println("Expected="+result);
	    	System.out.println("Actual="+total);
	        Assert.assertEquals(result, total);
	        //ExtentCucumberAdapter.addTestStepLog(Status.PASS+": login button is clicked");
	    }
	


}

