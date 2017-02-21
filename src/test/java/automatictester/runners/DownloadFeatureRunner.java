package automatictester.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/features/Download.feature",
        glue = "automatictester.glue",
        format = {"pretty"})
public class DownloadFeatureRunner extends AbstractTestNGCucumberTests {
}

//todo
//https://habrahabr.ru/post/283384/
//https://habrahabr.ru/post/283422/