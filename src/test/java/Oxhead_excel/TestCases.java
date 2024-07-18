package Oxhead_excel;

import java.io.IOException;

import org.testng.annotations.Test;


public class TestCases extends Baseclass {

	//tc 1-5
	@Test(dataProvider="Registrationdata",dataProviderClass = DataClass.class,priority=1)
	public void Customer_is_able_to_Register_with_valid_Email(String mail) throws Throwable	{
		test = extent.createTest("Customer_is_able_to_Register_with_valid_Email");
		Runner r=new Runner();
		r.create(mail);
	}

	//tc 6-18
	@Test(dataProvider="logindata",dataProviderClass = DataClass.class,priority=91)
	public void Customer_is_able_to_login_with_Valid_Username_and_ValidPassword(String username,String password) throws Throwable {
		test = extent.createTest("Customer_is_able_to_login_with_Valid_Username_and_ValidPassword");
		Runner r=new Runner();
		r.login(username,password);
	}

	//tc 19
	@Test(priority=3)
	public void Customer_is_able_to_login_with_google() throws Throwable	{
		test = extent.createTest("Customer_is_able_to_login_with_google");
		Runner r=new Runner();
		r.loginwithGoogle();

	}

	//tc 20
	@Test(priority=4)
	public void Customer_is_able_to_login_with_Facebook() throws Throwable {
		test = extent.createTest("Customer_is_able_to_login_with_Facebook");
		Runner r=new Runner();
		r.loginwithFacebook();
	}

	//tc23
	@Test(priority = 5)
	public void click_On_Remeber_Me_CheckBox() throws InterruptedException, IOException {
		test = extent.createTest("click_On_Remeber_Me_CheckBox");
		Runner r=new Runner();
		r.clickOnRemeberMeCheckBox();
	}
	
	//tc24
	@Test(priority = 6)
	public void click_On_Lost_Your_Password_Link() throws InterruptedException, IOException {
		test = extent.createTest("click_On_Lost_Your_Password_Link");
		Runner r=new Runner();
		r.clickOnLostYourPasswordLink();
	}
	
	//tc 25,26
	@Test (enabled = false)
	public void password_Has_Been_Reset_Successfully_Message() throws InterruptedException, IOException {
		test = extent.createTest("password_Has_Been_Reset_Successfully_Message");
		Runner r=new Runner();
		r.passwordReset(DataClass.data("exceldata",1,2),DataClass.data("exceldata",1,2));
	}
	
	//tc 27
	@Test (enabled = false)
	public void password_Does_Not_Match_Message() throws InterruptedException, IOException {
		test = extent.createTest("password_Does_Not_Match_Message");
		Runner r=new Runner();
		r.passwordReset(DataClass.data("exceldata",1,2),DataClass.data("exceldata",2,2));
	}
	
	//tc 28
	@Test (enabled = false) 
	public void please_Enter_Your_Password_Message() throws InterruptedException, IOException {
		test = extent.createTest("please_Enter_Your_Password_Message");
		Runner r=new Runner();
		r.passwordReset(DataClass.data("exceldata",3,2),DataClass.data("exceldata",3,2));
	}
	
	//tc 29
	@Test (enabled = false)
	public void password_DoesNot_Match_Message() throws InterruptedException, IOException {
		test = extent.createTest("password_DoesNot_Match_Message");
		Runner r=new Runner();
		r.passwordReset(DataClass.data("exceldata",1,2),DataClass.data("exceldata",3,2));
	}
	
	//tc 30
	@Test(priority = 7)
	public void click_On_Create_An_Account_Link() throws InterruptedException {
		test = extent.createTest("click_On_Create_An_Account_Link");
		Runner r=new Runner();
		r.clicknOnCreateAnAccountLink();
	}
	
	//tc 31
	@Test(priority = 8)
	public void click_On_Cross_Mark_Button () throws InterruptedException {
		test = extent.createTest("click_On_Cross_Mark_Button");
		Runner r=new Runner();
		r.clickOnCrossMarkButton();
	}
	
