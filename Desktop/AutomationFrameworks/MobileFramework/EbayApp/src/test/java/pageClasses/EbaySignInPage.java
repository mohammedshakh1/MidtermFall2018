package pageClasses;

import ExtentReport.TestLogger;
import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySignInPage extends ApplicationPageBase {

    @FindBy(id = "com.ebay.mobile:id/textview_sign_out_status")
    private WebElement signInButton;

    @FindBy(id = "com.ebay.mobile:id/button_facebook")
    private WebElement fbSignIn;

    @FindBy(id = "m_login_email")
    private WebElement emailBox;

    @FindBy(id = "m_login_password")
    private WebElement passWord;

    @FindBy(id = "u_0_5")
    private WebElement logIn;

    public void signIn(){
        click(signInButton,"Sign In Button");
    }

    public void fbSigningIn(){
        click(fbSignIn,"Email Sign In");
    }

public boolean invalidSignIn(){
        TestLogger.log("Sending arno@gmail.com to Email Box ");
        emailBox.sendKeys("arno@gmail.com");
        TestLogger.log("Sending akr23 to PassWord Box ");
        passWord.sendKeys("akr23");
        click(logIn,"log In");
        boolean rsl =  ad.scrollTo("Did you forget your password?").isDisplayed();
        return rsl;
}



}
