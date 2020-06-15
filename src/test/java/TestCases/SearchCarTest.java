package TestCases;

import Listener.Listener;
import TestFunctions.SearchCarFunc;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.BaseTest;

@Listeners({Listener.class})
public class SearchCarTest extends BaseTest {

    @Test
    public void searchCar() {
        SearchCarFunc searchCarFunc = new SearchCarFunc(driver);
        searchCarFunc.searchCar();
    }
}
