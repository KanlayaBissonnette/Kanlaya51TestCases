package Kanlaya_51TestCasePages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Kanlaya_51TestCaseUtilities.Base;

public class ShopPage {

	public ShopPage() {
		
		PageFactory.initElements(Base.getDriver(), this);

	}

// SHOP

	@FindBy(xpath = "//div[@id='content']/nav/a")
	public WebElement homeButton;


//Adjust the filter by price between 150 to 450
	@FindBy(xpath = "//*[@id=\"woocommerce_price_filter-2\"]/form/div/div[1]/div")
	public WebElement sliderBar;
	
	@FindBy(xpath = "//*[@class = 'price_slider_amount']/button")
	public WebElement filterBtn;
	
	//choose selenium categories
	@FindBy(xpath = "//*[@id ='woocommerce_product_categories-2']/ul/li[4]/a")
	public WebElement seleniumProduct;
	
	@FindBy(xpath = "//*[@class = 'woocommerce-breadcrumb']")
	public WebElement seleniumHeaderText;
	
	@FindBy(xpath = "//*[@id=\"content\"]/form/select")
	public WebElement sortingDropDown;
	
//Pick a book on read more
	@FindBy(xpath = "//*[@id=\"content\"]/ul/li[7]/a[2]")
	public WebElement readMoreSeleniumRuby;

	@FindBy(xpath = "//*[@id=\"product-160\"]/div[2]/p")
	public WebElement outOfStockText;
	
//Click on sale written product
	@FindBy(xpath = "//*[@id=\"content\"]/ul/li[1]/a[1]/span[1]")
	public WebElement saleButton;

//Click on the Add To Basket to add your book to basket
	@FindBy(xpath = "//*[@id=\"content\"]/ul/li[5]/a[2]")
	public WebElement addToBasketButton;

//Click view basket
	@FindBy(xpath = "//*[@id=\"content\"]/ul/li[5]/a[3]")
	public WebElement viewBasketButton;

//Menu Item with price
	@FindBy(xpath = "//*[@id=\"wpmenucartli\"]/a/span[1]")
	public WebElement cartItemProduct;
	
	@FindBy(xpath = "//*[@id=\"wpmenucartli\"]/a/span[2]")
	public WebElement cartTotal;

//Cart order total and sub total
	@FindBy(xpath = "//*[@id=\"page-34\"]/div/div[1]/div/div/table/tbody/tr[1]")
	public WebElement cartSubtotal;


	@FindBy(xpath = "//*[@id=\"order_review\"]/table/tfoot/tr[2]/td/span")
	public WebElement tax;
	
	@FindBy(xpath = "//*[@class = 'cart-subtotal']/td/span")
	public WebElement subTotal;

	@FindBy(xpath = "//*[@class = 'order-total']/td/strong")
	public WebElement total;


	
	
	
	
