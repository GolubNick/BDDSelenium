package automatictester.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class DSL {

    private WebDriver driver;

    public DSL(WebDriver driver) {
        this.driver = driver;
    }

    public void click(String text) {
        click(By.linkText(text));
    }

    public void clickByXpath(String locator) {
        click(By.xpath(locator));
    }

    public void click(By by) {
        driver.findElement(by).click();
    }

    public void setValueInputField(String locator, String value){
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }

    public boolean hasElement(By by) {
        return !driver.findElements(by).isEmpty();
    }

}