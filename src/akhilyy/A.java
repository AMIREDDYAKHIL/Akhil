package akhilyy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	 public class A {
	 
		static String username ="suresh";
		static String password ="suresh123";
		public static void main(String arg[]) throws Exception{
			System.setProperty("webdriver.gedcko.driver"," C:\\Users\\windows\\Downloads\\chromedriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
			if(driver.getTitle().equals(" orangeHRM - New level of HR Management")) {
				System.out.println("Title matched");
			}
			else {
				System.out.println("Title not matched and expected title is " + driver.getTitle());
				
			}
			driver.findElement(By.name("txtuserName")).sendKeys(username);
			driver.findElement(By.xpath("//input[@name='txtpassword']")).sendKeys(password);
			driver.findElement(By.name("submit")).click();
			Thread.sleep(3000);
			System.out.println( "Login completed");
			
	            
			}
	 }
					