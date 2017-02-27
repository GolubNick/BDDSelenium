package automatictester.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/features/LoginMailYandex.feature",
        glue = "automatictester.glue",
        format = {"pretty"},
        plugin = {"json:target/cucumber.json"})
public class LoginYandexMail extends AbstractTestNGCucumberTests{
}
