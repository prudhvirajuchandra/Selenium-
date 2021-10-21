package Seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\source\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver(); // create object for chrome driver
		Driver.get("https://www.facebook.com/"); // pass the URL
		System.out.println(Driver.getTitle()); // get the title
		Driver.findElement(By.id("email")).sendKeys("this is my first code"); // find the element with id and pass the email
		Driver.findElement(By.name("pass")).sendKeys("raj@143"); // find th element with name and pass the password
		Driver.findElement(By.linkText("Forgotten password?")).click(); // find the element with linktext and click the button and the link will transfer to another page
		Driver.findElement(By.id("identify_email")).sendKeys("8885765860"); 
		Driver.findElement(By.id("did_submit")).click();
		Driver.findElement(By.xpath("//*[@id=\"initiate_interstitial\"]/div[3]/div/div[1]/a"));
		


	}

}