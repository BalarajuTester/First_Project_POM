package Oxhead_excel;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class ScreenShort extends Baseclass{

	//static WebDriver dr;
	public ScreenShort(WebDriver dr) {
		this.dr=dr;
	}
	static String datename = new SimpleDateFormat("yyyy MM dd hh mm ss").format(new Date());
	
    
	public static void visibilityOfElement(WebElement ele)  {
		new WebDriverWait(dr,20,1).until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void sc(WebElement ele,String attribute) throws IOException {
		visibilityOfElement(ele);
		TakesScreenshot ts=(TakesScreenshot)dr;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\\\Users\\\\BalarajuGone\\\\git\\\\Envela\\\\Envela\\\\Screenshort\\"+ele.getAttribute(attribute)+".jpg  "+datename);
		Files.copy(src, trg);
	}


	public static void sc(WebElement ele) throws IOException {
		visibilityOfElement(ele);
		TakesScreenshot ts=(TakesScreenshot)dr;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\\\Users\\\\BalarajuGone\\\\git\\\\Envela\\\\Envela\\\\Screenshort\\"+ele.getText()+".jpg  "+datename);
		Files.copy(src, trg);

	}
	
	public static String screenShort(String str) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)dr;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir")+"\\Screenshort\\"+str+".jpg "+datename;
		File trg=new File(dest);
		Files.copy(src, trg);
		return dest;

	}
}
