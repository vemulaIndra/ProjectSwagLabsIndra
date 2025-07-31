package TestDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LearningAdvanceReport {
	public static void main(String[] args) {
		//Create the SparkReport
		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReports/report.html");
		
		
		//Configure the SparkReport Information
		spark.config().setDocumentTitle("Regression Testing for the Swaglabs ");
		spark.config().setReportName("RegressionTestSuit");
		spark.config().setTheme(Theme.STANDARD);
		
		//Create the Extent Report
		ExtentReports report=new ExtentReports();
		
		//Attach the SparkReport and Extent Report
		report.attachReporter(spark);
		
		//Configure the System Information in Extent Report
		report.setSystemInfo("Device Name:", "Indra");
		report.setSystemInfo("OperatingSystem:", "WINDOWS 11");
		report.setSystemInfo("Browser:", "Chrome");
		report.setSystemInfo("BrowserVersion:", "chrome-138.0.7204.169");
		
		//Create the Test Information
		ExtentTest test=report.createTest("Regressiontest");
		
		
		//Steps Information
		test.log(Status.INFO,"Step1: Launching the Browser Successfull");
		
		test.log(Status.INFO, "Step2: Navigate to the Application via URL Successful");
		
		test.log(Status.PASS, "Step3: Verified the WebPage Successful");
		
		if(true==true)
		{
			test.log(Status.PASS, "Step4: verified the WebElement is Displayed");
		}
		else
		{
			test.log(Status.FAIL,"Steps4: verified the WebElement is Not Displayed");
		}
		test.log(Status.SKIP, "Step5: Element is Hidden");
		
		//Flush the Report Information
		report.flush();
		System.out.println("Execution Done");
		
	}

}
