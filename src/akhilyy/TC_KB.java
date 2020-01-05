package akhilyy;
package akhilyy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class TC_KB {
public static void main(String args[]) throws Exception{
	//Test case steps
	System.setProperty("webdriver.gecko.driver", "D:\\Suresh_Selenium\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	//click --Keyboard --Robot
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	System.out.println("TAB");
	Thread.sleep(4000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	System.out.println("ENTER");
	Thread.sleep(4000);
    System.out.println("Login completed");
    driver.findElement(By.linkText("Logout")).click();
    System.out.println("Logout complted");
    driver.close()
	
}
}




}
