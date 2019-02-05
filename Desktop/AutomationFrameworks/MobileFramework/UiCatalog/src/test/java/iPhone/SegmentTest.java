package iPhone;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pagefactory.SegmentsPage.Segments;

public class SegmentTest extends Segments {

    Segments objOfSegments;

    @BeforeMethod
    public void inIt(){
        objOfSegments = PageFactory.initElements(ad,Segments.class);
    }
    @Test
    public void SegmentTest(){
      String actualText = objOfSegments.segmentText();
      objOfSegments.segmentClick();
      String expectedText = "Segments";
        Assert.assertEquals(actualText,expectedText);
    }




}
