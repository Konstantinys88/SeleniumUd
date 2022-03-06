package pages.telecomunications;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class MobilePhoneReplenishmentPage extends BasePage {

    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonWallet = By.xpath("//div[contains(text(), 'My wallet')]");
    private final By inputCardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']");
    private final By inputCardExpDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
    private final By inputCardCvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    private final By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
    private final By inputForAmount = By.xpath("//input[@data-qa-node='amount']");
    private final By buttonSubmitToTheCart = By.xpath("//button[@data-qa-node='submit']");
    private final By firstName = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
    private final By lastName = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
    private final By paymentDetails = By.xpath("//div[@data-qa-node='details']");


    /**
     *выбор карты
     */
    public MobilePhoneReplenishmentPage selectCardFromWallet() {
        driver.findElement(buttonWallet).click();
        return this;
    }

    /**
     *ввод номера телефона
     */
    public MobilePhoneReplenishmentPage enterPhoneNumber(String number){
        driver.findElement(inputPhoneNumber).sendKeys(number);
        return this;
    }

    /**
     *ввод суммы
     */
    public MobilePhoneReplenishmentPage enterAmount(String amount){
        driver.findElement(inputForAmount).sendKeys(amount);
        return this;
    }

    /**
     *ввод номера карты
     */
    public MobilePhoneReplenishmentPage enterCardFrom (String card){
        driver.findElement(inputCardFrom).sendKeys(card);
        return this;
    }

    /**
     *ввод даты карты
     */
    public MobilePhoneReplenishmentPage enterCardExpDate(String expDate){
        driver.findElement(inputCardExpDate).sendKeys(expDate);
        return this;
    }

    /**
     * ввод cvv
     */
    public MobilePhoneReplenishmentPage enterCvv(String cvv){
        driver.findElement(inputCardCvv).sendKeys(cvv);
        return this;
    }

    /**
     *кнопка добавить карту
     */
    public MobilePhoneReplenishmentPage submitToTheCard(){
        driver.findElement(buttonSubmitToTheCart).click();
        return this;
    }

    public MobilePhoneReplenishmentPage enterFirstName(String name){
        driver.findElement(firstName).sendKeys(name);
        return this;
    }

    public MobilePhoneReplenishmentPage enterLastName(String name){
        driver.findElement(lastName).sendKeys(name);
        return this;
    }

    public MobilePhoneReplenishmentPage checkPaymentDetailsIsPresentInCart(String text){
        waitElementIsVisible(driver.findElement(paymentDetails));
        WebElement details =  driver.findElement(paymentDetails);
        waitElementIsVisible(details);
        Assertions.assertEquals(text,details.getText());
        return this;
    }





}
