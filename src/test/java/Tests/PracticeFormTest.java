package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelperMethods;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormTest {
    public WebDriver driver;
    public ElementsMethods elementsMethods;
    public HomePage homePage;
    public CommonPage commonPage;
    public JavaScriptHelperMethods javaScriptHelperMethods;
    public PracticeFormPage practiceFormPage;

    @Test
    public void automationMethod() {
        // deschidem browser de chrome
        driver = new ChromeDriver();

        // accesam pagina web
        driver.get("https://demoqa.com/");

        // maximize browser
        driver.manage().window().maximize();

        elementsMethods = new ElementsMethods(driver);
        javaScriptHelperMethods = new JavaScriptHelperMethods(driver);
        homePage = new HomePage(driver);
        commonPage = new CommonPage(driver);
        practiceFormPage = new PracticeFormPage(driver);

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
