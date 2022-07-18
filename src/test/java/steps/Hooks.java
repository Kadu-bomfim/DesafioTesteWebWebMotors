package steps;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

import static utils.Utils.*;

public class Hooks {

    @Before()
    public void setUp() throws InterruptedException {
        Thread.sleep(3000);
        acessarSistema();
        Thread.sleep(30000);
    }

    @After()
    public void down(Scenario scenario) throws IOException {
        capturarScreenshot(scenario);
        driver.quit();
    }
}
