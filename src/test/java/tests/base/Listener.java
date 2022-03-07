//package tests.base;
//
//import io.qameta.allure.Attachment;
//import org.apache.commons.io.FileUtils;
//import org.junit.jupiter.api.extension.ExtensionContext;
//import org.junit.jupiter.api.extension.TestWatcher;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Locale;
//
//
//public class Listener implements TestWatcher {
//
//    public static final Logger LOGGER = LoggerFactory.getLogger(Listener.class);
//
//    @Override
//    public void testFailed(ExtensionContext context,Throwable cause){
//        LOGGER.info("Test {} - FAILED!",context.getTestMethod().get().getName());
//        String screenshotName = context.getTestMethod().get().getName() + String.valueOf(System.currentTimeMillis())
//                        .substring(9,13);
//        LOGGER.info("Trying to trace screenShot...");
//        TakesScreenshot ts = (TakesScreenshot) ((BaseTest) context.getRequiredTestInstance()).driver;
//
//        File source = ts.getScreenshotAs(OutputType.FILE);
//        try {
//            FileUtils.copyFile(source,new File("build/reports/tests/" + screenshotName + ".png"));
//        } catch (IOException e){
//            LOGGER.info("Exception on saving screenshot");
//            e.printStackTrace();
//        }
//        attachScreenshotToAllure(ts);
//    }
//
//    @Attachment
//    public byte[] attachScreenshotToAllure(TakesScreenshot takesScreenshot){
//        return takesScreenshot.getScreenshotAs(OutputType.BYTES);
//    }
//}
