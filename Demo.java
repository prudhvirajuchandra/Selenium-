import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chromeDriver","C:\\Users\\Dell\\Desktop\\chromedriver.exe")
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
