package testClasses;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageClasses.SauceLabHome;

public class SauceLabHomeTest extends SauceLabHome {

    SauceLabHome objOfSauceLabHome;

    @BeforeMethod
    public void inIt(){
        objOfSauceLabHome = PageFactory.initElements(ad,SauceLabHome.class);
    }

    @Test
    public void test(){
        objOfSauceLabHome.contentText();
    }

}
