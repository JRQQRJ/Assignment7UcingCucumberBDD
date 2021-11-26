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

public class SwagLabsLoginStepDefinition extends TestActions  {

    static WebDriver driver;
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

//    @When("I login to the application")
//    public void iLoginToTheApplication() throws InterruptedException {
//        loginPage.enterUserName("Admin")
//                .enterPassword("admin123")
//                .clickLogin();
//        Thread.sleep(3000);
//    }

    @When("I enter {string} and {string} and submit")
    public void iEnterAndAndSubmit(String arg0, String arg1) throws InterruptedException {
        swagLabsLoginPage.enterUserName(arg0);
        System.out.println(arg0);
        swagLabsLoginPage.enterPassword(arg1);
        System.out.println(arg1);
        swagLabsLoginPage.clickLogin();
        Thread.sleep(3000);
        driver = driverManager.getDriver();
        System.out.println(driver.getCurrentUrl());


    }

    public WebDriver rD(){

        System.out.println(driver.getCurrentUrl());
        return driver;
    }


//    @Then("I should see the Welcome Page")
//    public void iShouldSeeTheWelcomePage() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        String welcomMsg = welcomePage.getWelcomeMessage();
//        System.out.println(welcomMsg);
//        Thread.sleep(3000);
////        TestAsserts
////
////        TestAsserts.checkIfValuesAreEqual(welcomMsg,welcomMsg);
////        TestAsserts;
//
//    }


    @When("I enter {string} and {string} and try submit")
    public void iEnterAndAndTrySubmit(String arg0, String arg1) throws InterruptedException {
        System.out.println(arg0);
        System.out.println(arg1);
                swagLabsLoginPage.enterUserName(arg0)
                .enterPassword(arg1)
                .clickLogin();
        Thread.sleep(3000);
    }

    @Then("I should not see the Welcome Page")
    public void iShouldNotSeeTheWelcomePage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("validate"));
    }


    }



