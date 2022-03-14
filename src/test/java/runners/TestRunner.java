package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"steps"},
        //tags = "@regression",
        tags = "@login",
       // tags="@wishlist",
        // tags = "@sanity and @ui",
        //tags = "@regression and @ui",
       // tags = "@regression or @ui",
       // dryRun = true,
        monochrome = true,
        plugin = {"pretty","html:target/report.html"}

)

public class TestRunner
{

}
