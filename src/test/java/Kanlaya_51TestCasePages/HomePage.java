package Kanlaya_51TestCasePages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Kanlaya_51TestCaseUtilities.Base;

public class HomePage {

	JavascriptExecutor js = (JavascriptExecutor) Base.getDriver();

	public HomePage() {
		PageFactory.initElements(Base.getDriver(), this);
	}

	// HOMEPAGE
	@FindBy(xpath = "//*[@id = 'main-nav']/li[2]")
	public WebElement myAccountButton;

	@FindBy(xpath = "//*[@id= 'content']/ul/li")
	public List<WebElement> bookList;

	@FindBy(xpath = "//*[@id='menu-item-40']/a")
	public WebElement shopButton;

	@FindBy(xpath = "//div[@class = 'n2-ss-slider-3']/div")
	public List<WebElement> sliders;

	@FindBy(xpath = "//*[@class = 'themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']/div")
	public List<WebElement> arrivals;

	@FindBy(xpath = "//*[text() = 'Description']")
	public WebElement descriptionTab;

	@FindBy(xpath = "//*[@id = 'tab-description']")
	public WebElement descriptionDetails;

	@FindBy(xpath = "//*[@class = 'woocommerce-tabs wc-tabs-wrapper']/ul/li[2]")
	public WebElement reviewTab;

	@FindBy(xpath = "//*[@id= 'comment']")
	public WebElement reviewField;

	@FindBy(xpath = "//*[@title = 'Functional Programming in JS']")
	public WebElement functionalProgrammingInJSBook;

	@FindBy(xpath = "//*[@class = 'quantity']/input")
	public WebElement quantityField;

	@FindBy(xpath = "//*[@class = 'cart']/button")
	public WebElement addToBasketButton;

	@FindBy(xpath = "//*[@class = 'summary entry-summary']/div/p/span")
	public WebElement bookPrice;

	@FindBy(xpath = "//*[text() = 'View Basket']")
	public WebElement viewBasketButton;

	@FindBy(xpath = "//*[@class = 'wc-proceed-to-checkout']/a")
	public WebElement checkoutButton;

	@FindBy(xpath = "//*[@class ='woocommerce']/div[2]/a")
	public WebElement addCouponLink;

	@FindBy(xpath = "//*[@class ='woocommerce']/div[1]/a")
	public WebElement clickToLogInLink;

	@FindBy(xpath = "//*[@id='coupon_code']")
	public WebElement couponField;

	@FindBy(xpath = "//*[@name ='apply_coupon']")
	public WebElement applyCouponButton;

	@FindBy(xpath = "//*[@class = 'woocommerce']/ul/li")
	public WebElement limitCouponReach;

	@FindBy(xpath = "//*[@class = 'product-remove']/a")
	public WebElement removeIcon;

	@FindBy(xpath = "//*[@class = 'return-to-shop']")
	public WebElement returnToShopButton;

	@FindBy(xpath = "//*[@class = 'cart-empty']")
	public WebElement cartEmptyText;

	@FindBy(xpath = "//*[@class = 'shop_table shop_table_responsive cart']/tbody/tr[1]/td[6]")
	public WebElement priceOfItemInBasket;

	@FindBy(xpath = "//*[@name = 'update_cart']")
	public WebElement updateBasketButton;

	@FindBy(xpath = "//*[@class = 'shop_table shop_table_responsive']")
	public WebElement subtotalTable;

	@FindBy(xpath = "//*[@class = 'shop_table woocommerce-checkout-review-order-table']")
	public WebElement checkoutOrderTable;

	@FindBy(xpath = "//*[@class = 'cart-subtotal']/td/span")
	public WebElement subTotal;

	@FindBy(xpath = "//*[@class = 'order-total']/td/strong")
	public WebElement total;

	@FindBy(xpath = "//*[@id = 'payment']")
	public WebElement paymentTypeLists;

	@FindBy(xpath = "//*[@class = 'woocommerce-billing-fields']/h3")
	public WebElement billigDetailsText;

	@FindBy(xpath = "//*[@class = 'woocommerce-shipping-fields']/h3")
	public WebElement additionalInfoText;

	@FindBy(xpath = "//*[@id = 'order_review_heading']")
	public WebElement yourOrderText;

	@FindBy(xpath = "//*[@id = 'order_comments']")
	public WebElement additionalInfoField;

	@FindBy(id = "payment_method_bacs")
	public WebElement directBankTransfer;

	@FindBy(id = "payment_method_cheque")
	public WebElement checkPayments;

	@FindBy(id = "payment_method_cod")
	public WebElement payOnDelivery;

	@FindBy(id = "payment_method_ppec_paypal")
	public WebElement paypalExpressCheckout;

	@FindBy(id = "place_order")
	public WebElement placeOrderBtn;

