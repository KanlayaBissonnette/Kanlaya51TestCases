package Kanlaya_51TestCaseTests;

import org.testng.annotations.Test;

import Kanlaya_51TestCasePages.HomePage;
import Kanlaya_51TestCasePages.MyAccountPage;
import Kanlaya_51TestCasePages.ShopPage;
import Kanlaya_51TestCaseUtilities.Base;
import Kanlaya_51TestCaseUtilities.Constants;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class HomePageTests {

	HomePage homePage = new HomePage();
	ShopPage shopPage = new ShopPage();
	MyAccountPage accountPage = new MyAccountPage();

	@BeforeClass
	public void setUp() {
		Base.getDriver();

	}

	@BeforeMethod
	public void beforeMethod() {
		homePage.shopButton.click();
		shopPage.homeButton.click();

	}

	@Test(priority = 1)
	public void HomePageWithThreeSlidersOnly() {

		homePage.verifyHomePageHas3SlidesOnly(Constants.slidersCount);

	}

	@Test(priority = 2)
	public void HomePageWith3ArrivalsOnly() {

		homePage.verifyHomePageWith3ArrivalsOnly(Constants.arrivalsCount);
	}

	@Test(priority = 3)
	public void HomePageImagesInArrivalsShouldNavigate() {

		homePage.verifyHomePageWith3ArrivalsOnly(Constants.arrivalsCount);
		homePage.verifyImagesInArrivalsShouldNavigate();
	}

	@Test(priority = 4)
	public void HomePageArrivalsImagesDescription() {

		homePage.verifyHomePageWith3ArrivalsOnly(Constants.arrivalsCount);
		homePage.verifyArrivalsDescription();
	}

	@Test(priority = 5)
	public void HomePageArrivalsImagesReviews() {

		homePage.verifyHomePageWith3ArrivalsOnly(Constants.arrivalsCount);
		homePage.verifyArrivalsReviews();
	}

	@Test(priority = 6)
	public void HomePageArrivalsImagesAddtoBasket() {

		homePage.verifyHomePageWith3ArrivalsOnly(Constants.arrivalsCount);
		homePage.clickShopBtn();
		homePage.clickFunctionalProgrammingInJSBook();
		homePage.verifyBookPrice();
		homePage.clickAddToBasketBtn();
		homePage.verifyAddBook();

	}

	@Test(priority = 7)
	public void HomePageArrivalsAddtoBasketWithMoreBooks() {

		homePage.verifyHomePageWith3ArrivalsOnly(Constants.arrivalsCount);
		homePage.verifyAddBooksMoreThanBooksAvaialble();

	}

	@Test(priority = 8)
	public void HomeArrivalsAddtoBasketItems() {

		homePage.verifyHomePageWith3ArrivalsOnly(Constants.arrivalsCount);
		homePage.clickShopBtn();
		homePage.clickFunctionalProgrammingInJSBook();
		homePage.verifyBookPrice();
		homePage.clickAddToBasketBtn();
		homePage.verifyAddBook();
		homePage.clickViewBasketbtn();
		homePage.clickCheckoutBtn();
		homePage.verifyCheckoutBillingDetails();
	}

	@Test(priority = 9)
	public void HomeArrivalsAddtoBasketItemsCoupon() {

		homePage.verifyHomePageWith3ArrivalsOnly(Constants.arrivalsCount);
		homePage.clickShopBtn();
		homePage.clickFunctionalProgrammingInJSBook();
		homePage.verifyBookPrice();
		homePage.clickAddToBasketBtn();
		homePage.verifyAddBook();
		homePage.clickViewBasketbtn();
		homePage.clickAddCouponField();
		homePage.addCouponCode();
		homePage.clickApplyCouponBtn();
		homePage.verifyAddCoupon();

	}

	@Test(priority = 10)
	public void HomeArrivalsAddtoBasketItemsCouponvalueLessThan450() {

		homePage.verifyHomePageWith3ArrivalsOnly(Constants.arrivalsCount);
		homePage.clickShopBtn();
		homePage.clickFunctionalProgrammingInJSBook();
		homePage.verifyBookPrice();
		homePage.clickAddToBasketBtn();
		homePage.verifyAddBook();
		homePage.clickViewBasketbtn();
		homePage.clickAddCouponField();
		homePage.addCouponCode();
		homePage.clickApplyCouponBtn();
		homePage.verifyAddCoupon();
	}

	@Test(priority = 11)
	public void HomeArrivalsAddtoBasketItemsRemoveBook() {

		homePage.verifyHomePageWith3ArrivalsOnly(Constants.arrivalsCount);
		homePage.clickShopBtn();
		homePage.clickFunctionalProgrammingInJSBook();
		homePage.verifyBookPrice();
		homePage.clickAddToBasketBtn();
		homePage.verifyAddBook();
		homePage.clickViewBasketbtn();
		homePage.clickRemoveBtn();
		homePage.verifyBookRemoved();

	}

	@Test(priority = 12)
	public void HomeArrivalsAddtoBasketItemsAddBook() throws InterruptedException {

		homePage.verifyHomePageWith3ArrivalsOnly(Constants.arrivalsCount);
		homePage.clickShopBtn();
		homePage.clickFunctionalProgrammingInJSBook();
		homePage.verifyBookPrice();
		homePage.clickAddToBasketBtn();
		homePage.verifyAddBook();
		homePage.clickViewBasketbtn();
		homePage.verifyUpdateBasketButtonIsClickable();
	}

	@Test(priority = 13)
	public void HomeArrivalsAddtoBasketItemsCheckoutBookFinalprice() throws InterruptedException {

		homePage.verifyHomePageWith3ArrivalsOnly(Constants.arrivalsCount);
		homePage.clickShopBtn();
		homePage.clickFunctionalProgrammingInJSBook();
		homePage.verifyBookPrice();
		homePage.clickAddToBasketBtn();
		homePage.verifyAddBook();
		homePage.clickViewBasketbtn();
		homePage.total();
		homePage.verifyUserCanSeeTotalPrice();
	}

	@Test(priority = 14)
	public void HomeArrivalsAddtoBasketItemsCheckoutUpdateBasket() throws InterruptedException {

		homePage.verifyHomePageWith3ArrivalsOnly(Constants.arrivalsCount);
		homePage.shopButton.click();
		homePage.functionalProgrammingInJSBook.click();
		homePage.verifyBookPrice();
		homePage.addToBasketButton.click();
		homePage.verifyAddBook();
		homePage.viewBasketButton.click();
		homePage.verifyUpdateButtonIsClickableAndReflexPice();

	}

	@Test(priority = 15)
	public void HomeArrivalsAddtoBasketItemsCheckoutTotalAndSubtotalCondition() {

		homePage.verifyHomePageWith3ArrivalsOnly(Constants.arrivalsCount);
		homePage.shopButton.click();
		homePage.functionalProgrammingInJSBook.click();
		homePage.verifyBookPrice();
		homePage.addToBasketButton.click();
		homePage.verifyAddBook();
		homePage.viewBasketButton.click();
		homePage.subtotal();
		homePage.total();
		homePage.verifyTotalAlwaysMoreThanSubTotal();
	}

	@Test(priority = 16)
	public void HomeArrivalsAddtoBasketItemsCheckoutfunctionality() {
		homePage.verifyHomePageWith3ArrivalsOnly(Constants.arrivalsCount);
		homePage.shopButton.click();
		homePage.functionalProgrammingInJSBook.click();
		homePage.verifyBookPrice();
		homePage.addToBasketButton.click();
		homePage.verifyAddBook();
		homePage.viewBasketButton.click();
		homePage.subtotal();
		homePage.total();
		homePage.verifyTotalAlwaysMoreThanSubTotal();
		homePage.clickCheckoutBtn();
		homePage.verifyPaymentGateway();
	}

	@Test(priority = 17)
	public void HomeArrivalsAddtoBasketItemsCheckoutPaymentGateway() throws InterruptedException {
		homePage.verifyHomePageWith3ArrivalsOnly(Constants.arrivalsCount);
		homePage.shopButton.click();
		homePage.functionalProgrammingInJSBook.click();
		homePage.verifyBookPrice();
		homePage.addToBasketButton.click();
		homePage.verifyAddBook();
		homePage.viewBasketButton.click();
		homePage.subtotal();
		homePage.total();
		homePage.verifyTotalAlwaysMoreThanSubTotal();
		homePage.clickCheckoutBtn();
		homePage.clickAddCouponLink();
		homePage.addCouponCode();
		homePage.clickApplyCouponBtn();
		homePage.verifyCheckoutBillingDetails();
		accountPage.verifyBillingAddressFunctionallity();
		homePage.verifyCheckoutAdditionalInfoDetails();
		homePage.clickAdditionalInfoField();
		homePage.additionalInfoSendKey();
		homePage.verifyCheckoutOrdersDetails();
		homePage.subtotal();
		homePage.total();
		

	}

	@Test(priority = 18)
	public void HomeArrivalsAddtoBasketItemsCheckoutPaymentGatewayPlaceorder() throws InterruptedException {
		homePage.verifyHomePageWith3ArrivalsOnly(Constants.arrivalsCount);
		homePage.shopButton.click();
		homePage.functionalProgrammingInJSBook.click();
		homePage.verifyBookPrice();
		homePage.addToBasketButton.click();
		homePage.verifyAddBook();
		homePage.viewBasketButton.click();
		homePage.subtotal();
		homePage.total();
		homePage.verifyTotalAlwaysMoreThanSubTotal();
		homePage.clickCheckoutBtn();
		homePage.clickAddCouponLink();
		homePage.addCouponCode();
		homePage.clickApplyCouponBtn();
		homePage.verifyCheckoutBillingDetails();
		accountPage.verifyBillingAddressFunctionallity();
		homePage.verifyCheckoutAdditionalInfoDetails();
		homePage.clickAdditionalInfoField();
		homePage.additionalInfoSendKey();
		homePage.verifyCheckoutOrdersDetails();
		homePage.subtotal();
		homePage.total();
		homePage.paymentCheckedBox();
		homePage.clickPlaceOderBtn();
		homePage.verifyOrderReceived();
		homePage.orderConfirmation();
	}

	@AfterClass
	public void tearDown() {
		Base.teardown();
	}

}
