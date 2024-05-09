package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailPage {
    private final WebDriver driver;

    private final By addToCartButtonLocator = By.className("addBasketUnify");
    private final By headerDetailLocator = By.className("proName");

    public DetailPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCartButtonClick(){
        driver.findElement(addToCartButtonLocator).click();
    }

    public String getHeaderText(){
        return driver.findElement(headerDetailLocator).getText();
    }
}
