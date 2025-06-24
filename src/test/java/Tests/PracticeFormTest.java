package Tests;

import ExtentUtility.ExtentUtility;
import ExtentUtility.ReportStep;
import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelperMethods;
import ObjectData.PracticeFormObject;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
import PropertyUtility.PropertyUtility;
import ShareData.Hooks;
import org.testng.annotations.Test;


public class PracticeFormTest extends Hooks {

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
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Forms menu.");

        commonPage.goToDesiredSubMenu("Practice Form");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Practice Form sub-menu.");

        practiceFormPage.fillInFirstInputs(practiceFormObject);
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user filled in the first input fields.");

        practiceFormPage.selectGender(practiceFormObject);
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user selected the gender.");

        practiceFormPage.fillSubjectWithList(practiceFormObject);
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user selected the subjects.");

        practiceFormPage.selectHobbies(practiceFormObject);
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user selected the hobbies.");

        practiceFormPage.uploadPicture();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user uploaded the picture.");

        practiceFormPage.selectCalendarDate();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user selected the date of birth.");

        practiceFormPage.selectState(practiceFormObject);
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user selected the state.");

        practiceFormPage.selectCity(practiceFormObject);
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user selected the city.");

        practiceFormPage.submitForm();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user submitted the form.");
    }
}
