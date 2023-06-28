package bluestone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BluestPageClass {
	private WebDriver dr;
	public BluestPageClass(WebDriver d){
		
		dr = d ;
		
		PageFactory.initElements(dr, this);
		
	}
		//testcase1
		
	 	@FindBy(xpath=("//a[text()='Watch Jewellery ']")) WebElement WatchJewe;
	 	//testcase1.1
	 	@FindBy (xpath = ("//a[text()='Charm']")) WebElement Charm;
	 	@FindBy (xpath = ("//span[text()='Price']")) WebElement Price;
	 	@FindBy(xpath = ("//span[@class='prcs-dlh']")) WebElement Below;
	 	@FindBy(xpath = ("//span[text()='Below ']")) WebElement RemoveRf;
	 	//testcase1.2
	 	@FindBy(xpath = ("//a[@title='Band']")) WebElement Band;
	 	@FindBy(xpath = ("//span[text()='More Filters']")) WebElement MoreFilters; 	
//	 	@FindBy(xpath = ("//section[@id='Delivery Time-form']/span/span")) WebElement Delivery;
	 	@FindBy(xpath = ("//span[@data-displayname='next day delivery']")) WebElement Deliverytime;
//	 	@FindBy(xpath = ("//span[text()='Next Day Delivery']")) WebElement RemoveNF;
		@FindBy(xpath = ("//span[text()='Next Day Delivery']")) WebElement RemoveNF;
	 	//span[text()='Next Day Delivery']//ancestor::div[@class='filtered-data']
	 	//testcase1.3
	 	@FindBy(xpath = ("//a[@title='Pin']")) WebElement Pin;
	 	@FindBy(xpath = ("//span[text()='Offers']")) WebElement Offers;
	 	@FindBy(xpath = ("//span[@data-displayname='10% Making Charge Off']")) WebElement makingcharge;
	 	@FindBy(xpath = ("//span[text()='10% Making Charge Off']")) WebElement RemoveOF;
	 	//Testcase2
	 	@FindBy(xpath = ("//a[text()='All Jewellery ']")) WebElement AllJwewe;
	 	//Testcase2.1
	 	@FindBy(xpath = ("//a[text()='Bangles']")) WebElement Bangles;
	 	@FindBy(xpath = ("//span[text()='Gold Purity']")) WebElement GoldPurity;
	 	@FindBy(xpath = ("//span[@data-displayname='18k']")) WebElement kgold;
	 	@FindBy(xpath = ("//span[@class='view-by-wrap title style-outline i-right']")) WebElement Sortby;
	 	@FindBy(xpath = ("//div[@id='view-sort-by']/div[1]/a")) WebElement whatsnew;
	 	@FindBy(xpath = ("//span[text()='18k']")) WebElement RemoveBF;
	 	
	 	
	 	//Testcase2.2
	 	@FindBy(xpath = ("//a[@title='Bracelets']")) WebElement Bracelets;
	 	@FindBy(xpath = ("//span[text()='Gender']")) WebElement Gender;
	 	@FindBy(xpath = ("//span[@data-displayname='men']")) WebElement men;
	 	@FindBy(xpath = ("//div[@id='view-sort-by']/div[3]/a")) WebElement PriceLToH;
	 	@FindBy(xpath = ("//span[text()='Men']")) WebElement RemoveMF;
	 	//Testcase2.3
	 	@FindBy(xpath = ("//ul[@class='kids-sub-menu two-col']/li[2]/a")) WebElement Pendants;
	 	@FindBy(xpath = ("//div[@id='view-sort-by']/div[5]/a")) WebElement Discount;
	 	@FindBy(xpath = ("//a[@class='bvideo-icon2 fancybox-popup-style3']/span[1]")) WebElement VideoFr;
	 	@FindBy(xpath = ("//a[@title='Close']")) WebElement Closevid;
	 	//Testcase2.4
	 	@FindBy(xpath = ("//html/body/header/div/div[2]/div/nav/ul/li[7]/div/ul/li[4]/div[1]/ul/li[4]/a")) WebElement Earning; //(abXpath)
	 	@FindBy(xpath = ("//div[@id='search-result']/div[1]/ul[1]/li[4]/div[1]/div/a/span")) WebElement VideoTh; //(abXpath)
	 	@FindBy(xpath = ("//a[@title='Home']/span")) WebElement Home; 
	 	
	 	//Testcase3
	 	@FindBy(className =  ("text")) WebElement Recently; 
	 	@FindBy(css = (".cart>div>a>span")) WebElement Cart; 
	 	@FindBy(xpath = ("//img[@alt='The Corinna Band for Her']")) WebElement Image; 
		@FindBy(xpath = ("//div[@id='grid-view-result']/ul/li[2]/div[1]/div[1]/span[1]/div[1]/div[1]/div[2]/a")) WebElement ViewDetails; 
		@FindBy(xpath = ("//span[@class='size-box-overlay']")) WebElement SizeD; 
		
	// 	
	 	
	 	
	 	//Test-case 1
	 	public void HoverWatch() {
	 		Actions A = new Actions(dr);
	 		A.moveToElement(WatchJewe).perform();
	 	}
	 	
		//Test-case 1.1
	 	public void ClickCharm() {
	 		Charm.click();
	 	}
	 	public void HoverPrice() {
	 		Actions A2 = new Actions(dr);
	 		A2.moveToElement(Price).build().perform();
	 	}
	 	public void ClickBelow() {
	 		Below.click();
	 	}
	 	public void ClickRemoveRF() {
	 		RemoveRf.click();
	 	}
	 	
		//Test-case 1.2
	 	public void ClickBand() {
	 		Band.click();
	 	}
	 	
	 	public void ClickMoreFil() {
	 		MoreFilters.click();
	 	}
	 	
//	 	public void HoverDelivery() {
//	 		Actions A3 = new Actions(dr);
//	 		A3.moveToElement(Delivery).perform();
//	 	}
	 	public void ClickDeliver() {
	 		Deliverytime.click();
	 	}

	 	public void ClickRemoveNF() {
	 		RemoveNF.click();
	 	}

	 	//Test-case 1.3
	 	public void ClickPin() {
	 		Pin.click();
	 	}
	 	public void HoverOffer() {
	 		Actions A4 = new Actions(dr);
	 		A4.moveToElement(Offers).perform();
	 	}
	 	
	 	public void ClickMaking() {
	 		makingcharge.click();
	 	}
	 	
	 	public void ClickRemoveOF() {
	 		RemoveOF.click();
	 	}
	 	
	 	//Testcase2
	 	public void Hoveralljewe() {
	 		Actions A5 = new Actions(dr);
	 		A5.moveToElement(AllJwewe).perform();
	 	}
	 	//Testcase2.1
	 	public void ClickBangles() {
	 		Bangles.click();
	 	}
	 	
	 	public void HoverGoldP() {
	 		Actions A6 = new Actions(dr);
	 		A6.moveToElement(GoldPurity).perform();
	 	}
	 	
	 	public void Clickkgold() {
	 		kgold.click();
	 	}
	 	public void HoverSortby() {
	 		Actions A7 = new Actions(dr);
	 		A7.moveToElement(Sortby).perform();
	 	}
	 	
	 	public void ClickWhatsn() {
	 		whatsnew.click();
	 	}
	 	
	 	
	 	public void ClickRemoveBF() {
	 		RemoveBF.click();
	 	}
	 	
	 	//Testcase2.1
	 	public void ClickBracelets() {
	 		Bracelets.click();
	 	}
	 	
	 	public void HoverGender() {
	 		Actions A8 = new Actions(dr);
	 		A8.moveToElement(Gender).perform();
	 	}
	 
	 	public void Clickmen() {
	 		men.click();
	 	}

	 	public void ClickPriceLToH() {
	 		PriceLToH.click();
	 	}

	 	public void ClickRemoveMF() {
	 		RemoveMF.click();
	 	}
	 	
	 	
	 	public void ClickPendants() {
	 		Pendants.click();
	 	}
	 	
	 	public void ClickDiscount() {
	 		Discount.click();
	 	}

	 	public void ClickVideoFr() {
	 		VideoFr.click();
	 	}
	 	

	 	public void ClickClosevid() {
	 		Closevid.click();
	 	}
	 	
	 	//Testcase2.3
	 	public void ClickEarning() {
	 		Earning.click();
	 	}
	 	public void ClickVideoTh() {
	 		VideoTh.click();
	 	}
	 	
	 	public void ClickHome() {
	 		Home.click();
	 	}
	 	
	 	
	 	public void ClickRecent() {
	 		Recently.click();
	 	}
	 	public void ClickCart() {
	 		Cart.click();
	 	}
	 	public void HoverImage() {
	 		Actions A9 = new Actions(dr);
	 		A9.moveToElement(Image).perform();
	 	}
	 
	 	
	 	public void ClickViewDet() {
	 		ViewDetails.click();
	 	}
	 	public void ClickSizeD() {
	 		SizeD.click();
	 	}
}
