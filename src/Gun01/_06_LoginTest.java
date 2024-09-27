package Gun01;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _06_LoginTest extends BaseDriver {
//      Seneryo
//  1- Siteye Login olunuz
//  2- Login olduğunuzu Title ile Assert yapınız

    @Test
    public void Test1(){

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        Tools.Bekle(2);

        WebElement eMail = driver.findElement(By.xpath("//input[@id='input-email']"));
        eMail.sendKeys("azizgunes@msn.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
        password.sendKeys("Aag260323");

        WebElement login = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        login.click();

        wait.until(ExpectedConditions.titleIs("My Account"));
        Assert.assertTrue(driver.getTitle().equals("My Account"), "Login Olunamadı");
    }
}
