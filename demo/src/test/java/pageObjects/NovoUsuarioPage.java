package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NovoUsuarioPage {
private WebDriver driver;
    
    public NovoUsuarioPage(WebDriver driver) {
        
        this.driver = driver;
}
 public WebElement getLogoText() {
             
        return driver.findElement(By.xpath(("//div[@class = 'navbar-header']/div[@class='navbar-brand']")));
    }
    
    
    public WebElement getNovoUsuarioBotao() {
    	return driver.findElement(By.xpath("//div[@class='nav navbar-nav']/div[@class='active']/href"));
    }
    public WebElement getNovoNomeUsuario() {
    	return driver.findElement(By.id("nome"));
    }
    
    public WebElement getNovoEmailUsuario() {
    	return driver.findElement(By.id("email"));
    }
    public WebElement getNovaSenhaUsuario() {
    	return driver.findElement(By.id("senha"));
    }
    public WebElement getBotaoCadastrar() {
    	return driver.findElement(By.className("btn btn-primary"));
    }
    
}