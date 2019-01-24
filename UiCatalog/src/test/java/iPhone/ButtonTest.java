package iPhone;

import ButtonsPage.Buttons;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonTest extends Buttons {

    Buttons buttons;
    @BeforeMethod
    public void initElements(){
        buttons= PageFactory.initElements(ad, Buttons.class);
    }
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getButtonPage();
    }
    @Test
    public void testbutton() throws InterruptedException {
        buttons.clickOnButton();
        sleep(2);
    }
}
