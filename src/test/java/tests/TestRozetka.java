package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RozetkaHomePage;
import pages.TestInit;
import utils.DriverBuffer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.*;

public class TestRozetka extends TestInit {

    @Test
    public void openRozetkaWebsite() {
        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage();

        rozetkaHomePage
                .open();

        Assert.assertTrue(rozetkaHomePage.rozetkaLogo().isDisplayed(), "Изображение Rozetka Logo не отображается на странице");


    }

    @Test
    public void testRozetkaSearchField() {
        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage();
        String expectedTitle = "iphone";

        List<String> actualTitles;
        actualTitles = rozetkaHomePage
                .open()
                .search(expectedTitle)
                .getItemsTitle();

        assertTrue(actualTitles.stream().allMatch(item -> item.toLowerCase().contains(expectedTitle)));
    }

//    public static void main(String[] args) {
//        List<String> arrayList = Arrays.asList("Andrii", "Vova", "Moma");
//
//        List<String> actualNames = arrayList
//                .stream().filter(name -> name.toLowerCase().startsWith("a")).collect(Collectors.toList());
//
//        System.out.println(actualNames);
//
//        String anyString = arrayList
//                .stream().findAny().orElseThrow();
//
//        List<Integer> intList = Arrays.asList(1, 0, 3, 4, 5);
//
//        Collections.sort(intList);
//
//        System.out.println(intList);
//    }
}
