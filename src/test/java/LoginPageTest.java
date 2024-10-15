import org.example.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest {
    WebDriver driver;
    LoginPage loginPage ;
//
@BeforeMethod
    public void setUP() {
    // Initialize the WebDriver (ChromeDriver)
    driver = new ChromeDriver();
    loginPage = new LoginPage(driver);// Instantiate the LoginPage object
    loginPage.getUrl("https://thatsoundsdope.com/");
    driver.manage().window().maximize();
        }
    @Test
    public void testLogin(){
    loginPage.clickOnSigninFelid();   // Click on the sign-in field (navigation)
    // Enter username and password
    loginPage.enterUserName("vivekgawade08@gmail.com");
    loginPage.enterPassword("Tapy@1973");
    loginPage.ClickSingIntoAccount();        // Click to sign in


    }
    @AfterMethod
    public void closeBrowser(){
    loginPage.tearDown();
    }



}


