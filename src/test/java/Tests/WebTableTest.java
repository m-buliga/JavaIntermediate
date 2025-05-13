package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelperMethods;
import Pages.CommonPage;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class WebTableTest {
    public WebDriver driver;
    public ElementsMethods elementsMethods;
    public JavaScriptHelperMethods javaScriptHelperMethods;
    public HomePage homePage;
    public CommonPage commonPage;

    @Test
    public void automationMethod() {
        // deschidem un browser chrome
        driver = new ChromeDriver();

        // accesam o pagina web
        driver.get("https://demoqa.com/");

        // maximize browser
        driver.manage().window().maximize();

        elementsMethods = new ElementsMethods(driver);
        javaScriptHelperMethods = new JavaScriptHelperMethods(driver);
        homePage = new HomePage(driver);
        commonPage = new CommonPage(driver);

        homePage.goToDesiredMenu("Elements");
        commonPage.goToDesiredSubMenu("Web Tables");

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
        javaScriptHelperMethods.scrollToElement(submitButton);
        elementsMethods.clickElement(submitButton);
    }
}
