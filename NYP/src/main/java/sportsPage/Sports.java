package sportsPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class Sports extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]")
    public static WebElement sports;
    public void setSports1() throws InterruptedException {
        menu.click();
        sleep(2);
        sports.click();
        sleep(4);
        scrollAndClickByName("Sonny Gray has no idea how it went horribly wrong with Yankees");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Sonny Gray has no idea how it went horribly wrong with Yankees";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setSports2() throws InterruptedException {
        menu.click();
        sleep(2);
        sports.click();
        sleep(4);
        scrollAndClickByName("Mariano Rivera: Perfect choice for 1st perfect Hall of Fame ballot");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Mariano Rivera: Perfect choice for 1st perfect Hall of Fame ballot";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }

}
