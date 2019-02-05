package testCases;

import home.HomePage;
import route.SelectRoutePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {
    HomePage objHomePage;
    SelectRoutePage objSelectRoutePage;

    @BeforeMethod
    public void initializationOfObjects() {
        objHomePage = PageFactory.initElements(ad, HomePage.class);
        objSelectRoutePage = PageFactory.initElements(ad, SelectRoutePage.class);
    }

    @Test
    public void testMenu() throws InterruptedException {
       // objHomePage.skipLogin();
        // objHomePage.clickGps();
        objHomePage.getMenu();

      //  objHomePage.getMenu();
    }

  /*  @Test
    public void testYourPlaces() {
        objHomePage.getYourPlaces();
    }

    @Test
    public void testYourTimeline() {
        objHomePage.getYourTimeline();
    }

    @Test
    public void testYourCOntribution() {
        objHomePage.getYourContributions();
    }

    @Test
    public void testLocationSharing() {
        objHomePage.getLocationSharing();
    }

    @Test
    public void testStartDriving() {
        objHomePage.getStartDriving();
    }

    @Test
    public void testExplore() {
        objHomePage.getExplore();
    }

    @Test
    public void testTipsAndTricks() {
        objHomePage.getTipsAndTricks();
    }

    @Test
    public void testAddAMissingPlace() {
        objHomePage.getAddAMissingPlace();
    }

    @Test
    public void testSettings() {
        objHomePage.getSettings();
    }

    @Test
    public void testHelp() {
        objHomePage.getHelp();
    }

    @Test
    public void testSendFeedBack() {
        objHomePage.getSendFeedback();
    }

    @Test
    public void testTermsOfService() {
        objHomePage.getTermsOfServices();
    }

    @Test
    public void testSetHomeAddressInYourPlace() {
        objHomePage.setHomeAddressInYourPlaces();
    }

    @Test
    public void testMapTypeSatellite() {
        objHomePage.mapTypeSatellite();
    }

    @Test
    public void testMapTypeTerrain() {
        objHomePage.mapTypeTerrain();
    }

    @Test
    public void testStartDrivingTo() {
        objHomePage.startDriving();
    }
    @Test
    public void testSearch() {
        objHomePage.search();
    }*/
}
