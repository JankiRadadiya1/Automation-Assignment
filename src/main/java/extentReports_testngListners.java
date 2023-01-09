import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class extentReports_testngListners implements ITestListener{
ExtentTest test;
	ExtentReports extent = ExtendedReport.config();
	
	 @Override  
	    public void onTestStart(ITestResult result) {  
	    test =  extent.createTest(result.getMethod().getMethodName());
	    }    
	    @Override  
	    public void onTestSuccess(ITestResult result) {  
	       test.log(Status.PASS, "Test Passed");       
	    }  
	    @Override  
	    public void onTestFailure(ITestResult result) {  
		       test.fail(result.getThrowable());
	    }  //give code of screenshot to attached to report  
	    
	    @Override  
	    public void onTestSkipped(ITestResult result) {  
	        // TODO Auto-generated method stub  
	        System.out.println("Skip of test cases and its details are : "+result.getName());  
	    }  
	    @Override  
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
	        // TODO Auto-generated method stub  
	        System.out.println("Failure of test cases and its details are : "+result.getName());  
	    }  
}
