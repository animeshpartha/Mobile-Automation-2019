package iPhone;

import TextViewPage.TextView;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextViewPageTest extends TextView {
    TextView textView;

    @BeforeMethod
    public void initElements()throws InterruptedException{
        textView = PageFactory.initElements(ad, TextView.class);
    }
    @Test
    public void testUiTestView(){
        textView.clickOnTextView();
    }
}
