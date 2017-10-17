import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.GoogleSteps;
import steps.StoreSteps;

import java.awt.*;

import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SerenityRunner.class)
@WithTag("serenity:test")
public class StoreTest {

    @Managed(driver = "chrome",uniqueSession = true)
    WebDriver webDriver;

    @Steps
    private GoogleSteps googleSteps;

    @Test
    public void step1(){
        googleSteps.open();
        googleSteps.fill_search("word");
        googleSteps.search();
    }
//
//    @Test
//    public void step2(){
//        storeSteps.click_product_category();
//    }
//
//    @Test
//    public void step3(){
//        storeSteps.click_imac();
//    }
//
//    @Test
//    public void step4(){
//        storeSteps.add_to_cart();
//    }
}