	@FindBy(xpath = "//*[@class ='woocommerce']/p[1]")
	public WebElement receivedOrderText;

	@FindBy(xpath = "//*[@class = 'woocommerce-thankyou-order-details order_details']")
	public WebElement orderConfirmationText;

	public void clickMyAcctBtn() {
		myAccountButton.click();
	}

	public void clickShopBtn() {
		shopButton.click();
	}

	public void clickFunctionalProgrammingInJSBook() {
		functionalProgrammingInJSBook.click();
	}

	public void clickAddToBasketBtn() {
		addToBasketButton.click();
	}

	public void clickViewBasketbtn() {
		viewBasketButton.click();
	}

	public void clickCheckoutBtn() {
		checkoutButton.click();
	}

	public void clickAddCouponField() {
		couponField.click();
	}

	public void clickAddCouponLink() {
		addCouponLink.click();
	}

	public void addCouponCode() {
		couponField.sendKeys(Base.getProperty("couponCode"));
	}

	public void clickApplyCouponBtn() {
		applyCouponButton.click();
	}

	public void clickRemoveBtn() {
		removeIcon.click();
	}

	public void clickUpdateBasketBtn() {
		updateBasketButton.click();
	}

	public void verifyHomePageHas3SlidesOnly(int count) {
		Assert.assertEquals(count, sliders.size());
	}

	public void verifyHomePageWith3ArrivalsOnly(int count) {
		Assert.assertEquals(arrivals.size(), count);
	}

	public void verifyImagesInArrivalsShouldNavigate() {

		String[] expectedTexts = new String[] { "Selenium Ruby", "Thinking in HTML", "Mastering JavaScript" };

		for (int i = 0; i < arrivals.size(); i++) {

			String pathText = String.format(
					"//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']/div[%d]", i + 1);
			Base.getDriver().findElement(By.xpath(pathText)).click();
			String text = Base.getDriver().findElement(By.xpath("//*[@class='product_title entry-title']")).getText();
			Assert.assertTrue(expectedTexts[i].equals(text));
			Base.getDriver().navigate().back();
		}
	}

	public void verifyArrivalsDescription() {

		String[] expectedTexts = new String[] { "Selenium Ruby", "Thinking in HTML", "Mastering JavaScript" };

		for (int i = 0; i < arrivals.size(); i++) {

			String pathText = String.format(
					"//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']/div[%d]", i + 1);
			Base.getDriver().findElement(By.xpath(pathText)).click();
			String text = Base.getDriver().findElement(By.xpath("//*[@class='product_title entry-title']")).getText();
			Assert.assertTrue(expectedTexts[i].equals(text));

			Assert.assertTrue(descriptionTab.isDisplayed());
			descriptionTab.click();
			Assert.assertTrue(descriptionDetails.isDisplayed());

			Base.getDriver().navigate().back();
		}

	}

	public void verifyArrivalsReviews() {

		String[] expectedTexts = new String[] { "Selenium Ruby", "Thinking in HTML", "Mastering JavaScript" };

		for (int i = 0; i < arrivals.size(); i++) {

			String pathText = String.format(
					"//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']/div[%d]", i + 1);
			Base.getDriver().findElement(By.xpath(pathText)).click();
			String text = Base.getDriver().findElement(By.xpath("//*[@class='product_title entry-title']")).getText();
			Assert.assertTrue(expectedTexts[i].equals(text));

			Assert.assertTrue(reviewTab.isDisplayed());
			reviewTab.click();
			Assert.assertTrue(reviewField.isDisplayed());

			Base.getDriver().navigate().back();

		}

	}

	public void verifyBookPrice() {
		Assert.assertTrue(bookPrice.isDisplayed());
		System.out.println("Book Price : " + bookPrice.getText().substring(1));
	}

	public void verifyAddBook() {
		Assert.assertTrue(viewBasketButton.isDisplayed());
	}

	public void verifyAddBooksMoreThanBooksAvaialble() {
		quantityField.clear();
		String maxNumber = quantityField.getAttribute("max");
		int moreThanMax = Integer.valueOf(maxNumber) + 1;
		quantityField.sendKeys(String.valueOf(moreThanMax));
		addToBasketButton.click();
		// Check if there is an error message pop up (using javascript)
		JavascriptExecutor js = (JavascriptExecutor) Base.getDriver();
		Boolean isValidInput = (Boolean) js.executeScript("return arguments[0].checkValidity();", quantityField);
		System.out.println(isValidInput); // false; not valid number
		String validationMessage = (String) js.executeScript("return arguments[0].validationMessage;", quantityField);
		System.out.println(validationMessage);
		Assert.assertFalse(isValidInput);
		String alert = String.format("Value must be less than or equal to %d.", Integer.valueOf(maxNumber));
		Assert.assertTrue(validationMessage.equals(alert));
		quantityField.clear();
		Base.getDriver().navigate().back();
	}

