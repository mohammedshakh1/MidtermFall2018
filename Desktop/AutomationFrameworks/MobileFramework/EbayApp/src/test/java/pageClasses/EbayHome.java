package pageClasses;

import ExtentReport.TestLogger;
import application.page.base.ApplicationPageBase;
import base.MobileAPI;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;

public class EbayHome extends ApplicationPageBase {

  // public WebDriver driver;
    TouchAction act = new TouchAction(ad);

    @FindBy(id = "com.ebay.mobile:id/capsule_selling")
    private WebElement selling;

    @FindBy(id = "com.ebay.mobile:id/capsule_deals")
    private WebElement deals;

    @FindBy(id = "com.ebay.mobile:id/capsule_categories")
    private WebElement categories;

    @FindBy(id = "com.ebay.mobile:id/home")
    private WebElement menu;

    @FindBy(id = "com.ebay.mobile:id/capsule_following")
    private WebElement following;

    @FindBy(id = "com.ebay.mobile:id/search_box")
    private WebElement searchBox;

    @FindBy(id = "com.ebay.mobile:id/search_src_text")
    private WebElement searchBox2;

    @FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Add to search query\"])[10]")
    private WebElement searchIcon;

    @FindBy(id = "com.ebay.mobile:id/textview_header_title")
    private WebElement trending;

    @FindBy(id = "https://postman-echo.com/get")
    private WebElement ebayLogo;



    public String sellingtext(){
    String text = getText(selling,"selling");
    return text;


    }


    public String dealText(){
      String text=  getText(deals,"deals");
    return text;
    }

    public String categoriesText() {
        String text = getText(categories, "categories");
        return text;

    }

       public void ebayBatSearch(){
        ebaySearch(searchBox,"Search Box");
         TestLogger.log("Sending Char Bat");
         searchBox2.sendKeys("bat");
          TestLogger.log("Tapping Search Icon");
           searchIcon.click();
        }
       public void clickMenuButton(){
           click(menu,"Menu Button");



        }
/*public void search2(){
    searchBox2.sendKeys("bat",Keys.ENTER);
    TestLogger.log("Tapping Search Icon");
}*/

    public boolean trendingVerify(){
        TestLogger.log("Scrolling down to Trending");
        TestLogger.log("Checking for Trending");
     boolean rsl =   ad.scrollTo("Trending on eBay").isDisplayed();
     return rsl;
    }

    public String trendingText(){
        TestLogger.log("Scrolling to Trending");
        ad.scrollTo("Trending on eBay");
        boolean isDisplayed = trending.isDisplayed();
        boolean isEnabled = trending.isEnabled();
        String  text  =   trending.getText();
        return text;

    }
    public boolean featuredSaleVerify(){
        TestLogger.log("Scrolling down to Featured Sales & Events");
        TestLogger.log("Checking for Featured Sales & Events ");
        boolean rsl =   ad.scrollTo("Featured Sales & Events").isDisplayed();
        return rsl;
    }

    public boolean ebayLogoCheck(){
        TestLogger.log("Checking Ebay Logo");
        boolean rsl = ebayLogo.isDisplayed();
        return rsl;
}

    public void menu() {
        click(menu,"Menu");
    }

}


