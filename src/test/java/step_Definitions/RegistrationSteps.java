package step_Definitions;

import com.pages.RegisterUserPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class RegistrationSteps {

    RegisterUserPage registerUserPage =  new RegisterUserPage(DriverFactory.getDriver());
    SoftAssert softAssert= new SoftAssert();
    @Given("User is on registration page")
    public void user_is_on_registration_page() {
       registerUserPage.goToPage();
    }

    @Given("User fills Last name field {string}")
    public void user_fills_last_name_field(String string) {
        registerUserPage.setLAST_NAME(string);
    }

    @Given("User fills Email field {string}")
    public void user_fills_email_field(String string) {
        registerUserPage.setEMAIL(string);
    }

    @Given("User fills Password field {string}")
    public void user_fills_password_field(String string) {
        registerUserPage.setPASSWORD(string);
    }

    @Given("User fills Confirm Password filed {string}")
    public void user_fills_confirm_password_filed(String string) {
       registerUserPage.setCONFIRM_PASSWORD(string);
    }

    /// confusion with the empty field methods ///
    @When("User keeps the First name field empty {string}")
    public void user_keeps_the_first_name_field_empty(String string) {
        registerUserPage.setFirstName(string);
    }

    @When("User clicks Registration button")
    public void user_clicks_registration_button() {
        registerUserPage.clickRegBtn();
    }

    @Then("User should see First Name required message {string}")
    public void user_should_see_first_name_required_message(String string) {
        softAssert.assertEquals(string, registerUserPage.FirstNameError());
        softAssert.assertAll();
    }

    @Given("User fills First name field {string}")
    public void user_fills_first_name_field(String string) {
        registerUserPage.setFirstName(string);
    }

    @When("User keeps the Last name field empty {string}")
    public void user_keeps_the_last_name_field_empty(String string) {
        registerUserPage.setLAST_NAME(string);
    }

    @Then("User should see Last Name required message {string}")
    public void user_should_see_last_name_required_message(String string) {
        softAssert.assertEquals(string, registerUserPage.LastNameError());
        softAssert.assertAll();
    }

    @When("User keeps the Email field empty {string}")
    public void user_keeps_the_email_field_empty(String string) {
        registerUserPage.setEMAIL(string);
    }

    @Then("User should see Email required message {string}")
    public void user_should_see_email_required_message(String string) {
        softAssert.assertEquals(string, registerUserPage.EmailError1());
        softAssert.assertAll();
    }

    @When("User keeps the Password field empty {string}")
    public void user_keeps_the_password_field_empty(String string) {
        registerUserPage.setPASSWORD(string);
    }

    @Then("User should see 1st warning message {string}")
    public void user_should_see_1st_warning_message(String string) {
        softAssert.assertEquals(string, registerUserPage.PassError2());
        softAssert.assertAll();
    }

    @Then("User should see 2nd warning message {string}")
    public void user_should_see_2nd_warning_message(String string) {
        softAssert.assertEquals(string, registerUserPage.PassError3());
        softAssert.assertAll();
    }

    @Given("User fills Password filed {string}")
    public void user_fills_password_filed(String string) {
        registerUserPage.setPASSWORD(string);
    }

    @When("User keeps the Confirm Password field empty {string}")
    public void user_keeps_the_confirm_password_field_empty(String string) {
        registerUserPage.setCONFIRM_PASSWORD(string);
    }

    @Then("User should see Password required message {string}")
    public void user_should_see_password_required_message(String string) {
        softAssert.assertEquals(string, registerUserPage.PassError5());
        softAssert.assertAll();
    }

    @Then("User should see mismatched password message {string}")
    public void user_should_see_mismatched_password_message(String string) {
        softAssert.assertEquals(string, registerUserPage.PassError4());
    }

    @Then("User should see invalid email message {string}")
    public void user_should_see_invalid_email_message(String string) {
        softAssert.assertEquals(string, registerUserPage.EmailError2());
        softAssert.assertAll();
    }

    @Then("User should see invalid password length message {string}")
    public void user_should_see_invalid_password_length_message(String string) {
        softAssert.assertEquals(string, registerUserPage.PassError1().replace("\n", ""));
        softAssert.assertAll();
    }

    @Then("User should see email already exists message {string}")
    public void user_should_see_email_already_exists_message(String string) {
        String errorText = registerUserPage.EmailError3();
        softAssert.assertEquals(string, errorText);
        softAssert.assertAll();
    }

    @Then("User should see confirmation message {string}")
    public void user_should_see_confirmation_message(String string) {
        String errOr= registerUserPage.ConfirmReg();
        softAssert.assertEquals(string, errOr);
        softAssert.assertAll();
    }

}
