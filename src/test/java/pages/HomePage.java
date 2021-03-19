package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver) { //this one is used only to connect with home page
        super(driver);
    }
        @FindBy(xpath="//input[@id='txtUsername']")
        public WebElement username;
        @FindBy(xpath="//input[@name='txtPassword']")
        public WebElement password;
        @FindBy(xpath="//input[@id='btnLogin']")
        public WebElement loginButton;

        public void login(String username,String password) throws InterruptedException {
            Thread.sleep(3000);
            this.username.sendKeys(username);
            this.password.sendKeys(password);
            this.loginButton.click();
        }
    }
