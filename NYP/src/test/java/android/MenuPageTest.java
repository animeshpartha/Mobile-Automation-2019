package android;

import breakingNews.HomePageMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuPageTest extends Base {

    HomePageMenu homePageMenu;
    @BeforeMethod
    public void initElements(){
        homePageMenu = PageFactory.initElements(ad, HomePageMenu.class);
    }
    @Test
    public void sportsTest() throws InterruptedException {
        homePageMenu.setSports();
    }
    @Test
    public void pageSixTest() throws InterruptedException{
        homePageMenu.setPageSix();
    }
    @Test
    public void businessTest()throws InterruptedException{
        homePageMenu.setBusiness();
    }
    @Test
    public void entertainmentTest() throws InterruptedException{
        homePageMenu.setEntertainment();
    }
    @Test
    public void opinionTest() throws InterruptedException{
        homePageMenu.setOpinion();
    }
    @Test
    public void menuTest(){
        homePageMenu.clickMenu();
    }
    @Test
    public void livingTest() throws InterruptedException{
        homePageMenu.setLiving();
    }

    @Test(priority = 2, enabled = true)
    public void menuSearchBoxTest() throws InterruptedException {
        homePageMenu.setMenuSearchBox();
    }
    @Test(priority = 1, enabled = true)
    public void topNewsTest(){
        homePageMenu.setTopNews();
    }
    @Test(priority = 0, enabled = true)
    public void menuNewsTest() throws InterruptedException {
        homePageMenu.setMenuNews();
    }
    @Test(priority = 3, enabled = true)
    public void notificationTest(){
        homePageMenu.setNotifications();
    }
    @Test(priority = 4, enabled = true)
    public void signUpTest() throws InterruptedException {
        homePageMenu.setSignUp();
    }
    @Test
    public void sportsNewsTest() throws InterruptedException{
        homePageMenu.setSportsLastestNews();
    }
    @Test
    public void photoTest()throws InterruptedException{
        homePageMenu.setPhotos();
    }
    @Test
    public void photo1Test() throws InterruptedException{
        homePageMenu.setPhotos1();
    }
    @Test
    public void photo2Test() throws InterruptedException{
        homePageMenu.setPhoto2();
    }
}
