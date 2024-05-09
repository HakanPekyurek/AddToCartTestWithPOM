package pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TabBarPage {
    private final WebDriver driver;

    private final By homePageLogoLocator = By.cssSelector("a[class='logo  home ']");
    private final By searchBoxLocator = By.id("searchData");
    private final By cartLocator = By.className("basketTotalNum");
    private final By signUpLocator = By.className("btnSignUp");
    private final By signInLocator = By.className("btnSignIn");

    public TabBarPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searhProduct(String productName) {
        driver.findElement(searchBoxLocator).sendKeys(productName + Keys.ENTER);
    }

    public int getNumberOfProductInCart(){
        String numberOfProduct = driver.findElement(cartLocator).getText();
        return Integer.parseInt(numberOfProduct);
    }

    public void clickToBasket(){

        driver.findElement(cartLocator).click();
    }

    public void clickHomePageButton(){
        driver.findElement(homePageLogoLocator).click();
    }
}
