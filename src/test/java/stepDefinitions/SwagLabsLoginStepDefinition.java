package stepDefinitions;

import com.automationbytarun.browser.DriverManager;
import com.automationbytarun.components.BaseActions;
import com.automationbytarun.components.TestActions;
import com.automationbytarun.properties.PropertiesLoader;
import com.automationbytarun.properties.PropertiesValidator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.SwagLabsLoginPage;
import pages.SwagLabsInventoryPage;

import java.util.Objects;

public class SwagLabsLoginStepDefinition extends TestActions  {

    public static WebDriver driver;
    DriverManager driverManager;
    public BaseActions pageActions;
    SwagLabsLoginPage swagLabsLoginPage;
    SwagLabsInventoryPage swagLabsInventoryPage;

    @Given("I am at the login page")
    public void iAmAtTheLoginPage() throws Exception {
        PropertiesLoader.initializeProperties();
        PropertiesValidator.validateConfigurations();
        driverManager=new DriverManager();
        driverManager.loadDriver();
        driver=driverManager.getDriver();
        pageActions = new BaseActions(driver);
        swagLabsLoginPage =new SwagLabsLoginPage(driver);
        pageActions.launchUrl(PropertiesLoader.appUrl);

    }


    @When("I enter {string} and {string} and submit")
    public void iEnterAndAndSubmit(String arg0, String arg1) throws InterruptedException {

        swagLabsLoginPage.enterUserName(arg0);
        swagLabsLoginPage.enterPassword(arg1);
        swagLabsLoginPage.clickLogin();
        Thread.sleep(3000);

    }

    @When("I enter {string} and {string} and try submit")
    public void iEnterAndAndTrySubmit(String arg0, String arg1) throws InterruptedException {
                swagLabsLoginPage.enterUserName(arg0)
                .enterPassword(arg1)
                .clickLogin();
        Thread.sleep(3000);
    }

    @Then("I should not see the Welcome Page")
    public void iShouldNotSeeTheWelcomePage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("validate"));
    }

//    @Then("I should see the Welcome Page")
//    public void iShouldSeeTheWelcomePage() throws InterruptedException {
//        SwagLabsLoginStepDefinition swagLabsLoginStepDefinition =new SwagLabsLoginStepDefinition();
//        System.out.println(driver);
//        pageActions = new BaseActions(driver);
//        swagLabsInventoryPage = new SwagLabsInventoryPage(driver);
//        String welcomMsg = swagLabsInventoryPage.getWelcomeMessage();
//        System.out.println(welcomMsg);
//        Thread.sleep(3000);
//    }
//
//
//    @Given("I am able to login")
//    public void iAmAbleToLogin() throws InterruptedException {
//        swagLabsInventoryPage = new SwagLabsInventoryPage(driver);
//        String welcomMsg = swagLabsInventoryPage.getWelcomeMessage();
//        System.out.println(welcomMsg);
//        Thread.sleep(3000);
//
//    }
//
//    @When("I want add {string}  and {string}to cart")
//    public void iWantAddAndToCart(String arg0, String arg1) throws InterruptedException {
//        System.out.println("111111");
//        if(Objects.equals(arg0, "SauceLabsBackpack")){
//            swagLabsInventoryPage.addSauceLabsBackpackToCart();
//            Thread.sleep(3000);}
//        if(Objects.equals(arg1, "SauceLabsFleeceJacket")){
//            System.out.println("222222");
//            swagLabsInventoryPage.addSauceLabsFleeceJacketToCart();
//        }
//    }
//
//    @Then("Items must be added to cart")
//    public void itemsMustBeAddedToCart() {
//    }

}



