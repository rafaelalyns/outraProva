package Tasks;

import org.openqa.selenium.WebDriver;

import pageObjects.GenericPage;
import pageObjects.LoginPage;
import Validations.GenericValidation;
import Validations.LoginValidation;

public class GenericTask {
	private WebDriver driver;
	private GenericPage genericPage;
	private GenericValidation genericValidation;
	
	
	public GenericTask(WebDriver driver) {
        
        this.driver= driver;
        genericPage = new GenericPage(this.driver);
        genericValidation = new GenericValidation(this.driver);
    }
	public void CriarMovimentacao() {
	    genericValidation.validationGenericPage();
		genericPage.getBotaoContas();
	}
}
