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
        LoggerUtility.infoLog("The user filled in the First Name input with " + webTableObject.getFirstName() + " value.");
        elementsMethods.fillElement(lastNameInput, webTableObject.getLastName());
        LoggerUtility.infoLog("The user filled in the Last Name input with " + webTableObject.getLastName() + " value.");
        elementsMethods.fillElement(emailInput, webTableObject.getEmail());
        LoggerUtility.infoLog("The user filled in the Email input with " + webTableObject.getEmail() + " value.");
        elementsMethods.fillElement(ageInput, webTableObject.getAge());
        LoggerUtility.infoLog("The user filled in the Age input with " + webTableObject.getAge() + " value.");
        elementsMethods.fillElement(salaryInput, webTableObject.getSalary());
        LoggerUtility.infoLog("The user filled in the Salary input with " + webTableObject.getSalary() + " value.");
        elementsMethods.fillElement(departmentInput, webTableObject.getDepartment());
        LoggerUtility.infoLog("The user filled in the Department input with " + webTableObject.getDepartment() + " value.");
    }
    public void submitRegistrationForm() {
        javaScriptHelperMethods.scrollBy(0, 300);
        elementsMethods.clickElement(submitButton);
        LoggerUtility.infoLog("The user submitted the registration form.");
    }

}
