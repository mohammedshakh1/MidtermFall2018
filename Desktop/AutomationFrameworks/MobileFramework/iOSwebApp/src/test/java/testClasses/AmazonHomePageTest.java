package testClasses;

import org.openqa.selenium.support.PageFactory;
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
    public void clickTest(){
      String actual =  objOfAmazonHomePage.test();
    }









}
