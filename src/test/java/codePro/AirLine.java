

package codePro;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirLine {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\DailyTask\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.makemytrip.com/");
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File des=new File("C:\\Users\\admin\\Desktop\\Data\\png");
		FileUtils.copyFile(src, des);
	Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"));
		search.click();
		 
		TakesScreenshot tk1=(TakesScreenshot)driver;
		File src1 = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File des1=new File("D:\\Airline\\kaveri\\png");
		FileUtils.copyFile(src1, des1);
}
}
