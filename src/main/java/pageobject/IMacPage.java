package pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl(value = "http://store.demoqa.com/products-page/product-category/imacs/")
public class IMacPage extends PageObject {

    @FindBy(css = "input-button-buy")
    private WebElement add_cart;

    public void click_add_cart(){
        add_cart.click();
    }
}
