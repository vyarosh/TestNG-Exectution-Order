package test;

import org.testng.annotations.Test;
import static org.testng.Assert.fail;

public class SingleClassDemo extends TestFactory {

    @Test
    public void test1() {
        logTestName();
    }
 
    @Test
    public void test2() {
        logTestName();
    }

    @Test
    public void test3() {
        fail(getFailMessage());
    }

    @Test(enabled=false)
    public void test4() {
        logSkipTest();
    }
}