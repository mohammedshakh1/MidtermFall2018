package pagefactory.SegmentsPage;

import ExtentReport.TestLogger;
import base.MobileAPI;

/**
 * Created by mrahman on 1/15/17.
 */
public class Segments extends MobileAPI {


    public String segmentText(){
        TestLogger.log("Looking For Segment Button");
        TestLogger.log("Getting Text From Segment Button");
      String text =   findElementByAccesablityId("Segments").getText();
      return text;
    }


    public void segmentClick(){
        TestLogger.log("Looking For Segment Button");
        TestLogger.log("Clicking segment Button");
        findElementByAccesablityId("Segments").click();
    }



}
