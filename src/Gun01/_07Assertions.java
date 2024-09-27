package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _07Assertions {

    @Test
    public void EqualsOrnek(){
        String s1 = "Merhaba";
        String s2 = "Merhaba";

        // Actual(Oluşan), Expected(Beklenen), Mesajı(Opsiyonel)
        Assert.assertEquals(s1,s2,"oluşanla beklenen aynı değil");
    }

    @Test
    public void NotEqualsOrnek(){
        String s1 = "Merhaba";
        String s2 = "Merhaba";

        Assert.assertNotEquals(s1,s2,"oluçanla beklenen farklı değil");
    }

    @Test
    public void TrueOrnek(){
        String s1 = "Merhaba";
        String s2 = "Merhaba";

        Assert.assertTrue(s1.equals(s2), "oluşanla beklenen aynı değil");
    }

    @Test
    public void TrueOrnek2(){
        int s1 = 5;
        int s2 = 5;

        Assert.assertTrue(s1==s2, "oluşanla beklenen aynı değil");
    }

    @Test
    public void NullOrnek(){
        String s = null;

        Assert.assertNull(s,"Değer null değil");
    }

    @Test
    public void direktFail(){
        int a = 56;

        if (a != 56)
            Assert.fail();
    }

    @Test
    public void FalseOrnek(){
        int s1 = 5;
        int s2 = 7;
        Assert.assertFalse(s1==s2,"oluşanla beklenen aynı değil");
    }
}
