package Tasks;

import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage;
import pageObjects.NovoUsuarioPage;
import Validations.LoginValidation;
import Validations.NovoUsuarioValidation;

public class NovoUsuarioTask {
	private WebDriver driver;
	private LoginPage loginPage;
	private LoginValidation loginValidation;
	private pageObjects.NovoUsuarioPage novoUsuarioPage;
	NovoUsuarioValidation novoUsuarioValidation;
	
public NovoUsuarioTask(WebDriver driver) {
        
        this.driver= driver;
        NovoUsuarioValidation novoUsuarioValidation = new NovoUsuarioValidation(this.driver);
        NovoUsuarioPage novoUsuarioPage = new NovoUsuarioPage(this.driver);
    }
    
  public void IrPaginaNovoUsuario() {
    novoUsuarioValidation.validationUsuarioPage();  
}
    public void CriarNovoUsuario() {
        novoUsuarioValidation.validationUsuarioPage();  
        novoUsuarioPage.getNovoUsuarioBotao().click();              
       novoUsuarioPage.getNovoNomeUsuario().sendKeys("Rafaela Pereira");
    	novoUsuarioPage.getNovoEmailUsuario().sendKeys("rafaelapereira@teste.com.br");
        novoUsuarioPage.getNovaSenhaUsuario().sendKeys("testeteste");
        novoUsuarioPage.getBotaoCadastrar().click();
    }
    
}
