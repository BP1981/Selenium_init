package com.bertpeters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {

        public static void main(String[] args) {
            WebDriver browser = new ChromeDriver();
            browser.get("http://www.bertpeters.be");

           // browser.quit();
          //  browser.close();
        }
    }

