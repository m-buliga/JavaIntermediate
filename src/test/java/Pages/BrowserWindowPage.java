package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;


public class BrowserWindowPage extends CommonPage {

    public BrowserWindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "tabButton")
    private WebElement newTabButton;

    @FindBy(id = "sampleHeading")
    private WebElement sampleHeadingElement;

    @FindBy(id = "windowButton")
    private WebElement newWindowButton;

    @FindBy(id = "sampleHeading")
    private WebElement sampleHeadingWindowElement;


    public void interactWithTabs() {
        elementsMethods.clickElement(newTabButton);
        // returns all tabs open and then checks the newly opened one
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(1));
        System.out.println("Textul din noul tab este: " + sampleHeadingElement.getText());
        driver.close();
        driver.switchTo().window(tabList.get(0));
    }

    public void interactWithWindow() {
        elementsMethods.clickElement(newWindowButton);
        List<String> windowList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowList.get(1));
        System.out.println("Textul din noul window este: " + sampleHeadingWindowElement.getText());
        driver.close();
        driver.switchTo().window(windowList.get(0));
    }

}
