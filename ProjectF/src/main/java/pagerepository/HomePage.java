package pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// 1. WebElement Identification & Declaration

		@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
		private WebElement firstproduct;

		@FindBy(id = "add-to-cart")
		private WebElement addtocartbtn;

		@FindBy(id = "back-to-products")
		private WebElement backtoproducts;

		@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
		private WebElement fourthproduct;

		@FindBy(id = "add-to-cart")
		private WebElement addtocartbtn1;

		@FindBy(id = "back-to-products")
		private WebElement backtoproducts1;

		@FindBy(xpath = "//div[text()='Test.allTheThings() T-Shirt (Red)']")
		private WebElement sixproduct;

		@FindBy(id = "add-to-cart")
		private WebElement addtocartbtn2;

		@FindBy(id = "back-to-products")
		private WebElement backtoproducts2;

		// Identify Shopping cart icon
		@FindBy(className = "shopping_cart_link")
		private WebElement carticon;

		

		// 2. WebElement Initialization
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		// 3. WebElement Utilization
		public WebElement getfirstproduct() {
			return firstproduct;
		}

		public WebElement getaddtocartbtn() {
			return addtocartbtn;
		}
		
		public WebElement getbacktoproducts() {
			return backtoproducts;
		}

		public WebElement getfourthproduct() {
			return fourthproduct;
		}

		public WebElement getaddtocartbtn1() {
			return addtocartbtn1;
		}
		
		public WebElement getbacktoproducts1() {
			return backtoproducts1;
		}


		public WebElement getsixproduct() {
			return sixproduct;
		}

		public WebElement getaddtocartbtn2() {
			return addtocartbtn2;
		}
		
		public WebElement getbacktoproducts2() {
			return backtoproducts2;
		}


		public WebElement getcarticon() {
			return carticon;

}
}
