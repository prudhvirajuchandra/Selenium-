package Seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ddddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\source\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver(); // create object for chrome driver
		Driver.get("https://www.rediff.com/"); // pass the URL
		System.out.println(Driver.getTitle()); // get the title
		Driver.findElement(By.xpath("//*[@id=\'signin_info\']/a[1]")).click();
		Driver.findElement(By.xpath("//*[@id=\'login1\']")).sendKeys("8885765860");
		Driver.findElement(By.id("password")).sendKeys("raj@143");
		Driver.findElement(By.name("proceed")).click();
		
	}

}
