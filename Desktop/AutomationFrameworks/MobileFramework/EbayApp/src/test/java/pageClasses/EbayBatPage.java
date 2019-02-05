package pageClasses;

import ExtentReport.TestLogger;
import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayBatPage extends ApplicationPageBase {

    @FindBy(id = "com.ebay.mobile:id/button_follow")
    private WebElement save;

    @FindBy(id = "com.ebay.mobile:id/button_sort")
    private WebElement sort;

    @FindBy(id = "com.ebay.mobile:id/button_filter" )
    private WebElement filter;

    @FindBy(id = "com.ebay.mobile:id/textview_item_count")
    private WebElement itemCount;

    @FindBy(id = "com.ebay.mobile:id/text_slot_1" )
    private WebElement saveMsg;

    @FindBy(id = "com.ebay.mobile:id/menu_image_search")
    private WebElement imageSearch;

    @FindBy(id = "com.ebay.mobile:id/action_view_icon")
    private WebElement cart;


   public String sortText(){
       TestLogger.log("Getting text from sort");
       String text = getText(sort,"sort");
       TestLogger.log("Clicking sort");
       sort.click();
       return text;
   }
   public String filterText(){
       TestLogger.log("Getting Text From Filter`");
       String text =getText(filter,"Filter");
       TestLogger.log("Clicking Filter Button");
       filter.click();
       return  text;
   }
   public String itemCountText(){
       TestLogger.log("Getting Item Count ");
       String text = getText(itemCount,"Item Count");
       return text;
   }

   public String saveText(){
       TestLogger.log("Getting Text from save ");
       String text = getText(save,"Save");
       return text;
   }

   public void clickSaveMsg(){
       click(saveMsg,"save msg");
   }

   public boolean imageSearchCheck(){
     boolean res = imageSearch.isDisplayed();
     return res;
   }

   public boolean cartCheck(){
       boolean res = cart.isDisplayed();
       return res;
   }

}
