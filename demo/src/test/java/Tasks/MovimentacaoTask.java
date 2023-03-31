package Tasks;

import org.openqa.selenium.WebDriver;

import Validations.MovimentacaoValidation;
import pageObjects.MovimentacaoPage;

public class MovimentacaoTask {
    private WebDriver driver;
    private MovimentacaoPage movimentacaoPage;
    private MovimentacaoValidation movimentacaoValidation;
    
    public MovimentacaoTask(WebDriver driver) {
        this.driver=driver;
        MovimentacaoPage movimentacaoPage = new MovimentacaoPage(this.driver);
        MovimentacaoValidation movimentacaoValidation = new MovimentacaoValidation(this.driver);
    }
        public void criarContaMovimentacao() {
            movimentacaoValidation.movimentacaoContasValidation();
            movimentacaoPage.getMovimentacao();
            movimentacaoPage.getDataMovimentacao().sendKeys("12/03/2023");
            movimentacaoPage.getDataPagamento().sendKeys("12/03/2023");
            movimentacaoPage.getDescricao().sendKeys("Receita");
            movimentacaoPage.getInteressado().sendKeys("pedro");
            movimentacaoPage.getValor().sendKeys("100");
            movimentacaoPage.getConta().sendKeys("Receita");
            movimentacaoPage.getSituacaoPago().click();
            movimentacaoPage.getSalvarBotao().click();
        }
            
            
        

        
    }

    

