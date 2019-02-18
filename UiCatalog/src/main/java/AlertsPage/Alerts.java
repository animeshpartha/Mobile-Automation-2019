package AlertsPage;

import common.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Alerts extends Base {
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[11]")
    public static WebElement alerts;
    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[1]")
    public static WebElement cancel;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Show Customized\"]")
    public static WebElement customized;
    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[2]")
    public static WebElement simple;
    public void clickOnAlerts(){
        System.out.println();
        alerts.click();
        cancel.click();
        customized.click();
        String actual = ad.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"UIActionSheet\"])[1]")).getText();
        String expected = "UIActionSheet";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
}





















//    public void showActionSheetSimple(){
//        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[1]");
//    }
//    public void showActionSheetOkCancel(){
//        clickByXpath("(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[1]");
//    }
//    public void showActionSheetCustom(){
//        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[5]");
//    }
//    public void showAlertSimple(){
//        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[7]");
//    }
//    public void showAlertOkCancel(){
//        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[9]");
//    }
//    public void showAlertCustom(){
//        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[11]");
//    }
//    public void showSecureTextInput(){
//        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[13]");
//    }

