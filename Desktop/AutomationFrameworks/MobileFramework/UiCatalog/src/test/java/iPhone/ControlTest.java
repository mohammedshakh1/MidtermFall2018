package iPhone;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pagefactory.ControlsPage.Controls;
import pagefactory.HomePage.Homepage;

public class ControlTest extends Controls {

    Homepage objOfHomePage;


    @BeforeMethod
    public void inIt(){
        objOfHomePage = PageFactory.initElements(ad,Homepage.class);
    }


    @Test
    public void controlTextTest(){
        String actualText = objOfHomePage.controlText();
        objOfHomePage.clickControl();
        String expectedText = "Controls";
        Assert.assertEquals(actualText,expectedText);
    }








}
