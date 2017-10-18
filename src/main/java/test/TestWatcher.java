package test;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import static test.TestFactory.staticLog;


public class TestWatcher extends TestListenerAdapter {
    private int m_count = 0;

    @Override
    public void onStart(ITestContext arg0) {
        staticLog("BeforeSuite Actions");
    }

    @Override
    public void onTestStart(ITestResult tr){
        staticLog("Before @Test Actions");
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        staticLog("Failed Actions");
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        staticLog("Skipped Actions");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        staticLog("Success Actions");
    }

//    @Override
//    public void onTestFinish(ITestResult tr){
//        staticLog("Before @Test Actions");
//    }

    @Override
    public void onFinish(ITestContext arg0) {
        staticLog("AfterSuite Actions");
    }
}
