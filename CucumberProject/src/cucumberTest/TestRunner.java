package cucumberTest;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

/**
 * @author Admin
 *
 */


@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(
		strict=true,
		features="LoginTest",
		glue= {"stepDefinition"}
		
		)



public class TestRunner {

}
