package steps;

import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Step;
import pageobject.IMacPage;
import pageobject.StoreQAPage;

import java.awt.*;

public class StoreSteps {

    private StoreQAPage storeQAPage;
    private IMacPage iMacPage;

    @Step("Open browser in store page")
    public void open_page(){
        storeQAPage.open();
    }

    @Step("Click in product category")
    public void click_product_category() throws AWTException {
        storeQAPage.click_product_category();
    }

    @Step("Click in imac")
    public void click_imac(){
        storeQAPage.click_i_mac();
    }

    @Step("Click in add cart")
    public void add_to_cart(){
        iMacPage.click_add_cart();
    }
}
