package webdriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC001_Login_Logout {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.navigate().to("https://hrms.indianrail.gov.in/HRMS/login");
Thread.sleep(3000);
driver.close();
	}

}
