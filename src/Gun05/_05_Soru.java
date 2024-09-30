package Gun05;
/*
  Senaryo
  1- Siteyi açınız.
  2- Top Menudeki menu elemanlarının olduğunu doğrulayınız.(menuValidation)
  3- Desktops, Laptops & Notebooks, Components, Tablets, Software, Phones & PDAs, Cameras, MP3 Players
 */

// webden menuyu okuyun, ve 3.sıradaki menu ile karşılatırın:

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _05_Soru extends BaseDriver {

    @Test
    public void MenuValidation(){
        // Beklenen Listemiz
        List<String> menuExpectedList = new ArrayList<>(); // String[] menu={"Desktops", " ", " "};
        menuExpectedList.add("Desktops");
        menuExpectedList.add("Laptops & Notebooks");
        menuExpectedList.add("Components");
        menuExpectedList.add("Tablets");
        menuExpectedList.add("Software");
        menuExpectedList.add("Phones & PDAs");
        menuExpectedList.add("Cameras");
        menuExpectedList.add("MP3 Players");

        // Webdeki Menu listemiz
        List<WebElement> menuActuallList = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li"));

        for (int i = 0; i < menuExpectedList.size(); i++) {

            Assert.assertEquals(
                    menuActuallList.get(i).getText(),
                    menuExpectedList.get(i), "Menu beklendiği gibi değil");
        }
    }
}
/*
WebElement ucret=driver.findElement(By.classname("price")) // ücretlerin hepsini çıkarır

driver. -> (tüm sayaf arar)
ucret.findElement(By.classname("price-new"));  // 80       // çıkan ücretlerde istediğimizi ücret adıyla başlayarak bulabiliriz.

//elementin içinde arama yapılırken xPath kullanılmaz
 */
