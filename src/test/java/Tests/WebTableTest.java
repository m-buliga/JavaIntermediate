package Tests;

import HelperMethods.ElementsMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebTableTest {
    public WebDriver driver;
    public ElementsMethods elementsMethods;

    @Test
    public void automationMethod () {
        // deschidem un browser chrome
        driver = new ChromeDriver();

        // accesam o pagina web
        driver.get("https://demoqa.com/");

        // maximize browser
        driver.manage().window().maximize();

        elementsMethods = new ElementsMethods(driver);

        // declaram un element, scroll pana la el si click
        WebElement elementsField = driver.findElement(By.xpath("//h5[text()='Elements']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementsField);
        elementsMethods.clickElement(elementsField);

        WebElement webTableField = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        elementsMethods.clickElement(webTableField);

        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        elementsMethods.clickElement(addButton);

        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        elementsMethods.fillElement(firstNameInput, "Kate");

        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        elementsMethods.fillElement(lastNameInput, "Smith");

        WebElement emailInput = driver.findElement(By.id("userEmail"));
        elementsMethods.fillElement(emailInput, "ksmith@gmail.com");

        WebElement ageInput = driver.findElement(By.id("age"));
        elementsMethods.fillElement(ageInput, "20");

        WebElement salaryInput = driver.findElement(By.id("salary"));
        elementsMethods.fillElement(salaryInput, "25000");

        WebElement departmentInput = driver.findElement(By.id("department"));
        elementsMethods.fillElement(departmentInput, "Testing");

        WebElement submitButton = driver.findElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);
        elementsMethods.clickElement(submitButton);
    }
}
