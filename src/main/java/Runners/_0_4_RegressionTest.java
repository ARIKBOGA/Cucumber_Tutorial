package Runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(

        tags = {"@RegressionTest"},

        features = {"src/test/java/com/youtube/task1"},

        glue = {"stepDefinition"},

        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"}
)


public class _0_4_RegressionTest extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void afterClass() {

        Reporter.loadXMLConfig("src/main/java/XMLFiles/extendReportSet.xml");
        Reporter.setSystemInfo("QA Tester : ", "Burak Arıkboğa");
        Reporter.setSystemInfo("Application name : ", "Test Automation E-Commerce");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Test execution Cucumber Report");
    }
}