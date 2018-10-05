package com.bertpeters;
//import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

//import static org.junit.Assert.assertTrue;

//import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {

        Webdriver driver = new ChromeDriver();
        driver.get("http://www.bertpeters.be");
        Thread.sleep(5000);
        driver.close();
        driver.quit();


        //assertTrue( true );
    }
}
