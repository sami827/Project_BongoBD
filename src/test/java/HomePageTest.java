import com.bongoBD.qa.base.BaseClass;
import com.bongoBD.qa.pages.ContentPage;
import com.bongoBD.qa.pages.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {

    private String EXPECTED_TITLE = "BONGO | Watch Live Tv, Bangla Movies, Natoks Anytime Anywhere";

    HomePage homePage;
    ContentPage contentPage;

    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        homePage = new HomePage();
        contentPage = new ContentPage();
    }

    //Verifying Page Title
    @Test(priority = 3)
    public void validatePageTitle() {
        String actualTitle = homePage.verifyTitle();
        Assert.assertEquals(actualTitle, EXPECTED_TITLE, "Title doesn't match");
    }

    //Verifying if the logo is present
    @Test(priority = 2)
    public void validatingPageLogo() {
        boolean flag = homePage.verifyLogo();
        Assert.assertTrue(flag);
    }


    @Test(priority = 1)
    public void clickingAmarBangladeshContent() throws InterruptedException {
        Thread.sleep(5000);
        contentPage = homePage.clickOnContent();
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
