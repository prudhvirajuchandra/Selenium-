package Seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
;

public class datehandler {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String month="December 2022";
		String day="20";		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Dell\\\\Desktop\\\\source\\\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.phptravels.net/");
		Driver.findElement(By.xpath("//*[@id=\'checkin\']")).click();
		Thread.sleep(3000L);
		while(true)
		{
			String text =Driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[1]/th[2]")).getText();
		
			if (text.equals(month))
			{
				break;
			}	
			else
			{
				Driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[1]/th[3]/i")).click();
			}
		}	
		
		
		Driver.findElement(By.xpath("//html[1]//body[1]//div[4]//div[1]//table[1]//tbody[1]//tr//td[contains(text),'+day+']")).click();
	}
		
	}	
	