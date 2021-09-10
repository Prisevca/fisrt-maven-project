import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\ThinkPad\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://google.com");

        WebElement input = driver.findElement(By.xpath("//input[contains(@class, 'gLFyf gsfi')]"));
        input.sendKeys("Lora Prisevca");
        WebElement search = driver.findElement(By.name("btnK"));
//        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        actions.moveToElement(search);
        search.click();

        assertEquals("The page title is validated","selenium - Căutare Google",driver.getTitle());
        System.out.println( driver.getTitle());
        System.out.println(driver.getCurrentUrl());
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.quit();
    }
    }

