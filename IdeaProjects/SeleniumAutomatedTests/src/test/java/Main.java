import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    private static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        driver.get("http://store.demoqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        HomePage aP = new HomePage();
        aP.homeLogo.click();
        System.out.println("The element was clicked");

        driver.quit();
    }
}
