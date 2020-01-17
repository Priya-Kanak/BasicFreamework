package testRunner;

import java.io.File;

import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import reader.FileReaderManager;

@RunWith(Cucumber.class)
	@CucumberOptions(
	 features = "src/test/java/features/Test.feature",
			 plugin = {  "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
			 glue= {"stepDefinition"}
		)	 
public class TestRunner {	
	
	@AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	 }
	 
}
