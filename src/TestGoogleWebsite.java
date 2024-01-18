import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

class TestGoogleWebsite {

	@Test
	void testSearchByKeyword() {
		WebDriver driver = null;
        System.setProperty("webdriver.edge.driver", "D:\\webdriveredge\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://www.google.com");
        
        WebElement search_box = driver.findElement(By.name("q"));
        search_box.sendKeys("NPRU");
        search_box.sendKeys(Keys.ENTER);
        
       String resute = driver.findElement(By.className("VuuXrf")).getText();
       assertEquals("����Է������Ҫ�ѯ��û��",resute);
       
       driver.close();
       
}
	
	@Test
	void testSearchByKeyword2() {
		WebDriver driver = null;
        System.setProperty("webdriver.edge.driver", "D:\\webdriveredge\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://www.google.com");
        
        WebElement search_box = driver.findElement(By.name("q"));
        search_box.sendKeys("KRU");
        search_box.sendKeys(Keys.ENTER);
        
       String resute = driver.findElement(By.className("VuuXrf")).getText();
       assertEquals("Kanchanaburi Rajabhat University",resute);
       
       driver.close();
       
}
}
