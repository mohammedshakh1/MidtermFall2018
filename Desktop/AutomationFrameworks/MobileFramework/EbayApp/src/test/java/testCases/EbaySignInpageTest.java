package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageClasses.EbayHome;
import pageClasses.EbaySignInPage;

public class EbaySignInpageTest extends EbaySignInPage {

    EbayHome objOfEbayHome;
    EbaySignInPage objOfEbaySignInPage;

    @BeforeMethod
    public void inIt(){
        objOfEbayHome = PageFactory.initElements(ad,EbayHome.class);
        objOfEbaySignInPage = PageFactory.initElements(ad,EbaySignInPage.class);
    }



    @Test
    public void signInTest(){
        objOfEbayHome.menu();
        objOfEbaySignInPage.signIn();
        objOfEbaySignInPage.fbSigningIn();
      Assert.assertTrue(objOfEbaySignInPage.invalidSignIn());
    }


}
