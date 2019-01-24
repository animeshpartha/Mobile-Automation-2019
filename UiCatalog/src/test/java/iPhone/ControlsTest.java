package iPhone;

import AlertsPage.Alerts;
import ControlsPage.Controls;
import PickersPage.Picker;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ControlsTest extends Controls {

    Controls controls;
    @BeforeMethod
    public void initElements() {
        controls = PageFactory.initElements(ad, Controls.class);
    }
    public Controls controls() {
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getControls();
        return PageFactory.initElements(ad, Controls.class);
    }
    @Test
    public void testbutton() {
        controls.clickControls();
    }
}
