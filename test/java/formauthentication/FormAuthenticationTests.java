package formauthentication;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.formauthentication.LoginPage;
import pages.formauthentication.SecurePage;

public class FormAuthenticationTests extends BaseTest {

    @Test
    public void registerFormAuthentication(){
        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
        SecurePage securePage = loginPage.clickOnLoginButton("tomsmith","SuperSecretPassword!");
        Assert.assertEquals(securePage.getLoadedText(),"Welcome to the Secure Area. When you are done click logout below.");

    }

}
