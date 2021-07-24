package addremoveelements;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.addremoveelements.AddRemovePage;
import pages.checkboxes.CheckboxesPage;

public class AddRemoveTests extends BaseTest {

    @Test
    public void testAdd(){
        AddRemovePage addRemovePage = homePage3.clickOnAddRemoveElementLink();
        boolean addPage = addRemovePage.onClickAddElementButton();
        Assert.assertEquals(addPage,true);
    }

    @Test
    public void testRemove(){
        AddRemovePage addRemovePage = homePage3.clickOnAddRemoveElementLink();
        boolean removePage = addRemovePage.onClickRemoveElementButton();
        Assert.assertEquals(removePage,false);
    }
}
