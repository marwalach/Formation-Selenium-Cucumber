package Run;
//pour générer un rapport

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@CreationCompte"
		,features = "src/test/features/TestCucumber/FbAccount.feature"
		,glue={"CucumberTest"}
        ,publish= true
        ,plugin= {"pretty"
		,"html:target/cucumber-Reports.html"
		,"json:target/cucumber-Reports"
		,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
}
        ,snippets= io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE
        ,monochrome=true
)
public class Runner {

}
