package Seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class endtoend {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\source\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(3000L);
		Driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		Driver.findElement(By.className("ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today")).click();
		

		

		


	}

}
