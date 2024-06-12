package baseTestPackage;

import driver.Driver;
import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;
import java.util.ResourceBundle;

public class BaseTestClass {

    public static WebDriver driver;
    public ResourceBundle rb;


    public void setup() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pragati\\IdeaProjects\\Ellvis\\src\\test\\resources\\chromedriver-win64\\chromedriver.exe");

        rb = ResourceBundle.getBundle("config");
        if (rb.getString("Browser").equals("chrome")) {
            driver = new ChromeDriver();
        } else {
            driver = new EdgeDriver();
        }
        driver.get(rb.getString("URL"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().window().maximize();

    }


    public void teardown() {
        driver.quit();
    }

    @BeforeMethod
    public void setDriver(){
        Driver.initDriver();
        DriverManager.getDriver().get("https://google.com");
    }
}
