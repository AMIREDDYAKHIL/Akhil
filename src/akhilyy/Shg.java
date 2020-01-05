package akhilyy;
import org.openqa.selenium.WebDriver; //To get access for WebDriver classes & methods
import org.openqa.selenium.firefox.FirefoxDriver;//To get access for firefox browser
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;//to get access for obj Ind: methods

public class Shg {
	public static void main(String args[]) throws Exception{
		//Test case steps
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\windows\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//enter url
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println("Application Opened");
		//Enter un
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		//clikc on login btn
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		//clikc on logout 
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		//close app
		driver.close();
	}
	}


