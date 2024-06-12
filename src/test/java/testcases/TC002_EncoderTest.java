package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.Encoder;

import java.io.IOException;
import java.time.Duration;
import java.util.ResourceBundle;

public class TC002_EncoderTest {
   /* public static WebDriver driver;
    public ResourceBundle rb;

        @BeforeMethod
        public void setup () throws IOException {

            rb = ResourceBundle.getBundle("config");
            if (rb.getString("Browser").equals("chrome")) {
                driver = new ChromeDriver();
            } else {
                driver = new EdgeDriver();
            }
            driver.get(rb.getString("URL2"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
            driver.manage().window().maximize();
        }

    @Parameters({"DestProtocol", "DestIP","DestPort","EnSRTmode","EnEncryption","EncPassphrase"})
    @Test
    public void encoderTest(String enProtocol,String enDestIP, String enDestPort,String enSRTmode, String enEncryption,String enPassphrase) throws InterruptedException {

        Encoder encoder=new Encoder(driver);

        encoder.clickEnStopBtn();
        Thread.sleep(3000);
        encoder.clickSystemSettingBtn();
        encoder.selectEnOutputMode();
        encoder.clickTSsettingsBtn();
        if(enProtocol.equals("SRT")) {
            encoder.selectEnProtocol(enProtocol);
            encoder.selectEnSRTmode(enSRTmode);
            encoder.setEnDestIP(enDestIP);
            encoder.setEnDestPort(enDestPort);
            encoder.selectEnEncryption(enEncryption);
            encoder.setEnPassphrase(enPassphrase);
        } else if (enProtocol.equals("UDP")) {
            encoder.selectEnProtocol(enProtocol);
            encoder.setEnDestIP(enDestIP);
            encoder.setEnDestPort(enDestPort);
        }
        encoder.clickEnSaveBtn();
        Thread.sleep(3000);
        encoder.clickEnStartBtn();
        Thread.sleep(3000);

        Assert.assertEquals(encoder.CheckStateofEncoder(),"Running");
        if(encoder.CheckStateofEncoder().equals("Running")){
            System.out.println("Encoder is running");
        }else {
            System.out.println("Encoder is stopped");
        }
    }
    @AfterClass
    public void TearDown(){
           driver.quit();
    }*/
}