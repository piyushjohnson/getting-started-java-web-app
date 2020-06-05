import static org.junit.Assert.assertEquals;

import javax.swing.text.html.HTML;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelloServletFunctionalTest {
    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        // System.setProperty("webdriver.chrome.driver",
        // "C:\\Users\\Piyush\\.m2\\repository\\webdriver\\chromedriver\\win32\\83.0.4103.39\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }

    @Test
    public void sayHello() throws Exception {
        // WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.get("http://localhost:8999");
        // driver.get("http://localhost:5000/webdemo");
        Thread.sleep(8000);

        driver.findElement(By.id("say-hello-text-input")).sendKeys("Dolly");
        driver.findElement(By.id("say-hello-button")).click();

        assertEquals("Hello Page", driver.getTitle());
        assertEquals("Hello, Dolly!", driver.findElement(By.tagName("h2")).getText());
    }
}
