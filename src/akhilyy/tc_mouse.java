package akhilyy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class tc_mouse {
	
		//Test Data
		static String username = "suresh";
		static String password = "suresh123";
	public static void main(String args[]) throws Exception{
		//Test case steps
	System.setProperty("webdriver.gecko.driver", "D:\\Suresh_Selenium\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	//verify
	//   A.R                    E.R
	if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
		System.out.println("Title matched");
	}
	else {
		System.out.println("Title not matched and expected title is " + driver.getTitle());
	}
	driver.findElement(By.name("txtUserName")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Login completed");
	//mouseover
	Actions ac = new Actions(driver);
	WebElement pimmenu = driver.findElement(By.linkText("PIM"));
	ac.moveToElement(pimmenu).perform();
	System.out.println("Mover completed");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Add Employee")).click();
	Thread.sleep(3000);
	System.out.println("CLikded on submenu");
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
	driver.quit();
	}
}
