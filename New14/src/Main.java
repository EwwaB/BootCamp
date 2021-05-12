import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;



public class Main {

    @Test

    public  void openHomePage( ) {
        WebDriver driver = new ChromeDriver ( );
        driver.get ( "http://sampleshop.inqa.pl/9-art" );
        WebElement ArtElement = driver.findElement ( By.xpath ( "/html/body/main/header/div[2]/div/div[1]/div[2]/div[1]/ul/li[3]/a" ) );

        WebElement SearchArticle = driver.findElement ( By.xpath ( "/html/body/main/header/div[2]/div/div[1]/div[2]/div[2]/form/input[2]" ) );

        String pageTitle = driver.getTitle ( );
        String pageUrl = driver.getCurrentUrl ( );

        Assert.assertEquals ( pageTitle, "Art" );
        Assert.assertEquals ( pageUrl, "http://sampleshop.inqa.pl/9-art" );


        SearchArticle.click ( );
        SearchArticle.sendKeys ( "brown bear notebook" );
        WebElement look = driver.findElement ( By.xpath ( "//*[@id=\"search_widget\"]/form/button/i" ) );
        look.click ( );


        String pageURLaftersearch = driver.getCurrentUrl ( );

        Assert.assertEquals ( pageURLaftersearch, "http://sampleshop.inqa.pl/szukaj?controller=search&s=brown+bear+notebook" );

        
    }
    }
