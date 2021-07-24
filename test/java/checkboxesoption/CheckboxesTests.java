package checkboxesoption;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.checkboxes.CheckboxesPage;
import pages.formauthentication.SecurePage;

public class CheckboxesTests extends BaseTest {

    @Test
    public void testSelectCheckbox1(){
        CheckboxesPage checkboxesPage = homePage2.clickOnChecksOptions();
        boolean checkbox1 = checkboxesPage.onClickSelectCheck1();
        Assert.assertEquals(checkbox1,true);
    }

    @Test
    public void testUnselectCheckbox2(){
        CheckboxesPage checkboxesPage = homePage2.clickOnChecksOptions();
        boolean checkbox2 = checkboxesPage.onClickUnselectCheck2();
        Assert.assertEquals(checkbox2,false);
    }
}
