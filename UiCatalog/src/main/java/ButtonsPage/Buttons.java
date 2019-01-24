package ButtonsPage;

import common.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Buttons extends Base {
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
    public static WebElement button;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Gray\"]")
    public static WebElement backgroundimage;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Right pointing arrow\"]")
    public static WebElement buttonwithimage;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Rounded\"]")
    public static WebElement roundedbutton;
    public void clickOnButton() {
        button.click();
        backgroundimage.click();
        buttonwithimage.click();
        roundedbutton.click();
        String actual = ad.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Rounded\"]")).getTagName();
        String expected = "Rounded";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
}
