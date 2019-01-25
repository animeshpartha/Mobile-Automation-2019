package android;
import businessPage.Business;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class BusinessPageTest extends Business {
    Business business;
    @BeforeMethod
    public void initElements(){
        business = PageFactory.initElements(ad, Business.class);
    }
    @Test
    public void livingTest1() throws InterruptedException {
        business.setBusiness();
    }
}
