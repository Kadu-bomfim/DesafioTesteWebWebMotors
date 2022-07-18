package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.Utils.*;

public class ConultarOfertasPage {

    public ConultarOfertasPage() {
        //this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='Button Button--red-home']")
    public WebElement btnVerOfertas; //= driver.findElement(By.xpath("//a[@class='Button Button--red-home']"));

    public WebElement labelListaCarros = driver.findElement(By.xpath("(//h2[contains(@class,'sc-uJMKN hNiOat')])[1]"));

}
