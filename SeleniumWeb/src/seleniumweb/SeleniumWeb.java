/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleniumweb;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 *
 * @author Yohan Alvarado
 */

public class SeleniumWeb {

    /**
     * @param args the command line arguments
     */
    static WebDriver driver;
    
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver"
                , "C:\\Users\\Yohan_Alvarado\\ChromeDriver\\chromedriver.exe");
        System.out.println("Test initiated");
        driver = new ChromeDriver();
        driver.get("https://www.rescatewildlife.org");
        System.out.println("Page title is: " +driver.getTitle());
        driver.quit();
        // TODO code application logic here
    }
    
}
