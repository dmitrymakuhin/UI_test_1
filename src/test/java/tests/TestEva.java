package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EvaHomePage;
import pages.TestInit;
import utils.DriverBuffer;

public class TestEva extends TestInit {

    @Test
    public void openEva(){
        EvaHomePage evaHomePage = new EvaHomePage();

        evaHomePage
                .open()
                .clickPickupIcon();

        Assert.assertTrue(evaHomePage.infoBunner().isDisplayed(), "not displayed nah");

    }

//    @Test
//    public void openBascket(){
//        EvaHomePage evaHomePage = new EvaHomePage();
//
//        evaHomePage
//                .open();
//
//
//    }
}
