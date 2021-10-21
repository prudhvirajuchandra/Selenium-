package Seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flightbook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\source\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver(); // create object for chrome driver
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(3000L);// pass the URL
		Driver.manage().window().maximize();
		Driver.findElement(By.id("autosuggest")).sendKeys("ind");    
		Thread.sleep(3000L);
		List <webElement> options = Driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for (webElement option : options)
		{
			if (options.getText().equalsIgnorecase("India"))
					{
					options.click();
					break();
				
					
		//Driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		//Thread.sleep(3000L);
		//Driver.findElement(By.xpath("//*[@id='citydropdown']/tbody/tr[2]/td[2]//a[@value='BLR']")).click();
		//Thread.sleep(3000L);
		//Driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).click();
		//Thread.sleep(2000L);
		//Driver.findElement(By.xpath("(//a[@value='VTZ'])[2]")).click();
		//Driver.findElement(By.id("custom_date_picker_id_1")).click();
	
		
	}

}
