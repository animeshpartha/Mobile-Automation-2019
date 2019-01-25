package android;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import techPage.Tech;
public class TechPageTest extends Tech {
    Tech tech = null;
    @BeforeMethod
    public void initElements() {
        tech = PageFactory.initElements(ad,Tech.class);
    }
    @Test
    public void techTest1()throws Exception{
        tech.setTech();
    }
}