	public void verifyAddCoupon() {
		String limitCounponReachMsg = limitCouponReach.getText();
		String expectedCouponMsg = "Coupon usage limit has been reached.";
		Assert.assertEquals(limitCounponReachMsg, expectedCouponMsg);
		System.out.println(expectedCouponMsg);

	}

	public void verifyBookRemoved() {
		String returnToShop = cartEmptyText.getText();
		String expectedReturnToShopText = "Your basket is currently empty.";
		Assert.assertEquals(returnToShop, expectedReturnToShopText);
	}

	public void verifyUpdateBasketButtonIsClickable() {
		quantityField.clear();
		quantityField.sendKeys(Base.getProperty("updateBookQuantity")); // 3
		System.out.println("Update Button is enable to click: " + updateBasketButton.isEnabled());
		clickUpdateBasketBtn();

	}

	public void total() {
		String totalPrice = total.getText().substring(1);
		System.out.println("Total pice is :" + totalPrice);
	}

	public void verifyUserCanSeeTotalPrice() {

		System.out.println("User can see Total price : " + total.isDisplayed());

	}

	public void subtotal() {
		String subTotalPrice = subTotal.getText().substring(1);
		System.out.println("Subtotal pice is :" + subTotalPrice);
	}

	public void verifyUpdateButtonIsClickableAndReflexPice() throws InterruptedException {
		String priceBeforeUpdate = priceOfItemInBasket.getText().substring(1);
		System.out.println("Total Price Before Update: " + priceBeforeUpdate);
		System.out.println("---------------------------");
		verifyUpdateBasketButtonIsClickable();
		Thread.sleep(4000);
		System.out.println("---------------------------");
		String priceAfterUpdate = priceOfItemInBasket.getText().substring(1);
		System.out.println("Total Price After Update: " + priceAfterUpdate);
		System.out.println("User has the feasibility to Update Basket at the time of check out.");
	}

	public void verifyCheckoutOrderTableVisible() {
		String checkoutOrders = checkoutOrderTable.getText();
		System.out.println(checkoutOrders);
	}

	public void verifyTotalAlwaysMoreThanSubTotal() {
		String totalPrice = total.getText().substring(1);
		String subTotalPrice = subTotal.getText().substring(1);
		Assert.assertTrue(Double.valueOf(totalPrice) > Double.valueOf(subTotalPrice));
		System.out.println("Total: " + total.getText().substring(1) + " is always more than " + "Subtotal: "
				+ subTotal.getText().substring(1));

	}

	public void verifyPaymentGateway() {
		String paymentType = paymentTypeLists.getText();
		System.out.println(paymentType);
		System.out.println("---------------------------");

	}

	public void verifyCheckoutBillingDetails() {

		String actualBillingDetailsText = billigDetailsText.getText();
		String expectedBillingDetalsText = "Billing Details";

		Assert.assertEquals(actualBillingDetailsText, expectedBillingDetalsText);
	}

	public void verifyCheckoutAdditionalInfoDetails() {

		String actualAdditionalInfoText = additionalInfoText.getText();
		String expectedAdditionalInfoText = "Additional Information";

		Assert.assertEquals(actualAdditionalInfoText, expectedAdditionalInfoText);
	}

	public void verifyCheckoutOrdersDetails() {

		String actualYourOrderText = yourOrderText.getText();
		String expectedYourOrderText = "Your order";

		Assert.assertEquals(actualYourOrderText, expectedYourOrderText);
	}

	public void checkoutOrderList() {
		checkoutOrderTable.getText();

	}

	public void clickAdditionalInfoField() {
		additionalInfoField.click();
	}

	public void additionalInfoSendKey() throws InterruptedException {
		additionalInfoField.sendKeys(Base.getProperty("additionalInfoText"));
		Thread.sleep(5000);

	}

	@FindBy(xpath = "//*[@id=\"payment\"]/ul/li[3]/div/p")
	public WebElement paymentMethodMsg;

	public void paymentCheckedBox() {
		payOnDelivery.click();
		
		String paymentMsg = paymentMethodMsg.getText();
		Assert.assertTrue(paymentMsg.contains("Pay with cash upon delivery."));

	}

	public void clickPlaceOderBtn() {
		placeOrderBtn.click();
	}

	public void verifyOrderReceived() {
		String receiveOrderText = receivedOrderText.getText();
		Assert.assertTrue(receiveOrderText.contains(" Your order has been received."));

	}

	public void orderConfirmation() {
		String oderDetails = orderConfirmationText.getText();

		Assert.assertTrue(oderDetails.contains("ORDER NUMBER"));
		Assert.assertTrue(oderDetails.contains("DATE"));
		Assert.assertTrue(oderDetails.contains("TOTAL"));
		Assert.assertTrue(oderDetails.contains("PAYMENT METHOD"));
	}
}
