package pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

@DefaultUrl(value = "https://www.google.com")
public class GooglePage extends PageObject{

    @FindBy(id = "lst-ib")
    private WebElement search;

    public void write_search(String text){
        search.sendKeys(text);
    }

    public void press_enter(){
        search.sendKeys(Keys.ENTER);
    }
}
