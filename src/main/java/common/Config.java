package common;

import com.codeborne.selenide.Configuration;

public class Config {

    /**
     * Спецификация браузера
     * CHROME_WINDOWS
     * MOZILLA_WINDOWS
     */

    public static final String PLATFORM_AND_BROWSER = "CHROME_WINDOWS";

    /**
     * Очищает файлы cookies если true
     */
    public static final Boolean CLEAR_COOKIES = false;

    /**
     * Закрывает браузер если значение false
     */
    public static final Boolean HOLD_BROWSER_OPEN = true;

    /**
     * Очищает reports/tests если true
     */
    public static final Boolean CLEAR_REPORTS_DIT = false;

    static {
        Configuration.holdBrowserOpen = HOLD_BROWSER_OPEN;
        Configuration.reportsFolder = "build/reports/tests";
    }

}
