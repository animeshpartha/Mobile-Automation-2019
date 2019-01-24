package iPhone;

import AlertsPage.Alerts;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTest extends Alerts {

    Alerts alerts;
    @BeforeMethod
    public void initElements(){
        alerts= PageFactory.initElements(ad, Alerts.class);}

    @Test
    public void testActionSheetSimple() throws InterruptedException {
        alerts.clickOnAlerts();
        sleep(2);
    }
}
