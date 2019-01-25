package android;

import sportsPage.Sports;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SportsPageTest extends Sports{
    Sports sports;
    @BeforeMethod
    public void initElements(){
        sports = PageFactory.initElements(ad, Sports.class);
    }
    @Test
    public void sportsTest1() throws InterruptedException {
        sports.setSports1();
    }
    @Test
    public void sportsTest2() throws InterruptedException {
        sports.setSports2();
    }
}
