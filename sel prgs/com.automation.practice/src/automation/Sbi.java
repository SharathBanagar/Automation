package automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbi {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharath\\Desktop\\selenium-java-3.141.59\\chromedriver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://sbi.co.in/web/student-platform/maturity-value-calculator");
		
		FileInputStream file = new FileInputStream("E:\\SBI.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow row = sheet.getRow(i);
			
			int principal = (int)row.getCell(0).getNumericCellValue();
			
			int annualrateofint = (int)row.getCell(1).getNumericCellValue();
			
			int duration = (int)row.getCell(2).getNumericCellValue();
			
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id = 'u_amount']")).clear();
			driver.findElement(By.xpath("//input[@id = 'uRate']")).clear();
			driver.findElement(By.xpath("//input[@id = 'uTime']")).clear();
			
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id = 'u_amount']")).sendKeys(String.valueOf(principal));
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id = 'uRate']")).sendKeys(String.valueOf(annualrateofint));
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id = 'uTime']")).sendKeys(String.valueOf(duration));
			
			driver.findElement(By.xpath("//option[@value = '3']")).click();
			
			String maturityamount = (driver.findElement(By.xpath("//span[@id = 'interestearned']"))).getText();
			
			System.out.println("The maturity amount for principal Rs"+String.valueOf(principal)+"  and interest % "+String.valueOf(annualrateofint)
			+" and for a duration of "+String.valueOf(duration)+"   Year is  "+maturityamount);
		
	}
		
}
}