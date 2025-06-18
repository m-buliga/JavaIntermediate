package Pages;

import Logger.LoggerUtility;
import ObjectData.WebTableObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WebTablePage extends CommonPage {

    public WebTablePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "addNewRecordButton")
    private WebElement addButton;

    @FindBy(id = "firstName")
    private WebElement firstNameInput;

    @FindBy(id = "lastName")
    private WebElement lastNameInput;

    @FindBy(id = "userEmail")
    private WebElement emailInput;

    @FindBy(id = "age")
    private WebElement ageInput;

    @FindBy(id = "salary")
    private WebElement salaryInput;

    @FindBy(id = "department")
    private WebElement departmentInput;

    @FindBy(id = "submit")
    private WebElement submitButton;

    public void openRegistrationForm() {
        javaScriptHelperMethods.scrollToElement(driver, addButton);
        elementsMethods.clickElement(addButton);
        LoggerUtility.infoLog("The user opened the registration form.");
    }

    public void fillInAllDetails(WebTableObject webTableObject) {
        elementsMethods.fillElement(firstNameInput, webTableObject.getFirstName());
        elementsMethods.fillElement(lastNameInput, webTableObject.getLastName());
        elementsMethods.fillElement(emailInput, webTableObject.getEmail());
        elementsMethods.fillElement(ageInput, webTableObject.getAge());
        elementsMethods.fillElement(salaryInput, webTableObject.getSalary());
        elementsMethods.fillElement(departmentInput, webTableObject.getDepartment());
        LoggerUtility.infoLog("The user filled in the registration form info.");
    }
    public void submitRegistrationForm() {
        javaScriptHelperMethods.scrollBy(0, 300);
        elementsMethods.clickElement(submitButton);
        LoggerUtility.infoLog("The user submitted the registration form.");
    }

}
