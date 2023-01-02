package pageobject;

import configuretions.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SliderPageObject extends BaseClass {
    @FindBy(xpath = "//input[@type = 'range']")
    WebElement slider;
    @FindBy(id = "sliderValue")
    WebElement valueSlider;
    String valueBeforeMoveSlider;
    String valueAfterMoveSlider;

    public String getValueBeforeMoveSlider() {
        valueBeforeMoveSlider = valueSlider.getAttribute("value");
        return valueBeforeMoveSlider;
    }

    public String getValueAfterMoveSlider() {
        valueAfterMoveSlider = valueSlider.getAttribute("value");
        return valueAfterMoveSlider;

    }

    public void equalsValue() {
        Assert.assertNotEquals(valueBeforeMoveSlider, valueAfterMoveSlider);
    }

    public void moveSlider() {
        for (int i = 0; i < 2; i++) {
            getValueBeforeMoveSlider();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            new Actions(driver)
                    .dragAndDropBy(slider, getRandomNumberUsingNextInt(-325, 500), getRandomNumberUsingNextInt(-325, 500)) // смещение в пикселях
                    .build()
                    .perform();
            getValueAfterMoveSlider();
            equalsValue();
        }
    }

}
