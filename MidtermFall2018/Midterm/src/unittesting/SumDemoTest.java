package unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumDemoTest {

    @Test //works same as main method
    public void sumTest(){
        SumDemo obj = new SumDemo();
        int x = obj.sum(2, 2);

        Assert.assertEquals(x, 4);
        System.out.println("Passed");
    }
}
