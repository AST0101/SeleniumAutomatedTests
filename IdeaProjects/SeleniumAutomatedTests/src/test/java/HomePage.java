import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class HomePage {

    private static WebDriver driver = new ChromeDriver();


//    public static WebDriver getDriver() {
//        return driver;
//    }

    //element not found - to be fixed
    WebElement homeLogo = driver.findElement(By.cssSelector(".logo"));

}
