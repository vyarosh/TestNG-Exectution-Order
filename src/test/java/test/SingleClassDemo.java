package test;

import org.testng.SkipException;
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

    @Test
    public void test4() {
        logTestName();
        throw new SkipException("Skip");
//        logSkipTest();
    }
}