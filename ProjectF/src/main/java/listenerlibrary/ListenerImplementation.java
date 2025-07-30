package listenerlibrary;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import genericLibrary.BaseConfig;

public class ListenerImplementation implements ITestListener {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-hh-mm-ss");
	String currentdate = sdf.format(new Date());

	@Override
	public void onTestFailure(ITestResult result)  {
		//provide the steps to capture the screenshot
		//perform typecasting
		TakesScreenshot tsobj = (TakesScreenshot)BaseConfig.staticdriver;
		
		//call the screenshot method and store it into temp path
		File src = tsobj.getScreenshotAs(OutputType.FILE);
		
		//create a permanent path and store it
		
	
		File dest = new File("./TakeScreenshot/swaglabs"+"currentDate"+".png");
		
		//copy the path from src to dest
		
		try {
			org.openqa.selenium.io.FileHandler.copy(src,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

}
}
