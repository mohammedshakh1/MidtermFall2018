package pageClasses;

import ExtentReport.TestLogger;
import application.page.base.ApplicationPageBase;
import base.MobileAPI;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApiDemoHomePage extends ApplicationPageBase {
    TouchAction act = new TouchAction(ad);

    @FindBy(id = "com.touchboarder.android.api.demos:id/buttonDefaultPositive")
    private WebElement okButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]")
    private WebElement apiDemo;

    @FindBy(id = "Accessibility")
    private WebElement accessibility;

public void clickOk(){
    click(okButton, "Ok Button");
}

public void apiDemoClick(){
    act.tap(182,472).perform();
}

public String apiDemoText(){
    String text = getText(apiDemo, "Api Demo");
    TestLogger.log("Got API Demo Text");
    return text;
}
public void clickAccess(){
    click(accessibility,"Accessibility");
}

}
