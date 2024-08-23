import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    WebDriver driver;
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver",
                "/Users/moladin/Downloads/chromedriver-mac-arm64/chromedriver");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.moneylion.com/");
    }

    public void scrollDown(){
        WebElement careersLink = driver.findElement(By.partialLinkText("Careers"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", careersLink);
        careersLink.click();

    }

//    public void closeChrome(){
//        driver.quit();
//    }

    public static void main(String[] args)
    {
        Main obj=new Main();
        obj.launchBrowser();
        obj.scrollDown();
//        obj.closeChrome();
    }
}

//To do: need to close chrome after run but idk why close browser is run but scrolling web is not workout

