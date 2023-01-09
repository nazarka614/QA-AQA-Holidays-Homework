package pageobject;

import configuretions.BaseClass;
import data.User;
import io.opentelemetry.sdk.resources.Resource;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

public class PracticeFormPageObject extends BaseClass {
    @FindBy(id = "firstName")
    WebElement inputFirstNameField;
    @FindBy(id = "lastName")
    WebElement inputLastNameField;
    @FindBy(id = "userEmail")
    WebElement inputEmailField;
    @FindBy(xpath = "//label[@for=\"gender-radio-1\"]")
    WebElement genderMale;
    @FindBy(id = "userNumber")
    WebElement inputMobileField;
    @FindBy(id = "subjectsInput")
    WebElement inputSubjectField;
    @FindBy(xpath = "//label[@for=\"hobbies-checkbox-1\"]")
    WebElement hobbiesSport;
    @FindBy(id = "currentAddress")
    WebElement inputAddressField;
    @FindBy(xpath = "//div[contains(@class, 'subjects-auto-complete__option--is-focused')]")
    WebElement FocusSUB;
    @FindBy(id = "react-select-3-input")
    WebElement state;
    @FindBy(id = "react-select-4-input")
    WebElement city;
    @FindBy(id = "submit")
    WebElement submit;
    @FindBy(id = "dateOfBirthInput")
    WebElement dateOfBirthInput;

    @FindBy(xpath = "//select[@class = 'react-datepicker__year-select']")
    WebElement years;
    @FindBy(xpath = "//option[@value = 1995]")
    WebElement year;
    @FindBy(xpath = "//select[@class = 'react-datepicker__month-select']")
    WebElement months;
    @FindBy(xpath = "//option[@value = 7]")
    WebElement month;
    @FindBy(xpath = "//div[contains(@class, \"react-datepicker__day--018\")]")
    WebElement day;
    @FindBy(id = "uploadPicture")
    WebElement uploadPicture;
    @FindBy(id = "example-modal-sizes-title-lg")
    WebElement submitInfo;

    public void completeForm(User user) {
        this.inputFirstNameField.sendKeys(user.getFirstname());
        this.inputLastNameField.sendKeys(user.getLastname());
        this.inputEmailField.sendKeys(user.getEmail());
        this.genderMale.click();
        this.inputMobileField.sendKeys(user.getMobile());
        this.dateOfBirthInput.click();
        this.months.click();
        this.month.click();
        this.years.click();
        this.year.click();
        this.day.click();
        this.inputSubjectField.sendKeys(user.getSubject());
        int i = 0;
        while (i <= 7) {
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
            if (this.FocusSUB.getText().equals("Economics")) {
                this.inputSubjectField.sendKeys(Keys.ENTER);
                break;
            } else {
                this.inputSubjectField.sendKeys(Keys.DOWN);
            }
        }
        this.hobbiesSport.click();
       // this.uploadPicture.sendKeys("C:\\Users\\nazar\\IdeaProjects\\HomeworkQA_AQA_Holidaysz_Naz\\images.jpg"); пропишите свой абсолютный путь для загрузки картинки
        this.inputAddressField.sendKeys(user.getAddress());
        this.state.sendKeys("E");
        this.state.sendKeys(Keys.ENTER);
        this.city.sendKeys("E");
        this.city.sendKeys(Keys.ENTER);
        this.submit.sendKeys(Keys.ENTER);
        Assert.assertEquals("Thanks for submitting the form", submitInfo.getText());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