	public void adjustPriceFilter() {
		
		WebElement slider = sliderBar
				.findElement(By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form/div/div[1]/span[2]"));
		for (int i = 1; i <= 50; i++) { //-1 for 50 times from 500 = 450
			slider.sendKeys(Keys.ARROW_LEFT);

			System.out.println("Filler By Price between 150 to 450");
		}
		
	}
	public void verifyBookPrice150_450(){
		String bookPrice150_450 = Base.driver.getCurrentUrl().toString();
		Assert.assertEquals("http://practice.automationtesting.in/shop/?min_price=150&max_price=450", bookPrice150_450);

	}
	
	public void clickFilterBtn() {
		filterBtn.click();
	}

	public void clickSeleniumProduct() throws InterruptedException {
		seleniumProduct.click();
		Thread.sleep(3000);
	}

	

	public void verifySeleniumHeaderText() {
		Assert.assertTrue(seleniumHeaderText.isDisplayed());
		System.out.println(seleniumHeaderText.getText());
		
	}
	
	public void clickSortingDropDown() {
		sortingDropDown.click();
	}
	
	public void verifySortByPopularity() {
		Select select = new Select(Base.driver.findElement(By.xpath("//*[@id=\"content\"]/form/select")));
		select.selectByValue("popularity");
		String popularityURL = Base.driver.getCurrentUrl().toString();
		Assert.assertEquals("http://practice.automationtesting.in/shop/?orderby=popularity", popularityURL);
	}

	public void verifySortByAverageRatings() {
		Select select = new Select(Base.driver.findElement(By.xpath("//*[@id=\"content\"]/form/select")));
		select.selectByValue("rating");
		String averageRatingURL = Base.driver.getCurrentUrl().toString();
		Assert.assertEquals("http://practice.automationtesting.in/shop/?orderby=rating", averageRatingURL);
	}

	public void verifySortByNewness() {
		Select select = new Select(Base.driver.findElement(By.xpath("//*[@id=\"content\"]/form/select")));
		select.selectByValue("date");
		String newnessURL = Base.driver.getCurrentUrl().toString();
		Assert.assertEquals("http://practice.automationtesting.in/shop/?orderby=date", newnessURL);
	}

	public void verifySortByLowToHigh() {
		Select select = new Select(Base.driver.findElement(By.xpath("//*[@id=\"content\"]/form/select")));
		select.selectByValue("price");
		String lowToHighURL = Base.driver.getCurrentUrl().toString();
		Assert.assertEquals("http://practice.automationtesting.in/shop/?orderby=price", lowToHighURL);
	}

	public void verifySortByHighToLow() {
		Select select = new Select(Base.driver.findElement(By.xpath("//*[@id=\"content\"]/form/select")));
		select.selectByValue("price-desc");
		String highToLowURL = Base.driver.getCurrentUrl().toString();
		Assert.assertEquals("http://practice.automationtesting.in/shop/?orderby=price-desc", highToLowURL);
	}

	public void readMoreSeleniumRuby() {
		readMoreSeleniumRuby.click();
		String outOfStockText = Base.driver.findElement(By.xpath("//*[@id=\"product-160\"]/div[2]/p")).getText();
		Assert.assertTrue(outOfStockText.contains("Out of stock"));
	}

	public void saleProductButton() {
		saleButton.click();
	}

	public void verifySaleProduct() {
		String originalPrice = Base.driver.findElement(By.xpath("//*[@id=\"product-169\"]/div[2]/div[1]/p/del/span"))
				.getText();
		Assert.assertTrue(originalPrice.contains("600.00"));
		String salePrice = Base.driver.findElement(By.xpath("//*[@id=\"product-169\"]/div[2]/div[1]/p/ins/span"))
				.getText();
		Assert.assertTrue(salePrice.contains("450.00"));
	}

	public void addToBasketButton() {
		addToBasketButton.click();
	}

	public void viewBasketButton() {
		viewBasketButton.click();
	}

	public void verifyCartItemsProduct() {
		String cartItemProduct = Base.driver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a/span[1]")).getText();
		System.out.println("Number of item is " + cartItemProduct);
		String expectedCartItemProduct = "1 Item";
		Assert.assertTrue(cartItemProduct.equals(expectedCartItemProduct));
	}
	
	public void verifyCartTotal() {
		String cartTotalText = cartTotal.getText().substring(1);
		System.out.println(cartTotalText);
	}

	public void verifyOrderCompleted() {
		String ActualTitle = Base.driver.getTitle();
		String ExpectedTitle = "Thank you. Your order has been received.";
		Assert.assertNotEquals(ActualTitle, ExpectedTitle);
	}
	
	
	
	
	public void verifyIndianTax() {
		double subTotalPrice =  Double.parseDouble(subTotal.getText().substring(1));
		System.out.println("Subtotal: "+subTotalPrice);
		
		double indiaTax = subTotalPrice * 0.02;
		System.out.println("India tax :"+indiaTax);
		
		double exptdIndiaTax = Double.parseDouble(tax.getText().substring(1));
		System.out.println("Expected India tax : "+ exptdIndiaTax);
		Assert.assertEquals(indiaTax, exptdIndiaTax);
		
		
	}
	
	public void verifyRoamingTax() {
		double subTotalPrice =  Double.parseDouble(subTotal.getText().substring(1));
		System.out.println("Subtotal: "+subTotalPrice);
		
		double roamingTax = subTotalPrice * 0.05;
		System.out.println("India tax :"+roamingTax);
		
		double exptdRoamingTax = Double.parseDouble(tax.getText().substring(1));
		System.out.println("Expected India tax : "+ exptdRoamingTax);
		Assert.assertEquals(roamingTax, exptdRoamingTax);
		
		
	}
	
}


