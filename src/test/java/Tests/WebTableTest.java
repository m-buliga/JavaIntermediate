package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelperMethods;
import Pages.CommonPage;
import Pages.HomePage;
import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class WebTableTest extends ShareData {

    public ElementsMethods elementsMethods;
    public JavaScriptHelperMethods javaScriptHelperMethods;
    public HomePage homePage;
    public CommonPage commonPage;

    @Test
    public void automationMethod() {

        elementsMethods = new ElementsMethods(getDriver());
        javaScriptHelperMethods = new JavaScriptHelperMethods(getDriver());
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());

        homePage.goToDesiredMenu("Elements");
        commonPage.goToDesiredSubMenu("Web Tables");

        WebElement addButton = getDriver().findElement(By.id("addNewRecordButton"));
        elementsMethods.clickElement(addButton);

        WebElement firstNameInput = getDriver().findElement(By.id("firstName"));
        elementsMethods.fillElement(firstNameInput, "Kate");

        WebElement lastNameInput = getDriver().findElement(By.id("lastName"));
        elementsMethods.fillElement(lastNameInput, "Smith");

        WebElement emailInput = getDriver().findElement(By.id("userEmail"));
        elementsMethods.fillElement(emailInput, "ksmith@gmail.com");

        WebElement ageInput = getDriver().findElement(By.id("age"));
        elementsMethods.fillElement(ageInput, "20");

        WebElement salaryInput = getDriver().findElement(By.id("salary"));
        elementsMethods.fillElement(salaryInput, "25000");

        WebElement departmentInput = getDriver().findElement(By.id("department"));
        elementsMethods.fillElement(departmentInput, "Testing");

        WebElement submitButton = getDriver().findElement(By.id("submit"));
        javaScriptHelperMethods.scrollToElement(submitButton);
        elementsMethods.clickElement(submitButton);
    }
}
