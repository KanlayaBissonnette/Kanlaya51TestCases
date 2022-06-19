package Kanlaya_51TestCaseTests;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Kanlaya_51TestCasePages.HomePage;
import Kanlaya_51TestCasePages.MyAccountPage;
import Kanlaya_51TestCasePages.ShopPage;
import Kanlaya_51TestCaseUtilities.Base;

public class ShopTests {
	
	  ShopPage shopPage= new ShopPage();
	  HomePage homePage = new HomePage();
	  MyAccountPage accountPage = new MyAccountPage();

		@BeforeClass 
		public void setUp() {
			Base.getDriver();
		}
		
	   @BeforeMethod
	   public void beforeMethod() {
		  homePage.clickShopBtn();
	}
	
	   @Test(priority = 1)
	   public void ShopFilterByPriceFunctionality() {
		   shopPage.adjustPriceFilter();
		   shopPage.clickFilterBtn();
		   shopPage.verifyBookPrice150_450();
	}

	   @Test(priority = 2)
	   public void ShopProductCategoriesFunctionality() throws InterruptedException {
		   shopPage.clickSeleniumProduct();
		   shopPage.verifySeleniumHeaderText();
	}
	   
	   @Test(priority = 3)
	   public void ShopSortingByPopularityFunctionality() {
		   shopPage.clickSortingDropDown();
		   shopPage.verifySortByPopularity();
	  }
	   
	   @Test(priority = 4)
	   public void shopSortingByAverageRatingsFunctionality() {
		   shopPage.clickSortingDropDown();
		   shopPage.verifySortByAverageRatings();
	   }
	   
	   @Test(priority = 5)
	   public void shopSortingByNewnessFunctionality() {
		   shopPage.clickSortingDropDown();
		   shopPage.verifySortByNewness();
	   }
	
	   @Test(priority = 6)
	   public void shopSortingByLowToHighFunctionality() {
		   shopPage.clickSortingDropDown();
		   shopPage.verifySortByLowToHigh();
	   }

	   @Test(priority = 7)
	   public void shopSortingByHighToLowFunctionality() {
		   shopPage.clickSortingDropDown();
		   shopPage.verifySortByHighToLow();
	   }
	   
	   @Test(priority = 8)
	   public void ShopReadMoreFunctionality() { 
		  shopPage.readMoreSeleniumRuby();	   
	   }
	   
	   @Test(priority = 9)
	   public void ShopSaleFunctionality() {
		   shopPage.saleProductButton();
		   shopPage.verifySaleProduct();		   
	   }
	
	   @Test(priority = 10)
	   public void ShopAddtoBasketViewBasketFunctionality() throws InterruptedException {
		   shopPage.addToBasketButton();
		   shopPage.viewBasketButton();
		   shopPage.verifyCartItemsProduct();
		   shopPage.verifyCartTotal();
		   homePage.total();
		   homePage.subtotal();
		   homePage.verifyTotalAlwaysMoreThanSubTotal();
		   homePage.clickCheckoutBtn();
		   homePage.verifyCheckoutBillingDetails();
		   homePage.verifyCheckoutOrdersDetails();
		   homePage.verifyCheckoutAdditionalInfoDetails();
		   homePage.verifyPaymentGateway();
		   accountPage.verifyBillingAddressFunctionallity();
		   homePage.clickPlaceOderBtn();
		   homePage.verifyOrderReceived();
		   homePage.orderConfirmation();

	   }
	   
	   @Test(priority = 11)
	   public void ShopAddtoBasketViewBasketthroughItemlink() throws InterruptedException {
		   shopPage.addToBasketButton();
		   shopPage.viewBasketButton();
		   shopPage.verifyCartItemsProduct();
		   shopPage.verifyCartTotal();
		   homePage.total();
		   homePage.subtotal();
		   homePage.verifyTotalAlwaysMoreThanSubTotal();
		   homePage.clickCheckoutBtn();
		   homePage.verifyCheckoutBillingDetails();
		   homePage.verifyCheckoutOrdersDetails();
		   homePage.verifyCheckoutAdditionalInfoDetails();
		   homePage.verifyPaymentGateway();
		   accountPage.verifyBillingAddressFunctionallity();
		   homePage.clickPlaceOderBtn();
		   homePage.verifyOrderReceived();
		   homePage.orderConfirmation();
	   }
	   
	   @Test(priority = 12)
	   public void ShopAddtoBasketViewBasketTaxFunctionality() throws InterruptedException{
		   shopPage.addToBasketButton();
		   shopPage.viewBasketButton();
		   shopPage.verifyCartItemsProduct();
		   shopPage.verifyCartTotal();
		   homePage.total();
		   homePage.subtotal();
		   homePage.verifyTotalAlwaysMoreThanSubTotal();
		   homePage.clickCheckoutBtn();
		   homePage.verifyCheckoutBillingDetails();
		   homePage.verifyCheckoutOrdersDetails();
		   homePage.verifyCheckoutAdditionalInfoDetails();
		   homePage.verifyPaymentGateway();
		   accountPage.shippingIndia(); 
		   shopPage.verifyIndianTax();
	   }
	   
	   @Test(priority = 13)
	   public void RoamingTax() throws InterruptedException {
		   shopPage.addToBasketButton();
		   shopPage.viewBasketButton();
		   shopPage.verifyCartItemsProduct();
		   shopPage.verifyCartTotal();
		   homePage.total();
		   homePage.subtotal();
		   homePage.verifyTotalAlwaysMoreThanSubTotal();
		   homePage.clickCheckoutBtn();
		   homePage.verifyCheckoutBillingDetails();
		   homePage.verifyCheckoutOrdersDetails();
		   homePage.verifyCheckoutAdditionalInfoDetails();
		   homePage.verifyPaymentGateway();
		   accountPage.verifyBillingAddressFunctionallity();
		   shopPage.verifyRoamingTax();
	   }
	   
	   
	   @AfterClass
	   public void tearDown() {
		   Base.teardown();
	}

}

