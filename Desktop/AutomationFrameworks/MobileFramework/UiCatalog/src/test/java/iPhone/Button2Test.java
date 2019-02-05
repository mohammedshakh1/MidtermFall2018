package iPhone;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pagefactory.ButtonsPage.Buttons;
import pagefactory.UiCatalogPage.UiCatalog;

import static base.MobileAPI.ad;

public class Button2Test extends Buttons {

    @Test
    public void buttonTest(){
       // Buttons btn = PageFactory.initElements(ad,Buttons.class);
        Buttons btn = new Buttons();
        btn.clickButton();

    }
}
