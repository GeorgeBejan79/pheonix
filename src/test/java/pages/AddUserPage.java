package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage {

        public AddUserPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }
        @FindBy(xpath="//input[@id='btnAdd']")
            public WebElement addButton;

        @FindBy(xpath = "//select[@id='systemUser_userType']")
            public WebElement userRole;

        @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
            public WebElement employeeName;

        @FindBy(xpath = "//input[@id='systemUser_userName']")
            public WebElement userName;

        @FindBy(xpath = "//select[@id='systemUser_status']")
            public WebElement status;

        @FindBy(xpath = "//input[@id='systemUser_password']")
        public WebElement password;

        @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
            public WebElement confirmPassword;
        @FindBy(xpath = "//input[@id='btnSave']")
        public WebElement saveButton;

//        public void sendKeys(String userName, String){
//            userName.sendKeys(userName);

        }