	//tc 32
	@Test(priority = 9)
	public void click_On_Close_Button() throws InterruptedException {
		test = extent.createTest("click_On_Close_Button");
		Runner r=new Runner();
		r.clickOnCloseButton();
	}
	
	//tc 33
	@Test(priority = 10)
	public void Customer_Ablet_To_Do_SignUp_With_Valid_Email_Address() throws InterruptedException, IOException {
		test = extent.createTest("Customer_Ablet_To_Do_SignUp_With_Valid_Email_Address");
		Runner r=new Runner();
		r.CustomerAbletToDoSignUpWithValidEmailAddress();
	}

	//tc 34
	@Test(priority = 11)
	public void Customer_should_be_able_to_see_the_About_US_page() throws InterruptedException {
		test = extent.createTest("Customer_should_be_able_to_see_the_About_US_page");
		Header hdr=new Header();
		hdr.aboutuspage();  //36&37 TC are Responsive Testing,38 is a fixed Bug
	}

	//tc 35
	@Test(priority = 12)
	public void Customer_should_be_able_to_click_on_all_the_sociallinks() throws InterruptedException {
		test = extent.createTest("Customer_should_be_able_to_click_on_all_the_sociallinks");
		Header hdr=new Header();
		hdr.sociallinks();  
	}

	//ContactUSPage
	@Test(priority=13,dataProvider="getData",dataProviderClass=DataClass.class)
	public void Customer_is_able_to_fill_valid_details_and_able_to_see_Thanku_for_ur_message(String un,String ma,String ph,String company,String message) throws InterruptedException {
		test = extent.createTest("Customer_is_able_to_fill_valid_details_and_able_to_see_Thanku_for_ur_message");
		Header hdr=new Header();
		hdr.contact1(un,ma,ph,company,message);
	}

	@Test(priority=14,dataProvider="getData2",dataProviderClass=DataClass.class) 
	public void Customer_is_able_to_fill_invalid_details_for_ContactUSPage_and_not_able_to_see_Thanku_for_ur_message(String un,String ma,String ph,String company,String message) throws InterruptedException {
		test = extent.createTest("Customer_is_able_to_fill_invalid_details_for_ContactUSPage_and_not_able_to_see_Thanku_for_ur_message");
		Header hdr=new Header();
		hdr.contact2(un, ma, ph, company, message);
	}

	@Test(priority=15,dataProvider="getData",dataProviderClass=DataClass.class) 
	public void valid_details_and_user_is_able_to_click_on_getaquote_link(String un,String ma,String ph,String company,String message) throws InterruptedException {
		test = extent.createTest("valid_details_and_user_is_able_to_click_on_getaquote_link");
		Header hdr=new Header();
		hdr.contact3(un, ma, ph, company, message);   //TC-49 is a fixed Bug
	}
	
	//tc65
	@Test(priority = 16)
	public void Customer_is_able_to_enter_products_in_the_Search_for_Products_text_box() throws InterruptedException, IOException {
		test = extent.createTest("Customer_is_able_to_enter_products_in_the_Search_for_Products_text_box");
		Header hdr=new Header();
		hdr.productsinthesearch();
	}

	//tc66
	@Test(priority = 17)
	public void Customer_is_able_to_see_No_products_were_found_matching_your_selection_message() throws InterruptedException, IOException {
		test = extent.createTest("Customer_is_able_to_see_No_products_were_found_matching_your_selection_message");
		Header hdr=new Header();
		hdr.Noproductsinthesearch();
	}
	
	//tc67
	@Test(priority = 18)
	public void select_Allproducts_option_in_the_select_category() throws InterruptedException, IOException{
		test = extent.createTest("select_Allproducts_option_in_the_select_category");
		Header hdr=new Header();
		hdr.selectcategory(DataClass.data("products",2,1));
	}
	
	//tc68
	@Test(priority = 19)
	public void select_Gold_option_in_the_select_category() throws InterruptedException, IOException{
		test = extent.createTest("select_Gold_option_in_the_select_category");
		Header hdr=new Header();
		hdr.selectcategory(DataClass.data("products",3,0));
	}
	
