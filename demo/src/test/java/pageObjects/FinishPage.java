package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinishPage {
    private WebDriver driver;
    public WebElement getLogoText() {
        
        return driver.findElement(By.xpath(("//div[@class = 'navbar-header']/div[@class='navbar-brand']")));
    }
    public WebElement getSairBotao() {
        return driver.findElement(By.xpath("//div[@class = 'nav navbar-nav']/div[@class='dropdown']/div[@class='active']/div[@href = '/logout'"));
    }
}
