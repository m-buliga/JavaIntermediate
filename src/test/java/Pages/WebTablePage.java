package Pages;

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
        elementsMethods.clickElement(addButton);
    }

    public void fillInAllDetails(String firstName, String lastName, String email, String age, String salary, String department) {
        elementsMethods.fillElement(firstNameInput, firstName);
        elementsMethods.fillElement(lastNameInput, lastName);
        elementsMethods.fillElement(emailInput, email);
        elementsMethods.fillElement(ageInput, age);
        elementsMethods.fillElement(salaryInput, salary);
        elementsMethods.fillElement(departmentInput, department);
    }
    public void submitRegistrationForm() {
        javaScriptHelperMethods.scrollBy(0, 300);
        elementsMethods.clickElement(submitButton);
    }

}
