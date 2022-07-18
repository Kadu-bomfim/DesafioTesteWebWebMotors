package steps;

import actions.ConsultarOfertasActions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

import static actions.ConsultarOfertasActions.*;

public class ConsultarOfertasSteps {

    @Dado("que o usuario acesse a plataforma webMotors")
    public void queOUsuarioAcesseAPlataformaWebMotors() {

    }

    @Dado("clica em ver ofertas")
    public void clicaEmVerOfertas() {
        consultarOfertasActions().clicarVerOfertas();
    }

    @Entao("apresenta a lista de carros novos e usados")
    public void apresentaAListaDeCarrosNovosEUsados() throws InterruptedException {
        consultarOfertasActions().validarListaVeiculos();
    }
}
