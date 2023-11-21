package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("------------------------------------------------");
        System.out.println("Start test = " + result.getTestName() + " waiting result)))");
        System.out.println("------------------------------------------------");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("------------------------------------------------");
        System.out.println("Test pass. It's best of day! Test name = " + result.getTestName());
        System.out.println("------------------------------------------------");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("------------------------------------------------");
        System.out.println("Test failed. Test name = " + result.getTestName());
        System.out.println("------------------------------------------------");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("=========================================");
        System.out.println("Suite " + context.getSuite() + " starting");
        System.out.println("=========================================");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("=========================================");
        System.out.println("Suite " + context.getSuite() + " finished");
        System.out.println("=========================================");
    }
}
