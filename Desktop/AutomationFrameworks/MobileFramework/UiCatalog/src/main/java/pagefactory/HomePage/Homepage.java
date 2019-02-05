package pagefactory.HomePage;

import ExtentReport.TestLogger;
import base.MobileAPI;

public class Homepage extends MobileAPI {

    public void clickControl(){
        TestLogger.log("Looking For Control Button");
        TestLogger.log("Clicking Control");
        findElementByAccesablityId("Controls").click();
    }

public String controlText(){
        TestLogger.log("Looking for Control Button");
        TestLogger.log("Getting Text From Control");
        String text = findElementByAccesablityId("Controls").getText();
        return text;

}

}
