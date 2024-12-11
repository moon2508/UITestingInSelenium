package vacationConfig;

import login.loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class vacationConfigTest {

        WebDriver driver;
@BeforeTest
        public void setup() throws InterruptedException {

             driver = new ChromeDriver();
            driver.get("http://192.168.100.198:8038/cau-hinh-nghi-phep");
            driver.manage().window().maximize();
            Thread.sleep(1000);

        };
        @Test(priority=0)

        public void test_Home_Page_Appear_Correct() throws InterruptedException {
            //Create Login Page object
            loginPage page = new loginPage(driver);
            page.enterPassword("admin");
            page.enterUsername("admin");
            page.clickLogin();
            Thread.sleep(1000);
            vacationConfigPage vacationConfigPage = new vacationConfigPage(driver);
            vacationConfigPage.forwardHRM();
            driver.get("http://192.168.100.198:8038/cau-hinh-nghi-phep");
            Thread.sleep(1000);
            vacationConfigPage.enterVacationDrop();



    }
}
