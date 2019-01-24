package TextViewPage;

import common.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextView extends Base {
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]")
    public static WebElement textview;
    public void clickOnTextView() {
        textview.click();
        String actual = ad.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextView")).getText();
        String expected = "Now is the time for all good developers to come to serve their country. Now is the time for all good developers to come to serve their country. This text view can also use attributed strings.";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
}
