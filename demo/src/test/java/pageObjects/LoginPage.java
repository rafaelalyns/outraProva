package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    
    private WebDriver driver;
    
    public LoginPage(WebDriver driver) {
        
        this.driver = driver;        
    }
    
    public WebElement getLogoText() {
        
            
        return driver.findElement(By.xpath("//div[@class = 'navbar-header']/div[@class='navbar-brand']"));
    }
    
    public WebElement getEmailInput() {
        
        return driver.findElement(By.id("email"));
    }
    
    public WebElement getPasswordInput() {
        
        return driver.findElement(By.id("senha"));
    }
    
    public WebElement getEnterButton() {
        
        return driver.findElement(By.className("btn btn-primary"));
        
    }

}
