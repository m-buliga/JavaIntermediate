package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelperMethods;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
import ShareData.ShareData;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;


public class PracticeFormTest extends ShareData {

    public ElementsMethods elementsMethods;
    public JavaScriptHelperMethods javaScriptHelperMethods;
    public HomePage homePage;
    public CommonPage commonPage;
    public PracticeFormPage practiceFormPage;

    @Test
    public void automationMethod() {

        elementsMethods = new ElementsMethods(getDriver());
        javaScriptHelperMethods = new JavaScriptHelperMethods(getDriver());
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        practiceFormPage = new PracticeFormPage(getDriver());

        homePage.goToDesiredMenu("Forms");

        commonPage.goToDesiredSubMenu("Practice Form");

        practiceFormPage.fillInFirstInputs("Olivia", "Bennet", "olivia.b@mail.com", "5512333", "Drake Rd, 48725, London");

        practiceFormPage.selectGender("Female");
        // practiceFormPage.fillSubject("Maths");

        List<String> subject = new ArrayList<>();
        subject.add("Maths");
        subject.add("English");
        practiceFormPage.fillSubjectWithList(subject);

        List<String> hobbies = new ArrayList<>();
        // hobbies.add("Sports");
        hobbies.add("Reading");
        hobbies.add("Music");
        practiceFormPage.selectHobbies(hobbies);

        practiceFormPage.uploadPicture();

        practiceFormPage.selectCalendarDate();

        practiceFormPage.selectState("NCR");

        practiceFormPage.selectCity("Noida");

        practiceFormPage.submitForm();
    }
}
