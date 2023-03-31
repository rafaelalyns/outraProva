package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import pageObjects.LoginPage;
import pageObjects.NovoUsuarioPage;
import Report.Report;
import Report.Screenshot;

public class NovoUsuarioValidation {
	private  WebDriver driver;
    
    public NovoUsuarioValidation(WebDriver driver) {
        
        this.driver = driver;
        NovoUsuarioPage novoUsuarioPage = new NovoUsuarioPage(this.driver);
    }
public void validationUsuarioPage() {
        
        try {
            NovoUsuarioPage novoUsuarioPage = null;
			Assertions.assertTrue(novoUsuarioPage.getLogoText().isDisplayed());
            Report.log(Status.PASS, "Acessou a pagina de Login corretamente", Screenshot.captureBase64(driver));
            
        }catch (Exception e) {
            
            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
        }
    }
}
