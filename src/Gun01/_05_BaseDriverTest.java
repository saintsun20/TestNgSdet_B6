package Gun01;

import Utility.BaseDriver;
import org.testng.annotations.Test;

public class _05_BaseDriverTest extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://www.google.com");
    }
}
