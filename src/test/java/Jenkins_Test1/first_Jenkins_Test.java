package Jenkins_Test1;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class first_Jenkins_Test {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/SPARK/workspace/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.apple.com/ru/iphone");
    }

    @Test
    public void buyIphone() {

        System.out.println("Page title is: " + driver.getTitle());

        WebElement newIphone = driver.findElement(By.cssSelector(".chapternav-icon"));
        newIphone.click();

        WebElement buyIphone = driver.findElement(By.cssSelector(".ac-ln-button"));
        buyIphone.click();

        WebElement buyIphoneNextStep = driver.findElement(By.cssSelector(".button.as-button-small"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        buyIphoneNextStep.click();

        WebElement colorIphone = driver.findElement(By.xpath(".//*[@id='tabs_dimensionColor']/fieldset/ul/li[2]/div/div[2]/img"));
        colorIphone.click();

        System.out.println("Page title is: " + driver.getTitle());

        WebElement howManyGb = driver.findElement(By.cssSelector(".as-dimension-capacity-text"));
        howManyGb.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement Add = driver.findElement(By.cssSelector(".button.as-button-large.as-button-block"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Add.click();

        WebElement myOrder = driver.findElement(By.cssSelector(".merchandising.button"));
        myOrder.click();

        WebElement buy = driver.findElement(By.id("cart-actions-checkout"));
        buy.click();

        System.out.println("Page title is: " + driver.getTitle());

        WebElement IamGuest = driver.findElement(By.id("guest-checkout"));
        IamGuest.click();

        WebElement buyMyOrder = driver.findElement(By.id("cart-continue-button"));
        buyMyOrder.click();

        WebElement firstName = driver.findElement(By.xpath(".//*[@id='shipping-user-firstName']"));
        firstName.sendKeys("Alex");

        WebElement lastName = driver.findElement(By.xpath(".//*[@id='shipping-user-lastName']"));
        lastName.sendKeys("Bahota");

        WebElement mobile = driver.findElement(By.xpath(".//*[@id='shipping-user-daytimePhone']"));
        mobile.sendKeys("80931111111");

        WebElement street = driver.findElement(By.xpath(".//*[@id='shipping-user-street']"));
        street.sendKeys("ul.Kurchenskaya");

        WebElement street2 = driver.findElement(By.xpath(".//*[@id='shipping-user-street2']"));
        street2.sendKeys("111");

        WebElement district = driver.findElement(By.xpath(".//*[@id='shipping-user-district']"));
        district.click();
        WebElement district2 = driver.findElement(By.xpath(".//*[@id='coherent_id_214']"));
        district2.click();

        WebElement city = driver.findElement(By.xpath(".//*[@id='shipping-user-city']"));
        city.sendKeys("Russian city");

        WebElement postalCode = driver.findElement(By.xpath(".//*[@id='shipping-user-postalCode']"));
        postalCode.sendKeys("614018");

        WebElement emailAddress = driver.findElement(By.xpath(".//*[@id='shipping-user-emailAddress']"));
        emailAddress.sendKeys("Russell@gmail.com");

        WebElement mobilePhone = driver.findElement(By.xpath(".//*[@id='shipping-user-copyShippingAddressPhone']"));
        mobilePhone.click();

        WebElement continueSubmit = driver.findElement(By.xpath(".//*[@id='shipping-continue-button']"));
        continueSubmit.click();

        System.out.println("Page title is: " + driver.getTitle());

    }

}
