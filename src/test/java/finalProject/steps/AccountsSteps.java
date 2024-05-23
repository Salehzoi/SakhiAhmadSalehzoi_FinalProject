package finalProject.steps;

import finalProject.pages.AccountsPage;
import finalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class AccountsSteps extends SeleniumUtilities {



    @Then("user should see 5 rows per page by default")
    public void user_should_see_five_rows_per_page_by_default() {
        List<WebElement> rows = getDriver().findElements(AccountsPage.PRIMARY_ACCOUNTS_ALL_ROWS);
        Assert.assertEquals(5, rows.size());

    }

    @When("user selects the show per page option as (.*)$")
    public void user_selects_the_show_per_page_option_as(String selectedNumber) {
        selectFromDropDownByValue(AccountsPage.SHOW_PER_PAGE_OPTION, selectedNumber);
    }

    @Then("user should see (.*) rows per page$")
    public void user_should_see_rows_per_page(String expectedRows) {
        int actualRows = getDriver().findElements(AccountsPage.PRIMARY_ACCOUNTS_ALL_ROWS).size();
        Assert.assertEquals(Integer.parseInt(expectedRows), actualRows);

    }


    @Given("user is on the home page")
    public void userIsOnTheHomePage() {
        
    }

    @When("user clicks on the Login button")
    public void userClicksOnTheLoginButton() {
        
    }

    @And("user enters valid username {string} and valid password {string}")
    public void userEntersValidUsernameAndValidPassword(String arg0, String arg1) {
        
    }

    @And("user clicks on the Sign In button")
    public void userClicksOnTheSignInButton() {
    }
}

