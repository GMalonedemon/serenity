package pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import java.awt.*;

@DefaultUrl(value = "http://store.demoqa.com/")
public class StoreQAPage extends PageObject {
    @FindBy(id="lst-ib")
    WebElement search;

    @FindBy(id="menu-item-33")
    private WebElement product_category;

    @FindBy(id="menu-item-35")
    private WebElement i_mac;

    public void click_product_category() throws AWTException {
        Point p=product_category.getLocation();
        Robot r=new Robot();
        r.mouseMove(p.x,p.y);
    }
    public void click_i_mac(){
        i_mac.click();
    }
}
