package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://192.168.100.198:8038/login");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        loginPage page = new loginPage(driver);
        page.enterPassword("admin");
        page.enterUsername("admin");
        page.clickLogin();

    }
}
