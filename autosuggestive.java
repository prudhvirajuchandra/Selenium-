package Seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\source\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(3000L);
		Driver.manage().window().maximize();
		Driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000L);
		List<WebElement> options = Driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option : options)
		{
			if(option.getText().equalsIgnoreCase("British Indian Ocean Territory"))
			{
				option.click();
				break;
			
			}
			
		}

	}

    }

