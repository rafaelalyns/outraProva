package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericPage {
	  private WebDriver driver;
	    
	    public GenericPage(WebDriver driver) {
	        
	        this.driver = driver;        
	    }
	    
	    public WebElement getLogoText() {
	        
	        
	        return driver.findElement(By.xpath("//div[@id = 'header_container']/div[@class='header_secondary_container']/span"));
	    }
	    public WebElement getBemvindo() {
	    	return driver.findElement(By.className("alert alert-success"));
	    }
	   
	    public WebElement getBotaoContas () {
	        return driver.findElement(By.xpath("//div[@class = 'dropdown']/div[@class='dropdow-toggle']/span"));
	    }
	    public WebElement getAdicionar() {
	        return driver.findElement(By.xpath("//div[@class = 'dropdow-menu']/div[@href='/addConta']"));
	    }
	    public WebElement getCriarMovimentacao() {
            return driver.findElement(By.className("movimentacao"));
        }
}

