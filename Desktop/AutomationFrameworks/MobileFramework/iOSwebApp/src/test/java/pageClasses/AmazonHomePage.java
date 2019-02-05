package pageClasses;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends ApplicationPageBase {


    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Deals\"]")
    private WebElement deal;




    public String test(){
       String text = deal.getText();
       return text;
    }












}
