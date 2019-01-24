package iPhone;

import ToolbarPage.Toolbar;
import TransitionsPage.Transitions;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TransitionsTest extends Transitions {
    Transitions transitions;

    @BeforeMethod
    public void initElements()throws InterruptedException {
        transitions = PageFactory.initElements(ad, Transitions.class);}
    @Test
    public void testImageButton(){
        transitions.clickOnFlipImage();
    }
    }

