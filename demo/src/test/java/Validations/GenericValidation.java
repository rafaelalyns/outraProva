package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import pageObjects.GenericPage;
import pageObjects.LoginPage;
import Report.Report;
import Report.Screenshot;

public class GenericValidation {
	private  WebDriver driver;
    private LoginPage loginPage;

    public GenericValidation(WebDriver driver) {
        
        this.driver = driver;
        GenericPage genericPage = new GenericPage(this.driver);
    }
    
    public void validationGenericPage() {
        
        try {
            GenericPage genericPage = null;
			Assertions.assertTrue(genericPage.getLogoText().isDisplayed());
            Report.log(Status.PASS, "Acessou a p�gina de Login corretamente", Screenshot.captureBase64(driver));
            
        }catch (Exception e) {
            
            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
        }
    }
}
