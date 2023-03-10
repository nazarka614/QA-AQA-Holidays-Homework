package pageobject;

import configuretions.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserWindowsPageObject extends BaseClass {
    @FindBy(id = "tabButton")
    WebElement tabButton;

    @FindBy(id = "sampleHeading")
    WebElement textSampleHeading;

    @FindBy(id = "windowButton")
    WebElement windowButton;

    public void tabTest() {
        String mainTab = driver.getWindowHandle();
        this.tabButton.click();
        try {
            Thread.sleep(2300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }
        Assert.assertEquals("This is a sample page", textSampleHeading.getText());
        driver.switchTo().window(mainTab);
        this.windowButton.click();
        try {
            Thread.sleep(2300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (String newWindows : driver.getWindowHandles()) {
            driver.switchTo().window(newWindows);
        }
        Assert.assertEquals("This is a sample page", textSampleHeading.getText());
        System.out.println(this.textSampleHeading.getText());
        driver.switchTo().window(mainTab);
    }

}
