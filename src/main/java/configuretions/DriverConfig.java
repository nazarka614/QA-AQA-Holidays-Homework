package configuretions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class DriverConfig {
    private static WebDriver driver;

    public static WebDriver create(BROWSERS browsers) {
        switch (browsers) {
            case CHROMEINCOGNITO:
                createChrome();
                break;
        }
        return driver;
    }
    private static void createChrome() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            driver = new ChromeDriver(options);

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
