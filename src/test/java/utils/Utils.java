package utils;

import com.github.javafaker.Faker;
import io.cucumber.core.api.Scenario;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.concurrent.TimeUnit;

public class Utils {

    public static ChromeDriver driver;
    public static Faker fake = new Faker();

    public static void acessarSistema() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32_c\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.webmotors.com.br/");

    }


    public static File capturarScreenshot(Scenario scenario) throws IOException {
        final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenShot, "image/png");
        File imagem = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {

            FileUtils.copyFile(imagem, (new File("./target/screenshots", scenario.getName() + "-" + scenario.getStatus()+ ".png")));

        }catch (Exception e){
            e.printStackTrace();
        }

        return imagem;
    }

    public static void aguardarLoading(WebElement elemento) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(elemento));
    }



    public static void limparCache() {
        try {
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_SHIFT);
            r.keyPress(KeyEvent.VK_DELETE);
            r.keyRelease(KeyEvent.VK_CONTROL);
            r.keyRelease(KeyEvent.VK_SHIFT);
            r.keyRelease(KeyEvent.VK_DELETE);
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);

        } catch (Exception e) {

        }
    }

    public static String dateManufacture() {
        LocalDate date = LocalDate.now();
        return date.getMonthValue() + "/" + date.getDayOfMonth() + "/" +date.getYear();
    }

    public static String dateBirth() {
        LocalDate date = LocalDate.now();
        Date dateInicial = Date.valueOf(date.minusYears(70));
        Date dateFinal = Date.valueOf(date.minusYears(18));
        LocalDate dateBirth = LocalDate.from(fake.date().between(dateInicial, dateFinal).toInstant().atZone(ZoneId.systemDefault()));
        return dateBirth.getMonthValue() +"/"+ dateBirth.getDayOfMonth()+"/"+dateBirth.getYear();

    }

    public static String startDate() {
        LocalDate startDate = LocalDate.from(LocalDate.now().plusYears(fake.number().randomDigitNotZero()));
        return startDate.getMonthValue() +"/"+ startDate.getDayOfMonth()+"/"+startDate.getYear();
    }
}
