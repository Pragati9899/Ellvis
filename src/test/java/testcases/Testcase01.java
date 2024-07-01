package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase01 {

    @Test
    public void test01(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://maven.apache.org/plugins/maven-compiler-plugin/usage.html");
    }
}
