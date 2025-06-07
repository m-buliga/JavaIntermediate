package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelperMethods;
import ObjectData.PracticeFormObject;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
import PropertyUtility.PropertyUtility;
import ShareData.ShareData;
import org.testng.annotations.Test;


public class PracticeFormTest extends ShareData {

    public ElementsMethods elementsMethods;
    public JavaScriptHelperMethods javaScriptHelperMethods;
    public HomePage homePage;
    public CommonPage commonPage;
    public PracticeFormPage practiceFormPage;
    public PropertyUtility propertyUtility;
    public PracticeFormObject practiceFormObject;

    @Test
    public void automationMethod() {

        elementsMethods = new ElementsMethods(getDriver());
        javaScriptHelperMethods = new JavaScriptHelperMethods(getDriver());
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        practiceFormPage = new PracticeFormPage(getDriver());
        propertyUtility = new PropertyUtility("PracticeFormTest");
        practiceFormObject = new PracticeFormObject(propertyUtility.getData());

        homePage.goToDesiredMenu("Forms");

        commonPage.goToDesiredSubMenu("Practice Form");

        practiceFormPage.fillInFirstInputs(practiceFormObject);

        practiceFormPage.selectGender(practiceFormObject);

        practiceFormPage.fillSubjectWithList(practiceFormObject);

        practiceFormPage.selectHobbies(practiceFormObject);

        practiceFormPage.uploadPicture();

        practiceFormPage.selectCalendarDate();

        practiceFormPage.selectState(practiceFormObject);

        practiceFormPage.selectCity(practiceFormObject);

        practiceFormPage.submitForm();
    }
}
