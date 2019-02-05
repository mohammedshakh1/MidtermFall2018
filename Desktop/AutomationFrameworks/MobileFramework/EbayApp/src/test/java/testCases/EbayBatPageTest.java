package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageClasses.EbayBatPage;
import pageClasses.EbayHome;

public class EbayBatPageTest extends EbayBatPage {

    EbayHome objOfEbayHome;
    EbayBatPage objOfEbayBatPage;

    @BeforeMethod
    public void inIt(){
        objOfEbayBatPage = PageFactory.initElements(ad, EbayBatPage.class);
        objOfEbayHome = PageFactory.initElements(ad,EbayHome.class);
    }

@Test
    public void sortTest(){
        objOfEbayHome.ebayBatSearch();
        objOfEbayBatPage.clickSaveMsg();
       String actualText = objOfEbayBatPage.sortText();
        String expectedText = "SORT";
        Assert.assertEquals(actualText,expectedText);
}

@Test
    public void filtertest(){
        objOfEbayHome.ebayBatSearch();
        objOfEbayBatPage.clickSaveMsg();
        String actualText = objOfEbayBatPage.filterText();
        String expectedText = "FILTER";
        Assert.assertEquals(actualText,expectedText);
}
@Test
    public void imageSearchTest(){
        objOfEbayHome.ebayBatSearch();
        objOfEbayBatPage.clickSaveMsg();
        Assert.assertTrue(objOfEbayBatPage.imageSearchCheck());
}
@Test
    public void cartTest(){
        objOfEbayHome.ebayBatSearch();
        objOfEbayBatPage.clickSaveMsg();
        Assert.assertTrue(objOfEbayBatPage.cartCheck());
}
}
