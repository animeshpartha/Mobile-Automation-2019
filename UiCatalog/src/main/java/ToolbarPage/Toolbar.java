package ToolbarPage;


import common.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Toolbar extends Base {
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[10]")
    public static WebElement toolbar;
    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Image\"]")
    public static WebElement imageButton;
    public void clickOnImageButton() {
        toolbar.click();
        imageButton.click();
        String actual = ad.findElement(By.xpath("//XCUIElementTypeSwitch[@name=\"Image\"]")).getText();
        String expected = "Image";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
}
