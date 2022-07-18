package actions;

import org.junit.Assert;
import pages.ConultarOfertasPage;

public class ConsultarOfertasActions extends ConultarOfertasPage {

    public static ConsultarOfertasActions consultarOfertasActions() {
        return new ConsultarOfertasActions();
    }

    public void clicarVerOfertas() {
        btnVerOfertas.click();
    }

    public void validarListaVeiculos() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(labelListaCarros.isDisplayed());
    }
}
