package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageClasses.EbayHome;

public class EbayHomeTest extends EbayHome {

    EbayHome objOfCricBuzzHome;

    @BeforeMethod
    public void inIt() {
        objOfCricBuzzHome = PageFactory.initElements(ad, EbayHome.class);


    }


    @Test
    public void cricTest(){
        String actualText = objOfCricBuzzHome.sellingtext();
        String expectedText = "SELLING";
        Assert.assertEquals(actualText,expectedText);
}


   @Test
    public void homeTest() {
       String actualText = objOfCricBuzzHome.dealText();
       String expectedText = "DEALS";
       Assert.assertEquals(actualText, expectedText);
   }
    @Test
    public void categoryTest(){
        String actualText = objOfCricBuzzHome.categoriesText();
        String expectedTest = "CATEGORIES";
        Assert.assertEquals(actualText,expectedTest);



}
@Test
    public void tendingTest(){

     Assert.assertTrue(objOfCricBuzzHome.trendingVerify());
}

@Test
    public void saleTextTest(){
      Assert.assertTrue(objOfCricBuzzHome.featuredSaleVerify());

}

@Test
    public void ebayLogoTest(){
        Assert.assertTrue(objOfCricBuzzHome.ebayLogoCheck());
}



   }
