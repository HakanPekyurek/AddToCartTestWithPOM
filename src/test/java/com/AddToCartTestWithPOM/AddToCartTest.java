package com.AddToCartTestWithPOM;

import org.testng.annotations.Test;
import pages.DetailPage;
import pages.ResutlPage;
import pages.TabBarPage;

public class AddToCartTest extends BaseTest {

    TabBarPage tabBarPage;
    ResutlPage resutlPage;
    DetailPage detailPage;

    @Test(priority = 1)
    public void searchProduct() {
        tabBarPage = new TabBarPage(driver);
        driver.get("https://www.n11.com/");
        tabBarPage.searhProduct("ekmek");
    }

    @Test(priority = 2)
    public void goToDetailPage() {
        resutlPage = new ResutlPage(driver);
        String resutlText = resutlPage.getResultText();
        softAssert.assertTrue(resutlText != null);
        resutlPage.clickProductImage();
    }

    @Test(priority = 3)
    public void clickAddToCart() {
        detailPage = new DetailPage(driver);
        String headerText = detailPage.getHeaderText();
        softAssert.assertTrue(headerText != null);
        detailPage.addToCartButtonClick();
    }

    @Test(priority = 4)
    public void controlProductInCart() {
        tabBarPage = new TabBarPage(driver);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int numberOfProduct = tabBarPage.getNumberOfProductInCart();
        softAssert.assertTrue(numberOfProduct > 0);
        tabBarPage.clickToBasket();
    }

    @Test(priority = 5)
    public void goToHomePage(){
        tabBarPage = new TabBarPage(driver);
        tabBarPage.clickHomePageButton();
    }
}
