package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PageBase {
    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "menu_admin_viewAdminModule")
    public WebElement adminButton;

    @FindBy(xpath = "//input[@name='chkSelectAll']")
    public WebElement checkBox;

    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> radioButtons;
    @FindBy(xpath ="//a[text()='Username']")
    public WebElement usernametext;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> descendingNames;
}
