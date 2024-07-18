package Oxhead_excel;


import java.io.IOException;
import java.util.Set;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Runner extends TestCases {
	
	public Runner() {
		PageFactory.initElements(dr, this);
	}
	
	//Sravya methods(Registration2)
	public void create(String mail) throws Throwable
	{
		
		loginRegister();
		visibilityOfElement(createaccount);
		createaccount.click();
		visibilityOfElement(email);
        email.sendKeys(mail);
        visibilityOfElement(regbtn);
		regbtn.click();
		try {
			if(passworderrormessage.isDisplayed()) {
				System.out.println(passworderrormessage.getText());
			}
		}catch (Exception e) {
			System.out.println("Regestration Sucessfull");
		}
	}
	
	
public void login(String un,String pwd) throws Throwable {
		
		loginRegister();
		 visibilityOfElement(username);
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		try {
			if(passworderrormessage.isDisplayed()) {
				System.out.println(passworderrormessage.getText());
			}
		}catch (Exception e) {
			System.out.println("Login Sucessfull");
		}	
	}

public void loginwithGoogle() throws Throwable
{
	loginRegister();
	visibilityOfElement(googlelink);
	googlelink.click();
}

public void loginwithFacebook() throws Throwable
{

	loginRegister();
	visibilityOfElement(facebooklink);
	facebooklink.click();
}
	
	
	public void loginRegister() throws InterruptedException {
		//new FluentWait<WebDriver>(dr).withTimeout(60,TimeUnit.SECONDS).pollingEvery(1,TimeUnit.SECONDS);
		visibilityOfElement(popupclose);
		popupclose.click();
		visibilityOfElement(loginregister);
		loginregister.click();
	}
	
	//tc 23
	public void clickOnRemeberMeCheckBox() throws InterruptedException, IOException {
		loginRegister();
		username.sendKeys(DataClass.data("exceldata",1,0));
		password.sendKeys(DataClass.data("exceldata",1,1));
		Assert.assertTrue( rememberme.isDisplayed());
		rememberme.click();
		loginButton.click();
		Assert.assertTrue( loginusername.getText().contains("Hello"));
		//System.out.println("Welcome & "+ loginusername.getText());
	}
	
	//tc 24
	public void clickOnLostYourPasswordLink() throws InterruptedException, IOException {
		 
		loginRegister();
		username.sendKeys(DataClass.data("exceldata",1,0));
		password.sendKeys(DataClass.data("exceldata",1,1));
		lostpassword.click();
		Assert.assertTrue( lostyourpassword.getText().contains("Lost your password?"));
		System.out.println(lostyourpassword.getText());
	}
	
	//tc 25,26,27,28,29
	public void passwordReset(String npw,String rpw) throws InterruptedException, IOException {
		 
		loginRegister();
		visibilityOfElement(lostpassword);
		lostpassword.click();
		Assert.assertTrue( lostyourpassword.getText().contains("Lost your password?"));
		System.out.println(  lostyourpassword.getText());
		uname.sendKeys(DataClass.data("exceldata",1,0),Keys.ENTER);
		Assert.assertTrue( passwordmessage.getText().contains("Password reset email has been sent"));
		System.out.println(  passwordmessage.getText());
		dr.get("https://accounts.google.com/");
		visibilityOfElement(gmail);
		gmail.sendKeys(DataClass.data("exceldata",1,0),Keys.ENTER);
		visibilityOfElement(gmailPassword);
		gmailPassword.sendKeys(DataClass.data("exceldata",1,1),Keys.ENTER);
		visibilityOfElement(logo);
		logo.click();
		dr.switchTo().frame( frame);
		gmaillogo.click();
		String wnd=dr.getWindowHandle();
		Set<String> wnds = dr.getWindowHandles();
		for(String windo:wnds) {
			if(!(windo.equals(wnd))){
				dr.switchTo().window(windo);
				try {
					if(frame.isDisplayed()) {
						dr.switchTo().frame( frame);
						dontswitch.click();
					}
				}catch (Exception e) {
					System.out.println("");
				}
				visibilityOfElement(mail);
				mail.click();
				visibilityOfElement(resetlink);
				Assert.assertTrue( resetlink.getText().contains("Click here to reset your password"));
				System.out.println( resetlink.getText());
				resetlink.click();
				deletmail.click();
			}
		}
		visibilityOfElement(lostpassword);
		dr.close();
		dr.switchTo().window(wnd);
		Set<String> wndos = dr.getWindowHandles();
		for(String windo:wndos) {
			if(!(windo.equals(wnd))){
				dr.switchTo().window(windo);
			}
		}
		newPwd.sendKeys(npw);
		ReNewPwd.sendKeys(rpw);
		save.click();
		try {
			if( passworderrormessage.isDisplayed()) 
				System.out.println( passworderrormessage.getText());
		}catch (Exception e) {
			Assert.assertTrue( passwordmessage.getText().contains("Your password"));	
			System.out.println(  passwordmessage.getText());
		}

	}
	//tc 30
	public void clicknOnCreateAnAccountLink() throws InterruptedException {
		loginRegister();
		visibilityOfElement(createaccount);
		createaccount.click();
	}

	//tc 31
	public void clickOnCrossMarkButton () throws InterruptedException {
		loginRegister();
		visibilityOfElement(logincross);
		logincross.click();
	}

	//tc 32
	public void clickOnCloseButton() throws InterruptedException {
		visibilityOfElement(popupclose);
		popupclose.click();
	}
	//tc 33
	public void CustomerAbletToDoSignUpWithValidEmailAddress() throws InterruptedException, IOException {
		 
		visibilityOfElement(popupemail);
		popupemail.sendKeys(DataClass.data("exceldata",1,0));
		visibilityOfElement(popupsubmit);
		popupsubmit.click();
		visibilityOfElement(popupmessage);
		Assert.assertTrue( popupmessage.getText().contains("Thank you,"));
		System.out.println(popupmessage.getText());
	}
	
	//tc 67,68,69,70,71,72,73-inprogress ,74,76-not available     76,77,78,80,81-need select catrgories    79-inprogress                    82,83-responsive        84,85-products not available     86-not resolved
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//tc 132
	public void paymentMethod() throws InterruptedException, IOException {
		 
		clickOnRemeberMeCheckBox();
		loginregister.click();
		Paymentmethods.click();
		Addpaymentmethod1.click();
		cardnumber.sendKeys(DataClass.data("Card_Details",1,0));
		cardnumber.sendKeys(DataClass.data("Card_Details",2,0));
		cardnumber.sendKeys(DataClass.data("Card_Details",3,0));
		cardnumber.sendKeys(DataClass.data("Card_Details",4,0));
		Expiry.sendKeys(DataClass.data("Card_Details",1,1));
		Expiry.sendKeys(DataClass.data("Card_Details",2,1));
		Cardcode.sendKeys(DataClass.data("Card_Details",1,2));
		Addpaymentmethod2.click();
		Assert.assertTrue(passwordmessage.getText().contains("Payment method"));
		System.out.println(passwordmessage.getText());
		deletpaymentmethod.click();
	}
	
	//tc137
	public void orderDetails() throws InterruptedException, IOException {
		ScreenShort ss= new ScreenShort(dr);
		clickOnRemeberMeCheckBox();
		loginregister.click();
		orders.click();
		ordersview.click();
		Assert.assertTrue(ordersdetails.getText().contains("Order"));
		JavaScrptClass.scroll(ordersdetails);
		ss.sc(ordersdetails);
	}
	//tc139
	public void dashBoardlogout() throws InterruptedException, IOException {
		clickOnRemeberMeCheckBox();
		loginregister.click();
		dashboardlogout.click();
		Assert.assertTrue(loginregister.getText().contains("Login"));
		System.out.println("Logout Sucessfull");
	}
	//tc140
	public void myAccountlogout() throws InterruptedException, IOException {
		Actions ac=new Actions(dr);
		clickOnRemeberMeCheckBox();
		ac.moveToElement(loginregister).perform();
		visibilityOfElement(myaccountlogout);
		myaccountlogout.click();
		Assert.assertTrue(loginregister.getText().contains("Login"));
		System.out.println("Logout Sucessfull");
	}
	//tc243
	public void clickingOnTheShopNowButtonItHasToRedirectToThatParticularPage() throws InterruptedException, IOException {
		clickOnRemeberMeCheckBox();
		visibilityOfElement(SilverShopnow);
		SilverShopnow.click();
		Assert.assertTrue(producctmessage.getText().equalsIgnoreCase("Silver"));
		System.out.println(producctmessage.getText());
		dr.navigate().back();
		visibilityOfElement(rightarrow);
		rightarrow.click();
		visibilityOfElement(goldShopnow);
		goldShopnow.click();
		Assert.assertTrue(producctmessage.getText().equalsIgnoreCase("Gold"));
		System.out.println(producctmessage.getText());
		dr.navigate().back();
		visibilityOfElement(leftarrow);
		leftarrow.click();
		visibilityOfElement(platiniumShopnow);
		platiniumShopnow.click();
		Assert.assertTrue(producctmessage.getText().equalsIgnoreCase("Platinum"));
		System.out.println(producctmessage.getText());
	}
	//tc244
	public void clickOnTheShopNowButtonItHasToRedirectToThatParticularPage(String x,String y) throws InterruptedException, IOException {
		clickOnRemeberMeCheckBox();
		JavaScrptClass.scroll(x, y);
		visibilityOfElement(StsticShopnow1);
		StsticShopnow1.click();
		Assert.assertTrue(producctmessage.getText().contains("New"));
		System.out.println("Redirected to  "+producctmessage.getText());
		dr.navigate().back();
		visibilityOfElement(StsticShopnow2);
		StsticShopnow2.click();
		Assert.assertTrue(producctmessage.getText().contains("New"));
		System.out.println("Redirected to  "+producctmessage.getText());
	}			
	
	
	//s
	public void address(Object fname,Object lname,Object compny,Object sname,Object sname2,Object town,Object ste,Object postcode,Object phoneno,Object mail) throws Throwable
	{
		Header hdr=new Header();
		hdr.checkout();
		JavascriptExecutor jse=(JavascriptExecutor)dr;
		jse.executeScript("window.scrollBy(0,300)");
		firstname.clear();
		firstname.sendKeys(String.valueOf(fname));
		lastname.clear();
		lastname.sendKeys(String.valueOf(lname));
		cmpny.sendKeys(String.valueOf(compny));
		street.clear();
		street.sendKeys(String.valueOf(sname));
		//street2.clear();
		//street2.sendKeys(sname2);
		jse.executeScript("window.scrollBy(0,800)");
		city.clear();
		city.sendKeys(String.valueOf(town));
		//state.sendKeys(ste);
		zipcode.clear();
		zipcode.sendKeys(String.valueOf(postcode));
		phneno.clear();
		phneno.sendKeys(String.valueOf(phoneno));
		Email.clear();
		Email.sendKeys(String.valueOf(mail));
		validatebtn.click();
		visibilityOfElement(addressvalidationmsg);
		System.out.println(addressvalidationmsg.getText());
		Thread.sleep(3000);
		checkbox.click();
		plceordrbtn.click();
		
	}
	public void address2(Object fname,Object lname,Object compny,Object sname,Object sname2,Object town,Object ste,Object postcode,Object phoneno,Object mail) throws Throwable
	{
		
		JavascriptExecutor jse=(JavascriptExecutor)dr;
		jse.executeScript("window.scrollBy(0,300)");
		firstname.clear();
		firstname.sendKeys(String.valueOf(fname));
		lastname.clear();
		lastname.sendKeys(String.valueOf(lname));
		cmpny.sendKeys(String.valueOf(compny));
		street.clear();
		street.sendKeys(String.valueOf(sname));
		//street2.clear();
		//street2.sendKeys(sname2);
		jse.executeScript("window.scrollBy(0,800)");
		city.clear();
		city.sendKeys(String.valueOf(town));
		//state.sendKeys(ste);
		zipcode.clear();
		zipcode.sendKeys(String.valueOf(postcode));
		phneno.clear();
		phneno.sendKeys(String.valueOf(phoneno));
		Email.clear();
		Email.sendKeys(String.valueOf(mail));
		validatebtn.click();
		//jse.executeScript("window.scrollBy(0,100)");
		visibilityOfElement(addressvalidationmsg);
		System.out.println(addressvalidationmsg.getText());
		Thread.sleep(3000);
		checkbox.click();
		plceordrbtn.click();
	}
	
	
	//v
	public void adressBook_Billing(String use,String passw,String ref,String fn,String ln,String com,String str,String st,String to,String code,String num,String em,String em2) throws InterruptedException, IOException {
		Runner r=new Runner();
		r.clickOnRemeberMeCheckBox();
		Actions ac=new Actions(dr);
		ac.moveToElement(loginregister).perform();
		ac.moveToElement(add).perform();
		add.click();
		try {
			if(billingaddressdelet.isDisplayed())
				billingaddressdelet.click();
		}catch (Exception e) {
			
		}
		Thread.sleep(2000);
		bill.click();
		visibilityOfElement(refname);
		refname.sendKeys(ref);
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		cmpny.sendKeys(com);
		JavaScrptClass.scroll("0", "600");
		street.sendKeys(str);
		street2.sendKeys(st);
		city.sendKeys(to);
		//state.sendKeys(sta);
		JavaScrptClass.scroll("0", "600");
		Select ss=new Select(addressbookstate);
				ss.selectByVisibleText("Texas");
	    zipcode.sendKeys(code);
		Thread.sleep(3000);
		phone.sendKeys(num);
		mai.sendKeys(em);
		mai2.sendKeys(em2);
		saveaddress.click();
		Thread.sleep(3000);
		edit.click();
		Thread.sleep(3000);
		cmpny.clear();
		update.click();
		System.out.println("Customeris able to enter the billing details ,delete,edit the billing details");
	}
	

	public void adressBook_Billing_2(String use,String passw,String num) throws InterruptedException, IOException {
		Runner r=new Runner();
		r.clickOnRemeberMeCheckBox();
		Actions ac=new Actions(dr);
		ac.moveToElement(myacc).perform();
		ac.moveToElement(add).perform();
		add.click();
		JavaScrptClass.scroll("0","300");
		edit.click();
		visibilityOfElement(refname);
		//JavaScrptClass.scroll("0","800");
		phone.clear();
		phone.sendKeys(num);
		update.click();
	}
	
	public void adressBook_Shippingadress(String use,String passw,String ref,String fn,String ln,String com,String str,String st,String to,String sta,String code,String num,String up) throws InterruptedException, IOException {
		Runner r=new Runner();
		r.clickOnRemeberMeCheckBox();
		Actions ac=new Actions(dr);
		ac.moveToElement(myacc).perform();
		ac.moveToElement(add).perform();
		add.click();

		Thread.sleep(300);
		JavascriptExecutor js=(JavascriptExecutor)dr;
		try {
			if(delete1.isDisplayed())
				delete1.click();
		}catch (Exception e) {
			
		}
		dash.click();
		Thread.sleep(3000);
		shiping.click();
		visibilityOfElement(refname);
		refname.sendKeys(ref);
		fname1.sendKeys(fn);
		lname1.sendKeys(ln);
		bcom1.sendKeys(com);
		js.executeScript("window.scrollBy(0,600)");
	Select ss=new Select(country);
	ss.selectByIndex(2);
		Streeadd1.sendKeys(str);
		Stad21.sendKeys(st);
		town1.sendKeys(to);
		js.executeScript("window.scrollBy(0,200)");
		
				
		zip1.sendKeys(code);
		
		phone1.sendKeys(num);
		
		save1.click();
		Thread.sleep(3000);
		
		edit1.click();
		visibilityOfElement(refname);
		refname.sendKeys(up);
		update1.click();
		
		System.out.println("user is able to enter the Shipping Address details and delete the Shipping Adress details");
	}
	
	public void order(String id,String ma,String nam,String mal,String ph,String co,String mes) throws InterruptedException, IOException {
		Runner r=new Runner();
		r.clickOnRemeberMeCheckBox();
		String parent=dr.getWindowHandle();
		track.click();
		Set<String> child=dr.getWindowHandles();
		for(String par:child) {
			if(!child.equals(parent)) {
				dr.switchTo().window(par);
			}
			
		}
		orderid.sendKeys(id);
		ordmai.sendKeys(ma);
		Track.click();
		JavaScrptClass.scroll("0", "800");
		String actual="passed";
		String excpected="passed";
		if(actual.equals(excpected)) {
			System.out.println("user is able to see the order details.");
		}
		
		contactou.click();
		System.out.println("customer is able to see the contact details");
		name.sendKeys(nam);
		youremail.sendKeys(mal);
		num.sendKeys(ph);
		com.sendKeys(co);
		mess.sendKeys(mes);
		askq.click();
		visibilityOfElement(text);
		String actual1=text.getText();
		
		String expected1="Thank you for your message. It has been sent.";
		
		Assert.assertEquals(actual1, expected1);
		
		System.out.println("user is able to see Thank you for your message. It has been sent.");
		
		
	}
	public void order1(String id,String ma,String nam,String mal,String ph,String co,String mes) throws InterruptedException, IOException {
		Runner r=new Runner();
		r.clickOnRemeberMeCheckBox();
		String parent=dr.getWindowHandle();
		track.click();
		Set<String> child=dr.getWindowHandles();
		for(String par:child) {
			if(!child.equals(parent)) {
				dr.switchTo().window(par);
			}
			
		}
		orderid.sendKeys(id);
		ordmai.sendKeys(ma);
		Track2.click();
		JavaScrptClass.scroll("0", "800");
		String actual="passed";
		String excpected="passed";
		if(actual.equals(excpected)) {
			System.out.println("user is able to see the order details.");
		}
		
		contactou.click();
		System.out.println("customer is able to see the contact details");
		name.sendKeys(nam);
		youremail.sendKeys(mal);
		num.sendKeys(ph);
		com.sendKeys(co);
		mess.sendKeys(mes);
		askq.click();
		visibilityOfElement(text);
		String actual2=text.getText();
		String expected2="One or more fields have an error. Please check and try again.";
				Assert.assertEquals(actual2, expected2);
		System.out.println("user is not able to see Thank you for your message. It has been sent.");
			}
	
	
	
			public void order2(String id,String ma) throws InterruptedException, IOException {
				Runner r=new Runner();
				r.clickOnRemeberMeCheckBox();
				String parent=dr.getWindowHandle();
				track.click();
				Set<String> child=dr.getWindowHandles();
				for(String par:child) {
					if(!child.equals(parent)) {
						dr.switchTo().window(par);
					}
					
				}
				orderid.sendKeys(id);
				ordmai.sendKeys(ma);
				Track.click();
				JavaScrptClass.scroll("0", "800");
			
		 if(error.isDisplayed()){
			System.out.println("Sorry, the order could not be found. Please contact us if you are having difficulty finding your order details.s");
			
		}
			}
			
		public void logo() throws InterruptedException, IOException {
			Runner r=new Runner();
			r.clickOnRemeberMeCheckBox();
			String parent=dr.getWindowHandle();
			visibilityOfElement(loginregister);
			//Thread.sleep(3000);
			if(logo.isDisplayed()) {
				System.out.println("Image is displayed  "+logo.getAttribute("alt"));
			}
			String actual=logo.getAttribute("alt");
			visibilityOfElement(track);
			track.click();
			Set<String> child=dr.getWindowHandles();
			for(String par:child) {
				if(!child.equals(parent)) {
					dr.switchTo().window(par);
				}
			}
				if(logo2.isDisplayed()) {
					System.out.println("Image is displayed  "+logo2.getAttribute("alt"));
				}
				visibilityOfElement(logo2);
				String expect=logo2.getAttribute("alt");
			Assert.assertEquals(actual, expect);
			System.out.println("user is able to see the track an order logo is same as landing page logo");
		}
		
		public void footer(String na,String ma,String ph,String co,String me) throws InterruptedException, IOException {
			Runner r=new Runner();
			r.clickOnRemeberMeCheckBox();
		JavaScrptClass.scroll("0", "2500");
		JavaScrptClass.highlite(foot);
		foot.click();
		JavaScrptClass.highlite(name);
		name.sendKeys(na);
		JavaScrptClass.highlite(youremail);
		youremail.sendKeys(ma);
		JavaScrptClass.highlite(num);
		num.sendKeys(ph);
		com.sendKeys(co);
		mess.sendKeys(me);
		askq.click();
		dr.navigate().back();
		faqs.click();
		JavaScrptClass.scroll("0", "800");
		feedback.click();
		//Thread.sleep(5000);
		visibilityOfElement(cc);
		System.out.println(cc.getText());
		String actual=cc.getText();
		String expected="Contact Us";
		Assert.assertEquals(actual, expected);
		System.out.println("Customer is able to Redirect the ContactUS Page.");
		}
		
		
		public void privacy() throws InterruptedException, IOException {
			Runner r=new Runner();
			r.clickOnRemeberMeCheckBox();
			JavaScrptClass.scroll("0", "2500");
			visibilityOfElement(privacyp);
			privacyp.click();
			String actuals=dr.getTitle();
			String expecteds = "Privacy Policy – Oxhead";
			Assert.assertEquals(actuals, expecteds);
			System.out.println("Customer is able to see Privacy Policy Page.");
		
			visibilityOfElement(sales);
		sales.click();
		String Actual="Oxhead";
		String expected="SalesTax Page";
		Assert.assertNotEquals(Actual, expected);
		System.out.println("Customer is not able to see SalesTax Page");
		
		
		}
		public void shipp() throws InterruptedException, IOException {
			Runner r=new Runner();
			r.clickOnRemeberMeCheckBox();
			JavaScrptClass.scroll("0", "2500");
			visibilityOfElement(shipp);
			shipp.click();
		String Actual1="Oxhead";
		String expected1="Shipping and Delivery Page";
		Assert.assertNotEquals(Actual1, expected1);
		System.out.println("Customer is not able to see Shipping and Delivery Page");
		
		visibilityOfElement(paymen);
		paymen.click();
		String Actual2="Oxhead";
		String expected2="PaymentPolicy Page";
		Assert.assertNotEquals(Actual1, expected1);
		System.out.println("Customer is not able to see PaymentPolicy Page");
		visibilityOfElement(paymen);
		Return.click();
		String Actual3="Oxhead";
		String expected3="ReturnPolicy Page";
		Assert.assertNotEquals(Actual1, expected1);
		System.out.println("Customer is not able to see ReturnPolicy Page");
		visibilityOfElement(paymen);
		conditions.click();
	String actual =dr.getTitle();
	String expect="Terms and Conditions – Oxhead";
	System.out.println("Customer is able to see Terms and Conditions Page. ");
		}
		
		public void account() throws InterruptedException, IOException {
			Runner r=new Runner();
			r.clickOnRemeberMeCheckBox();
			JavaScrptClass.scroll("0", "2500");
			visibilityOfElement(paymen);
			myaccount.click();
			String actual="OXhead";
			String expected="Account -login";
			Assert.assertNotEquals(actual, expected);
			System.out.println("Customer is not able to see Account Login Page.");
			visibilityOfElement(paymen);
			order.click();
			String actual1="OXhead";
			String expected1="TrackanOrder";
			Assert.assertNotEquals(actual1, expected1);
			System.out.println("Customer is not able to see  TrackanOrder Page.");
			visibilityOfElement(paymen);
			price.click();
			String actual2="OXhead";
			String expected2="Price Alerts";
			Assert.assertNotEquals(actual2, expected2);
			System.out.println("Customer is not able to see Price Alerts Page.");
			visibilityOfElement(paymen);
			aboutox.click();
			String actual3=dr.getTitle();
			String expected3="About Us – Oxhead";
			Assert.assertEquals(actual3, expected3);
			System.out.println("Customer is able to see OXhead AboutUS Page.");
			dr.navigate().back();
			visibilityOfElement(paymen);
			Blog.click();
			String actual4="OXhead";
			String expected4="OXhead Blogs";
			Assert.assertNotEquals(actual4, expected4);
			System.out.println("Customer is not able to see OXhead Blogs Page.");
			visibilityOfElement(paymen);
			products.click();
			String actual5="OXhead";
			String expected5="OXhead Products";
			Assert.assertNotEquals(actual5, expected5);
			System.out.println("Customer is not able to see OXhead Products Page.");
		}
		
		public void Blog() throws InterruptedException, IOException {
			Runner r=new Runner();
			r.clickOnRemeberMeCheckBox();
			JavaScrptClass.scroll("0", "2500");
			visibilityOfElement(paymen);
			blog.click();
			String actual="OXhead";
			String expected="Blog";
			Assert.assertNotEquals(actual, expected);
			System.out.println("Customer is not able to see Blog Page.");
			visibilityOfElement(paymen);
			guide.click();
			String actual1="OXhead";
			String expected1="Investing Guide";
			Assert.assertNotEquals(actual1, expected1);
			System.out.println("Customer is not able to see Investing Guide Page.");
			visibilityOfElement(paymen);
			silver.click();
			String actual2="OXhead";
			String expected2="Siver Prices";
			Assert.assertNotEquals(actual2, expected2);
			System.out.println("Customer is not able to see Siver Prices Page.");
			visibilityOfElement(paymen);
			gold.click();
			String actual3="OXhead";
			String expected3="gold Prices";
			Assert.assertNotEquals(actual3, expected3);
			System.out.println("Customer is not able to see gold Prices Page.");
			visibilityOfElement(paymen);
			local.click();
			String actual4="OXhead";
			String expected4="local Directory";
			Assert.assertNotEquals(actual4, expected4);
			System.out.println("Customer is not able to see local Directory Page.");
			visibilityOfElement(paymen);
			coin.click();
			String actual5="OXhead";
			String expected5="Coin Values";
			Assert.assertNotEquals(actual5, expected5);
			System.out.println("Customer is not able to see Coin Values Page.");
			visibilityOfElement(paymen);
			salesTax.click();
			String actual6="OXhead";
			String expected6="Sales Tax";
			Assert.assertNotEquals(actual6, expected6);
			System.out.println("Customer is not able to see Sales Tax Page.");
			Actions ac=new Actions(dr);
			ac.moveToElement(Return).perform();
			
		}
}
