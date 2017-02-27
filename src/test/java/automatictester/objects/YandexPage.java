package automatictester.objects;

import automatictester.framework.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YandexPage extends ParentPage{

    private String loginField = "//*[@class='input auth__username domik2__dropdown-input input_theme_bordergray input_size_xs input_auth_yes i-bem input_js_inited']/span/input";
    private String passField = "//*[@class='input auth__password domik2__dropdown-input input_theme_bordergray input_size_xs input_type_password input_toolbar_yes input_auth_yes input_side_left input_forgot_yes i-bem input_js_inited']/span/input";
    private String submitButton = "//*[@class='domik2__social-icon domik2__social-more b-ico b-ico-more']/../button";
    private String logo = "//*[@class='mail-App-Header-Item mail-App-Header-Item_left js-header-left-column']";

    public YandexPage(WebDriver driver) {
        super(driver);
    }

    public void fillLoginField(String login){
        setValueInputField(loginField, login);
    }

    public void fillPassField(String login){
        setValueInputField(passField, login);
    }

    public void clickSubmit(){
        clickByXpath(submitButton);
    }

    public boolean hasOPened() {
        By downloadLinkLocator = By.xpath(logo);
        return hasElement(downloadLinkLocator);
    }
}
