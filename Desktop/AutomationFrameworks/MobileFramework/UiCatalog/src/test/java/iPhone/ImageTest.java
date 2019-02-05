package iPhone;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pagefactory.ImgesPage.Images;

public class ImageTest extends Images {

    Images objOfImage;

    @BeforeMethod
    public void inIt(){
        objOfImage = PageFactory.initElements(ad,Images.class);
    }


    @Test
    public void imageTextTest(){
        String actualText = objOfImage.imageText();
        objOfImage.imageClick();
        String expectedText = "Images";
        Assert.assertEquals(actualText,expectedText);

    }
}