	//tc69
	@Test(priority = 20)
	public void  select_Membership_option_in_the_select_category() throws InterruptedException, IOException{
		test = extent.createTest("select_Membership_option_in_the_select_category");
		Header hdr=new Header();
		hdr.selectcategory(DataClass.data("products",4,0));
	}
	
	//tc70
	@Test(priority = 21)
	public void select_Palladium_option_in_the_select_category() throws InterruptedException, IOException{
		test = extent.createTest("select_Palladium_option_in_the_select_category");
		Header hdr=new Header();
		hdr.selectcategory(DataClass.data("products",5,0));
	}
	
	//tc71
	@Test(priority = 22)
	public void select_Platinum_option_in_the_select_category() throws InterruptedException, IOException{
		test = extent.createTest("select_Platinum_option_in_the_select_category");
		Header hdr=new Header();
		hdr.selectcategory(DataClass.data("products",6,0));
	}
	
	//tc72
	@Test(priority = 23)
	public void select_Silver_option_in_the_select_category() throws InterruptedException, IOException{
		test = extent.createTest("select_Silver_option_in_the_select_category");
		Header hdr=new Header();
		hdr.selectcategory(DataClass.data("products",7,0));
	}
	
	//tc73
	@Test(priority = 24)
	public void select_Blank_option_in_the_select_category() throws InterruptedException, IOException{
		test = extent.createTest("select_Blank_option_in_the_select_category");
		Header hdr=new Header();
		hdr.selectBlank(DataClass.data("products",8,0));
	}
	
	//tc75
	@Test(priority = 25)
	public void see_The_Bar_In_The_Palladium_Bullion() throws InterruptedException, IOException{
		test = extent.createTest("see_The_Bar_In_The_Palladium_Bullion");
		Header hdr=new Header();
		hdr.browserCategoryPalladiumBullion(DataClass.data("products",5,0));
	}
	
	//tc81 inprogerss

	//tc 87
	@Test(priority=26)
	public void Customer_is_able_to_select_the_product_and_Add_product_to_Cart() throws Throwable	{
		test = extent.createTest("Customer_is_able_to_select_the_product_and_Add_product_to_Cart");
		Header hdr=new Header();
		hdr.addtocart();
	}

	//tc 91
	@Test(priority=27)
	public void Customer_is_able_to_click_on_the_viewcart_button() throws Throwable	{
		test = extent.createTest("Customer_is_able_to_click_on_the_viewcart_button");
		Header hdr=new Header();
		hdr.viewcart();
	}

	//tc 92,93
	@Test(priority=28)
	public void Customer_is_able_to_click_on_update_cart_button() throws Throwable	{
		test = extent.createTest("Customer_is_able_to_click_on_update_cart_button");
		Header hdr=new Header();
		hdr.updatecart();
	}

	//tc 94
	@Test(priority=29)
	public void Customer_is_able_to_click_on_the_Proceed_to_Checkout_button() throws Throwable	{
		test = extent.createTest("Customer_is_able_to_click_on_the_Proceed_to_Checkout_button");
		Header hdr=new Header();
		hdr.proceedtocheckout();
	}

	//tc 95
	@Test(priority=30)
	public void Customer_is_able_to_see_Wishlist_page() throws Throwable	{
		test = extent.createTest("Customer_is_able_to_see_Wishlist_page");
		Header hdr=new Header();
		hdr.wishlist1();
	}

	//tc 96
	@Test(priority=31)
	public void Customer_is_able_to_see_Wishlist_page2() throws Throwable {
		test = extent.createTest("Customer_is_able_to_see_Wishlist_page2");
		Header hdr=new Header();
		hdr.wishlist2();
	}

	//tc 97
	@Test(priority=32)
	public void Customer_should_be_able_to_see_any_category_shoul_not_be_there_in_the_wishlist_page() throws Throwable	{
		test = extent.createTest("Customer_should_be_able_to_see_any_category_shoul_not_be_there_in_the_wishlist_page");
		Header hdr=new Header();
		hdr.wishlist3();
	}

