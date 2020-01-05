package akhilyy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public classTc001 {
	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\windows\\Downloads\\geckodriver-v0.20.1-win64 (1)\\geckodriver.exe");
	 driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	}
	
	 
	 
	 