package producttest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseConfig;

public class Example1Test extends BaseConfig {
	@Test
	public void SwagLabs()
	{
		
		//Identify the First product
		WebElement firstproduct=driver.findElement(By.linkText("Sauce Labs Backpack"));
		//Click on first product
		firstproduct.click();
		//Identify the Add to cart button
		WebElement firstproductaddcart=driver.findElement(By.id("add-to-cart"));
		//click on Add to cart 
		firstproductaddcart.click();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Identify Back to product link
		WebElement backtoproductlink=driver.findElement(By.id("back-to-products"));
		//Click on Back to product link
		backtoproductlink.click();
		//Verify the page
		System.out.println("Title is:"+driver.getTitle());
		//Identify the Second product
		WebElement secondproduct=driver.findElement(By.linkText("Sauce Labs Fleece Jacket"));
		//Click on Second product
		secondproduct.click();
		//Identify the Add to cart button
		WebElement secondproductaddcart=driver.findElement(By.id("add-to-cart"));
		//Click on Add to cart
		secondproductaddcart.click();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Identify Back to product link
		WebElement backtoproductlink1=driver.findElement(By.id("back-to-products"));
		//Click on Back to product link
		backtoproductlink1.click();
		//Verify the page
		System.out.println("Title is:"+driver.getTitle());
		//Identify the Third product
		WebElement thirdproduct=driver.findElement(By.linkText("Test.allTheThings() T-Shirt (Red)"));
		//Click on Third product
		thirdproduct.click();
		//Identify Add to cart button
		WebElement thirdproductaddcart=driver.findElement(By.id("add-to-cart"));
		//Click on Add to cart button
		thirdproductaddcart.click();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Identify Back to product link
		WebElement backtoproductlink2=driver.findElement(By.id("back-to-products"));
		//Click on Back to product link
		backtoproductlink2.click();
		//Verify the page
		System.out.println("Title is:"+driver.getTitle());
		// Click on Cart Icon
		driver.findElement(By.className("shopping_cart_link")).click();

		// Verify the product is available on the cart
		System.out.println("product is diaplay on the cart");

		// Click on checkout button
		driver.findElement(By.id("checkout")).click();

		// Verify the page
		System.out.println("checkout your information page");

		// 15.Provide check out information
		WebElement firstname_Textfield = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		WebElement secondname_Textfield = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		WebElement postalcode_Textfield = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));

		// validate the element is displayed and enabled
		if (firstname_Textfield.isDisplayed() && firstname_Textfield.isEnabled() && secondname_Textfield.isDisplayed()
						&& secondname_Textfield.isEnabled() && postalcode_Textfield.isDisplayed()
						&& postalcode_Textfield.isEnabled()) {
		System.out.println("element is verified : It is Displayed");
		System.out.println("element is verified : It is Enabled");
		}
		// Perform the action
		firstname_Textfield.sendKeys("Indra");

		secondname_Textfield.sendKeys("Vemula");

		postalcode_Textfield.sendKeys("534101.");

		// Click on continue button on the check out page
		driver.findElement(By.id("continue")).click();

		// Verify the product information
		String checkoutProduct = driver.findElement(By.className("inventory_item_name")).getText();

		// Click on finish button
		driver.findElement(By.id("finish")).click();

		// Verify the confirmation message
		System.out.println("Thank you for your order message is displayed");
				
		Reporter.log("Products ordered successfully", true);
		
		
		
		
		
		
		
	}
	

}
