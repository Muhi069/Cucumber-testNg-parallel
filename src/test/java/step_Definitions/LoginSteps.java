package step_Definitions;

//import com.github.javafaker.Faker;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {

    private static String title;

//    Faker faker= new Faker();
//    String firstName= faker.name().firstName();
//    String lastName= faker.name().lastName();
//    String email= faker.internet().emailAddress();
    private static String errorMessage;
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("user is on home page")
    public void user_is_on_home_page() {
        loginPage.goToHomePage();
    }

    @When("user click on my login page")
    public void user_click_on_my_login_page() {
        loginPage.navigateToLoginPage();
    }

    @When("user gets the title of the page")
    public void user_gets_the_title_of_the_page() {
        title = loginPage.getLoginPageTitle();
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String expectedTitleName) {
        Assert.assertTrue(title.contains(expectedTitleName));
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        loginPage.goToLoginPage();
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
        loginPage.enterUserName(username);
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("user clicks on Login button")
    public void user_clicks_on_login_button() {
        loginPage.clickOnLogin();
    }

    @Then("user should see error message {string}")
    public void user_should_see_error_message(String expatErrMessage) {
        errorMessage = loginPage.errorMessage().replace("\n","");

        System.out.println(errorMessage);
        Assert.assertTrue(errorMessage.contains(expatErrMessage));
    }

    @Then("user should see error message as {string}")
    public void user_should_see_error_message_as(String expatErrMessage) {
        errorMessage = loginPage.errorMessage2();

        System.out.println(errorMessage);
        Assert.assertTrue(errorMessage.contains(expatErrMessage));
    }


    @When("user click on my account page")
    public void user_click_on_my_account_page() {
        loginPage.clickOnAccountPage();
    }
}
