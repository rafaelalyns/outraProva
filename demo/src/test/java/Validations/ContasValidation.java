package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Report.Report;
import Report.Screenshot;
import pageObjects.ContasPage;
import pageObjects.GenericPage;

public class ContasValidation {
    private WebDriver driver;
    
    public ContasValidation(WebDriver driver) {
        this.driver = driver;
        ContasPage contasPage = new ContasPage(this.driver);
    }
public void validationContasPage() {
        
        try {
            ContasPage contasPage = null;
            Assertions.assertTrue(contasPage.getLogoText().isDisplayed());
            Report.log(Status.PASS, "Acessou a p�gina de Login corretamente", Screenshot.captureBase64(driver));
            
        }catch (Exception e) {
            
            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
        }
}
}