	//tc 98
	//		@Test(priority=11)
	//		public void Customer_should_be_able_to_see_any_category_should_be_there_in_the_wishlist_page() throws Throwable	{
	//			test = extent.createTest("Customer_is_able_to_click_on_the_Proceed_to_Checkout_button");
	//			Header hdr=new Header();
	//			hdr.wishlist4();
	//		}


	//tc 99
	@Test(priority=33)
	public void Customer_is_able_to_see_the_checkoutdetails_page() throws Throwable	{
		test = extent.createTest("Customer_is_able_to_see_the_checkoutdetails_page");
		Header hdr=new Header();
		hdr.checkout();
	}

	//tc 101
	@Test(dataProvider="Addressdata",dataProviderClass = DataClass.class,priority=34)
	public void Customer_is_able_to_see_Address_validated_option_with_valid_data(Object fname,Object lname,Object compny,Object sname,Object sname2,String town,Object ste,Object postcode,Object phoneno,Object mail) throws Throwable
	{
		test = extent.createTest("Customer_is_able_to_see_Address_validated_option_with_valid_data");
		Runner r=new Runner();
		r.address(fname, lname, compny, sname, sname2, town, ste, postcode, phoneno, mail);
	}

	//AddressBook Page
	@Test(priority=35,dataProvider="getData5",dataProviderClass=DataClass.class)
	public void user_is_able_to_fill_valid_details_in_Billingaddress_and_able_to_delete_the_billingaddress(String use,String passw,String ref,String fn,String ln,String com,String str,String st,String to,String code,String num,String em,String em2) throws InterruptedException, IOException { 
		test = extent.createTest("user_is_able_to_fill_valid_details_in_Billingaddress_and_able_to_delete_the_billingaddress");
		Runner r=new Runner();
		r.adressBook_Billing(use,passw,ref,fn,ln,com,str,st,to,code,num,em,em2);
	}

	@Test(priority=36,dependsOnMethods = "user_is_able_to_fill_valid_details_in_Billingaddress_and_able_to_delete_the_billingaddress",dataProvider="getData6",dataProviderClass=DataClass.class) 
	public void user_is_able_to_edit_the_billingaddress(String use,String passw,String num) throws InterruptedException, IOException {
		test = extent.createTest("user_is_able_to_edit_the_billingaddress");
		Runner r=new Runner();
		r.adressBook_Billing_2(use,passw,num);
	}
	
	@Test(priority=37,dataProvider="getData7",dataProviderClass=DataClass.class)  
	public void user_is_able_to_fill_valid_details_in_shippingaddress_and_able_to_delete_shippingaddress_details(String use,String passw,String ref,String fn,String ln,String com,String str,String st,String to,String sta,String code,String num,String up) throws InterruptedException, Throwable { //these pages are in under development so i am not able to automate
		test = extent.createTest("user_is_able_to_fill_valid_details_in_shippingaddress_and_able_to_delete_shippingaddress_details");
		Runner r=new Runner();
		r.adressBook_Shippingadress(use,passw,ref,fn,ln,com,str,st,to,sta,code,num,up);
	}
	
	//tc 132
	@Test(priority = 38)
	public void Customer_is_able_to_do_the_payment_method_process() throws InterruptedException, IOException{
		test = extent.createTest("Customer_is_able_to_do_the_payment_method_process");
		Runner r=new Runner();
		r.paymentMethod();
	}	
	//tc 133-136-------
	//tc137
	@Test(priority = 39)
	public void customer_Is_Able_To_See_The_OrderDetails() throws InterruptedException, IOException{
		test = extent.createTest("customer_Is_Able_To_See_The_OrderDetails");
		Runner r=new Runner();
		r.orderDetails();
	}
	
