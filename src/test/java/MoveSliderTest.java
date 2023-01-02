import configuretions.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageobject.SliderPageObject;

public class MoveSliderTest extends BaseClass {
    static final String mainURL = "https://demoqa.com/slider";
    static SliderPageObject sliderPageObject = PageFactory.initElements(driver, SliderPageObject.class);

    @Before
    public void before() {
        if (!driver.getCurrentUrl().equals(mainURL)) {
            driver.get("https://demoqa.com/slider");
        }
    }

    @Test
    public void moveSlider() {
        sliderPageObject.moveSlider();
    }
}
