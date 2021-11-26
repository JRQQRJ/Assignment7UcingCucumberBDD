package pages;

import com.automationbytarun.components.BaseActions;
import org.openqa.selenium.WebDriver;

public class SwagLabsLoginPage extends BaseActions {

    WebDriver driver;

    public SwagLabsLoginPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }


    public SwagLabsLoginPage enterUserName(String username){

        typeInto("SwagLabsLoginPage.tbx_Username",username);
        return this;

    }

    public SwagLabsLoginPage enterPassword(String password){

        typeInto("SwagLabsLoginPage.tbx_Password",password);
        return this;

    }

    public SwagLabsInventoryPage clickLogin(){

        clickIt("SwagLabsLoginPage.tbx_btn_Submit");
        return new SwagLabsInventoryPage(driver);

    }

}
