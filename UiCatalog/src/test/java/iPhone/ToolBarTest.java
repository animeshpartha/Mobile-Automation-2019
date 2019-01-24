package iPhone;


import ToolbarPage.Toolbar;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ToolBarTest extends Toolbar {

    Toolbar toolbar;
    @BeforeMethod
    public void initElements()throws InterruptedException {
        toolbar = PageFactory.initElements(ad, Toolbar.class);}
        @Test
        public void testImageButton(){
            toolbar.clickOnImageButton();}
}

