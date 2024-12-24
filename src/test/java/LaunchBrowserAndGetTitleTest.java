import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchBrowserAndGetTitleTest {
    public static WebDriver driver;
    private String browser = "chrome";


    public void setUp(String browser) {
        if (browser.contains("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.contains("firefox")) {
            driver = new FirefoxDriver();
        }
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
