package samplepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class books {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.bookswagon.com/");
		WebElement cli=driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/div/span/a"));
		cli.click();
		WebElement sap=driver.findElement(By.xpath("//*[@id=\"listSearchResult\"]/div[1]/div[3]/div[1]/a"));
		sap.click();
	    WebElement tex=driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_ProductDetail_lblTitle\"]"));
        tex.getText();
	System.out.println(tex);
	}

}
