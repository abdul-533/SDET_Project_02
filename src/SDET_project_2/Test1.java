package SDET_project_2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test1 extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar.moveToElement(login).click().build();
        aksiyon.perform();
        MyFunc.Bekle(1);

        WebElement eMail = driver.findElement(By.xpath("//input[@id='Email']"));
        aksiyon = aksiyonlar.moveToElement(eMail).click().sendKeys("alperndemirciii@gmail.com").build();
        aksiyon.perform();

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        aksiyon = aksiyonlar.moveToElement(password).click().sendKeys("asdasd123").build();
        aksiyon.perform();

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
        aksiyon = aksiyonlar.moveToElement(loginButton).click().build();
        aksiyon.perform();

        WebElement computers = driver.findElement(By.xpath("//a[@href='/computers']"));
        aksiyon = aksiyonlar.moveToElement(computers).build();
        MyFunc.Bekle(3);
        aksiyon.perform();

        WebElement notebooks = driver.findElement(By.xpath("//a[@href='/notebooks']"));
        aksiyon = aksiyonlar.moveToElement(notebooks).click().build();
        MyFunc.Bekle(2);
        aksiyon.perform();
        MyFunc.Bekle(2);
        WebElement buyLaptop = driver.findElement(By.linkText("14.1-inch Laptop"));
        aksiyon = aksiyonlar.moveToElement(buyLaptop).click().build();

        aksiyon.perform();

        WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']"));
        aksiyon = aksiyonlar.moveToElement(addToCart).click().build();
        aksiyon.perform();

        WebElement addedToCart = driver.findElement(By.xpath("//*[@style='display: block;']"));
        Assert.assertTrue("Sepete Eklenemedi", addedToCart.isDisplayed());

        WebElement shoppingCart = driver.findElement(By.xpath("//a[text()='shopping cart']"));
        aksiyon = aksiyonlar.moveToElement(shoppingCart).click().build();
        aksiyon.perform();

        WebElement agree = driver.findElement(By.xpath("//input[@id='termsofservice']"));
        aksiyon = aksiyonlar.moveToElement(agree).click().build();
        aksiyon.perform();

        WebElement checkOut = driver.findElement(By.xpath("//*[@id='checkout']"));
        aksiyon = aksiyonlar.moveToElement(checkOut).click().build();

        aksiyon.perform();

//        WebElement company = driver.findElement(By.xpath("//*[@id='BillingNewAddress_Company']"));
//        aksiyon = aksiyonlar.moveToElement(company).click().sendKeys("asdasd").build();
//        MyFunc.Bekle(2);
//        aksiyon.perform();
//
//        WebElement country = driver.findElement(By.xpath("//*[@id='BillingNewAddress_CountryId']"));
//        aksiyon = aksiyonlar.moveToElement(country).click().build();
//        aksiyon.perform();
//        Select countrySelect = new Select(country);
//        countrySelect.selectByVisibleText("Turkey");
//
//        WebElement city = driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']"));
//        aksiyon = aksiyonlar.moveToElement(city).click().sendKeys("İzmir").build();
//        aksiyon.perform();
//
//        WebElement adress1 = driver.findElement(By.xpath("//*[@id='BillingNewAddress_Address1']"));
//        aksiyon = aksiyonlar.moveToElement(adress1).click().sendKeys("Bornova").build();
//        aksiyon.perform();
//
//        WebElement adress2 = driver.findElement(By.xpath("//*[@id='BillingNewAddress_Address2']"));
//        aksiyon = aksiyonlar.moveToElement(adress2).click().sendKeys("Kazımdirik").build();
//        aksiyon.perform();
//
//        WebElement zip = driver.findElement(By.xpath("//*[@id='BillingNewAddress_ZipPostalCode']"));
//        aksiyon = aksiyonlar.moveToElement(zip).click().sendKeys("24325").build();
//        aksiyon.perform();
//        MyFunc.Bekle(5);
//        WebElement phone = driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"));
//        aksiyon = aksiyonlar.moveToElement(phone).click().sendKeys("05555555555").build();
//        aksiyon.perform();
//        MyFunc.Bekle(5);
//        WebElement fax = driver.findElement(By.xpath("//*[@id='BillingNewAddress_FaxNumber']"));
//        aksiyon = aksiyonlar.moveToElement(fax).click().sendKeys("4343").build();
//
//        aksiyon.perform();
//        MyFunc.Bekle(5);
        WebElement continueButton = driver.findElement(By.xpath("//*[@onclick='Billing.save()']"));
        aksiyon = aksiyonlar.moveToElement(continueButton).click().build();
        aksiyon.perform();
        MyFunc.Bekle(5);

        WebElement continue2 = driver.findElement(By.xpath("//*[@onclick='Shipping.save()']"));
        aksiyon = aksiyonlar.moveToElement(continue2).click().build();
        aksiyon.perform();
        MyFunc.Bekle(5);

        WebElement continue3 = driver.findElement(By.xpath("//*[@onclick='ShippingMethod.save()']"));
        aksiyon = aksiyonlar.moveToElement(continue3).click().build();
        MyFunc.Bekle(5);

        aksiyon.perform();

        WebElement continue4 = driver.findElement(By.xpath("//*[@onclick='PaymentMethod.save()']"));
        aksiyon = aksiyonlar.moveToElement(continue4).click().build();
        MyFunc.Bekle(5);

        aksiyon.perform();

        WebElement continue5 = driver.findElement(By.xpath("//*[@onclick='PaymentInfo.save()']"));
        aksiyon = aksiyonlar.moveToElement(continue5).click().build();
        MyFunc.Bekle(5);

        aksiyon.perform();

        WebElement continue6 = driver.findElement(By.xpath("//*[@onclick='ConfirmOrder.save()']"));
        aksiyon = aksiyonlar.moveToElement(continue6).click().build();
        MyFunc.Bekle(5);

        aksiyon.perform();

        WebElement success = driver.findElement(By.xpath("//*[text()='Your order has been successfully processed!']"));
        Assert.assertTrue("Sipariş tamamlanamadı", success.getText().equals("Your order has been successfully processed!"));

        BekleKapat();
    }
}
