
package test;

import org.testng.annotations.*;
import java.lang.reflect.Method;

@Listeners(TestWatcher.class)
public abstract class TestFactory {
    private Method method;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("@BeforeTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass");
    }

    @BeforeMethod
    public void beforeMethod(Method test) {
        method = test;
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("@AfterMethod");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("@AfterTest");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("@AfterSuite");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("@BeforeGroups");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("@AfterGroups");
    }


    void log(String msg) {
        String currentClass = this.toString().replace("test.", "");

        System.out.println(currentClass+ ":: \t\t" + msg);
    }

    static void staticLog(String msg) {
        String currentClass = Thread.currentThread().getStackTrace()[2].getClassName().replace("test.", "");
        System.out.println(msg + " \t\t<< " + currentClass);
    }

    void logTestName() {
        log("@Test " + method.getName() + "()");
    }

    void logSkipTest() {
        log("ERROR: If you read this: @Test " + method.getName() + "() was not skipped!");
    }

    String getFailMessage() {
        return "@Test " + method.getName() + "() - Fail";
    }

}
