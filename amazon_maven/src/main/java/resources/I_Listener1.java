package resources;

import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utility1.Take_Screenshot;


public class I_Listener1 extends Take_Screenshot implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		ITestListener.super.onTestStart(result);
		Reporter.log("Test case Started");
		System.out.println("Test case started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test case is passed");
		System.out.println("Test case passed successfully");
		try {
			pass_get_screenshot();
		} catch (IOException e) {
			e.printStackTrace();			
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test case is failed");
		System.out.println("Test case failed");
		try {
			fail_get_screenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ITestListener.super.onTestSkipped(result);
		Reporter.log("Test case is skipped");
		System.out.println("Test case get skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
		Reporter.log("Test case is failed with success%");
		System.out.println("Test case failed but within success percentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		ITestListener.super.onTestFailedWithTimeout(result);
		Reporter.log("Test case is failed with Timeout");
		System.out.println("Test case failed with timeout");
		
	}

	@Override
	public void onStart(ITestContext context) {
		ITestListener.super.onStart(context);
	//	Reporter.log("Test case is just started");
	//	System.out.println("Test case is onstart");
	}

	@Override
	public void onFinish(ITestContext context) {
		ITestListener.super.onFinish(context);
	//	Reporter.log("Test case is just finished");
	//	System.out.println("Test case is on finish");
	}

}