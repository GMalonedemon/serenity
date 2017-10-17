package steps;

import net.thucydides.core.annotations.Step;
import pageobject.GooglePage;

public class GoogleSteps {

    private GooglePage googlePage;

    @Step
    public void open(){
        googlePage.open();
    }

    @Step
    public void fill_search(String search){
        googlePage.write_search(search);
    }

    @Step
    public void search(){
        googlePage.press_enter();
    }
}
