package Pages;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelperMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormPage {
    WebDriver driver;
    ElementsMethods elementsMethods;
    JavaScriptHelperMethods javaScriptHelperMethods;

    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
        this.elementsMethods = new ElementsMethods(driver);
        this.javaScriptHelperMethods = new JavaScriptHelperMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstName")
    WebElement firstNameElement;

    @FindBy(id = "lastName")
    WebElement lastNameElement;

    @FindBy(id = "userEmail")
    WebElement emailElement;

    @FindBy(xpath = "//label[@for='gender-radio-1']")
    WebElement maleGenderElement;

    @FindBy(xpath = "//label[@for='gender-radio-2']")
    WebElement femaleGenderElement;

    @FindBy(xpath = "//label[@for='gender-radio-3']")
    WebElement otherGenderElement;

    @FindBy(id = "userNumber")
    WebElement mobileNumberElement;

    @FindBy(id = "dateOfBirthInput")
    WebElement dateOfBirthElement;

    @FindBy(xpath = "//div[contains(@class, 'react-datepicker__day') and @tabindex='0']")
    WebElement dayElement;

    //@FindBy(xpath = "//div[@id='subjectsContainer']")
    //WebElement subjectsElement;

    @FindBy(id = "subjectsInput")
    WebElement subjectsElement;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
    WebElement sportsHobbiesElement;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
    WebElement readingHobbiesElement;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-3']")
    WebElement moviesHobbiesElement;

    @FindBy(id = "uploadPicture")
    WebElement pictureElement;

    @FindBy(id = "currentAddress")
    WebElement addressElement;

    @FindBy(xpath = "(//div[@class=' css-yk16xz-control'])")
    WebElement stateElement;

    @FindBy(id = "react-select-3-input")
    WebElement stateInputElement;

    @FindBy(xpath = "(//div[@class=' css-yk16xz-control'])")
    WebElement cityElement;

    @FindBy(id = "react-select-4-input")
    WebElement cityInputElement;

    @FindBy(id = "submit")
    WebElement submitButton;




    public void fillInFirstInputs(String firstName, String lastName, String email, String mobileNumber, String address) {
        elementsMethods.fillElement(firstNameElement, firstName);
        elementsMethods.fillElement(lastNameElement, lastName);
        elementsMethods.fillElement(emailElement, email);
        elementsMethods.fillElement(mobileNumberElement, mobileNumber);
        elementsMethods.fillElement(addressElement, address);
    }

    public void selectGender(String gender) {
        switch (gender){
            case "Male":
                elementsMethods.clickElement(maleGenderElement);
                break;
            case "Female":
                elementsMethods.clickElement(femaleGenderElement);
                break;
            case "Other":
                elementsMethods.clickElement(otherGenderElement);
                break;
        }
    }

    public void fillSubject(String subject) {
        elementsMethods.clickElement(subjectsElement);
        elementsMethods.fillWithActions(subjectsElement, subject);
    }

    public void fillSubjectWithList(List<String> list) {
        elementsMethods.clickElement(subjectsElement);
        elementsMethods.fillMultipleValues(subjectsElement, list);
    }

    public void selectHobbies(List<String> hobbies) {
        List<WebElement> hobbiesElement = new ArrayList<>();
        hobbiesElement.add(sportsHobbiesElement);
        hobbiesElement.add(readingHobbiesElement);
        hobbiesElement.add(moviesHobbiesElement);

        elementsMethods.clickMultipleValues(hobbiesElement, hobbies);
    }

    public void selectCalendarDate() {
        elementsMethods.clickElement(dateOfBirthElement);
        elementsMethods.clickElement(dayElement);
    }

    public void selectState(String state) {
        javaScriptHelperMethods.scrollToElement(stateElement);
        elementsMethods.selectDropDownValue(stateElement, stateInputElement, state);
    }

    public void selectCity(String city) {
        elementsMethods.selectDropDownValue(cityElement, cityInputElement, city);
    }

    public void uploadPicture() {
        elementsMethods.uploadFile(pictureElement, "C:\\Endava\\Demo QA Picture.png");
    }

    public void submitForm(){
        elementsMethods.clickElement(submitButton);
    }

}
