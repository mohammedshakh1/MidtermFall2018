package pageClasses;

import ExtentReport.TestLogger;
import application.page.base.ApplicationPageBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends ApplicationPageBase {

    @FindBy(id = "deals")
    private WebElement deals;

    @FindBy(id = "wholefoods")
    private WebElement wholeFood;

    @FindBy(id = "prime")
    private WebElement prime;

    @FindBy(id = "fresh")
    private WebElement fresh;

    @FindBy(id = "video")
    private WebElement video;

    @FindBy(id = "music")
    private WebElement music;

    @FindBy(id = "nav-logobar-greeting")
    private WebElement signIn;




public String dealText(){
    TestLogger.log("Getting text from Deals");
    String text =  getText(deals,"Deals");
    TestLogger.log("Clicking Deal Button");
    click(deals,"Deals");
    return text;
}

public String wholeFoodText(){
    TestLogger.log("Getting text From Whole Foods");
    String text = getText(wholeFood,"Whole Foods");
    TestLogger.log("Clicking WholeFoods Button");
    click(wholeFood,"Whole Foods");
    return text;
}

public String primeText(){
    TestLogger.log("Getting text from Prime");
    String text = getText(prime,"Prime");
    TestLogger.log("Clicking Prime Button");
    click(prime,"Prime");
    return text;
}

public String freshText(){
    TestLogger.log("Getting text from Fresh");
    String text = getText(fresh,"Fresh");
    TestLogger.log("Clicking Fresh Button");
    click(fresh,"Fresh");
    return text;
}

public String videoText(){
    TestLogger.log("Getting text from Video");
    String text = getText(video,"Video");
    TestLogger.log("Clicking Video Button");
    click(video,"Video");
    return text;
}

public String musicTest(){
    TestLogger.log("Getting text from Music");
    String text = getText(music,"Music");
    TestLogger.log("Clicking Music Button");
    click(music,"Music");
    return text;
}
public boolean trendingCheck(){
    TestLogger.log(" Looking for Trending deals");
    TestLogger.log("Scrolling to Trending deals");
    boolean rsl = ad.scrollTo("Trending deals").isDisplayed();
    return rsl;
}

public boolean signInCheck(){
    TestLogger.log("Checking for sign In button");
    boolean rsl = signIn.isDisplayed();
    return rsl;
}

public void signInClick(){
    TestLogger.log("Looking for Sign In Botton");
    click(signIn,"Sign In");
}

}
