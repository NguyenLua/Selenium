package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginJira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Programs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
		
	
        String baseUrl = "https://www.facebook.com/?stype=lo&jlou=Affzil5H1v6Qd4WyiwLrfwtClJTMCkHWNTxUFoqb3sx9yBFEM3p5EI6ThIHNaCh3V6MB6HQRKOJpwHaNUk_GW6AEwJRVkpVeWDIclENM58oXaA&smuh=18695&lh=Ac83vW4IIItfFGS3";
        String email = "nguyenlua090196@gmail.com";
        String password = "191196@Lua";
//        String expectedTitle = "Welcome: Mercury Tours";
//        String actualTitle = "";
       driver.get(baseUrl);
       
       
       driver.findElement(By.id("email")).sendKeys(email);
       driver.findElement(By.id("pass")).sendKeys(password);
       driver.findElement(By.id("u_0_2")).click();
       driver.close();
       

	}

}
