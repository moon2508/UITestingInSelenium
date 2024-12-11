package vacationConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class vacationConfigPage {
    WebDriver driver;
    public vacationConfigPage(WebDriver driver){
        this.driver = driver;
    }
    //define btn forward to HRM
    By btnForwardHRM = By.xpath("(//a[@class='service-item'])[1]");
    //define vacationType dropdown
    By vacationTypeDrop = By.xpath("//input[@id=':r0:']");

    //define contractType dropdown
    By contractTypeDrop = By.xpath("//input[@id=':r2:']");

    //define status dropdown
    By statusDrop = By.xpath("//input[@id=':r4:']");

    //Clear content
    public void enterVacationDrop(){
        driver.findElement(vacationTypeDrop).click();
        driver.findElement(vacationTypeDrop).clear();
    }
    public void forwardHRM()
    {
        driver.findElement(btnForwardHRM).click();
    }


}
