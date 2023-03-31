package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Utils.FileOperation;
import pageObjects.LoginPage;
import Validations.LoginValidation;

public class LoginTask {
    
private WebDriver driver;
private LoginPage loginPage;
private LoginValidation loginValidation;
    
    public LoginTask(WebDriver driver) {
        
        this.driver= driver;
        loginPage = new LoginPage(this.driver);
        loginValidation = new LoginValidation(this.driver);
    }
    
    public void efetuarLogin() {
        
        loginValidation.validationLoginPage();
        loginPage.getEmailInput().sendKeys("rafaelapereira@teste.com.br");
        loginPage.getPasswordInput().sendKeys("testeteste");
        loginPage.getEnterButton().click();
    }
    
  


}
