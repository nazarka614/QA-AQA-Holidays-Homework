import configuretions.BaseClass;
import data.User;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageobject.PracticeFormPageObject;

public class PracticeFormTest extends BaseClass {
    static final String mainURL = "https://demoqa.com/automation-practice-form";
    static PracticeFormPageObject practiceFormPageObject = PageFactory.initElements(driver, PracticeFormPageObject.class);

    @Before
    public void before() {
        if (!driver.getCurrentUrl().equals(mainURL)) {
            driver.get("https://demoqa.com/automation-practice-form");
        }
    }

    @Test
    public void moveSlider() {
        practiceFormPageObject.completeForm(new User());
    }
}
