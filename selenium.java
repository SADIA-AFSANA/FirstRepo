package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Chromedriver.exe");
        WebDriver webdriver = new ChromeDriver();
        webdriver.manage().window().maximize();
        webdriver.manage().deleteAllCookies();
        webdriver.get("https://www.google.com");
        webdriver.get("www.google.com");
        webdriver.findElement(By.name("q")).sendKeys("java");

        WebElement searchicon =webdriver.findElement(By.name("btnk"));
        searchicon.click();


    }
}
