package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    WebDriver driver;
    public loginPage(WebDriver driver){
        this.driver = driver;
    }

    //define usernameText
    By usernameTextbox = By.xpath("//input[@id=':r0:']");

    //define passwrdText
    By passwordText = By.xpath("//input[@id=':r1:']");
    //define loginBtn
    By loginBtn = By.xpath("//button[contains(text(),'Đăng nhập')]");
    public void enterUsername(String text){
        driver.findElement(usernameTextbox).sendKeys(text);
    }

    public void enterPassword(String text){
        driver.findElement(passwordText).sendKeys(text);
    }

    public void clickLogin(){
        driver.findElement(loginBtn).click();
    }
}
