package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginGuru {


    public static void main(String[] args) {
      
    	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Programs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
		
	
        String baseUrl = "http://demo.guru99.com/v4/index.php/";
        String username = "mngr188442";
        String password = "uzavese";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
       driver.get(baseUrl);
       
       
       driver.findElement(By.name("uid")).sendKeys(username);
       driver.findElement(By.name("password")).sendKeys(password);
       driver.findElement(By.name("btnLogin")).click();
       
       try {
		Thread.sleep(5000);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
//       
       String txtUser = driver.findElement(By.xpath("//tr[@class='heading3']/td")).getText();
       System.out.println(txtUser);
       
       if(txtUser.contains(username)){
    	   System.out.println("PASS");
       }else{
    	   System.out.println("FAIL");
       }
       
       driver.findElement(By.xpath("//a[@href='Logout.php']")).click();
       driver.switchTo().alert().dismiss();
       
       driver.close();
}
}