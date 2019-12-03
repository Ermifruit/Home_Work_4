package newtest;

import org.testng.annotations.Test;
import pages.MainPage;
import java.io.IOException;
import java.util.logging.Logger;

public class A1_Test extends BaseTest {
    private Logger log = (Logger) Logger.getLogger(String.valueOf(TC_01_NavigationMenu.class));

    public A1_Test() throws IOException {
    }


    @Test
    public void A1_Test() throws IOException, InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.sendPost();


    }
}
