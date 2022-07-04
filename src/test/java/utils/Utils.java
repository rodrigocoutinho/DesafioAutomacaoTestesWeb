package utils;

import io.cucumber.java.Scenario;
import io.cucumber.java.it.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.*;
import org.apache.commons.io.FileUtils;
import java.util.concurrent.TimeUnit;


public class Utils {
    public static WebDriver driver;

    public static void acessarSistema(){
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    public static <T> T Na(Class<T> classe) {
        return PageFactory.initElements(driver, classe);
    }

    public static void capturarTela(Scenario scenario) throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./target/image"+scenario+".png"));
        scenario.attach("./target/image"+scenario+".png", "img/png", "");

    }
}
