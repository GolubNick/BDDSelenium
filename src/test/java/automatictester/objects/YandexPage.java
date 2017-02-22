package automatictester.objects;

import automatictester.framework.ParentPage;
import org.openqa.selenium.WebDriver;

public class YandexPage extends ParentPage{

    private String loginField = "uniq44932880834676325";
    private String passField = "uniq5957158904056996";
    private String submitButton = "";

    public YandexPage(WebDriver driver) {
        super(driver);
    }

    public void fillLoginField(String login){
        setValueInputField(loginField, login);
    }

    public void fillPassField(String login){
        setValueInputField(passField, login);
    }
}
