package samplepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.click();
		search.sendKeys("redmi 7s");
		WebElement cli=driver.findElement(By.className("nav-input"));
		cli.click();
		Thread.sleep(10000);
		WebElement ph=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
        ph.click();
        WebElement cart=driver.findElement(By.id("add-to-cart-button"));
        cart.click();
        WebElement ca=driver.findElement(By.id("hlb-view-cart-announce"));
        ca.click();
		//Thread.sleep(10000);
        WebElement del=driver.findElement(By.xpath("//*[@id=\"sc-item-C0a276160-a832-4efe-bcc7-1aa380a416e2\"]/div[4]/div/div[1]/div/div/div[2]/div/span[2]/span/input"));
        del.click();
	}

}
