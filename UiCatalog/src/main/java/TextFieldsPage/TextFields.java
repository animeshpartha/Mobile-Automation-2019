package TextFieldsPage;

import common.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextFields extends Base {

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]")
    public static WebElement textfield;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UITextField\"]")
    public static WebElement uiTextField;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UITextField Rounded\"]")
    public static WebElement uiTextFieldRounded;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UITextField Secure\"]")
    public static WebElement uiTextFieldSecure;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UITextField (with LeftView)\"]")
    public static WebElement uiTextFieldWithLeftview;

    public void clickOnUiTextField() {
        textfield.click();
        String actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"UITextField\"]")).getText();
        String expected = "UITEXTFIELD";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
}
