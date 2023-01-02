import configuretions.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageobject.BrowserWindowsPageObject;

public class BrowserWindowsTest extends BaseClass {
    static final String mainURL = "https://demoqa.com/browser-windows";
    static BrowserWindowsPageObject browserWindowsPageObject = PageFactory.initElements(driver, BrowserWindowsPageObject.class);

    @Before
    public void before() {
        if (!driver.getCurrentUrl().equals(mainURL)) {
            driver.get("https://demoqa.com/browser-windows");
        }
    }

    @Test
    public void workingTabs() {
        browserWindowsPageObject.tabTest();
    }
}
