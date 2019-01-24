package iPhone;

import TextFieldsPage.TextFields;
import UiCatalogPage.UiCatalog;
import navigate.NavigateUi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextFieldsTest extends TextFields {

    TextFields textFields;

    @BeforeMethod
    public void initElements()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
    }
    @Test
    public void testUiTestFi8eld(){
        textFields.clickOnUiTextField();
    }
}
