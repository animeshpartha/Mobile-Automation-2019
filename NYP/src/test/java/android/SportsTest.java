package android;

import Sports.Sports;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static common.Base.ad;

public class SportsTest extends Sports{
    Sports sports;
    @BeforeMethod
    public void initElements(){
        sports = PageFactory.initElements(ad, Sports.class);
    }
    @Test
    public void sportsTest() throws InterruptedException {
        sports.setSports();
    }
}
