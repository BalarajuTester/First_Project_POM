package Oxhead_excel;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatersClass  {
//s
	@FindBy(xpath = "//input[@name='email']") WebElement email;
	@FindBy(xpath = "//button[text()='Register']") WebElement regbtn;
	@FindBy(xpath = "/html/body/div[11]/form/div[3]/div[1]/a") WebElement facebooklink;
	@FindBy(xpath = "//a[@class='login-goo-link btn']") WebElement googlelink;
	@FindBy(xpath = "//a[@class='button btn-cart wc-forward']") WebElement viewcart;
	//@FindBy(xpath = "//input[@class='plus']") WebElement plusbtn;
	@FindBy(xpath = "//button[text()='Update cart']") WebElement updatebtn;
	@FindBy(xpath = "//div[@class='wc-proceed-to-checkout']") WebElement checkoutbtn;
	@FindBy(xpath = "//a[text()='10 oz Platinum Bar']") WebElement selprdct;
	@FindBy(xpath = "//div[@class='wd-wishlist-btn wd-action-btn wd-style-text wd-wishlist-icon']//a[text()='Add to wishlist']") WebElement addtowishlist;
	@FindBy(xpath = "//div[3]//div[2]//div//ul//li[7]//a") WebElement myaccountwishlst;
	@FindBy(xpath = "/html/body/div[1]/header/div[1]/div[2]/div/div/div[3]/div[3]/a/span[1]")  WebElement wishlisticon;
	@FindBy(xpath = "//a[@class='wd-wishlist-remove']")  WebElement wishlistremove;
	@FindBy(xpath = "//a[@class='button']")  WebElement wishlistreturntoshop;
	@FindBy(xpath = "//a[text()='Palladium Maple Leaf']") WebElement selprdct2;
	@FindBy(xpath = "//input[@id='billing_first_name']") WebElement firstname;
	@FindBy(xpath = "//input[@id='billing_last_name']") WebElement lastname;
	@FindBy(xpath = "//*[@id='billing_company']") WebElement cmpny;
	@FindBy(xpath = "//input[@id='billing_address_2']") WebElement street2;
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/article/div/div/form[2]/div[1]/div[2]/div[1]/div/div/p[10]/span/input") WebElement phneno;
	@FindBy(xpath = "//input[@id='billing_email']") WebElement Email;
	@FindBy(xpath = "//button[text()='Validate Address']") WebElement validatebtn;
	@FindBy(xpath = "/html/body/div[1]/header/div[1]/div[3]/div/div/div[2]/div/ul/li[3]/a/span") WebElement slver;
	@FindBy(xpath = "/html/body/div[1]/header/div[1]/div[3]/div/div/div[2]/div/ul/li[3]/div/div/ul/li[1]/a") WebElement slvrbars;
	@FindBy(xpath = "//a[@class='category-link wd-fill']") WebElement bar;
	@FindBy(xpath = "//a[text()='Silver Bar 10 OZ']") WebElement prdctbr;
	@FindBy(xpath = "/html/body/div[1]/header/div[1]/div[3]/div/div/div[2]/div/ul/li[3]/div/div/ul/li[2]/a") WebElement slverbullets;
	@FindBy(xpath = "//html/body/div[1]/header/div[1]/div[3]/div/div/div[2]/div/ul/li[3]/div/div/ul/li[3]/a") WebElement slvrcoins;
	@FindBy(xpath = "//a[text()='1 oz Silver Buffalo Round']") WebElement prdctcoin;
	@FindBy(xpath = "/html/body/div[1]/header/div[1]/div[3]/div/div/div[2]/div/ul/li[4]/a/span") WebElement gld;
	@FindBy(xpath = "/html/body/div[1]/header/div[1]/div[3]/div/div/div[2]/div/ul/li[4]/div/div/ul/li[1]/a") WebElement gldcoins;
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div[5]/div[2]/div/a") WebElement usmint;
	@FindBy(xpath = "//a[text()='1 oz Gold American Buffalo (BU)']") WebElement gldprdct;
	@FindBy(xpath = "/html/body/div[1]/header/div[1]/div[3]/div/div/div[2]/div/ul/li[4]/div/div/ul/li[2]/a") WebElement gldbars;
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div[5]/div/div/a") WebElement bar2;
	@FindBy(xpath = "//a[text()='1 oz Gold Bar in Assay Card']") WebElement gldprdct2;
	@FindBy(xpath = "/html/body/div[1]/header/div[1]/div[3]/div/div/div[2]/div/ul/li[4]/div/div/ul/li[3]/a") WebElement usgld;
	@FindBy(xpath = "/html/body/div[1]/header/div[1]/div[3]/div/div/div[2]/div/ul/li[4]/div/div/ul/li[4]/a") WebElement canadiangld;
	@FindBy(xpath = "/html/body/div[1]/header/div[1]/div[3]/div/div/div[2]/div/ul/li[4]/div/div/ul/li[5]/a") WebElement Australiangld;
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div[3]/div/div/div[2]/div/ul/li[5]/a/span") WebElement other;
	@FindBy(xpath="//a[@aria-label='Remove this item']") List<WebElement> removeitem;
	
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div[3]/div/div/div[2]/div/ul/li[5]/div/div/ul/li[1]/a") WebElement pltnum;
	
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div/div/div[5]/div/div/a") WebElement pltnmbullion;
	
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div/div/div[5]/div[1]/div/a") WebElement bar3;
	
	
	@FindBy(xpath="//a[text()='10 oz Platinum Bar']") WebElement pltnmprdct;
	
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div[3]/div/div/div[2]/div/ul/li[5]/div/div/ul/li[2]/a") WebElement coinsupplies;
	
	
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div[3]/div/div/div[2]/div/ul/li[5]/div/div/ul/li[3]/a") WebElement merch;
	
	
	//AboutUS page objects
		@FindBy(xpath="//li[@id='menu-item-8194']") WebElement about;
		

		@FindBy(xpath="//*[@id=\"post-7146\"]/div/div/div[2]/div/div/div[4]/div/div/div/div/a[1]") WebElement links;
		
		@FindBy(xpath="//*[@id=\"post-7146\"]/div/div/div[2]/div/div/div[4]/div/div/div/div/a[2]") WebElement Twiter;
		
		@FindBy(xpath="//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div[2]/div/h2/span") WebElement prof;
		
		@FindBy(xpath="//*[@id=\"post-7146\"]/div/div/div[2]/div/div/div[4]/div/div/div/div/a[3]") WebElement insta;
		
		@FindBy(xpath="//h1[text()='Instagram']") WebElement instatext;
		
		//Contactus page objects
		@FindBy(xpath="//li[@id='menu-item-401']") WebElement con;
		
		@FindBy(xpath="//input[@name='your-name']") WebElement name;
		
		@FindBy(xpath="//input[@name='your-email']") WebElement youremail;
		
		@FindBy(xpath="//input[@name=\"tel-767\"]") WebElement num;
		
		@FindBy(xpath="//input[@name='text-1']") WebElement com;
		
		@FindBy(xpath="//textarea[@name='your-message']") WebElement mess;
		
		@FindBy(xpath="//input[@value=\"ASK A QUESTION\"]") WebElement askq;
		 
		@FindBy(xpath="//div[@class='wpcf7-response-output']") WebElement text;
		

		@FindBy(xpath="//span[@class='color-primary']") WebElement get;
		
		@FindBy(xpath="//h1[@class='entry-title title']") WebElement cc;
		
		//FAQ page objects
		@FindBy(xpath="//li[@id='menu-item-400']") WebElement faq;
		
		@FindBy(xpath="//span[text()='WILL I BE CHARGED SALES TAX?']") WebElement will;
		
		@FindBy(xpath="//span[text()='WILL MY PURCHASES BE REPORTED TO THE IRS']") WebElement purchase;

		

		@FindBy(xpath="//span[text()='DO YOU SHIP OUTSIDE THE US?']") WebElement ship;
		

			@FindBy(xpath="//span[text()='WHAT TYPES OF PAYMENT METHODS DO YOU ACCEPT?']") WebElement payment;
		
		@FindBy(xpath="//span[text()='CAN I PAY WITH A DEBIT CARD?']") WebElement PAY;
		

		@FindBy(xpath="//span[text()='IS MY PACKAGE INSURED?']") WebElement PACKAGE;
		 
		@FindBy(xpath="//span[text()='WHY HAS THE PRICE IN MY CART CHANGED AT CHECKOUT?']") WebElement CHECKOUT;
		
		@FindBy(xpath="//span[text()='CAN I ADD ITEMS TO MY ORDER AFTER I’VE ALREADY CHECKED OUT?']") WebElement ORDER;
		
		@FindBy(xpath="//span[text()='WILL THE PRICE CHANGE AFTER I COMPLETE CHECKOUT?']") WebElement PRICE;
		 
		@FindBy(xpath="//span[text()='HOW WILL I KNOW YOU RECEIVED MY ORDER?']") WebElement RECEIVED;
		
		@FindBy(xpath="//span[text()='WILL I HAVE TO SIGN FOR MY ORDER?']") WebElement SIGN;
		
		@FindBy(xpath="//span[text()='DO YOU OFFER FREE SHIPPING?']") WebElement OFFER;
		
		@FindBy(xpath="//a[text()='How do I contact you for feedback/queries/suggestions?']") WebElement feedback;
		
		@FindBy(xpath="//i[@class=\"vc_tta-controls-icon vc_tta-controls-icon-chevron\"]") WebElement arrow;
		
		@FindBy(xpath="//a[@title=\"Privacy Policy\"]") WebElement privacy;
		
		@FindBy(xpath="//a[@title=\"Terms and Conditions\"]") WebElement terms;
		
		//@FindBy(xpath="//div[@class=\"page-title page-title-default title-size-default title-design-default color-scheme-light\"]")
		//WebElement termcon;
		@FindBy(xpath="/html/body/div[1]/header/div[1]/div[2]/div/div/div[3]/div[2]/a") WebElement myacc;
		  
		@FindBy(xpath="/html/body/div[1]/header/div[1]/div[2]/div/div/div[3]/div[2]/div/ul/li[4]/a/span") WebElement add;
		
		//billing Address pageobjects
		@FindBy(xpath="//button[@class='form_option_billing']") WebElement bill;
		@FindBy(xpath="//input[@id=\"oc_refname\"]") WebElement refname;
		@FindBy(xpath="//input[@id=\"billing_email\"]") WebElement mai;
		
		@FindBy(xpath = "//input[@id='billing_email-2']") WebElement mai2;
		@FindBy(xpath="//select[@id=\"billing_state\"]") WebElement addressbookstate;
		
		@FindBy(xpath="//button[@id='oc_add_billing_form_submit']") WebElement saveaddress;
		@FindBy(xpath="//button[@class='form_option_edit'][1]") WebElement edit;
		@FindBy(xpath="//a[text()='Delete'][1]") WebElement billingaddressdelet;
		@FindBy(xpath="//button[@id='oc_edit_billing_form_submit']") WebElement update;
		
		//Shipping address pageobkects
		@FindBy(xpath="//button[@class=\"form_option_shipping\"]") WebElement shiping;
		
		@FindBy(xpath="//input[@id=\"shipping_first_name\"]") WebElement fname1;
		 
		@FindBy(xpath="//input[@id=\"shipping_last_name\"]") WebElement lname1;
		
		@FindBy(xpath="//input[@id=\"shipping_company\"]")  WebElement bcom1;
		
		@FindBy(xpath="//select[@id=\"shipping_country\"]") WebElement country;
		
		@FindBy(xpath="//input[@id=\"shipping_address_1\"]") WebElement Streeadd1;
		
		@FindBy(xpath="//input[@id='shipping_address_2']") WebElement Stad21;
		
		@FindBy(xpath="//input[@id=\"shipping_city\"]") WebElement town1;
		
		@FindBy(xpath="//select[@id=\"shipping_state\"]") WebElement state1;
		
		@FindBy(xpath="//input[@id=\"shipping_postcode\"]") WebElement zip1;
		
		@FindBy(xpath="//input[@id=\"shipping_phone\"]") WebElement phone1;
		
		@FindBy(xpath="//button[@id=\"oc_add_shipping_form_submit\"]") WebElement save1;
		
		@FindBy(xpath="//button[@class=\"form_option_ship_edit\"][1]") WebElement edit1;
		
		@FindBy(xpath="//span[@class=\"delete_ship_address\"][1]") WebElement delete1;
		
		@FindBy(xpath="//*[@id=\"post-11\"]/div/div/div/section[1]/div/div/div/div/div/div/div/div[1]/nav/ul/li[4]/a") WebElement dash;
		
		@FindBy(xpath="//button[@id=\"oc_edit_shipping_form_submit\"]") WebElement update1;
		
	

	@FindBy(xpath = "//button[@title='Close (Esc)']") public WebElement popupclose;
	@FindBy(xpath = "//header//div[1]//div[2]//div//div//div[3]//div[2]//a") public WebElement loginregister;   

	@FindBy(name = "username") public WebElement username;
	@FindBy(name = "password") public WebElement password;                                                  
	@FindBy(name = "rememberme") public WebElement rememberme;
	@FindBy(name = "login") public WebElement loginButton;
	@FindBy(xpath = "//div[2]//div//div//div[3]//div[2]//a//span[2]") public WebElement loginusername;

	@FindBy(xpath = "//div[11]//form//div[1]//a") public WebElement lostpassword;
	@FindBy(xpath = "//p[contains(text(),'Lost your password?')]") public WebElement lostyourpassword;

	@FindBy(xpath = "//input[@id='user_login']") public WebElement uname;
	@FindBy(xpath = "//button[@value='Reset password']") public WebElement resetpassword;
	@FindBy(xpath = "//div[@class='woocommerce-message']") public WebElement passwordmessage;
	@FindBy(xpath = "//input[@type='email']") public WebElement gmail;
	@FindBy(xpath = "//input[@type='password']") public WebElement gmailPassword;
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div/div[1]/div/a/img") public WebElement logo;
	@FindBy(xpath = "//div[@class='gb_Td gb_Va gb_Id gb_Wd']//div[2]//iframe") public WebElement frame;//div[@class='gb_Td gb_Va gb_Id gb_Wd']//div[2]//iframe
	@FindBy(xpath = "//div[@class='qWuU9c']//ul[1]//li[7]") public WebElement gmaillogo;
	@FindBy(xpath = "//button[@class='M6CB1c rr4y5c']") public WebElement dontswitch;
	@FindBy(xpath = "//tbody//tr[1]//td[5]//span[text()='Password Reset Request for Oxhead']") public WebElement mail;
	@FindBy(xpath = "//div//p//a[contains(text(),'Click here')]") public WebElement resetlink;
	@FindBy(xpath = "//div[@class='G-atb D E']//div[@class='T-I J-J5-Ji nX T-I-ax7 T-I-Js-Gs mA']") public WebElement deletmail;
	@FindBy(xpath = "//input[@type='password' and @name='password_1']") public WebElement newPwd;
	@FindBy(xpath = "//input[@type='password' and @name='password_2']") public WebElement ReNewPwd;
	@FindBy(xpath = "//button[@type='submit' and @value='Save']") public WebElement save;
	@FindBy(xpath = "//ul[@class='woocommerce-error']//li") public WebElement passworderrormessage;

	@FindBy(xpath = "//a[text()='Create an Account']") public WebElement createaccount;
	@FindBy(xpath = "//div[11]//div[1]//div//a") public WebElement logincross; //loginclose

	@FindBy(xpath = "//input[@placeholder='Your email address']") public WebElement popupemail;
	@FindBy(xpath = "//input[@type='submit']") public WebElement popupsubmit;
	@FindBy(xpath = "//div[@role='alert']") public WebElement popupmessage;


	//search for product,selecr category,product
	@FindBy(xpath = "//div[2]//input[@placeholder='Search for products']") public WebElement productsearch;
	@FindBy(xpath = "//p[@class='woocommerce-info']") public WebElement productErrormsg;
	@FindBy(xpath = "//div[@class='wd-search-cat wd-scroll']") public WebElement selecategory;
	@FindBy(xpath = "//div[@class='wd-search-cat wd-scroll']//ul[@class='wd-sub-menu']//li") public List<WebElement> selecategorylist; 
	@FindBy(xpath = "//a[@data-val='all-products']") public WebElement AllProducts; 
	@FindBy(xpath = "//a[@data-val='gold']") public WebElement Gold; 
	@FindBy(xpath = "//a[@data-val='membership']") public WebElement Membership; 
	@FindBy(xpath = "//a[@data-val='palladium']") public WebElement Palladium; 
	@FindBy(xpath = "//a[@data-val='platinum']") public WebElement Platinum; 
	@FindBy(xpath = "//a[@data-val='silver']") public WebElement Silver;
	@FindBy(xpath = "//span[@class='woof_remove_ppi']") public WebElement productmessage;
	@FindBy(xpath = "//div[1]//div[2]//form//button") public WebElement searchbutt;     //html/body/div[1]/header/div[1]/div[2]/div/div/div[2]/div[2]/form/button
	@FindBy(css = "li[class='cat-item cat-item-88 cat-parent']") public WebElement junksilver;
	@FindBy(css = "a[class='category-link wd-fill']") public WebElement silverproduct;



	//browser category
	@FindBy(xpath = "//span[@class='menu-opener color-scheme-light']") public WebElement Browsecategories;
	@FindBy(xpath = "//div[@class='wd-dropdown wd-dropdown-cats ']//ul//li") public List<WebElement> Browsecategorieslist; 
	@FindBy(xpath = "//ul[@class='children list-shown']") public WebElement PalladiumBullion;
	@FindBy(css = "a[class='category-link wd-fill']") public WebElement productPalladiumBullion;
	@FindBy(xpath = "//div[5]/div[2]/div/div[1]/a/img") public WebElement Bar;
	@FindBy(xpath = "//h1[@class='entry-title title']") public WebElement producctmessage;


	@FindBy(xpath="//a[text()='Gold Austrian Philharmonic']") WebElement GoldAustrianPhilharmonic;


	@FindBy(xpath="//div[@class='product-information']//h3//a[text()='Gold Swiss 20 Franc']") public WebElement goldpageproduct;
	@FindBy(xpath="//div[@class='summary-inner']//button[@name='add-to-cart']") public WebElement addtocart;
	@FindBy(xpath="//div[@class='wc-proceed-to-checkout']") public WebElement Proceedtocheckout;
	
	@FindBy(xpath="//input[@id='billing_address_1']") public WebElement street;
	@FindBy(xpath="//input[@name='billing_city']") public WebElement city;
	@FindBy(xpath="//span[@class='select2-selection__arrow']") public WebElement state;
	@FindBy(xpath="//input[@name='billing_postcode']") public WebElement zipcode;
	@FindBy(xpath="//input[@name='billing_phone']") public WebElement phone;


	@FindBy(xpath="//div[@class='payment-methods-link']") public WebElement Paymentmethods;
	@FindBy(xpath="//a[@class='button']") public WebElement Addpaymentmethod1;
	@FindBy(xpath="//input[@id='authnet-card-number']") public WebElement cardnumber;
	@FindBy(xpath="//input[@id='authnet-card-expiry']") public WebElement Expiry;
	@FindBy(xpath="//input[@id='authnet-card-cvc']") public WebElement Cardcode;
	@FindBy(xpath="//div[@class='form-row']//button[@type='submit']") public WebElement Addpaymentmethod2;
	@FindBy(xpath="//a[@class='button delete']") public WebElement deletpaymentmethod;

	@FindBy(xpath="//div[@class='orders-link']") public WebElement orders;
	@FindBy(xpath="//a[@class='woocommerce-button button view']") public WebElement ordersview;
	@FindBy(xpath="//h2[@class='woocommerce-order-details__title']") public WebElement ordersdetails;
	@FindBy(xpath="//div[@class='customer-logout-link']") public WebElement dashboardlogout;
	@FindBy(xpath="//div[3]//div[2]//div//ul//li[8]//a") public WebElement myaccountlogout;

	@FindBy(xpath="//div[@class='whb-flex-row whb-header-bottom-inner']//ul//li[@id='menu-item-8692']") public WebElement home;//header//div[1]//div[3]//div//div//div[2]//div//ul//li[1]//a//span
	@FindBy(xpath="//div[@id='myHeader']") public WebElement Stickyhesder;
	@FindBy(xpath="//div[@class='whb-flex-row whb-header-bottom-inner']//ul//li[@id='menu-item-7887']") public WebElement trading;
	@FindBy(xpath="//div[@class='whb-flex-row whb-header-bottom-inner']//ul//li[@id='menu-item-7887']//ul//li//a[text()='New Arrivals']") public WebElement NewArrivals;
	@FindBy(xpath="//div[@class='whb-flex-row whb-header-bottom-inner']//ul//li[@id='menu-item-7887']//ul//li//a[text()='Collections']") public WebElement Collections ;
	@FindBy(xpath="//div[@class='vc_row wpb_row vc_row-fluid vc_custom_1591793172822']//h3[@class='wd-entities-title']//a[contains(text(),'1 oz Gold A')]") public WebElement homepageproduct;
	@FindBy(xpath="//td[@class='product-name']") public WebElement Shoppingcartproduct;
	@FindBy(xpath="//li[@class='step-cart step-active']") public WebElement Shoppingcart;
	@FindBy(xpath="//li[@class='step-checkout step-active']") public WebElement checkout;
	@FindBy(xpath="//input[@id='terms']") WebElement checkbox;
	@FindBy(xpath="//button[text()='Place order']") WebElement plceordrbtn;
	@FindBy(xpath="//*[@id='customer_details']/div[1]/div/div[2]") WebElement addressvalidationmsg;
	
	@FindBy(xpath="//header//div//span[@class='wd-tools-icon wd-icon-alt']") public WebElement Shoppingcartbutton;
	@FindBy(xpath="//input[@class='minus']") public WebElement minus;
	@FindBy(xpath="//input[@name='quantity']") public WebElement value;
	@FindBy(xpath="//a[@class='cart-item-image']") public WebElement Shoppingcartimage;
	@FindBy(xpath="//p[@class='woocommerce-mini-cart__empty-message empty title']") public WebElement Shoppingcartbuttonmsg;
	@FindBy(xpath="//a[@class='btn btn-size-small btn-color-primary wc-backward']") public WebElement returntoshop;
	@FindBy(xpath="//h3[@class='wd-entities-title']//a[contains(text(),'1 oz Gold A')]") public WebElement newarrivalsproduct;
	@FindBy(xpath="//li[@class='wd_additional_tab_tab']//a") public WebElement ShoppingandDelivery;
	@FindBy(xpath="//li[@class='wd_additional_tab_tab active']//a") public WebElement ShoppingandDelivery2;

	@FindBy(xpath="//div[@class='whb-flex-row whb-header-bottom-inner']//div[@class='wd-button-wrapper text-left']") public WebElement TrackOrder;
	@FindBy(xpath="//input[@id='orderid']") public WebElement Orderid;
	@FindBy(xpath="//input[@id='order_email']") public WebElement Orderemail;
	@FindBy(xpath="//button[@name='track']") public WebElement Track;
	@FindBy(xpath="//div[@class='responsive-table']//tr[4]//td") public WebElement PaymentType;

	@FindBy(xpath="//h4[@class='rs-layer']") public List<WebElement> DynamicPname;
	@FindBy(xpath="//a[@class='rs-layer rev-btn rs-waction rs-wclickaction']") public List<WebElement> DynamicShopnow;
	@FindBy(xpath="//a[@id='slider-3-slide-7-layer-5']") public WebElement SilverShopnow;
	@FindBy(xpath="//a[@id='slider-3-slide-109-layer-5']") public WebElement platiniumShopnow;
	@FindBy(xpath="//a[@id='slider-3-slide-6-layer-5']") public WebElement goldShopnow;
	@FindBy(xpath="//rs-arrow[@class='tp-rightarrow tparrows custom noSwipe']") public WebElement rightarrow;
	@FindBy(xpath="//rs-arrow[@class='tp-leftarrow tparrows custom noSwipe']") public WebElement leftarrow;


	@FindBy(xpath="//article//div//div[5]//div[1]//div//div//div//div//div[2]//div//div[3]//div//a") public WebElement StsticShopnow1;
	@FindBy(xpath="//article//div//div[5]//div[2]//div//div//div//div//div[2]//div//div[3]//div//a") public WebElement StsticShopnow2;
	
	//Track and order details
		@FindBy(xpath="//a[text()='Track an Order']") WebElement track;
		
		
		@FindBy(xpath="//input[@id=\"orderid\"]") WebElement orderid;
		
		
		@FindBy(xpath="//input[@id=\"order_email\"]") WebElement ordmai;
		
		@FindBy(xpath="//button[text()='Track']") WebElement Track2;
		
		@FindBy(xpath="//h4[text()='ORDER TRACKING']")
		WebElement tex;
		@FindBy(xpath="//ul[@class=\"woocommerce-error\"]")
		WebElement error;
		@FindBy(xpath = "//h2[text()=\"Order details\"]")
		WebElement mark;
		@FindBy(xpath="//a[text()='CONTACT OUR COMPANY']")
		WebElement contactou;
		@FindBy(xpath="/html/body/div[1]/header/div[1]/div[2]/div/div/div[1]/div/a/img") WebElement logoo;
		

		@FindBy(xpath="/html/body/div[1]/header/div[1]/div[2]/div/div/div[1]/div/a/img") WebElement logo2;
	
		//footer objects
		@FindBy(xpath="/html/body/div[1]/footer/div[1]/aside/div/div[1]/div[1]/div/div/ul/li/ul/li[1]/a") WebElement foot;
		
		@FindBy(xpath="//a[@title=\"FAQs\"]") WebElement faqs;
		
		@FindBy(xpath="//a[@title=\"Privacy Policy\"]") WebElement privacyp;
		
		@FindBy(xpath="/html/body/div[1]/footer/div[1]/aside/div/div[1]/div[1]/div/div/ul/li/ul/li[4]/a") WebElement sales;
		
		@FindBy(xpath="/html/body/div[1]/footer/div[1]/aside/div/div[1]/div[1]/div/div/ul/li/ul/li[5]") WebElement shipp;
		 
		@FindBy(xpath="/html/body/div[1]/footer/div[1]/aside/div/div[1]/div[1]/div/div/ul/li/ul/li[6]") WebElement  paymen;
		
		@FindBy(xpath="/html/body/div[1]/footer/div[1]/aside/div/div[1]/div[1]/div/div/ul/li/ul/li[7]") WebElement Return;
		
		@FindBy(xpath="//a[@title=\"Terms and Conditions\"]") WebElement conditions;
		
		@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/h1") WebElement pp;
		
		@FindBy(xpath="/html/body/div[1]/footer/div[1]/aside/div/div[1]/div[2]/div/div/ul/li/ul/li[1]/a") WebElement myaccount;
		
		@FindBy(xpath="/html/body/div[1]/footer/div[1]/aside/div/div[1]/div[2]/div/div/ul/li/ul/li[2]/a") WebElement order;
		
		@FindBy(xpath="/html/body/div[1]/footer/div[1]/aside/div/div[1]/div[2]/div/div/ul/li/ul/li[3]/a") WebElement price;
		
		@FindBy(xpath="/html/body/div[1]/footer/div[1]/aside/div/div[1]/div[3]/div/div/ul/li/ul/li[1]/a") WebElement aboutox;
		
		@FindBy(xpath="/html/body/div[1]/footer/div[1]/aside/div/div[1]/div[3]/div/div/ul/li/ul/li[2]/a") WebElement Blog;
		 
		@FindBy(xpath="/html/body/div[1]/footer/div[1]/aside/div/div[1]/div[3]/div/div/ul/li/ul/li[3]/a") WebElement products;
		
		@FindBy(xpath="/html/body/div[1]/footer/div[1]/aside/div/div[1]/div[4]/div/div/ul/li/ul/li[1]/a") WebElement blog;
		
		@FindBy(xpath="/html/body/div[1]/footer/div[1]/aside/div/div[1]/div[4]/div/div/ul/li/ul/li[2]/a") WebElement guide;
		
		@FindBy(xpath="/html/body/div[1]/footer/div[1]/aside/div/div[1]/div[4]/div/div/ul/li/ul/li[3]/a") WebElement silver;
		
		@FindBy(xpath="/html/body/div[1]/footer/div[1]/aside/div/div[1]/div[4]/div/div/ul/li/ul/li[4]/a") WebElement gold;
		
		@FindBy(xpath="/html/body/div[1]/footer/div[1]/aside/div/div[1]/div[4]/div/div/ul/li/ul/li[5]/a") WebElement local;
		
		@FindBy(xpath="/html/body/div[1]/footer/div[1]/aside/div/div[1]/div[4]/div/div/ul/li/ul/li[6]/a") WebElement coin;
		
		@FindBy(xpath="/html/body/div[1]/footer/div[1]/aside/div/div[1]/div[4]/div/div/ul/li/ul/li[7]/a") WebElement salesTax;
		
}
