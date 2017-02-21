package automatictester.objects;

import automatictester.framework.ParentPage;
import org.openqa.selenium.WebDriver;

public class MainPage extends ParentPage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickTab(String tab) {
        click(tab);
    }

}