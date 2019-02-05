package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageClasses.ApiDemoHomePage;

public class ApiDemoPageTest extends ApiDemoHomePage {

    ApiDemoHomePage objOfApiDemoHomePage;

    @BeforeMethod
    public void inIt(){
        objOfApiDemoHomePage = PageFactory.initElements(ad,ApiDemoHomePage.class);
    }

    @Test
    public void apiDemoTest(){
        objOfApiDemoHomePage.clickOk();
      // String actualText = objOfApiDemoHomePage.apiDemoText();
       objOfApiDemoHomePage.apiDemoClick();
       objOfApiDemoHomePage.clickAccess();
    }



}
