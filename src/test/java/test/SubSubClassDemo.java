package test;

import org.testng.annotations.Test;
import static org.testng.Assert.fail;

public class SubSubClassDemo extends SubClassDemo {


    @Test
    public void subSubTest1() {
        logTestName();
    }

    @Test
    public void subSubTest2() {
        logTestName();
    }

    @Test
    public void subSubTest3() {
        fail(getFailMessage());
    }

    @Test(enabled = false)
    public void subSubTest4() {
        logSkipTest();
    }
}
