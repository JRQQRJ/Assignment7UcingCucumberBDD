package pages;

import com.automationbytarun.components.BaseActions;
import org.openqa.selenium.WebDriver;

public class ZSwagLabsInventoryPage extends BaseActions {
    WebDriver driver;

    public ZSwagLabsInventoryPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }

    public String getWelcomeMessage(){
        return getTextFromElement("SwagLabsInventoryPage.lbl_welcomeMsg");
    }


    public ZSwagLabsInventoryPage addSauceLabsBackpackToCart() throws InterruptedException {
        System.out.println("111");
        clickIt("SwagLabsInventoryPage.btn_addSauceLabsBackpackToCart");
        Thread.sleep(3000);
        System.out.println("121");
        return this;
    }

    public ZSwagLabsInventoryPage addSauceLabsFleeceJacketToCart() throws InterruptedException {
        System.out.println("222");
        clickIt("SwagLabsInventoryPage.btn_addSauceLabsFleeceJacketToCart");
        System.out.println("212");
        Thread.sleep(3000);
        return this;
    }

}



