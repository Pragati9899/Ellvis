package baseTestPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.ResourceBundle;

public class BaseTestClass {

 public  static WebDriver driver;
    public ResourceBundle rb;

    @BeforeClass
    public void setup() throws IOException {

        rb = ResourceBundle.getBundle("config");
    if(rb.getString("Browser").equals("chrome")) {
        driver = new ChromeDriver();
    }else{
        driver=new EdgeDriver();
    }
     driver.get(rb.getString("URL"));
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
     driver.manage().window().maximize();

 }

    @AfterClass
    public void teardown(){
     //driver.quit();
 }
}
