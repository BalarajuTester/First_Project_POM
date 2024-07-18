package Oxhead_property;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestCases extends Baseclass {
	//tc23
	@Test(priority = 1)
	public void click_On_Remeber_Me_CheckBox() throws InterruptedException, IOException {
		test = extent.createTest("click_On_Remeber_Me_CheckBox");
		Runner r=new Runner(dr);
		r.clickOnRemeberMeCheckBox();
	}
	//tc24
	@Test(priority = 2)
	public void click_On_Lost_Your_Password_Link() throws InterruptedException, IOException {
		test = extent.createTest("click_On_Lost_Your_Password_Link");
		Runner r=new Runner(dr);
		r.clickOnLostYourPasswordLink();
	}
	//tc 25,26
	@Test (enabled = false)
	public void password_Has_Been_Reset_Successfully_Message() throws InterruptedException, IOException {
		test = extent.createTest("password_Has_Been_Reset_Successfully_Message");
		Runner r=new Runner(dr);
		r.passwordReset(r.properties("New_Password1"),r.properties("New_Password1"));
	}
	//tc 27
	@Test (enabled = false)
	public void password_Does_Not_Match_Message() throws InterruptedException, IOException {
		test = extent.createTest("password_Does_Not_Match_Message");
		Runner r=new Runner(dr);
		r.passwordReset(r.properties("New_Password1"),r.properties("New_Password2"));
	}
	//tc 28
	@Test (enabled = false) 
	public void please_Enter_Your_Password_Message() throws InterruptedException, IOException {
		test = extent.createTest("please_Enter_Your_Password_Message");
		Runner r=new Runner(dr);
		r.passwordReset(r.properties("New_Password3"),r.properties("New_Password3"));

	}
	//tc 29
	@Test (enabled = false)
	public void password_DoesNot_Match_Message() throws InterruptedException, IOException {
		test = extent.createTest("password_DoesNot_Match_Message");
		Runner r=new Runner(dr);
		r.passwordReset(r.properties("New_Password1"),r.properties("New_Password3"));
	}
	//tc 30
	@Test(priority = 7)
	public void click_On_Create_An_Account_Link() throws InterruptedException {
		test = extent.createTest("click_On_Create_An_Account_Link");
		Runner r=new Runner(dr);
		r.clicknOnCreateAnAccountLink();
	}
	//tc 31
	@Test(priority = 8)
	public void click_On_Cross_Mark_Button () throws InterruptedException {
		test = extent.createTest("click_On_Cross_Mark_Button");
		Runner r=new Runner(dr);
		r.clickOnCrossMarkButton();
	}
	//tc 32
	@Test(priority = 9)
	public void click_On_Close_Button() throws InterruptedException {
		test = extent.createTest("click_On_Close_Button");
		Runner r=new Runner(dr);
		r.clickOnCloseButton();
	}
	//tc 33
	@Test(priority = 10)
	public void Customer_Ablet_To_Do_SignUp_With_Valid_Email_Address() throws InterruptedException, IOException {
		test = extent.createTest("Customer_Ablet_To_Do_SignUp_With_Valid_Email_Address");
		Runner r=new Runner(dr);
		r.CustomerAbletToDoSignUpWithValidEmailAddress();
	}
	//tc65
	@Test(priority = 11)
	public void Customer_is_able_to_enter_products_in_the_Search_for_Products_text_box() throws InterruptedException, IOException {
		test = extent.createTest("Customer_is_able_to_enter_products_in_the_Search_for_Products_text_box");
		Runner r=new Runner(dr);
		r.productsinthesearch(r.properties("Gold"));
	}
	//tc66
	@Test(priority = 12)
	public void Customer_is_able_to_see_No_products_were_found_matching_your_selection_message() throws InterruptedException, IOException {
		test = extent.createTest("Customer_is_able_to_see_No_products_were_found_matching_your_selection_message");
		Runner r=new Runner(dr);
		r.productsinthesearch(r.properties("Bat"));
	}
	//tc67
	@Test(priority = 13)
	public void select_Allproducts_option_in_the_select_category() throws InterruptedException, IOException{
		test = extent.createTest("select_Allproducts_option_in_the_select_category");
		Runner r=new Runner(dr);
		Header hdr=new Header(dr);
		hdr.selectcategory(r.properties("All-Products"));
	}
	//tc68
	@Test(priority = 14)
	public void select_Gold_option_in_the_select_category() throws IOException, InterruptedException{
		test = extent.createTest("select_Gold_option_in_the_select_category");
		Runner r=new Runner(dr);
		Header hdr=new Header(dr);
		hdr.selectcategory(r.properties("Gold"));
	}		
	//tc69
	@Test(priority = 15)
	public void  select_Membership_option_in_the_select_category() throws InterruptedException, IOException{
		test = extent.createTest("select_Membership_option_in_the_select_category");
		Runner r=new Runner(dr);
		Header hdr=new Header(dr);
		hdr.selectcategory(r.properties("Membership"));
	}	
	//tc70
	@Test(priority = 16)
	public void select_Palladium_option_in_the_select_category() throws InterruptedException, IOException{
		test = extent.createTest("select_Palladium_option_in_the_select_category");
		Runner r=new Runner(dr);
		Header hdr=new Header(dr);
		hdr.selectcategory(r.properties("Palladium"));
	}	
	//tc71
	@Test(priority = 17)
	public void select_Platinum_option_in_the_select_category() throws InterruptedException, IOException{
		test = extent.createTest("select_Platinum_option_in_the_select_category");
		Runner r=new Runner(dr);
		Header hdr=new Header(dr);
		hdr.selectcategory(r.properties("Platinum"));
	}	
	//tc72
	@Test(priority = 18)
	public void select_Silver_option_in_the_select_category() throws InterruptedException, IOException{
		test = extent.createTest("select_Silver_option_in_the_select_category");
		Runner r=new Runner(dr);
		Header hdr=new Header(dr);
		hdr.selectcategory(r.properties("Silver"));
	}	
	//tc73
	@Test(priority = 19)
	public void select_Blank_option_in_the_select_category() throws InterruptedException, IOException{
		test = extent.createTest("select_Blank_option_in_the_select_category");
		Runner r=new Runner(dr);
		Header hdr=new Header(dr);
		hdr.selectBlank(r.properties("Blank"));
	}	
	//tc75
	@Test(priority = 20)
	public void see_The_Bar_In_The_Palladium_Bullion() throws InterruptedException, IOException{
		test = extent.createTest("see_The_Bar_In_The_Palladium_Bullion");
		Runner r=new Runner(dr);
		Header hdr=new Header(dr);
		hdr.browserCategoryPalladiumBullion(r.properties("Palladium"));
	}	
	//tc81 inprogerss
	//tc 132
	@Test(priority = 21)
	public void Customer_is_able_to_do_the_payment_method_process() throws InterruptedException, IOException{
		test = extent.createTest("Customer_is_able_to_do_the_payment_method_process");
		Runner r=new Runner(dr);
		r.paymentMethod();
	}	
	//tc137
	@Test(priority = 22)
	public void customer_Is_Able_To_See_The_OrderDetails() throws InterruptedException, IOException{
		test = extent.createTest("customer_Is_Able_To_See_The_OrderDetails");
		Runner r=new Runner(dr);
		r.orderDetails();
	}
	//tc139
	@Test(priority = 23)
	public void Customer_Is_Able_To_Do_Logout() throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_Do_Logout");
		Runner r=new Runner(dr);
		r.dashBoardlogout();
	}
	//tc140
	@Test(priority = 24)
	public void Customer_Is_Able_To_Logout_From_The_Application() throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_Logout_From_The_Application");
		Runner r=new Runner(dr);
		r.myAccountlogout();
	}
	//tc160
	@Test(priority = 25)
	public void Customer_Is_Able_To_See_The_AllProducts_On_Browse_Catagories () throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_See_The_AllProducts_On_Browse_Catagories");
		Runner r=new Runner(dr);
		Header hdr=new Header(dr);
		hdr.browserCategory(r.properties("AllProducts"));
	}
	//tc161
	@Test(priority = 26)
	public void Customer_Is_Able_To_See_The_Gold_On_Browse_Catagories () throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_See_The_Gold_On_Browse_Catagories");
		Runner r=new Runner(dr);
		Header hdr=new Header(dr);
		hdr.browserCategory(r.properties("Gold"));
	}
	//tc162
	@Test(priority = 27)
	public void Customer_Is_Able_To_See_The_Palladium_On_Browse_Catagories () throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_See_The_Palladium_On_Browse_Catagories");
		Runner r=new Runner(dr);
		Header hdr=new Header(dr);
		hdr.browserCategory(r.properties("Palladium"));
	}
	//tc163
	@Test(priority = 28)
	public void Customer_Is_Able_To_See_The_Platinum_On_Browse_Catagories () throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_See_The_Platinum_On_Browse_Catagories");
		Runner r=new Runner(dr);
		Header hdr=new Header(dr);
		hdr.browserCategory(r.properties("Platinum"));
	}
	//tc164
	@Test(priority = 29)
	public void Customer_Is_Able_To_See_The_Silver_On_Browse_Catagories () throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_See_The_Silver_On_Browse_Catagories");
		Runner r=new Runner(dr);
		Header bc=new Header(dr);
		bc.browserCategory(r.properties("Silver"));
	}
	//tc166
	@Test(priority = 30)
	public void customer_Is_Able_To_See_The_HomePage () throws InterruptedException, IOException{
		test = extent.createTest("customer_Is_Able_To_See_The_HomePage");
		Header hdr=new Header(dr);
		hdr.Home();
	}
	//tc168
	@Test(priority = 31)
	public void Customer_is_able_to_see_the_sticky_header_is_fixed_at_that_place_it_is_comingdown () throws InterruptedException, IOException{
		test = extent.createTest("Customer_is_able_to_see_the_sticky_header_is_fixed_at_that_place_it_is_comingdown");
		Runner r=new Runner(dr);
		Header hdr=new Header(dr);
		hdr.Homestikiheader(r.properties("x_axis"),r.properties("y_axis1"));
	}
	//tc169
	@Test(priority = 32)
	public void Customer_Is_Able_To_See_The_NewArrivals_Page () throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_See_The_NewArrivals_Page");
		Header hdr=new Header(dr);
		hdr.NewArrivalsPage();
	}	
	//tc171-Not Working
	//tc210
	@Test(priority = 33)
	public void Customer_Is_Not_Able_To_See_Product_In_ShoppingCart_Page () throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Not_Able_To_See_Product_In_ShoppingCart_Page");
		Header hdr=new Header(dr);
		hdr.NotAbleToSeeProductInShoppingCartPage();
	}
	
	//tc211
	@Test(priority = 34)
	public void Customer_Is_Able_To_See_Product_In_ShoppingCart_Page_From_NewArrivals_page () throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_See_Product_In_ShoppingCart_Page_From_NewArrivals_page");
		Header hdr=new Header(dr);
		hdr.seeProductInShoppingCartPage();
	}
	
	//tc209
	@Test(priority = 35)
	public void Customer_Is_Able_To_See_Product_In_ShoppingCart_Page () throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_See_Product_In_ShoppingCart_Page");
		Header hdr=new Header(dr);
		hdr.shoppingCartpage();
	}
	//tc219
	@Test(priority = 36)
	public void Customer_Is_Able_To_See_Shipping_And_Delivery_Page() throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_See_Shipping_And_Delivery_Page");
		Runner r=new Runner(dr);
		Header hdr=new Header(dr);
		hdr.seeShippingAndDeliveryPage(r.properties("Gold"),r.properties("x_axis"),r.properties("y_axis2"));
	}
	//tc220
	@Test(priority = 37)
	public void Customer_Is_able_To_Track_The_Cash_On_Delivery() throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_able_To_Track_The_Cash_On_Delivery");
		Runner r=new Runner(dr);
		Header hdr=new Header(dr);
		hdr.ableToTrackTheCashOnDelivery(r.properties("ordernumber"),r.properties("username"),r.properties("x_axis"),r.properties("y_axis2"));
	}
	//tc243
	@Test(priority = 38)
	public void customer_Is_clicking_On_The_Shop_Now_Button_It_Has_To_Redirect_To_That_Particular_Page() throws InterruptedException, IOException{
		test = extent.createTest("customer_Is_clicking_On_The_Shop_Now_Button_It_Has_To_Redirect_To_That_Particular_Page");
		Runner r=new Runner(dr);
		r.clickingOnTheShopNowButtonItHasToRedirectToThatParticularPage();
	}
	//tc244
	@Test(priority = 39)
	public void Customer_Is_Able_To_click_On_The_Shop_Now_Button_It_Has_To_Redirect_To_That_Particular_Page() throws InterruptedException, IOException{
		test = extent.createTest("Customer_Is_Able_To_click_On_The_Shop_Now_Button_It_Has_To_Redirect_To_That_Particular_Page");
		Runner r=new Runner(dr);
		r.clickOnTheShopNowButtonItHasToRedirectToThatParticularPage(r.properties("x_axis"),r.properties("y_axis3"));
	}		
}
