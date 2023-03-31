package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Report.Report;
import Report.Screenshot;
import pageObjects.ContasPage;
import pageObjects.MovimentacaoPage;

public class MovimentacaoValidation {
    private WebDriver driver;
    
    public MovimentacaoValidation(WebDriver driver) {
        this.driver = driver;
        MovimentacaoPage movimentacaoPage = new MovimentacaoPage(this.driver);
    }
public void movimentacaoContasValidation() {
        
        try {
            MovimentacaoPage movimentacaoPage = null;
            Assertions.assertTrue(movimentacaoPage.getLogoText().isDisplayed());
            Report.log(Status.PASS, "Acessou a p�gina de Login corretamente", Screenshot.captureBase64(driver));
            
        }catch (Exception e) {
            
            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
        }
}
}
