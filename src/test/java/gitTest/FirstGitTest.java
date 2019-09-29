package gitTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstGitTest {
	
	public void loginTest() throws IOException {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();//to maximize browser
		wd.get("https://www.bing.com/");
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("Chennai");
		input.submit();
		File src=  ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src, new File("C:\\Users\\lenovo\\eclipse-workspace\\GitTests\\Screenshot\\test.jpeg"));
		  
				
		
	}

}
