package Framawork;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import Framawork.Browse.DriverManager;
import Framawork.Browse.TypeBrowser;
import Framawork.Utils.FileOperation;

public class TestBase extends DriverManager{

    private static WebDriver driver;
    
    private static String URL = FileOperation.getProperties("url").getProperty("index");
    
    public static WebDriver getDriverManager () {
        driver = getDriver(TypeBrowser.CHROME);
        return driver;
    }
    
    @BeforeEach
    public void setup() {
        getDriverManager().get(URL);
    }
    
    @AfterEach
    public void finish() {
        quitDriver();
    }
}