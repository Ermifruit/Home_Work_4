package forms;

import net.tanesha.recaptcha.ReCaptcha;
import net.tanesha.recaptcha.ReCaptchaResponse;
import newtest.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.Properties;

public class SendForm extends BaseElement {

    private String codPhone = "//*[@id=\"nat\"]";
    private String subCodPhone = "//*[@id=\"nat\"]/option[2]";
    private String writePhoneNumber = "//*[@id=\"war_phone\"]/input";
    private String writeLetterForMe = "//*[@id=\"war_message\"]/textarea";
    private String sendMessage = "//*[@id=\"mainContent\"]/div[4]/div/div[1]/form/div/table[3]/tbody/tr[2]/td/a/img";

    public SendForm() throws IOException {
    }

    public void compliteCheckForm (){

        WebElement phone = driver.findElement(By.xpath(codPhone));
        phone.click();
        WebElement subPhone = driver.findElement(By.xpath(subCodPhone));
        subPhone.click();
        WebElement phoneNumber = driver.findElement(By.xpath(writePhoneNumber));
        phoneNumber.sendKeys("3314680");
        WebElement writeLetter = driver.findElement(By.xpath(writeLetterForMe));
        writeLetter.sendKeys("Hello!! I'm Not Alkocholik");
        ReCaptcha reCaptcha = new ReCaptcha() {
            @Override
            public String createRecaptchaHtml(String s, Properties properties) {
                return null;
            }

            @Override
            public String createRecaptchaHtml(String s, String s1, Integer integer) {
                return null;
            }

            @Override
            public ReCaptchaResponse checkAnswer(String s, String s1, String s2) {
                return null;
            }
        };

        WebElement sendMes = driver.findElement(By.xpath(sendMessage));
        sendMes.click();




    }
}
