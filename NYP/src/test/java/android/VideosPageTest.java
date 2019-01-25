package android;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import videoPage.Videos;

public class VideosPageTest extends Videos {
    Videos videos = null;
    @BeforeMethod
    public void initElements() {
        videos = PageFactory.initElements(ad,Videos.class);
    }
    @Test
    public void videoTest1()throws Exception{
        videos.setVideos();
    }
}
