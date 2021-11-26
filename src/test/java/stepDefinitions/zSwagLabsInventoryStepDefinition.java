package stepDefinitions;

import com.automationbytarun.components.BaseActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ZSwagLabsInventoryPage;

import java.util.Objects;

public class zSwagLabsInventoryStepDefinition {



    WebDriver driver;
    public BaseActions pageActions;
    ZSwagLabsInventoryPage zSwagLabsInventoryPage;


    @Then("I should see the Welcome Page")
    public void iShouldSeeTheWelcomePage() throws InterruptedException {
        SwagLabsLoginStepDefinition swagLabsLoginStepDefinition =new SwagLabsLoginStepDefinition();
        driver = swagLabsLoginStepDefinition.rD();
        System.out.println(driver);
        pageActions = new BaseActions(driver);
        zSwagLabsInventoryPage = new ZSwagLabsInventoryPage(driver);
        String welcomMsg = zSwagLabsInventoryPage.getWelcomeMessage();
        System.out.println(welcomMsg);
        Thread.sleep(3000);
        }


    @Given("I am able to login")
    public void iAmAbleToLogin() {

    }

    @When("I want add {string}  and {string}to cart")
    public void iWantAddAndToCart(String arg0, String arg1) throws InterruptedException {
        System.out.println("111111");
        if(Objects.equals(arg0, "SauceLabsBackpack")){
            zSwagLabsInventoryPage.addSauceLabsBackpackToCart();
            Thread.sleep(3000);}
        if(Objects.equals(arg1, "SauceLabsFleeceJacket")){
            System.out.println("222222");
            zSwagLabsInventoryPage.addSauceLabsFleeceJacketToCart();
        }
    }

    @Then("Items must be added to cart")
    public void itemsMustBeAddedToCart() {
    }



}


