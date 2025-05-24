package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends CommonPage {

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "frame1")
    private WebElement frame1Field;

    @FindBy(id = "sampleHeading")
    private WebElement sampleFrameHeadingElement;

    @FindBy(id = "frame2")
    private WebElement frame2Field;

    public void interactWithFrame1() {
        driver.switchTo().frame(frame1Field);
        System.out.println("Textul din primul frame este: " + sampleFrameHeadingElement.getText());
    }

    public void interactWithFrame2() {
        driver.switchTo().frame(frame2Field);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 200)");
    }


}
