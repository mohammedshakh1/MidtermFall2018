package testClasses;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageClasses.AmazonHomePage;
import pageClasses.AmazonSignIn;

public class AmazonSignInTest extends AmazonSignIn {

    AmazonHomePage obOfAmazonHomePage;
    AmazonSignIn  objOfAmazonSignIn;

    @BeforeMethod
    public void inIt(){
        obOfAmazonHomePage = PageFactory.initElements(ad,AmazonHomePage.class);
        objOfAmazonSignIn = PageFactory.initElements(ad,AmazonSignIn.class);
    }


   @Test
   public void emailBoxVerificationTest(){
        obOfAmazonHomePage.signInClick();
        Assert.assertTrue(objOfAmazonSignIn.emailBoxverification());
   }


   @Test
    public void forgotPasswordTest(){
        obOfAmazonHomePage.signInClick();
        String actualText = objOfAmazonSignIn.forgotPasswordText();
        String expectedText = "Forgot password?";
        Assert.assertEquals(actualText,expectedText);
   }


   @Test
    public void logInIcontextTest(){
        obOfAmazonHomePage.signInClick();
        String actualText = objOfAmazonSignIn.logInIconText();
        String expectedText = "Create account. New to Amazon?";
        Assert.assertEquals(actualText,expectedText);
   }

   @Test
    public void createAccountVerificationTest(){
        obOfAmazonHomePage.signInClick();
        Assert.assertTrue(objOfAmazonSignIn.createAccountVerification());
   }

    @Test
    public void secondaryLogInIcontextTest(){
        obOfAmazonHomePage.signInClick();
        objOfAmazonSignIn.clickLogInButton();
        String actualText = objOfAmazonSignIn.logInIconText();
        String expectedText = "Create account. New to Amazon?";
        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void secondaryCreateAccountVerificationTest(){
        obOfAmazonHomePage.signInClick();
        objOfAmazonSignIn.clickLogInButton();
        Assert.assertTrue(objOfAmazonSignIn.createAccountVerification());
    }
}
