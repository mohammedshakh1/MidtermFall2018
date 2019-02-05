package pagefactory.ImgesPage;

import ExtentReport.TestLogger;
import base.MobileAPI;

/**
 * Created by mrahman on 1/15/17.
 */
public class Images extends MobileAPI {

    public String imageText(){
        TestLogger.log("Looking For Image ");
        TestLogger.log("Getting Text From Image");
       String text = findElementByAccesablityId("Images").getText();
       return text;
    }

    public void imageClick(){
        TestLogger.log("Looking For Image Button");
        TestLogger.log("Click Image Button");
        findElementByAccesablityId("Images").click();
    }



}
