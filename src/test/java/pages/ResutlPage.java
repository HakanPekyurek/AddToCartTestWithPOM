package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResutlPage {
    private final WebDriver driver;

    private final By resulTextLocator = By.className("resultText");
    private final By productImageLocator = By.cssSelector("div[class='imgHolder  cargoCampaign ']");

    public ResutlPage(WebDriver driver){
        this.driver = driver;
    }

    public String getResultText(){
        return driver.findElement(resulTextLocator).getText();
    }

    public void clickProductImage(){
        driver.findElement(productImageLocator).click();
    }
}
