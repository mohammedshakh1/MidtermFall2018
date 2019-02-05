package pageClasses;

import ExtentReport.TestLogger;
import application.page.base.ApplicationPageBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSignIn extends ApplicationPageBase {

    @FindBy(id = "ap_email_login")
    private WebElement emailBox;

    @FindBy(id = "ap_password")
    private WebElement passwordBox;

    @FindBy(id = "signInSubmit")
    private WebElement logInButton;

    @FindBy(id = "auth-show-password-checkbox-container")
    private WebElement showPassword;

    @FindBy(id = "auth-fpp-link-bottom")
    private WebElement forgotPassword;

    @FindBy(id = "register_accordion_header")
    private WebElement createAccount;

    @FindBy(id = "register_accordion_header")
    private WebElement logInIcon;

public void invalidLogin(){
    TestLogger.log("Sending asif@gmail.com to Email box");
    emailBox.sendKeys("asif@gmail.com");
    TestLogger.log("Sending asif123 to Password Box");
    passwordBox.sendKeys("asfd");
    TestLogger.log("Clicking log In to check");
    click(logInButton,"Log In");
}

public boolean emailBoxverification(){
    TestLogger.log("Checking for Email Box");
    boolean rsl = emailBox.isDisplayed();
    return rsl;
}
public boolean passwordBoxVerification(){
    TestLogger.log("Checking for Password Box");
    boolean rsl = passwordBox.isDisplayed();
    return rsl;
}
public String forgotPasswordText(){
    TestLogger.log("Looking for Forgot PassWord Button");
    String text = getText(forgotPassword,"Forgot PassWord");
    return text;
}

public boolean showPasswordVerification(){
    TestLogger.log("Looking for Show Password Check Box");
    boolean rsl = showPassword.isDisplayed();
    return rsl;
}

public String logInIconText(){
    TestLogger.log("Looking for Forgot Password");
    String text = getText(logInIcon,"Log in Icon");
    return text;
}

public boolean createAccountVerification(){
    TestLogger.log("Looking for Create Account Icon");
    boolean rsl = createAccount.isDisplayed();
    return rsl;
}

public void clickLogInButton(){
    click(logInButton,"Log In Button");
}

}
