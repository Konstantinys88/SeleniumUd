package tests.telecomunications.positive;

import org.junit.jupiter.api.Test;
import pages.telecomunications.MobilePhoneReplenishmentPage;
import tests.base.BaseTest;

import static constants.Constant.MobileReplenishmentTestData.*;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneReplenishmentPositiveTest extends BaseTest {

    @Test
    public void checkIsRedirectToAuth(){
        basePage.goToURL(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.selectCardFromWallet();
        basePage.isAuthWidgetPresent();
    }

    @Test
    public void checkMinimumReplenishmentAmount(){
        basePage.goToURL(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .enterAmount("12")
                .enterCardFrom(MOBILE_PAYMENT_CARD)
                .enterCardExpDate(MOBILE_PAYMENT_CARD_EXP_DATE)
                .enterCvv(MOBILE_PAYMENT_CARD_CVV)
                .submitToTheCard()
//                .enterFirstName(FIRST_NAME)
//                .enterLastName(LAST_NAME)
//                .submitToTheCard()
                .checkPaymentDetailsIsPresentInCart("1Mobile payment. Phone number +380686979712");
    }

}
