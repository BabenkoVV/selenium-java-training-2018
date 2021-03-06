import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;


public class BrowserCheckTest {

    @Test
    public void IETest()
    {
        InternetExplorerDriverManager.getInstance().setup();

        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://google.com");

        driver.quit();
    }

    @Test
    public void ChromeTest()
    {
        ChromeDriverManager.getInstance().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        driver.quit();
    }

    @Test
    public void FirefoxTest()
    {
        FirefoxDriverManager.getInstance().setup();

        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com");

        driver.quit();
    }

}
