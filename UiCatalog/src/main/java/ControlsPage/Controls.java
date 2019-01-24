package ControlsPage;

import common.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Controls extends Base {
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]")
    public static WebElement controls;
    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Standard\"]")
    public static WebElement standardswitch;
    @FindBy(xpath = "//XCUIElementTypeSlider[@name=\"Standard\"]")
    public static WebElement standardslider;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Customized Slider\"]")
    public static WebElement customizedslider;
    public void clickControls() {
        controls.click();
        standardswitch.click();
        standardslider.click();
        customizedslider.click();
        String actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Customized Slider\"]")).getText();
        String expected = "Customized Slider";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);

    }
}
