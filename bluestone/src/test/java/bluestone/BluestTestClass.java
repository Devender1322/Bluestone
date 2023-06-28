package bluestone;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import io.github.bonigarcia.wdm.WebDriverManager;
@Test

public class BluestTestClass {
	WebDriver Driver;

	@BeforeMethod
	public void FirstTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();

		Driver.get("https://www.bluestone.com");
		Driver.manage().window().maximize();	
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//*[@id='denyBtn']")).click();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test (groups = {"atest"})	
	public void Test1() {
		BluestPageClass BP = new BluestPageClass(Driver);
		BP.HoverWatch();
		BP.ClickCharm();
		BP.HoverPrice();
		BP.ClickBelow();
		BP.ClickRemoveRF();
		

	}

	@Test 
	  
	(groups = "atest")	
	public void Test2() {
		BluestPageClass BP = new BluestPageClass(Driver);
		BP.HoverWatch();
		BP.ClickBand();
		BP.ClickMoreFil();
//		BP.HoverDelivery();
		BP.ClickDeliver();
		BP.ClickRemoveNF();

	}

	@Test  (groups =  {"dtest"})
	public void Test3() {
		BluestPageClass BP = new BluestPageClass(Driver);
		BP.HoverWatch();
		BP.ClickPin();
		BP.HoverOffer();
		BP.ClickMaking();
		BP.ClickRemoveOF();

	}
	@Test 
	(groups =  "etest")
	public void Test4() {
//		WebDriverWait W = new WebDriverWait(Driver,Duration.ofSeconds(5));
//		W.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='18k']")));
		BluestPageClass BP = new BluestPageClass(Driver);
		BP.Hoveralljewe();
		BP.ClickBangles(); 
		BP.HoverGoldP();
		BP.Clickkgold(); 
		BP.HoverSortby();
		BP.ClickWhatsn();
		BP.ClickRemoveBF();
		

	}
	@Test 
	public void Test5() 
	{
		SoftAssert SF = new SoftAssert();
		String ExpText = "Buy 350+ Bracelets Online | BlueStone.com - India's #1 Online Jewellery Brand";
//		String EText = "https://www.bluestone.com/jewellery/bracelets-men.html?sortby=pricelow";
		BluestPageClass BP = new BluestPageClass(Driver);
		BP.Hoveralljewe();
		BP.ClickBracelets(); 
		String ActualText = Driver.getTitle();
		System.out.println("Actual text is " + ActualText);
		AssertJUnit.assertEquals(ActualText, ExpText);
		BP.HoverGender();
		BP.Clickmen();
		BP.HoverSortby();
		BP.ClickPriceLToH();
//		String AText = Driver.getCurrentUrl();
//		System.out.println("Actual text is " + AText);
//		AssertJUnit.assertEquals(AText, EText);
		BP.ClickRemoveMF();
		SF.assertAll();

	}
	@Test (groups = "otest")
	public void Test6() {
		BluestPageClass BP = new BluestPageClass(Driver);
		BP.Hoveralljewe();
		BP.ClickPendants(); 
		BP.HoverSortby();
		BP.ClickDiscount();
		BP.ClickVideoFr();
		BP.ClickClosevid();

	}
	@Test 
	public void Test7() throws IOException {
		BluestPageClass BP = new BluestPageClass(Driver);
		BP.Hoveralljewe();
		BP.ClickEarning(); 
		BP.ClickVideoTh();
		BP.ClickClosevid();
		Date cdate = new Date();
		System.out.println(cdate);
		String myfileName = cdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(myfileName);
		File ssFile = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);			
		FileUtils.copyFile(ssFile, new File("E://walls//ss/"+myfileName+".png"));


	}
	
	@Test 
(groups = "ftest")
	
//	(priority = 7)
	public void Test8() {
		
		BluestPageClass BP = new BluestPageClass(Driver);		
		BP.ClickRecent();
		BP.ClickCart();
		Driver.navigate().back();
		BP.ClickCart(); 
		BP.HoverImage();
		BP.ClickViewDet();
		Driver.switchTo().frame(1);

		
		

	}
	@Test (dependsOnGroups = "ftest")
	public void quitbr() {
		Driver.quit();
	}
	
	@AfterMethod 
	public void closebr() {
		Driver.close();
}
	
	

}
