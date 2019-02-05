package testClasses;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageClasses.AmazonHomePage;

public class AmazonHomePageTest extends AmazonHomePage {

    AmazonHomePage objOfAmazonHomePage;

    @BeforeMethod
    public void inIt(){
        objOfAmazonHomePage = PageFactory.initElements(ad,AmazonHomePage.class);
    }


   @Test
    public void dealTextTest(){
      String actualText = objOfAmazonHomePage.dealText();
      String expectedText = "Deals";
      Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void wholeFoodTextTest(){
        String actualText = objOfAmazonHomePage.wholeFoodText();
        String expectedText = "Whole Foods";
        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void freshTextTest(){
        String actualText = objOfAmazonHomePage.freshText();
        String expectedText = "Fresh";
        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void primeTextTest(){
        String actualText = objOfAmazonHomePage.primeText();
        String expectedText = "Prime";
        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void videoTextTest(){
        String actualText = objOfAmazonHomePage.videoText();
        String expectedText = "Video";
        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void musicTextTest(){
        String actualText = objOfAmazonHomePage.musicTest();
        String expectedText = "Music";
        Assert.assertEquals(actualText,expectedText);
    }




    @Test
    public void signInTest(){
        Assert.assertTrue(objOfAmazonHomePage.signInCheck());
    }


}
