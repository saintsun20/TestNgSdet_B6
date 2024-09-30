package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _03_DataProvider_CokBoyutlu {

    @Test(dataProvider = "UserData")
    void UserNamePasswordTest(String userName, String password)
    {
        System.out.println(userName+" "+password);
    }

    @DataProvider
    Object[][] UserData()
    {
        Object[][] userPass = {
                {"Aziz","123457a"},
                {"Halil","12dd7a"},
                {"Selçuk","1vvv57a"},
                {"Rukiye","1xxx7a"},
        };

        return userPass;
    }
}
