package samplePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PraactiveProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myteamlease.com/");
		Thread.sleep(2000);
		
		driver.close();

	}

}
