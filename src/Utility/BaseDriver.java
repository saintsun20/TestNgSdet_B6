package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void BaslangicIslemleri(){
        // System.out.println("Başlangıç işlemleri yapılıyor");

        driver=new ChromeDriver();

        //driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        Login();
    }

    @AfterClass
    public void KapanisIslemleri(){
        // System.out.println("Kapanis işlemleri yapılıyor");

        Tools.Bekle(3);
        driver.quit();
    }

    public void Login() {
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        Tools.Bekle(2);

        WebElement email=driver.findElement(By.id("input-email"));
        email.sendKeys("azizgunes@msn.com");

        WebElement password=driver.findElement(By.id("input-password"));
        password.sendKeys("Aag260323");

        WebElement loginBtn=driver.findElement(By.xpath("//input[@value='Login']"));
        loginBtn.click();

        wait.until(ExpectedConditions.titleIs("My Account"));
        Assert.assertTrue(driver.getTitle().equals("My Account"), "Login olunamadı");
    }
}
