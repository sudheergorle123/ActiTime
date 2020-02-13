package actitime.ut;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.ActiTime.utilities.Baseclass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners implements ITestListener
{
	 ExtentHtmlReporter reporter;
	 ExtentReports extent;
	 ExtentTest test;
	
	public void onFinish(ITestContext rv) 
	{
		// TODO Auto-generated method stu
		extent.flush();
	}

	public void onStart(ITestContext rv) 
	{
		String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		String rep = "report"+date+".html";
		reporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/"+rep );
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("Functional Report");
		reporter.config().setTheme(Theme.DARK);
		extent.setSystemInfo("QA","sudheer");
		extent.setSystemInfo("Qs","windows");
		extent.setSystemInfo("Browser","GoogleChrome");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult rv) 
	{
		// TODO Auto-generated method stub
		test=extent.createTest(rv.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(rv.getName(), ExtentColor.RED));

		String date = new SimpleDateFormat("yyyyMMDDHHmmss").format(new Date());
		EventFiringWebDriver e1 = new EventFiringWebDriver(Baseclass.driver);
		File f1 = e1.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"//ScreenShot//"+date+rv.getName();
		File f2 = new File(path);
		try {
			FileUtils.copyFile(f1, f2);
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult rv) 
	{
		// TODO Auto-generated method stub
		test=extent.createTest(rv.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel(rv.getName(), ExtentColor.BLUE));
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult rv) 
	{
		// TODO Auto-generated method stub
		test=extent.createTest(rv.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(rv.getName(), ExtentColor.GREEN));

	}


}

