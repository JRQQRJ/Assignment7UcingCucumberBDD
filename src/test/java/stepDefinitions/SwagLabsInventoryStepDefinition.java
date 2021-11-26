package stepDefinitions;

import com.automationbytarun.components.BaseActions;
import com.automationbytarun.components.TestActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.SwagLabsInventoryPage;

import java.util.Objects;

public class SwagLabsInventoryStepDefinition extends TestActions {



    WebDriver driver;
    public BaseActions pageActions;
    SwagLabsInventoryPage swagLabsInventoryPage;


    @Then("I should see the Welcome Page")
    public void iShouldSeeTheWelcomePage() throws InterruptedException {
        SwagLabsLoginStepDefinition swagLabsLoginStepDefinition =new SwagLabsLoginStepDefinition();
        driver = swagLabsLoginStepDefinition.rD();
        System.out.println(driver);
        pageActions = new BaseActions(driver);
        swagLabsInventoryPage = new SwagLabsInventoryPage(driver);
        String welcomMsg = swagLabsInventoryPage.getWelcomeMessage();
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
            swagLabsInventoryPage.addSauceLabsBackpackToCart();
            Thread.sleep(3000);}
        if(Objects.equals(arg1, "SauceLabsFleeceJacket")){
            System.out.println("222222");
            swagLabsInventoryPage.addSauceLabsFleeceJacketToCart();
        }
    }

    @Then("Items must be added to cart")
    public void itemsMustBeAddedToCart() {
    }



}


