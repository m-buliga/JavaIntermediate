package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebTableTest {
    public WebDriver driver;

    @Test
    public void automationMethod () {
        // deschidem un browser chrome
        driver = new ChromeDriver();

        // accesam o pagina web
        driver.get("https://demoqa.com/");

        // maximize browser
        driver.manage().window().maximize();

        // declaram un element, scroll pana la el si click
        WebElement elementsField = driver.findElement(By.xpath("//h5[text()='Elements']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementsField);
        elementsField.click();

        WebElement webTableField = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        webTableField.click();

        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();

        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        String firstNameInputValue = "Kate";
        firstNameInput.sendKeys(firstNameInputValue);

        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        String lastNameInputValue = "Smith";
        lastNameInput.sendKeys(lastNameInputValue);

        WebElement emailInput = driver.findElement(By.id("userEmail"));
        String emailInputValue = "ksmith@gmail.com";
        emailInput.sendKeys(emailInputValue);

        WebElement ageInput = driver.findElement(By.id("age"));
        String ageInputValue = "20";
        ageInput.sendKeys(ageInputValue);

        WebElement salaryInput = driver.findElement(By.id("salary"));
        String salaryInputValue = "25000";
        salaryInput.sendKeys(salaryInputValue);

        WebElement departmentInput = driver.findElement(By.id("department"));
        String departmentInputValue = "Testing";
        departmentInput.sendKeys(departmentInputValue);

        WebElement submitButton = driver.findElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);
        submitButton.click();
    }
}
