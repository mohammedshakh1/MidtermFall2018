package pageClasses;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceLabHome extends ApplicationPageBase {


@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"i am a link\"]")
private WebElement link;



    public void contentText(){
        link.click();
    }




}
