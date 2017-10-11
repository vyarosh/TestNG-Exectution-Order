package test;

import org.testng.annotations.Test;
import static org.testng.Assert.fail;

public class SubClassDemo extends SingleClassDemo {

 
    @Test
    public void subTest1() {
        logTestName();
    }
 
    @Test
    public void subTest2() {
        logTestName();
    }

    @Test
    public void subTest3() {
        fail(getFailMessage());
    }

    @Test(enabled = false)
    public void subTest4() {
        logSkipTest();
    }
}
