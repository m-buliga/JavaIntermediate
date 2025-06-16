package Pages;

import ObjectData.PracticeFormObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class PracticeFormPage extends CommonPage {

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "firstName")
    private WebElement firstNameElement;

    @FindBy(id = "lastName")
    private WebElement lastNameElement;

    @FindBy(id = "userEmail")
    private WebElement emailElement;

    @FindBy(xpath = "//label[@for='gender-radio-1']")
    private WebElement maleGenderElement;

    @FindBy(xpath = "//label[@for='gender-radio-2']")
    private WebElement femaleGenderElement;

    @FindBy(xpath = "//label[@for='gender-radio-3']")
    private WebElement otherGenderElement;

    @FindBy(id = "userNumber")
    private WebElement mobileNumberElement;

    @FindBy(id = "dateOfBirthInput")
    private WebElement dateOfBirthElement;

    @FindBy(xpath = "//div[contains(@class, 'react-datepicker__day') and @tabindex='0']")
    private WebElement dayElement;

    //@FindBy(xpath = "//div[@id='subjectsContainer']")
    //WebElement subjectsElement;

    @FindBy(id = "subjectsInput")
    private WebElement subjectsElement;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
    private WebElement sportsHobbiesElement;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
    private WebElement readingHobbiesElement;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-3']")
    private WebElement musicHobbiesElement;

    @FindBy(id = "uploadPicture")
    private WebElement pictureElement;

    @FindBy(id = "currentAddress")
    private WebElement addressElement;

    @FindBy(xpath = "(//div[@class=' css-yk16xz-control'])")
    private WebElement stateElement;

    @FindBy(id = "react-select-3-input")
    private WebElement stateInputElement;

    @FindBy(xpath = "(//div[@class=' css-yk16xz-control'])")
    private WebElement cityElement;

    @FindBy(id = "react-select-4-input")
    private WebElement cityInputElement;

    @FindBy(id = "submit")
    private WebElement submitButton;


    public void fillInFirstInputs(PracticeFormObject practiceFormObject) {
        elementsMethods.fillElement(firstNameElement, practiceFormObject.getFirstName());
        elementsMethods.fillElement(lastNameElement, practiceFormObject.getLastName());
        elementsMethods.fillElement(emailElement, practiceFormObject.getEmail());
        elementsMethods.fillElement(mobileNumberElement, practiceFormObject.getMobileNumber());
        elementsMethods.fillElement(addressElement, practiceFormObject.getAddress());
    }

    public void selectGender(PracticeFormObject practiceFormObject) {
        switch (practiceFormObject.getGender()) {
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

    public void fillSubjectWithList(PracticeFormObject practiceFormObject) {
        elementsMethods.clickElement(subjectsElement);
        elementsMethods.fillMultipleValues(subjectsElement, practiceFormObject.getSubjects());
    }

    public void selectHobbies(PracticeFormObject practiceFormObject) {
        List<WebElement> hobbiesElement = new ArrayList<>();
        hobbiesElement.add(sportsHobbiesElement);
        hobbiesElement.add(readingHobbiesElement);
        hobbiesElement.add(musicHobbiesElement);

        elementsMethods.clickMultipleValues(hobbiesElement, practiceFormObject.getHobbies());
    }

    public void selectCalendarDate() {
        elementsMethods.clickElement(dateOfBirthElement);
        elementsMethods.clickElement(dayElement);
    }

    public void selectState(PracticeFormObject practiceFormObject) {
        javaScriptHelperMethods.scrollToElement(driver, stateElement);
        elementsMethods.selectDropDownValue(stateElement, stateInputElement, practiceFormObject.getState());
    }

    public void selectCity(PracticeFormObject practiceFormObject) {
        elementsMethods.selectDropDownValue(cityElement, cityInputElement, practiceFormObject.getCity());
    }

    public void uploadPicture() {
        File file = new File(getClass().getClassLoader()
                .getResource("UploadFiles/Demo_QA_Picture.png")
                .getFile());

        elementsMethods.uploadFile(pictureElement, file.getAbsolutePath());
    }

    public void submitForm() {
        elementsMethods.clickElement(submitButton);
    }

}
