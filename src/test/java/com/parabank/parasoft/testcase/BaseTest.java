package com.parabank.parasoft.testcase;

import com.parabank.parasoft.pages.BasePage;
import com.parabank.parasoft.pages.Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class BaseTest {
    WebDriver driver;
    Page page;
    private Properties properties;
    public BaseTest(){
        try {
            String filePath = System.getProperty("user.dir") + "/src/test/resources/config.properties";
            properties = new Properties();

            FileInputStream inputStream = new FileInputStream(filePath);
            properties.load(inputStream);
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    @BeforeMethod
    public void browserSetup() {
        String browserName = properties.getProperty("browserName");
        if (Objects.equals(browserName, "firefox")) {
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        } else if (Objects.equals(browserName, "chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (Objects.equals(browserName, "headless")) {
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("-headless");
            driver = new FirefoxDriver(options);
        } else {
            System.out.println("Browser Name is not found.");
        }

        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().window().maximize();

        page = new BasePage(driver);
    }

    // for login page
//    public String getUsername(){
//        return properties.getProperty("username");
//    }
//
//    public String getPassword(){
//        return properties.getProperty("password");
//    }

    // for register page
    String randomValue="01";
    public String getFirstname(){
        return properties.getProperty("firstname")+randomValue;
    }

    public String getLastname(){
        return properties.getProperty("lastname")+randomValue;
    }

    public String getAddress(){
        return properties.getProperty("address")+randomValue;
    }

    public String getCity(){
        return properties.getProperty("city")+randomValue;
    }

    public String getState(){
        return properties.getProperty("state")+randomValue;
    }

    public String getZipcode(){
        return properties.getProperty("zipcode")+randomValue;
    }

    public String getPhone(){
        return properties.getProperty("phone")+randomValue;
    }

    public String getSsn(){
        return properties.getProperty("ssn")+randomValue;
    }

    public String getUsername(){
        return properties.getProperty("username")+randomValue;
    }

    public String getPassword(){
        return properties.getProperty("password")+randomValue;
    }

    public String getConformPassword(){
        return properties.getProperty("confirmPassword")+randomValue;
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.quit();
        Thread.sleep(2000);
    }
}
