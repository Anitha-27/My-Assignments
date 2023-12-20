package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(Title);
		

		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendkeys("Tuna@321");
		
		driver.findElement(By.className("firstname")).sendKeys("Anitha");
		driver.findElement(By.className("lastname")).sendKeys("V");
		
		driver.findElement(By.className("reg_email__")).sendKeys("anitavinay08@gmail.com");
		driver.findElement(By.className("reg_passwd__")).sendkeys("Anitha@97");
		
		WebElement Date of birthDD = driver.findElement(By.id("day"));
		Select sec = new Select(Date of birthDD);
		sec.selectByValue("8");
	}

}
