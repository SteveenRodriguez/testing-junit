package simpleJunit;

import org.example.simpleJunit.MoneyUtil;
import org.junit.Assert;
import org.junit.Test;

public class MoneyUtilTest {

    @Test //identifica un método como prueba = test
    public void moneyTest(){
        String money = MoneyUtil.format(1000.0);

        //parámetro 1 = lo que se espera
        //parámetro 2 = lo que recibimos
        Assert.assertEquals("$1000.00", money);
    }

    @Test
    public void negativeMoneyTest(){
        String money = MoneyUtil.format(-1000.0);
        Assert.assertEquals("-$1000.00", money);
    }

    @Test
    public void euroMoneyTest(){
        String money = MoneyUtil.format(-1000.0,"€");
        Assert.assertEquals("-€1000.00", money);
    }

    @Test(expected = IllegalArgumentException.class) // se le pasa el argumento que estamos esperando
    public void notNullExceptionMoneyTest(){
        MoneyUtil.format(-1000.0,null);
    }

}
