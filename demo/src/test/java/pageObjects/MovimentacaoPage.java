package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MovimentacaoPage {
    private WebDriver driver;
    
    public MovimentacaoPage(WebDriver driver) {
        this.driver = driver;    }
    
    public WebElement getLogoText() {
        
        return driver.findElement(By.xpath("//div[@class = 'navbar-header']/div[@class='navbar-brand']"));
    }
    
    public WebElement getMovimentacao() {
        return driver.findElement(By.id("tipo"));
        }
    public WebElement getDataMovimentacao() {
        return driver.findElement(By.id("data_transacao"));
    }
    public WebElement getDataPagamento() {
        return driver.findElement(By.id("data_pagamento"));
    }
    public WebElement getDescricao() {
        return driver.findElement(By.id("descricao"));
    }
    public WebElement getInteressado() {
        return driver.findElement(By.id("descricao"));
    }
    public WebElement getValor() {
        return driver.findElement(By.id("valor"));
    }
    public WebElement getConta() {
        return driver.findElement(By.id("conta"));
    }
    public WebElement getSituacaoPendente() {
        return driver.findElement(By.id("status_pendente"));
    }
    public WebElement getSituacaoPago() {
        return driver.findElement(By.id("status_pago"));
    }
    public WebElement getSalvarBotao() {
        return driver.findElement(By.xpath("//div[@class = 'btn-group']/div[@class = 'btn btn-primary]"));
    }
    public WebElement getResumoMensal() {
        return driver.findElement(By.xpath("//div[@class = 'nav navbar-nav']/div[@class='dropdown']/div[@class='active']/div[@href = '/extrato'"));
    }
}
