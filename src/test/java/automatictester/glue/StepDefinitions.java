package automatictester.glue;

import automatictester.framework.ParentScenario;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StepDefinitions extends ParentScenario {

    @Before
    public void beforeScenario() {
        startBrowser();
    }

//    @Given("^I am on the Selenium homepage$")
//    public void I_am_on_the_Selenium_homepage() {
//        navigateTo();
//    }
//
//    @When("^I click \"([^\"]*)\" tab$")
//    public void I_click_tab_on(String tab) {
//        mainPage.clickTab(tab);
//    }
//
//    @Then("^I should see \"([^\"]*)\" download link on Download page$")
//    public void I_should_see_download_link_on_download_page(String linkText) {
//        assertThat(downloadPage.hasDownloadLinkFor(linkText), is(true));
//    }

    @Given("^I am on the Yandex homepage$")
    public void I_am_on_the_Yandex_homepage(){
        navigateToYandex();
    }

    @When("^I enter \"([^\"]*)\" login$")
    public void I_enter_login(String login){
        yandexPage.fillLoginField(login);
    }

    @When("^I enter \"([^\"]*)\" password$")
    public void I_enter_password(String login){
        yandexPage.fillPassField(login);
    }

    @When("^I press submit button$")
    public void I_press_submit_button(){
        yandexPage.clickSubmit();
    }

    @Then("^I should see my mailbox$")
    public void I_should_see_my_mailbox() {
        assertThat(yandexPage.hasOPened(), is(true));
    }

    @After
    public void afterScenario(Scenario scenario) {
        closeBrowser();
    }
}