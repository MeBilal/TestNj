package testFirstTestNj;

import firstTestNj.First;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFirst {
    @Test
    public  void testMethode(){
        First first = new First();
        int a=first.add(2,4);
        Assert.assertEquals(a,6);

    }
}