	//tc139
	@Test(priority = 40)
	public void Customer_Is_Able_To_Do_Logout() throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_Do_Logout");
		Runner r=new Runner();
		r.dashBoardlogout();
	}
	
	//tc140
	@Test(priority = 41)
	public void Customer_Is_Able_To_Logout_From_The_Application() throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_Logout_From_The_Application");
		Runner r=new Runner();
		r.myAccountlogout();
	}
	

	@Test(priority=42,dataProvider="getData8",dataProviderClass=DataClass.class) 
	public void verify_with_valid_orderid_and_billingmail_and_able_to_see_contactus_page_and_fill_with_valid_details(String id,String ma,String nam,String mal,String ph,String co,String mes) throws InterruptedException, IOException {
		test = extent.createTest("verify_with_valid_orderid_and_billingmail_and_able_to_see_contactus_page_and_fill_with_valid_details");
		Runner r=new Runner();
		r.order(id,ma,nam,mal,ph,co,mes);
	}

	@Test(priority=43,dataProvider="getData9",dataProviderClass=DataClass.class) 
	public void verify_with_invalid_orderid_and_valid_billing_mail(String id,String ma) throws InterruptedException, IOException {
		test = extent.createTest("verify_with_invalid_orderid_and_valid_billing_mail");
		Runner r=new Runner();
		r.order2(id,ma);
	}

	@Test(priority=44,dataProvider="getData10",dataProviderClass=DataClass.class)  
	public void verify_with_valid_order_id_and_billing_mail_and_able_to_see_contactuspage_and_fill_with_invalid_name_and_remaining_all_are_valid(String id,String ma,String nam,String mal,String ph,String co,String mes) throws InterruptedException, IOException {
		test = extent.createTest("verify_with_valid_order_id_and_billing_mail_and_able_to_see_contactuspage_and_fill_with_invalid_name_and_remaining_all_are_valid");
		Runner r=new Runner();
		r.order1(id,ma,nam,mal,ph,co,mes);
	}
	
	@Test(priority=45) 
	public void verify_customer_is_able_to_see_trackanorder_logo_and_oxheadlogo_same_or_not() throws InterruptedException, IOException {
		test = extent.createTest("verify_customer_is_able_to_see_trackanorder_logo_and_oxheadlogo_same_or_not");
		Runner r=new Runner();
		r.logo();
	}
	
	// 158TC is closed bug
	//159TC is in Responsive Testing
	
	//tc160
	@Test(priority = 46)
	public void Customer_Is_Able_To_See_The_AllProducts_On_Browse_Catagories () throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_See_The_AllProducts_On_Browse_Catagories");
		Header hdr=new Header();
		hdr.browserCategory(DataClass.data("products",2,0));
	}
	
	//tc161
	@Test(priority = 47)
	public void Customer_Is_Able_To_See_The_Gold_On_Browse_Catagories () throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_See_The_Gold_On_Browse_Catagories");
		Header hdr=new Header();
		hdr.browserCategory(DataClass.data("products",3,0));
	}
	
	//tc162
	@Test(priority = 48)
	public void Customer_Is_Able_To_See_The_Palladium_On_Browse_Catagories () throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_See_The_Palladium_On_Browse_Catagories");
		Header hdr=new Header();
		hdr.browserCategory(DataClass.data("products",5,0));
	}
	
	//tc163
	@Test(priority = 49)
	public void Customer_Is_Able_To_See_The_Platinum_On_Browse_Catagories () throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_See_The_Platinum_On_Browse_Catagories");
		Header hdr=new Header();
		hdr.browserCategory(DataClass.data("products",6,0));
	}
	
	//tc164
	@Test(priority = 50)
	public void Customer_Is_Able_To_See_The_Silver_On_Browse_Catagories () throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_See_The_Silver_On_Browse_Catagories");
		Header hdr=new Header();
		hdr.browserCategory(DataClass.data("products",7,0));
	}
	
	//tc166
	@Test(priority = 51)
	public void customer_Is_Able_To_See_The_HomePage () throws InterruptedException, IOException{
		test = extent.createTest("customer_Is_Able_To_See_The_HomePage");
		Header hdr=new Header();
		hdr.Home();
	}
	
	//tc168
	@Test(priority = 52)
	public void Customer_is_able_to_see_the_sticky_header_is_fixed_at_that_place_it_is_comingdown () throws InterruptedException, IOException{
		test = extent.createTest("Customer_is_able_to_see_the_sticky_header_is_fixed_at_that_place_it_is_comingdown");
		Header hdr=new Header();
		hdr.Homestikiheader(DataClass.data("xy_axis",1,0),DataClass.data("xy_axis",1,1));
	}
	
	//tc169
	@Test(priority = 53)
	public void Customer_Is_Able_To_See_The_NewArrivals_Page () throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_See_The_NewArrivals_Page");
		Header hdr=new Header();
		hdr.NewArrivalsPage();
	}
	//170-----
	//tc171-Not Working

	//tc 173.
	@Test(dataProvider="ValidAddress",dataProviderClass = DataClass.class,priority=54)
	public void Customer_is_able_to_see_the_Silverbars(Object fname,Object lname,Object compny,Object sname,Object sname2,Object town,Object ste,Object postcode,Object phoneno,Object mail) throws Throwable
	{
		test = extent.createTest("Customer_is_able_to_see_the_Silverbars");
		Header hdr=new Header();
		hdr.silverbars(fname, lname, compny, sname, sname2, town, ste, postcode, phoneno, mail);
	}

	//tc 174
	@Test(priority=55)
	public void Customer_is_able_to_see_the_silver_bulletts() throws Throwable	{
		test = extent.createTest("Customer_is_able_to_see_the_silver_bulletts");
		Header hdr=new Header();
		hdr.silverbullets();
	}

	//tc 175.
	@Test(dataProvider="ValidAddress",dataProviderClass = DataClass.class,priority=56)
	public void Customer_is_able_to_see_the_silver_coins(Object fname,Object lname,Object compny,Object sname,Object sname2,Object town,Object ste,Object postcode,Object phoneno,Object mail) throws Throwable
	{
		test = extent.createTest("Customer_is_able_to_see_the_silver_coins");
		Header hdr=new Header();
		hdr.silvercoins(fname, lname, compny, sname, sname2, town, ste, postcode, phoneno, mail);
	}

	//tc 183
	@Test(priority=57)
	public void Customer_is_able_to_see_the_goldcoins() throws Throwable	{
		test = extent.createTest("Customer_is_able_to_see_the_goldcoins");
		Header hdr=new Header();
		hdr.goldcoins();
	}

	//tc 186 187
	@Test(dataProvider="ValidAddress",dataProviderClass = DataClass.class,priority=58)
	public void Customer_is_able_to_see_the_goldbars(Object fname,Object lname,Object compny,Object sname,Object sname2,Object town,Object ste,Object postcode,Object phoneno,Object mails) throws Throwable
	{
		test = extent.createTest("Customer_is_able_to_see_the_goldbars");
		Header hdr=new Header();
		hdr.goldbars(fname, lname, compny, sname, sname2, town, ste, postcode, phoneno, mail);
	}


	//tc 188
	@Test(priority=59)
	public void Customer_is_able_to_see_the_usgold() throws Throwable
	{
		test = extent.createTest("Customer_is_able_to_see_the_usgold");
		Header hdr=new Header();
		hdr.usgold();
	}

	//tc 189
	@Test(priority=60)
	public void Customer_is_able_to_see_the_canadiangold() throws Throwable
	{
		test = extent.createTest("Customer_is_able_to_see_the_canadiangold");
		Header hdr=new Header();
		hdr.canadiangold();
	}

	//tc 190
	@Test(priority=61)
	public void Customer_is_able_to_see_the_Austraiangold() throws Throwable
	{
		test = extent.createTest("Customer_is_able_to_see_the_Austraiangold");
		Header hdr=new Header();
		hdr.Australiangold();
	}

	//tc 194
	@Test(dataProvider="ValidAddress",dataProviderClass = DataClass.class,priority=62)
	public void Customer_is_able_to_see_the_Platinum_in_Other(Object fname,Object lname,Object compny,Object sname,Object sname2,Object town,Object ste,Object postcode,Object phoneno,Object mail) throws Throwable
	{
		test = extent.createTest("Customer_is_able_to_see_the_Platinum_in_Other");
		Header hdr=new Header();
		hdr.platinum(fname, lname, compny, sname, sname2, town, ste, postcode, phoneno, mail);
	}

	//tc 196
	@Test(priority=63)
	public void Customer_is_able_to_see_the_coins_supplies_page_in_Other() throws Throwable
	{
		test = extent.createTest("Customer_is_able_to_see_the_coins_supplies_page_in_Other");
		Header hdr=new Header();
		hdr.coinsupply();
	}

	//tc 197
	@Test(priority=64)
	public void Customer_is_able_to_see_the_oxhead_merch_in_Other() throws Throwable
	{
		test = extent.createTest("Customer_is_able_to_see_the_oxhead_merch_in_Other");
		Header hdr=new Header();
		hdr.oxheadmerch();
	}

	//tc210
	@Test(priority = 65)
	public void Customer_Is_Not_Able_To_See_Product_In_ShoppingCart_Page () throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Not_Able_To_See_Product_In_ShoppingCart_Page");
		Header hdr=new Header();
		hdr.NotAbleToSeeProductInShoppingCartPage();
	}
	
	//tc211
	@Test(priority = 66)
	public void Customer_Is_Able_To_See_Product_In_ShoppingCart_Page_From_NewArrivals_page () throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_See_Product_In_ShoppingCart_Page_From_NewArrivals_page");
		Header hdr=new Header();
		hdr.seeProductInShoppingCartPage();
	}

	//tc209
	@Test(priority = 67)
	public void Customer_Is_Able_To_See_Product_In_ShoppingCart_Page () throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_See_Product_In_ShoppingCart_Page");
		Header hdr=new Header();
		hdr.shoppingCartpage();
	}

	//tc219
	@Test(priority = 68)
	public void Customer_Is_Able_To_See_Shipping_And_Delivery_Page() throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_See_Shipping_And_Delivery_Page");
		Header hdr=new Header();
		hdr.seeShippingAndDeliveryPage(DataClass.data("products",3,0),DataClass.data("xy_axis",2,0),DataClass.data("xy_axis",2,1));
	}
	
	//tc220
	@Test(priority = 69)
	public void Customer_Is_able_To_Track_The_Cash_On_Delivery() throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_able_To_Track_The_Cash_On_Delivery");
		Header hdr=new Header();
		hdr.ableToTrackTheCashOnDelivery(DataClass.data("order",1,0),DataClass.data("exceldata",1,0),DataClass.data("xy_axis",2,0),DataClass.data("xy_axis",2,1));
	}
	
	//FooterSection
		@Test(priority=70,dataProvider="getData11",dataProviderClass=DataClass.class) 
		public void verify_customer_is_able_to_click_on_contactuspage_link_footersection_and_verify_able_to_redirect_contactuspage_Click_on_FAQlink_in_footersection_and_able_to_redirect_FAQpage_and_click_on_Contactlink_and_able_to_see_contactusPagelink(String na,String ma,String ph,String co,String me) throws InterruptedException, IOException { 
			test = extent.createTest("verify_customer_is_able_to_click_on_contactuspage_link_footersection");
			Runner r=new Runner();
			r.footer(na,ma,ph,co,me);
		}

		//FAQ Page 
		@Test(priority=71,dataProvider="getData3",dataProviderClass=DataClass.class)
		public void verify_user_is_able_click_on_FAQ_button_and_able_to_see_contactUSPage_and_verify_with_invalid_name_remaining_all_are_valid(String user,String pass,String uname,String mails,String phn,String comp,String msg) throws InterruptedException, IOException {
			test = extent.createTest("verify_user_is_able_click_on_FAQ_button_and_able_to_see_contactUSPage_and_verify_with_invalid_name_remaining_all_are_validk");
			Header hdr=new Header();
			hdr.FAQs(user,pass,uname,mails,phn,comp,msg);
		}
		
		@Test(priority=72,dataProvider="getData4",dataProviderClass=DataClass.class)
		public void verify_user_is_able_to_see_contactUSPage_and_verify_with_invalid_details(String uname,String mails,String phn,String comp,String msg) throws InterruptedException, IOException {
			test = extent.createTest("verify_user_is_able_to_see_contactUSPage_and_verify_with_invalid_details");
			Header hdr=new Header();
			hdr.FAQs2(uname,mails,phn,comp,msg);
		}

		@Test(priority=73)
		public void verify_user_is_able_to_see_PrivacyPolicyPage_and_Termsandconditions_page() throws InterruptedException, IOException {
			test = extent.createTest("verify_user_is_able_to_see_PrivacyPolicyPage_and_Termsandconditions_page");
			Header hdr=new Header();
			hdr.FAQs3();
		} 
		
		@Test(priority=74) 
		public void Customer_is_able_to_Redirect_to_PrivacyPolicypage_and_Customer_is_able_to_redirect_to_Salestaxpage() throws InterruptedException, IOException {
			test = extent.createTest("Customer_is_able_to_Redirect_to_PrivacyPolicypage_and_Customer_is_able_to_redirect_to_Salestaxpage");
			Runner r=new Runner();
			r.privacy();
		}
		
		@Test(priority=75) 
		public void  redirect_to_Shippingdeliverypage_redirect_to_PaymentpolicyPage_Returnpolicypage_Redirect_to_TermsandConditionspage() throws InterruptedException, IOException { 
			test = extent.createTest("redirect_to_Shippingdeliverypage_redirect_to_PaymentpolicyPage_Returnpolicypage_Redirect_to_TermsandConditionspage");
			Runner r=new Runner();
			r.shipp();
		}
		
		@Test(priority=76) 
		public void Redirect_to_the_Account_login_page_and_Trackanorderpage_pricealertspage_Aboutoxheadpage_oxheadblogpage_oxheadproductspage() throws InterruptedException, IOException { 
			test = extent.createTest("user_is_able_to_fill_valid_details_in_shippingaddress_and_able_to_delete_shippingaddress_details");
			Runner r=new Runner();
			r.account();
		}
		
		@Test(priority=77)   
		public void Customer_is_able_to_Redirect_to_the_Blogpage_Customer_is_able_to_Redirect_to_the_invest_in_guidepage_Customer_is_able_to_Redirect_to_the_Silverpricespage_goldpricespage_LocalDirectorypage_Coinvaluespage_Salestaxpage_Custumer_is_able_to_click_on_links_when_cursor_is_placed_on_the_words_itis_able_to_click_on_linkns_cursor_is_placed_outside() throws InterruptedException, IOException {  
			test = extent.createTest("user_is_able_to_fill_valid_details_in_shippingaddress_and_able_to_delete_shippingaddress_details");
			Runner r=new Runner();
			r.Blog();
		}
	
	//tc243
	@Test(priority = 78)
	public void customer_Is_clicking_On_The_Shop_Now_Button_It_Has_To_Redirect_To_That_Particular_Page() throws InterruptedException, IOException{
		test = extent.createTest("customer_Is_clicking_On_The_Shop_Now_Button_It_Has_To_Redirect_To_That_Particular_Page");
		Runner r=new Runner();
		r.clickingOnTheShopNowButtonItHasToRedirectToThatParticularPage();
	}
	
	//tc244
	@Test(priority = 79)
	public void Customer_Is_Able_To_click_On_The_Shop_Now_Button_It_Has_To_Redirect_To_That_Particular_Page() throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_click_On_The_Shop_Now_Button_It_Has_To_Redirect_To_That_Particular_Page");
		Runner r=new Runner();
		r.clickOnTheShopNowButtonItHasToRedirectToThatParticularPage(DataClass.data("xy_axis",3,0), DataClass.data("xy_axis",3,1));
	}	
	
}
