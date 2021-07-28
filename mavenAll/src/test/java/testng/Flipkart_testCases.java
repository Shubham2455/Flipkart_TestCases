package testng;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//............................................................................................................................................................//

//............................................... Test Cases For Flipkart ....................................................................................//

//............................................................................................................................................................//

public class Flipkart_testCases {
	@Test
	// Login Box availablity

	public void test21() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shubh\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		if (driver
				.findElement(By.xpath("//div[@class='_3wFoIb row']")) != null) {
			System.out.println("Login box Present");
		} else {
			System.out.println("Login box Missing");
		}
	}

	@Test
	// Login text visiblity

	public void test22() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		boolean display = driver
				.findElement(By.xpath("//span[ text()='Login']")).isDisplayed();
		if (display) {
			System.out.println("Login text visible");
		} else {
			System.out.println("Login text missing");
		}
	}

	@Test
	// Email Field box Visiblity

	public void test23() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		boolean display = driver
				.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.isDisplayed();
		if (display) {
			System.out.println("Email/Mobile no field is visible");
		} else {
			System.out.println("Email/Mobile no field is missing");
		}
	}
	@Test
	// Password Field box Visiblity

	public void test24() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		boolean display = driver
				.findElement(
						By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"))
				.isDisplayed();
		if (display) {
			System.out.println("Password field is visible");
		} else {
			System.out.println("Password field is missing");
		}
	}

	@Test
	// Forgot element visiblity

	public void test25() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		if (driver.findElement(By.xpath("//span[text()='Forgot?']"))
				.isDisplayed()) {
			System.out.println("forgot element is displays");
		} else {
			System.out.println("forgot element is missing");
		}
	}
	@Test
	// While click on forgot element shows Please enter valid Email ID/Mobile

	public void test26() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		if (driver.findElement(By.xpath("//span[text()='Forgot?']"))
				.isDisplayed()) {
			driver.findElement(By.xpath("//span[text()='Forgot?']")).click();
			if (driver.findElement(By.xpath(
					"//span[text()='Please enter valid Email ID/Mobile number']")) != null) {
				System.out.println("forgot element is working");
			} else {
				System.out.println("Forgot element error");
			}
		}

	}
	@Test
	// Request OTP Element Visiblity

	public void test27() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		boolean otp = driver
				.findElement(
						By.xpath("//button[@class='_2KpZ6l _2HKlqd _3NgS1a']"))
				.isDisplayed();
		if (otp) {
			System.out.println("Request OTP id displays");
		} else {
			System.out.println("Request OTP is Missing");
		}

	}
	@Test
	// Request OTP Element Visiblity

	public void test28() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		WebElement result = driver
				.findElement(By.xpath("//a[@class='_14Me7y']"));
		String er = "New to Flipkart? Create an account";
		String ar = result.getText();

		// Assert.assertEquals(er, ar);

		if (er.equals(ar)) {
			System.out.println("Data is visible");
		} else {
			System.out.println("Data is Missing");
		}
	}
	@Test
	// Mobile no. Visiblity

	public void test29() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@class='_14Me7y']")).click();
		WebElement expected = driver
				.findElement(By.xpath("//span[text()='Enter Mobile number']"));
		String exp = "Enter Mobile number";
		String act = expected.getText();

		if (exp.equals(act)) {
			System.out.println("Please enter mobile number");
		} else {
			System.out.println("Please enter valid mobile number");
		}
	}
	@Test
	// Loggin button visibility

	public void test30() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		boolean displys = driver
				.findElement(
						By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"))
				.isDisplayed();

		if (displys) {
			System.out.println("Displaying login button");
		} else {
			System.out.println("Login button missing");
		}

	}

	@Test
	// Loggin to flipkart successfully

	public void test31() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		boolean displys = driver
				.findElement(By.xpath("//img[@class='_2xm1JU']")).isDisplayed();

		if (displys) {
			System.out.println("Successfully login to Flipcart");
		} else {
			System.out.println("Plase enter correct uname/password");
		}

	}
	@Test
	// Searchbox

	public void test32() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		boolean search = driver
				.findElement(
						By.xpath("//form[@class='_2M8cLY header-form-search']"))
				.isDisplayed();
		if (search) {
			System.out.println("searchbox is present");
		} else {
			System.out.println("searchbox is missing");
		}
	}

	@Test
	// Main element list

	public void test33() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		ArrayList<String> explist = new ArrayList<String>();
		ArrayList<String> actlist = new ArrayList<String>();

		explist.add("Top Offers");
		explist.add("Grocery");
		explist.add("Mobiles");
		explist.add("Fashion");
		explist.add("Electronics");
		explist.add("Home");
		explist.add("Appliances");
		explist.add("Travel");
		explist.add("Beauty, Toys & More");

		List<WebElement> actlist1 = driver
				.findElements(By.xpath("//div[@class='_37M3Pb']/div"));
		for (WebElement Ele : actlist1) {
			actlist.add(Ele.getText());
		}
		if (explist.equals(actlist)) {
			System.out.println("correct data");
		} else {
			System.out.println("wrong");
		}
	}
	@Test
	// Cart logo

	public void test34() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		boolean cartlogo = driver.findElement(By.xpath("//*[@class='V3C5bO']"))
				.isDisplayed();

		if (cartlogo) {
			System.out.println("cart logo is displays");
		} else {
			System.out.println("Logo is missing");
		}
	}
	@Test
	// Cart text

	public void test35() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		WebElement carttext = driver
				.findElement(By.xpath("//span[contains(text(),'Cart')]"));
		String exp = "Cart";
		String act = carttext.getText();

		if (exp.equals(act)) {
			System.out.println("cart text is displaying");
		} else {
			System.out.println("Text is missing");
		}
	}
	@Test
	// Search product

	public void test36() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
					.sendKeys("9403513214");
			driver.findElement(By.xpath("//input[@type='password']"))
					.sendKeys("smackdown");
			driver.findElement(
					By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"))
					.click();

			Actions act = new Actions(driver);
			Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
			sendEsc.perform();

			driver.findElement(By.className("_1_3w1N")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("q")).sendKeys("Dell laptop");
			driver.findElement(
					By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
					.click();

		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	@Test
	// Search product and Click on it

	public void test_37() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		driver.findElement(By.className("_1_3w1N")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Dell laptop");
		driver.findElement(
				By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
				.click();

		WebDriverWait wait = new WebDriverWait(driver, 25);
		WebElement dell = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//a[@class='_1fQZEK']")));
		if (dell != null) {
			dell.click();
			System.out.println("click successfully");
		} else {
			System.out.println("Unclicked");
		}

	}
	@Test
	// Add product in cart

	public void test_38() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		driver.findElement(By.className("_1_3w1N")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Dell laptop");
		driver.findElement(
				By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
				.click();
		WebDriverWait wait = new WebDriverWait(driver, 25);
		WebElement dell = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//a[@class='_1fQZEK']")));
		dell.click();
		Thread.sleep(3000);
		ArrayList<String> tabs = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		driver.close();
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();
		Thread.sleep(3000);
		WebElement cnt = driver
				.findElement(By.xpath("//div[@class='_3g_HeN']"));
		String exp = "My Cart (3)";
		String actt = cnt.getText();
		System.out.println(actt);
		if (exp.equals(actt)) {
			System.out.println("Product added in cart");
		} else {
			System.out.println("Add cart Error");
		}

	}
	@Test
	// Remove product from cart

	public void test_39() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 25);
		WebElement hp = wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//div[@class='zab8Yh _10k93p']")));

		if (hp != null) {
			driver.findElement(
					By.xpath("//div[@class='_3dsJAO' and text()='Remove']"))
					.click();
			driver.findElement(By.xpath(
					"//div[@class='_3dsJAO _24d-qY FhkMJZ' and text()='Remove']"))
					.click();
			System.out.println("Product removed successfully");

		} else {

			System.out.println("Check the code");
		}

	}
	@Test
	// check daily deals

	public void test_40() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		driver.findElement(By.xpath("//a[@class='_2KpZ6l _3dESVI']")).click();

	}
	@Test
	// Sort by Low to High

	public void test_41() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		driver.findElement(By.className("_1_3w1N")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Dell laptop");
		driver.findElement(
				By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
				.click();
		Thread.sleep(3000);
		WebElement l_to_h = driver.findElement(By.xpath(
				"//div[@class='_10UF8M' and text()='Price -- Low to High']"));
		if (l_to_h != null) {
			l_to_h.click();
			Thread.sleep(3000);
			if (driver.findElement(By
					.xpath("//div[@data-id='COMFJGDEGYG9SJ8W']/div")) != null) {
				System.out.println("Sorted by Low to high");
			}
		} else {
			System.out.println("Please check your code");
		}

	}
	@Test
	// Sort by High to low

	public void test_42() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		driver.findElement(By.className("_1_3w1N")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Dell laptop");
		driver.findElement(
				By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
				.click();
		Thread.sleep(3000);
		WebElement h_to_l = driver.findElement(By.xpath(
				"//div[@class='_10UF8M' and text()='Price -- High to Low']"));
		if (h_to_l != null) {
			h_to_l.click();
			Thread.sleep(3000);
			if (driver.findElement(By
					.xpath("//div[@data-id='COMFVZZXTTUWAMFD']/div")) != null) {
				System.out.println("Sorted by high to low");
			}
		} else {
			System.out.println("Please check your code");
		}
	}

	@Test
	// Sort by Relevance

	public void test_43() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		driver.findElement(By.className("_1_3w1N")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Dell laptop");
		driver.findElement(
				By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
				.click();
		Thread.sleep(3000);
		WebElement Relevance = driver.findElement(By.xpath(
				"//div[@class='_10UF8M _3LsR0e' and text()='Relevance']"));
		if (Relevance != null) {
			Relevance.click();
			Thread.sleep(3000);
			if (driver.findElement(By
					.xpath("//div[@data-id='COMFUUBMUYK7XPFT']/div")) != null) {
				System.out.println("Sorted by Relevance");
			}
		} else {
			System.out.println("Please check your code");
		}

	}
	@Test
	// Sort by Popularity

	public void test_44() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		driver.findElement(By.className("_1_3w1N")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Dell laptop");
		driver.findElement(
				By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
				.click();
		Thread.sleep(3000);
		WebElement Popularity = driver
				.findElement(By.xpath("//div[ text()='Popularity']"));
		if (Popularity != null) {
			Popularity.click();
			Thread.sleep(3000);
			if (driver.findElement(By
					.xpath("//div[@data-id='COMFUUBMUYK7XPFT']/div")) != null) {
				System.out.println("Sorted by Popularity");
			}
		} else {
			System.out.println("Please check your code");
		}

	}
	@Test
	// Sort by Newest

	public void test_45() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		driver.findElement(By.className("_1_3w1N")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Dell laptop");
		driver.findElement(
				By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
				.click();
		Thread.sleep(3000);
		WebElement Newest = driver
				.findElement(By.xpath("//div[ text()='Newest First']"));
		if (Newest != null) {
			Newest.click();
			Thread.sleep(3000);
			if (driver.findElement(By
					.xpath("//div[@data-id='COMG3YV5YEAXFSDT']/div")) != null) {
				System.out.println("Sorted by Newest");
			}
		} else {
			System.out.println("Please check your code");
		}

	}

	@Test
	// Sort Corei5

	public void test_46() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		driver.findElement(By.className("_1_3w1N")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Dell laptop");
		driver.findElement(
				By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
				.click();
		Thread.sleep(3000);
		WebElement checkbox = driver
				.findElement(By.xpath("//div[@class='_24_Dny']"));
		checkbox.click();
		if (driver.findElement(
				By.xpath("//section[@class='JWMl0H _2hbLCH']/div")) != null) {
			Thread.sleep(3000);
			WebElement Corei5 = driver
					.findElement(By.xpath("//div[@class='_1xc7yr']/div"));
			if (Corei5 != null) {
				System.out.println("Displays Only corei5 laptops");
			}
		}

	}
	@Test
	// Select Minimum and Maximum value from Filter

	public void test_47() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		driver.findElement(By.className("_1_3w1N")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Dell laptop");
		driver.findElement(
				By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[@class='_2yz7eI _2hbLCH']"));
		WebElement min = driver
				.findElement(By.xpath("//div[@class='_2b0bUo']/div/select"));
		if (min != null) {
			min.click();
			driver.findElement(By
					.xpath("//select[@class='_2YxCDZ']/option[@value='20000']"))
					.click();
		}
		Thread.sleep(3000);
		WebElement max = driver
				.findElement(By.xpath("//div[@class='_3uDYxP']/select"));
		if (max != null) {
			max.click();
			driver.findElement(By.xpath(
					"//div[@class='_3uDYxP']/select/option[@value='30000']"))
					.click();
			Thread.sleep(3000);
			WebElement lapy = driver.findElement(
					By.xpath("//div[@data-id='COMFJGDEGYG9SJ8W']/div"));
			if (lapy != null) {
				System.out.println("Min and Max value Selected Successfully");
			} else {
				System.out.println("Value not selected");
			}

		}

	}
	@Test
	// Visiblity of Processor text

	public void test_48() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		driver.findElement(By.className("_1_3w1N")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Dell laptop");
		driver.findElement(
				By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
				.click();
		Thread.sleep(3000);
		WebElement processor = driver
				.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao']"));
		String exp = "PROCESSOR";
		String actt = processor.getText();
		System.out.println(actt);
		if (exp.equals(actt)) {
			System.out.println("Showing neccessory data");
		} else {
			System.out.println("data is not visible");
		}
	}

	@Test
	// Bottom List main title

	public void test_49() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		ArrayList<String> expected = new ArrayList<String>();
		ArrayList<String> actual = new ArrayList<String>();

		expected.add("ABOUT");
		expected.add("HELP");
		expected.add("POLICY");
		expected.add("SOCIAL");

		List<WebElement> actual1 = driver
				.findElements(By.xpath("//div[@class='_2Brcj4']/div"));
		for (WebElement webElement : actual1) {
			actual.add(webElement.getText());
		}
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.println("conditions are equal");
		} else {
			System.out.println("Unequal");
		}

	}
	@Test
	// Home Theater path

	public void test_50() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Boat Home Theater");
		driver.findElement(
				By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
				.click();
		Thread.sleep(3000);
		ArrayList<String> expected1 = new ArrayList<String>();
		ArrayList<String> actual1 = new ArrayList<String>();
		expected1.add("Home");
		expected1.add("Audio & Video");
		expected1.add("Speakers");
		List<WebElement> actual2 = driver
				.findElements(By.xpath("//div[@class='_3GIHBu']/a"));
		for (WebElement Element : actual2) {
			actual1.add(Element.getText());
		}
		System.out.println(actual1);
		if (expected1.equals(actual1)) {
			System.out.println("Correct Path");
		} else {
			System.out.println("Incorrect Path");
		}
	}
	@Test
	// switch to newly open tab for selected home Theater

	public void test_51() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Boat Home Theater");
		driver.findElement(
				By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-id='ACCF8J5ZNHYVYYEH']/div"))
				.click();
		ArrayList<String> tabs = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		driver.close();
		driver.switchTo().window(tabs.get(1));
	}
	@Test
	// Check availablity of product for Location

	public void test_52() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Boat Home Theater");
		driver.findElement(
				By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-id='ACCF8J5ZNHYVYYEH']/div"))
				.click();
		ArrayList<String> tabs = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		driver.close();
		driver.switchTo().window(tabs.get(1));

		WebElement pincode = driver
				.findElement(By.xpath("//*[@class='N79-rD']/input"));
		if (pincode != null) {
			driver.findElement(
					By.xpath("//span[@class='_2P_LDn' and text()='Change']"))
					.click();
			Thread.sleep(2000);
			WebElement add = driver
					.findElement(By.xpath("//*[@class='_3icCFx']"));
			if (add != null) {
				add.click();
				WebElement availablity = driver.findElement(By.xpath(
						"//div[@class='_1NQ_ER' and text()='Currently out of stock in this area.']"));
				String exp = "Currently out of stock in this area.";
				String actual = availablity.getText();
				if (exp.equals(actual)) {
					System.out.println(
							"Product Currently out of stock for location");
				} else {
					System.out.println("Please check pincode");
				}
			}
		}

	}
	@Test
	// Select 160 Watt from power

	public void test_53() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Boat Home Theater");
		driver.findElement(
				By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-id='ACCF8J5ZNHYVYYEH']/div"))
				.click();
		ArrayList<String> tabs = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		driver.close();
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.xpath(
				"//li[@class='_3V2wfe' and @id='swatch-2-power_output']/a"))
				.click(); // 160w Click

		Thread.sleep(2000);
		WebElement tt = driver
				.findElement(By.xpath("//h1[@class='yhB1nd']/span")); // text

		if (tt != null) {

			String exp = "boAt Aavante Bar 2000 160 W Bluetooth Soundbar  (Premium Black, 2.1 Channel)";
			String Act = tt.getText();
			System.out.println(Act);

			if (exp.equals(Act)) {
				System.out.println("Text is Visible");

			} else {
				System.out.println("Unselected Text");
			}
		}
	}
	@Test
	// Rating and Reviews

	public void test_54() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Boat Home Theater");
		driver.findElement(
				By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-id='ACCF8J5ZNHYVYYEH']/div"))
				.click();
		ArrayList<String> tabs = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		driver.close();
		driver.switchTo().window(tabs.get(1));

		WebElement rr = driver.findElement(By.xpath(
				"//div[@class='_2QKOHZ' and text()='Ratings & Reviews']"));

		String expString = "Ratings & Reviews";
		String acaString = rr.getText();

		Assert.assertEquals(expString, acaString);

	}
	@Test
	// Rate Product Button clickable

	public void test_55() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Boat Home Theater");
		driver.findElement(
				By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-id='ACCF8J5ZNHYVYYEH']/div"))
				.click();
		ArrayList<String> tabs = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		driver.close();
		driver.switchTo().window(tabs.get(1));

		WebElement RP = driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _1q9yVr']/span"));
		if (RP != null) {
			RP.click();
			Thread.sleep(2000);

			WebElement product = driver
					.findElement(By.xpath("//div[@class='_3ISAFp']"));
			String expString = "Haven't purchased this product?";
			String actString = product.getText();
			if (expString.equals(actString)) {
				System.out.println("Haven't purchased this product?");
			} else {
				System.out.println("something wrong");
			}
		}

	}
	@Test
	// Set source destination for Flight

	public void test_56() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//p[@class='_2x4zSD' and text()='Flights']")).click();

		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@data-checked='true' and text()='One Way']"))
				.click();
		WebElement from = driver
				.findElement(By.xpath("//div[@class='_3qBKP_ _1Jqgld']/input"));
		from.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Aurangabad']")).click();
		Thread.sleep(2000);

		WebElement to = driver.findElement(By.xpath(
				"//input[@class='_1w3ZZo _1YBGQV lZd1T6 _2dqBfU _2mFmU7']"));
		to.click();
		driver.findElement(By.xpath("//span[text()='Mumbai']")).click();
	}
	@Test
	// Check availablity of Flight

	public void test_57() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//p[@class='_2x4zSD' and text()='Flights']")).click();

		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@data-checked='true' and text()='One Way']"))
				.click();
		WebElement from = driver
				.findElement(By.xpath("//div[@class='_3qBKP_ _1Jqgld']/input"));
		from.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Aurangabad']")).click();
		Thread.sleep(2000);

		WebElement to = driver.findElement(By.xpath(
				"//input[@class='_1w3ZZo _1YBGQV lZd1T6 _2dqBfU _2mFmU7']"));
		to.click();
		driver.findElement(By.xpath("//span[text()='Mumbai']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement date = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
						"//button[@class='jkj0H4 _2v-mAi _3vGgRD' and text()='29']")));
		date.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Premium Economy']")).click();
		driver.findElement(
				By.xpath("//button[@class='aC49_F _14Me7y' and text()='Done']"))
				.click();
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _1QYQF8 _3dESVI' ]"))
				.click();
		Thread.sleep(3000);
		WebElement noflights = driver
				.findElement(By.xpath("//div[@class='heading']"));
		String exp = "Oops! No results found. Please try again";
		String actt = noflights.getText();
		if (exp.equals(actt)) {
			System.out.println("Flights Unavailable on the selected date");
		} else {
			System.out.println("Please Refresh the page");
		}

	}
	@Test

	// Entered search displays only search brand mobile (Expected and actual
	// comparison )

	public void test_58() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		driver.findElement(By.className("_1_3w1N")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Samsung Mobile");
		driver.findElement(
				By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
				.click();
		Thread.sleep(3000);
		WebElement mobile = driver
				.findElement(By.xpath("//div[@class='_4rR01T']"));
		String exptext = "SAMSUNG Galaxy F12 (Celestial Black, 64 GB)";
		String acttext = mobile.getText();
		if (exptext.equals(acttext)) {
			System.out.println("Displays Only Samsung brand Mobiles");
		} else {
			System.out.println("Displays another brand mobile also");
		}
	}
	@Test

	// Displays ratings and reviews near mobile

	public void test_59() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		driver.findElement(By.className("_1_3w1N")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Samsung M31 Ocean Blue");
		driver.findElement(
				By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
				.click();

		Thread.sleep(3000);
		WebElement mobileRR = driver
				.findElement(By.xpath("//span[@class='_2_R_DZ']"));
		String exptext = "3,962 Ratings & 317 Reviews";
		String acttext = mobileRR.getText();
		if (exptext.equals(acttext)) {
			System.out.println("Displays ratings and reviews with Mobiles");
		} else {
			System.out.println("Displays another textdata");
		}
	}

	@Test

	// Add to Compare check box availablity

	public void test_60() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		driver.findElement(By.className("_1_3w1N")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Samsung M31 Ocean Blue");
		driver.findElement(
				By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
				.click();

		Thread.sleep(3000);
		WebElement comparebox = driver
				.findElement(By.xpath("//div[@class='_3PzNI-']"));

		if (comparebox != null) {
			System.out.println("Add to compare checkbox and text is available");
		} else {
			System.out.println("Checkbox and text Unavailable");
		}
	}
	@Test

	// Add to Compare check box availablity

	public void test_61() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\shubh\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("smackdown");
		driver.findElement(
				By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		Actions act = new Actions(driver);
		Action sendEsc = act.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();

		driver.findElement(By.className("_1_3w1N")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Samsung M31 Ocean Blue");
		driver.findElement(
				By.xpath("//button[@class='L0Z3Pu' and @type='submit']"))
				.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_3_C9Hx']/div")).click();

		WebDriverWait wait = new WebDriverWait(driver, 25);
		boolean ele = wait
				.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//p[@class='_2x4zSD' and text()='Mobiles']")))
				.isDisplayed();

		if (ele) {
			System.out.println("You are Back on homepage");
		} else {
			System.out.println("Current page");
		}
	}

}
