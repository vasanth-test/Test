package samplepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sampleclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("http://192.168.1.244:9007/agromet/login_execute");
		 WebElement user = driver.findElement(By.name("j_username"));
		 user.sendKeys("vasanth");
		 WebElement pass =driver.findElement(By.id("password"));
		 pass.sendKeys("12345678");
		 WebElement cli=driver.findElement(By.className("iCheck-helper"));
		 cli.click();
		 WebElement log=driver.findElement(By.id("btnLogin"));
		 log.click();
		 System.out.println("success");
		 WebElement sel=driver.findElement(By.id("select2-s_code-container"));
		 sel.click();
		// WebElement drop=driver.findElement(By.xpath("//*[@id=\"select2-s_code-result-ofkw-S0003\"]"));
		// drop.click();
		// ChromeOptions opt=new ChromeOptions();
		 //Select div=new Select(driver.findElement(By.id("select2-s_code-container")));
		// div.selectByVisibleText("Dhaka");
		 System.out.println("success");
		 Select dropdown = new Select(driver.findElement(By.id("select2-s_code-container")));
		 dropdown.selectByVisibleText("Dhaka");
	}
}
