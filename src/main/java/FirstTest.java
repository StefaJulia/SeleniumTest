import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstTest {

    @Test
    public void CheckMinPaymentSum(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
        driver.get("https://next.privat24.ua/money-transfer/card");

        By NumberCardA = By.xpath("//input[@data-qa-node='numberdebitSource']");
        By dataCardA = By.xpath("//input[@data-qa-node='expiredebitSource']");
        By cvvCardA = By.xpath("//input[@data-qa-node='cvvdebitSource']");
        By firstNameCardA = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
        By lastNameCardA = By.xpath("//input[@data-qa-node='lastNamedebitSource']");

        By numberCardB = By.xpath("//input[@data-qa-node='numberreceiver']");
        By firstNameCardB = By.xpath("//input[@data-qa-node='firstNamereceiver']");
        By lastNameCardB = By.xpath("//input[@data-qa-node='lastNamereceiver']");
        By amount = By.xpath("//input[@data-qa-node='amount']");
        By currency = By.xpath("//button[@data-qa-value='UAH']");
        By currencyUSD = By.xpath("//button[@data-qa-value='USD']");
        By coment = By.xpath("//span[@data-qa-node='toggle-comment']");
        By comentEnter = By.xpath("//textarea[@data-qa-node='comment']");

        By confirButton = By.xpath("//button[@class='sc-VigVT hcHAAV']");

        driver.findElement(NumberCardA).sendKeys("4006 8956 8904 8337");
        driver.findElement(dataCardA).sendKeys("0323");
        driver.findElement(cvvCardA).sendKeys("480");
        driver.findElement(firstNameCardA).sendKeys("Andre");
        driver.findElement(lastNameCardA).sendKeys("Peterson");

        driver.findElement(numberCardB).sendKeys("4558032855841715");
        driver.findElement(firstNameCardB).sendKeys("Michel");
        driver.findElement(lastNameCardB).sendKeys("Jonson");
        driver.findElement(amount).sendKeys("900");
        driver.findElement(currency).click();
        driver.findElement(currencyUSD).click();
        driver.findElement(coment).click();
        driver.findElement(comentEnter).sendKeys("НА БРОНИКИ");

        driver.findElement(confirButton).click();

    }
}
