package cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/feature/GoogleSearch.feature",glue= {"cucumber"},
monochrome = true,
plugin={"pretty","junit:target/JunitReports/report2.xml",
		"json:target/JSONReports/report2.json",
		"html:target/HTMLreports2"},
tags="@smoketest"
)
public class Runner {
//C:\Users\Kishan B G\eclipse-workspace\maven-jenkin--01\target\HTMLreports2
	//html path report
}
