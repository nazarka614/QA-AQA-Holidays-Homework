package configuretions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class BaseClass {
    public static WebDriver driver;

    public int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    @BeforeClass
    public static void createDriver() {
        driver = DriverConfig.create(BROWSERS.CHROMEINCOGNITO);
    }

//    @AfterClass
//    public static void after() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.close();
//    }
}
