package TestFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class SearchCarFunc extends BasePage {
    public SearchCarFunc(WebDriver driver) {
        super(driver);
    }

    public By goTodetailSearch = By.linkText("Detaylı Arama");
    public By car = By.xpath("//*[contains(text(),'Vasıta')]");
    public By automobile = By.xpath("//*[contains(text(),'Otomobil')]");
    public By adressCity = By.cssSelector("#categoryMeta > div > table:nth-child(5) > tbody > tr:nth-child(1) > td.second > ul > li:nth-child(2) > a");
    public By selectAddressCity = By.xpath("//*[@data-id='34']");
    public By adressClose = By.cssSelector("#categoryMeta > div > table:nth-child(5) > tbody > tr:nth-child(1) > td.second > ul > li:nth-child(2) > div > a");
    public By priceMax = By.name("price_max");
    public By minYear = By.name("a5_min");
    public By fuelList = By.cssSelector("#categoryMeta > div > table:nth-child(5) > tbody > tr:nth-child(9) > td.second > dl > dd > div > div");
    public By selectFuel = By.cssSelector("#categoryMeta > div > table:nth-child(5) > tbody > tr:nth-child(9) > td.second > dl > dd > div > div > div > div.scroll-pane > ul > li:nth-child(2) > a > label");
    public By closeFuelList = By.cssSelector("#categoryMeta > div > table:nth-child(5) > tbody > tr:nth-child(9) > td.second > dl > dd > div > div > div > a");
    public By search = By.xpath("//*[@class='btn mtdef']");

    public void searchCar() {
        closePopUp();
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        element(goTodetailSearch).click();
        //driver.get("https://www.sahibinden.com/arama/detayli");
        element(car).click();
        element(automobile).click();
        element(adressCity).click();
        element(selectAddressCity).click();

        executor.executeScript("arguments[0].click();", element(adressClose));

        sendKeys(priceMax, "90000");
        sendKeys(minYear, "2015");
        element(fuelList).click();
        element(selectFuel).click();
        element(closeFuelList).click();

        executor.executeScript("arguments[0].click();", element(search));
    }
}
