package test;

import org.testng.annotations.Test;
import static org.testng.Assert.fail;

public class AnotherClassDemo extends TestFactory {

 
    @Test
    public void anotherTest1() {
        logTestName();
    }
 
    @Test
    public void anotherTest2() {
        logTestName();
    }


    @Test
    public void anotherTest3() {
        fail(getFailMessage());
    }

    @Test(enabled = false)
    public void anotherTest4() {
        logSkipTest();
    }

}
