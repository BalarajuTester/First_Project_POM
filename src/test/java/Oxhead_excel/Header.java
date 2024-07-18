package Oxhead_excel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class Header extends TestCases{
	
	public Header() {
		PageFactory.initElements(dr, this);
	}
	
	
	//tc65
	public void productsinthesearch() throws InterruptedException, IOException {
		search(DataClass.data("products",3,0));
	}
	
	//tc66
	public void Noproductsinthesearch() throws InterruptedException, IOException {
		 
		search(DataClass.data("products",1,0));
	}
	
		public void search(String prd) throws InterruptedException, IOException {
			Runner r=new Runner();
			r.clickOnRemeberMeCheckBox();
			visibilityOfElement(productsearch);
			productsearch.sendKeys(prd,Keys.ENTER);
			try {
				if(productErrormsg.isDisplayed()) {
					System.out.println( productErrormsg.getText());
				}
			}catch (Exception e) {
				System.out.println( producctmessage.getText());
			}
		}
		
		
		
		public void Membership() throws InterruptedException, IOException {
			 
			selectcategory(DataClass.data("products",4,0));
		}
		public void Palladium() throws InterruptedException, IOException {
			 
			selectcategory(DataClass.data("products",5,0));
		}
		public void Platinum() throws InterruptedException, IOException {
			 
			selectcategory(DataClass.data("products",6,0));
		}
		public void Silver() throws InterruptedException, IOException {
			 
			selectcategory(DataClass.data("products",7,0));
		}
		
	//67,68,69,70,71,72,73
	public void selectcategory(String prd) throws InterruptedException, IOException{
		if(prd.equalsIgnoreCase("All-Products")) {
			select(AllProducts);
		}else if (prd.equalsIgnoreCase("gold")) {
			select(Gold);
		}else if (prd.equalsIgnoreCase("membership")) {
			select(Membership);
		}else if (prd.equalsIgnoreCase("palladium")) {
			select(Palladium);
		}else if (prd.equalsIgnoreCase("platinum")) {
			select(Platinum);
		}else if (prd.equalsIgnoreCase("silver")) {
			select(Silver);
		}
		else{
			System.out.println("please enter correct product, you entered product is: "+prd);
		}
		try {
			if(productmessage.isDisplayed()) {
				Assert.assertTrue(productmessage.getText().equalsIgnoreCase(prd));
				System.out.println("you searched for "+productmessage.getText());
			}
		}catch (Exception e) {
			System.out.println("  ");
		}
	}
		
		
	public void select(WebElement ele) throws InterruptedException, IOException{
		Runner r=new Runner();
		r.clickOnRemeberMeCheckBox();
		visibilityOfElement(selecategory);
		selecategory.click();
		visibilityOfElement(ele);
		ele.click();
		searchbutt.click();
	}
	public void selectBlank(String prd) throws InterruptedException, IOException {
		Runner r=new Runner();
		r.clickOnRemeberMeCheckBox();
		searchbutt.click();
		System.out.println("you searched for "+prd);
	}
	//tc160,161,162,163,164
	public void browserCategory(String prd) throws  IOException, InterruptedException {
		Runner r=new Runner();
		//ScreenShort ss= new ScreenShort(dr);
		r.clickOnRemeberMeCheckBox();
		Actions ac=new Actions(dr);
		ac.moveToElement(Browsecategories).perform();
		for(WebElement sel: Browsecategorieslist) {
			if(sel.getText().equalsIgnoreCase(prd)) {
				sel.click();
				break;
			}
		}
		Assert.assertTrue(producctmessage.getText().equalsIgnoreCase(prd));
		System.out.println("You Searches for "+producctmessage.getText());
		ScreenShort.sc(producctmessage);
	}
	//tc 75		
	public void browserCategoryPalladiumBullion(String prd) throws InterruptedException, IOException {
		ScreenShort ss= new ScreenShort(dr);
		browserCategory(prd);
		PalladiumBullion.click();
		visibilityOfElement(Bar);
		JavaScrptClass.scroll(Bar);
		Assert.assertTrue(Bar.isDisplayed());
		System.out.println("Bar is available");
		System.out.println("Bar    "+Bar.getText());
		ss.sc(Bar,"alt");
	}
	
	
	
	//87
	public void addtocart() throws Throwable
	{
		 
		selectcategory(DataClass.data("products",3,0));
		JavascriptExecutor jse=(JavascriptExecutor)dr;
		jse.executeScript("window.scrollBy(0,1000)");
		GoldAustrianPhilharmonic.click();
		jse.executeScript("window.scrollBy(0,500)");
		addtocart.click();
		
		}
	
	//tc 91
	public void viewcart() throws Throwable
	{
		addtocart();
		//Thread.sleep(5000);
		visibilityOfElement(home);
		home.click();
		visibilityOfElement(Shoppingcartbutton);
		Shoppingcartbutton.click();
		Thread.sleep(3000);
		viewcart.click();
	}
	
	//tc 92,93
	public void updatecart() throws Throwable
	{
		viewcart();
		JavascriptExecutor jse=(JavascriptExecutor)dr;
		jse.executeScript("window.scrollBy(0,200)");
		visibilityOfElement(minus);
		minus.click();
		//plusbtn.click();
		visibilityOfElement(updatebtn);
		updatebtn.click();
	}
	
	//tc 94
	public void proceedtocheckout() throws Throwable
	{
		updatecart();
		Thread.sleep(5000);
		checkoutbtn.click();
	}
	
	//tc 95
	public void wishlist() throws Throwable
	{
		 
		selectcategory(DataClass.data("products",6,0));
		JavascriptExecutor jse=(JavascriptExecutor)dr;
		jse.executeScript("window.scrollBy(0,500)");
		selprdct.click();
		jse.executeScript("window.scrollBy(0,200)");
		addtowishlist.click();
		
		}
	
	public void wishlist1() throws Throwable
	{
		wishlist();
		visibilityOfElement(loginregister);
		Actions ac=new Actions(dr);
		ac.moveToElement(loginregister).perform();
		visibilityOfElement(myaccountwishlst);
	myaccountwishlst.click();
	
	}
	
	public void wishlist2() throws Throwable
	{
		wishlist();
	Thread.sleep(3000);
	wishlisticon.click();
	try {
		if(wishlistremove.isDisplayed())
			wishlistremove.click();	
	}catch (Exception e) {
		System.out.println("No Product in Wishlist");
	}
	
	
	}
	
	public void wishlist3() throws Throwable
	{
		Runner r=new Runner();
		r.clickOnRemeberMeCheckBox();
		wishlisticon.click();
	}
	
//	public void wishlist4() throws Throwable
//	{
//		wishlist3();
//		wishlistreturntoshop.click();
//		wishlist();
//	}
	
	public  void checkout() throws Throwable
	{
		selectcategory(DataClass.data("products",5,0));
		selprdct2.click();
		Thread.sleep(3000);
		addtocart.click();
		visibilityOfElement(Shoppingcart);
		JavascriptExecutor jse=(JavascriptExecutor)dr;
		jse.executeScript("window.scrollBy(0,300)");
		checkoutbtn.click();
	}
	
	//tc 173
	public void silver() throws Throwable
	{

		Runner r=new Runner();
		r.clickOnRemeberMeCheckBox();
			Actions ac=new Actions(dr);
			 ac.moveToElement(slver).perform();
	}
	public void silverbars(Object fname,Object lname,Object compny,Object sname,Object sname2,Object town,Object ste,Object postcode,Object phoneno,Object mail) throws Throwable
	{
		silver();
		slvrbars.click();
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)dr;
		jse.executeScript("window.scrollBy(0,300)");
		bar.click();
		jse.executeScript("window.scrollBy(0,300)");
		prdctbr.click();
		jse.executeScript("window.scrollBy(0,300)");
		addtocart.click();
		visibilityOfElement(Shoppingcart);
		jse.executeScript("window.scrollBy(0,300)");
		checkoutbtn.click();
		visibilityOfElement(checkout);
		Runner r=new Runner();
		r.address2(fname, lname, compny, sname, sname2, town, ste, postcode, phoneno, mail);
		
	}
	
	public void silverbullets() throws Throwable
	{
		     silver();
			 slverbullets.click();
	}
	
	public void silvercoins(Object fname,Object lname,Object compny,Object sname,Object sname2,Object town,Object ste,Object postcode,Object phoneno,Object mail) throws Throwable
	{
		silver();
		visibilityOfElement(slvrcoins);
		 slvrcoins.click();
		 bar.click();
		 prdctcoin.click();
		 visibilityOfElement(addtocart);
		 addtocart.click();
		 visibilityOfElement(checkoutbtn);
		 checkoutbtn.click();
			Runner r=new Runner();
			r.address2(fname, lname, compny, sname, sname2, town, ste, postcode, phoneno, mail);
			
	}
	
	public void gold() throws Throwable
	{
		Runner r=new Runner();
		r.clickOnRemeberMeCheckBox();
		Actions ac=new Actions(dr);
		ac.moveToElement(gld).perform();
	}
	
	public void goldcoins() throws Throwable
	{
		gold();
		gldcoins.click();
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)dr;
		jse.executeScript("window.scrollBy(0,300)");
		usmint.click();
		//System.out.println(gldprdct.getText());
		String expect="1 oz Gold American Buffalo (BU)";
		String Actual=gldprdct.getText();
		Assert.assertEquals(expect, Actual);
		System.out.println("customer is able to see the Gold American Buffalo ");
}
	
	public void goldbars(Object fname,Object lname,Object compny,Object sname,Object sname2,Object town,Object ste,Object postcode,Object phoneno,Object mail) throws Throwable
	{
		gold();
		visibilityOfElement(gldbars);
		gldbars.click();
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)dr;
		jse.executeScript("window.scrollBy(0,300)");
		visibilityOfElement(bar2);
		bar2.click();
		visibilityOfElement(gldprdct2);
		gldprdct2.click();
		jse.executeScript("window.scrollBy(0,300)");
		visibilityOfElement(addtocart);
		addtocart.click();
		visibilityOfElement(checkoutbtn);
		checkoutbtn.click();
		Runner r=new Runner();
		r.address2(fname, lname, compny, sname, sname2, town, ste, postcode, phoneno, mail);
		
	}
	
	public void usgold() throws Throwable
	{
		gold();
		visibilityOfElement(usgld);
		usgld.click();
		
	}
	public void canadiangold() throws Throwable
	{
		gold();
		visibilityOfElement(canadiangld);
		canadiangld.click();
	}
	public void Australiangold() throws Throwable
	{
		gold();
		visibilityOfElement(Australiangld);
		Australiangld.click();
	}
	
	public void other() throws Throwable
	{
		Runner r=new Runner();
		r.clickOnRemeberMeCheckBox();
		Thread.sleep(2000);
		Actions ac=new Actions(dr);
		ac.moveToElement(other).perform();
	}
		
	  public void platinum(Object fname,Object lname,Object compny,Object sname,Object sname2,Object town,Object ste,Object postcode,Object phoneno,Object mail) throws Throwable
	{
		other();
         pltnum.click();
		 JavascriptExecutor jse=(JavascriptExecutor)dr;
		jse.executeScript("window.scrollBy(0,300)");
		visibilityOfElement(pltnmbullion);
		pltnmbullion.click();
	    jse.executeScript("window.scrollBy(0,300)");
	    bar3.click();
	    jse.executeScript("window.scrollBy(0,300)");
	    pltnmprdct.click();
	    addtocart.click();
	    visibilityOfElement(checkoutbtn);
	    checkoutbtn.click();
		Runner r=new Runner();
		r.address2(fname, lname, compny, sname, sname2, town, ste, postcode, phoneno, mail);
		
	}
	  
	  public void coinsupply() throws Throwable
	  {
	  	other();
	  	visibilityOfElement(coinsupplies);
	  	coinsupplies.click();
	  }
	  public void oxheadmerch() throws Throwable
	  {
	  	other();
	  	visibilityOfElement(merch);
	  	merch.click();
	  }
	
	
	
	
	//tc166
	public void Home() throws InterruptedException, IOException {
		Runner r=new Runner();
		ScreenShort ss= new ScreenShort(dr);
		r.clickOnRemeberMeCheckBox();
		home.click();
		ss.sc(home);
	}
	//tc168
	public void Homestikiheader(String x,String y) throws InterruptedException, IOException {
		Runner r=new Runner();
		ScreenShort ss= new ScreenShort(dr);
		r.clickOnRemeberMeCheckBox();
		JavaScrptClass.scroll(x,y);
		ss.sc(Stickyhesder,"id");
	}
	//tc169
	public void NewArrivalsPage() throws InterruptedException, IOException {
		Runner r=new Runner();
		ScreenShort ss= new ScreenShort(dr);
		r.clickOnRemeberMeCheckBox();
		trading.click();
		NewArrivals.click();
		Assert.assertTrue(producctmessage.getText().equalsIgnoreCase("New Arrivals"));
		ss.sc(producctmessage);
	}
	//tc171 not working
	public void CollectionsPage(String un, String pwd) throws InterruptedException, IOException {
		//Runner r=new Runner();
		ScreenShort ss= new ScreenShort(dr);
		//r.clickOnRemeberMeCheckBox(un, pwd);
		trading.click();
		Collections.click();
		Assert.assertTrue(producctmessage.getText().equalsIgnoreCase("Collections"));
		ss.sc(producctmessage);
	}
	//tc209
	public void shoppingCartpage() throws InterruptedException, IOException {
		Runner r=new Runner();
		ScreenShort ss= new ScreenShort(dr);
		r.clickOnRemeberMeCheckBox();
		visibilityOfElement(homepageproduct);
		String homepageproductt=homepageproduct.getText();
		homepageproduct.click();
		visibilityOfElement(addtocart);
		addtocart.click();
		visibilityOfElement(Shoppingcartproduct);
		String Shoppingcartproductt=Shoppingcartproduct.getText();
		Assert.assertTrue(Shoppingcart.getText().equalsIgnoreCase("SHOPPING CART"));
		//Assert.assertEquals(homepageproductt, Shoppingcartproductt);
		ss.sc(Shoppingcart);
	}
	//tc210
	public void NotAbleToSeeProductInShoppingCartPage() throws InterruptedException, IOException {
		Runner r=new Runner();
		ScreenShort ss= new ScreenShort(dr);
		r.clickOnRemeberMeCheckBox();
		//String quantity=Shoppingcartbutton.getText();
		Shoppingcartbutton.click();
		Thread.sleep(3000);
		try {
//			if(minus.isDisplayed()) {
//				for(int i=0;i<=Integer.parseInt(quantity);i++) {
//				if(Integer.parseInt(value.getAttribute("value"))!=0) {
//					visibilityOfElement(Shoppingcartimage);
//					minus.click();
//				}
//				}
//				visibilityOfElement(Shoppingcartbuttonmsg);
//				Assert.assertTrue(Shoppingcartbuttonmsg.getText().contains("NO PRODUCTS"));
//				System.out.println(Shoppingcartbuttonmsg.getText());
//				ss.sc(Shoppingcartbutton);
//			}
			if(!(removeitem.isEmpty())) {
				for(int i=0;i<=removeitem.size();i++) {
					removeitem.get(i).click();
				}
//				for(WebElement rev:removeitem) {
//					rev.click();
//					Thread.sleep(3000);
//				}
			}
			visibilityOfElement(Shoppingcartbuttonmsg);
			Assert.assertTrue(Shoppingcartbuttonmsg.getText().contains("NO PRODUCTS"));
			System.out.println(Shoppingcartbuttonmsg.getText());
			ss.sc(Shoppingcartbutton);
			
		}catch (Exception e) {
			visibilityOfElement(Shoppingcartbuttonmsg);
			Assert.assertTrue(Shoppingcartbuttonmsg.getText().contains("NO PRODUCTS"));
			System.out.println(Shoppingcartbuttonmsg.getText());
			ss.sc(Shoppingcartbutton);
		}
	}
	//tc211
	public void seeProductInShoppingCartPage() throws InterruptedException, IOException {
		ScreenShort ss= new ScreenShort(dr);
		NotAbleToSeeProductInShoppingCartPage();
		returntoshop.click();
		Assert.assertTrue(producctmessage.getText().equalsIgnoreCase("New Arrivals"));
		String newarrivalsproductt=newarrivalsproduct.getText();
		newarrivalsproduct.click();
		visibilityOfElement(addtocart);
		addtocart.click();
		visibilityOfElement(Shoppingcartproduct);
		String Shoppingcartproductt=Shoppingcartproduct.getText();
		Assert.assertTrue(Shoppingcart.getText().equalsIgnoreCase("SHOPPING CART"));
		Assert.assertEquals(newarrivalsproductt, Shoppingcartproductt);
		System.out.println("product is  "+Shoppingcartproduct.getText());
		ss.sc(Shoppingcart);
	}
	//tc219
	public void seeShippingAndDeliveryPage(String prd,String x,String y) throws InterruptedException, IOException {
		ScreenShort ss= new ScreenShort(dr);
		selectcategory(prd);
		goldpageproduct.click();
		ShoppingandDelivery.click();
		JavaScrptClass.scroll(x, y);
		ss.sc(ShoppingandDelivery2);
	}
	//tc220
	public void ableToTrackTheCashOnDelivery(String id,String mail,String x,String y) throws InterruptedException, IOException {
		Runner r=new Runner();
		ScreenShort ss= new ScreenShort(dr);
		r.clickOnRemeberMeCheckBox();
		String pwindo=dr.getWindowHandle();
		TrackOrder.click();
		Set<String> allwindows = dr.getWindowHandles();
		for(String window:allwindows) {
			if(!(pwindo.equals(window))) {
				dr.switchTo().window(window);
				break;
			}
		}
		Orderid.sendKeys(id);
		Orderemail.sendKeys(mail);
		Track.click();
		Assert.assertEquals(PaymentType.getText(), "Cash on delivery");
		System.out.println("PaymentType is "+PaymentType.getText());
		JavaScrptClass.scroll(x, y);
		ss.sc(PaymentType);
	}
	
	//v
	public void aboutuspage() throws InterruptedException {
	     visibilityOfElement(popupclose);
	     popupclose.click();
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("arguments[0].style.border='2px solid red'", about);
		about.click();
	}
		
		public void sociallinks() throws InterruptedException {
			String Scro=dr.getWindowHandle();
			aboutuspage();
			JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("window.scrollBy(0,600)");
		links.click();
		
		Thread.sleep(2000);
	
		
		Set<String> DOwn =dr.getWindowHandles();
		
		
		 for(String handle:DOwn)
		 {
			
			 if(!Scro.equals(DOwn)) {
				 dr.switchTo().window(handle);
		
			 }
		 }
		 System.out.println(dr.getTitle());
		 
		 String actual=dr.getTitle();
			String expexted="Facebook";
			Assert.assertEquals(actual, expexted);
			System.out.println("user is able to see click on fb icon and able to see fb Page.");
			dr.switchTo().window(Scro);
		
			 Thread.sleep(2000);
			 Twiter.click();
			 Thread.sleep(3000);
			 Set<String> DOwn2 =dr.getWindowHandles();
			 for(String handle2:DOwn2)
			 {
				
				 if(!Scro.equals(DOwn2)) {
					 dr.switchTo().window(handle2);
				
				 }
			 }
			 Thread.sleep(3000);
				String actual2=prof.getText();
					String expexted2="Profile";
					Assert.assertEquals(actual2, expexted2);
					System.out.println("user is able to see click on Twiter icon and able to see Twiter Page.");
					 dr.switchTo().window(Scro);
	
			 
			
			 insta.click();
			 Thread.sleep(2000);
			 Set<String> DOwn3 =dr.getWindowHandles();
			 for(String handle3:DOwn3)
			 {
				
				 if(!Scro.equals(DOwn3)) {
					 dr.switchTo().window(handle3);
				
				 }
			 }
			
			 String actual3=instatext.getText();
				String expexted3="Instagram";
					Assert.assertEquals(actual3, expexted3);
					System.out.println("user is able to see click on Instagram and able to see Instagram Page.");
					dr.switchTo().window(Scro);
	}
		
		
		public void contact(String un,String ma,String ph,String company,String message) throws InterruptedException {
			 visibilityOfElement(popupclose);
		     popupclose.click();
			JavascriptExecutor js=(JavascriptExecutor)dr;
			js.executeScript("arguments[0].style.border='2px solid red'", con);
			con.click();
			js.executeScript("window.scrollBy(0,300)");
			name.sendKeys(un);
			youremail.sendKeys( ma);
			num.sendKeys( ph);
			com.sendKeys( company);
			mess.sendKeys(message);
		    askq.click();
			js.executeScript("window.scrollBy(0,200)");
			//System.out.println("user is able to see Thank u for ur message.It has been Sent.");
			Thread.sleep(5000);
		}
		
		public void contact1(String un,String ma,String ph,String company,String message) throws InterruptedException {
			contact(un, ma, ph, company, message);
			 visibilityOfElement(text);
			String actual=text.getText();
			
			String expected="Thank you for your message. It has been sent.";
			
			Assert.assertEquals(actual, expected);
			
			System.out.println("user is able to see Thank you for your message. It has been sent.");
			System.out.println("act  "+actual);
		}
		
		public void contact2(String un,String ma,String ph,String company,String message) throws InterruptedException {
			contact(un, ma, ph, company, message);
			visibilityOfElement(text);
			String actual1=text.getText();
			
			String expected1="One or more fields have an error. Please check and try again.";
					Assert.assertEquals(actual1, expected1);
			System.out.println("user is not able to see Thank you for your message. It has been sent.");
			System.out.println("act  "+actual1);
		}
		
		public void contact3(String un,String ma,String ph,String company,String message) throws InterruptedException {
			contact(un, ma, ph, company, message);
			get.click();
		}
	
		public void FAQs(String user,String pass,String uname,String mails,String phn,String comp,String msg) throws InterruptedException, IOException {
			JavascriptExecutor js=(JavascriptExecutor)dr;
			Runner r=new Runner();
			r.clickOnRemeberMeCheckBox();
			faq.click();
			js.executeScript("window.scrollBy(0,300)");
			payment.click();
			PAY.click();
			PACKAGE.click();
			CHECKOUT.click();
			ORDER.click();
			PRICE.click();
			RECEIVED.click();
			SIGN.click();
			OFFER.click();
			js.executeScript("window.scrollBy(0,300)");
			visibilityOfElement(feedback);
			feedback.click();
			Thread.sleep(4000);
			System.out.println(dr.getTitle());
			String actual=dr.getTitle();
			String expected="Contact Us – Oxhead";
			Assert.assertEquals(actual, expected);
			System.out.println("Customer should be able to see the Contact Us page. ");
			visibilityOfElement(name);
			name.sendKeys(uname);
			youremail.sendKeys(mails);
			num.sendKeys(phn);
			com.sendKeys(comp);
			mess.sendKeys(msg);
			askq.click();
			js.executeScript("window.scrollBy(0,300)");
			visibilityOfElement(text);
			String act=text.getText();
			String expect="One or more fields have an error. Please check and try again.";
			Assert.assertEquals(act, expect);
			System.out.println("Customer should not be able to see Thank you for your message it has been sent message");
			dr.navigate().refresh();
		}
			public void FAQs2(String uname,String mails,String phn,String comp,String msg) throws InterruptedException, IOException {
				JavascriptExecutor js=(JavascriptExecutor)dr;
				visibilityOfElement(popupclose);
				popupclose.click();
				faq.click();
				Thread.sleep(2000);
				feedback.click();
			name.sendKeys(uname);
			youremail.sendKeys(mails);
			num.sendKeys(phn);
			com.sendKeys(comp);
			mess.sendKeys(msg);
			askq.click();
			js.executeScript("window.scrollBy(0,300)");
			visibilityOfElement(text);
		String act=text.getText();
			String expect="One or more fields have an error. Please check and try again.";
			Assert.assertEquals(act, expect);
			System.out.println("Customer should not be able to see Thank you for your message it has been sent message");
			dr.navigate().refresh();
			}
			public void FAQs3() throws InterruptedException, IOException {
				visibilityOfElement(popupclose);
				popupclose.click();
				JavaScrptClass.scroll(privacy);
				privacy.click();
				String Actual= dr.getTitle();
				String expect="Privacy Policy – Oxhead";
			Assert.assertEquals(Actual, expect);
			System.out.println("Customer should be able to see the Privacy Policy page.");
			Thread.sleep(2000);
			dr.navigate().back();
			Thread.sleep(2000);
			JavaScrptClass.scroll("0", "800");
			terms.click();
			System.out.println(dr.getTitle());
			String Actual1= dr.getTitle();
			String expect1="Terms and Conditions – Oxhead";
		Assert.assertEquals(Actual1, expect1);
		System.out.println("Customer should be able to see the Terms and Conditions page.");
			
		}
	
}
