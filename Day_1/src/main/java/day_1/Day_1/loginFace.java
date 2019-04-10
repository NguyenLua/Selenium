package day_1.Day_1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class loginFace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Programs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.facebook.com/?stype=lo&jlou=AffI6ulqa7wg1iScfaFYtSvjDIRmiOXVm1oqGZYyYnMVl1aeJTRwSSvMIovU4hDGNSjus9JA2xTfTiPbQofUpOSMHdO4klB1jfSVAoP121A_-w&smuh=18695&lh=Ac850ney5umirxlT";
		driver.get(baseUrl);
		

	}

}
