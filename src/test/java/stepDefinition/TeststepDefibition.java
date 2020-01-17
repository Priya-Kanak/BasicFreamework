package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class TeststepDefibition {

	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	private String ENDPOINT = "http://dummy.restapiexample.com/api/v1/employees";

@Given("^I set base url$")
public void i_set_base_url() throws Throwable {

	System.out.println("Starting of sample get request");
	
}

@When("^i hit get request$")
public void i_hit_get_request() throws Throwable {

	response= given().relaxedHTTPSValidation().get(ENDPOINT);
}

@Then("^I validate success response$")
public void i_validate_success_response() throws Throwable {

	json = response.then().statusCode(400);
}

}
