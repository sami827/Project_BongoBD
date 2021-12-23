import com.bongoBD.qa.base.BaseClass;
import com.bongoBD.qa.pages.ContentPage;
import com.bongoBD.qa.pages.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContentPageTest extends BaseClass {

    HomePage homePage;
    ContentPage contentPage;
    JavascriptExecutor jse;


    public ContentPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        homePage = new HomePage();
        contentPage = homePage.clickOnContent();
    }


    @Test
    public void validatingContentTitle() {
        boolean flag = contentPage.verifyContent();
        Assert.assertTrue(flag);
    }


//    @Test
//    public void interactingVideoElements() throws InterruptedException {
//        contentPage.pauseVideo();
//    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        //driver.quit();
    }

}
