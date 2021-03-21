package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.PageBase;
import utils.ConfigReader;
import utils.Driver;
import java.util.concurrent.TimeUnit;
public class OrangeSteps {
    WebDriver driver;
    HomePage homepage;
    PageBase pageBase;
    Actions actions;

    @Given("the user navigates to url")
    public void the_user_navigates_to_https_opensource_demo_orangehrmlive_com_index_php_auth_login() {
        driver= Driver.getDriver();
        driver.get(ConfigReader.getProperty("url"));
        homepage=new HomePage(driver);
        pageBase = new PageBase(driver);

    }
    @When("user enter credentials")
    public void user_enter_credentials() throws InterruptedException {
        homepage.login(ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));
    }

    @Then("user click the Admin function")
    public void user_click_the_admin_function() {
        pageBase.adminButton.click();

    }
    @Then("click the first check box next to the Username")
    public void click_the_first_check_box_next_to_the_username() {
        pageBase.checkBox.click();
        // Find common xpath for all radio buttons
        // In the page class findElements
        // You are gonna loop in all elements and check that if they are selected.

    }
    @Then("validate that all the checkboxes are selected")
    public void validate_that_all_the_checkboxes_are_selected() {
        for (int i = 0; i <pageBase.radioButtons.size() ; i++) {  //we validate if all the checkboxes are selected
            Assert.assertTrue(pageBase.radioButtons.get(i).isSelected());
        }
    }
    @Then("user click on top of Username two times")
    public void user_click_on_top_of_username_two_times() throws InterruptedException {
        String url = pageBase.usernametext.getAttribute("href");
        Actions actions = new Actions(driver);
        if(url.endsWith("ASC")) {
            actions.doubleClick(pageBase.usernametext).build().perform();
            Thread.sleep(5000);
            actions.doubleClick(pageBase.usernametext).build().perform();
        } else {
            actions.doubleClick(pageBase.usernametext).build().perform();
        }
    }
    @Then("validate usernames are listed in descending order")
    public void validate_usernames_are_listed_in_descending_order() throws InterruptedException {
        for (int i = 0; i+1 < pageBase.descendingNames.size(); i++) {
            Thread.sleep(250);
            // pageBase.descendingNames.get(i+1)
            JavascriptExecutor js=(JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,document.body.scrollHeight/2)");
            System.out.println(pageBase.descendingNames.get(i).getText().charAt(0) + " "+ pageBase.descendingNames.get(i+1).getText().charAt(0));
            System.out.println("============================================");
                Assert.assertTrue(pageBase.descendingNames.get(i).getText().trim().charAt(0)>=
                        pageBase.descendingNames.get(i+1).getText().trim().charAt(0));
            }

        }

    }


