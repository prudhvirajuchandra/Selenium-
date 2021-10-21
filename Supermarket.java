package Seleniumdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Supermarket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\source\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver(); // create object for chrome driver
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(3000L);// pass the URL
		Driver.findElement(By.id("divpaxinfo")).click();
		Driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		Thread.sleep(3000L);
		Driver.findElement(By.xpath("//*[@value='BLR' ]")).click();
		Thread.sleep(3000L);

for(int i=1;i<5;i++)
{
		Driver.findElement(By.id("hrefIncAdt")).click();
}
        Driver.findElement(By.id("hrefIncChd")).click();

        Driver.findElement(By.id("hrefIncInf")).click();
        Driver.findElement(By.id("btnclosepaxoption")).click();
	}

}
