package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignupPageTest {
    @Test
    public void positiveTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys("Jane");
        driver.findElement(By.name("last_name")).sendKeys("Stone");
        driver.findElement(By.name("email")).sendKeys("jane.stone@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("ijkl890%");
        driver.findElement(By.name("password2")).sendKeys("ijkl890%");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    public void leaveAllNecessaryFieldsEmptyTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys("");
        driver.findElement(By.name("last_name")).sendKeys("");
        driver.findElement(By.name("email")).sendKeys("");
        driver.findElement(By.name("password1")).sendKeys("");
        driver.findElement(By.name("password2")).sendKeys("");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    public void checkFirstNameFieldNecessityTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys("");
        driver.findElement(By.name("email")).sendKeys("jane.stone@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("ijkl890%");
        driver.findElement(By.name("password2")).sendKeys("ijkl890%");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    public void checkEmailFieldNecessityTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys("Jane");
        driver.findElement(By.name("email")).sendKeys("");
        driver.findElement(By.name("password1")).sendKeys("ijkl890%");
        driver.findElement(By.name("password2")).sendKeys("ijkl890%");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    public void checkPasswordFieldNecessityTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys("Jane");
        driver.findElement(By.name("email")).sendKeys("jane.stone@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("");
        driver.findElement(By.name("password2")).sendKeys("ijkl890%");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    public void checkFieldConfirmPasswordNecessityTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys("Jane");
        driver.findElement(By.name("email")).sendKeys("jane.stone@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("ijkl890%");
        driver.findElement(By.name("password2")).sendKeys("");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    public void checkMarkedFieldsNecessityTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys("Jane");
        driver.findElement(By.name("email")).sendKeys("jane.stone@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("ijkl890%");
        driver.findElement(By.name("password2")).sendKeys("ijkl890%");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    public void spacesForAllNecessaryFieldsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys(" ");
        driver.findElement(By.name("email")).sendKeys(" ");
        driver.findElement(By.name("password1")).sendKeys(" ");
        driver.findElement(By.name("password2")).sendKeys(" ");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    //special symbols check
    public void textFieldTest1() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys("!@_");
        driver.findElement(By.name("email")).sendKeys("jane.stone@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("jkl000");
        driver.findElement(By.name("password2")).sendKeys("jkl000");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    //wildcards check
    public void textFieldTest2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys("&copy");
        driver.findElement(By.name("email")).sendKeys("jane.stone@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("jkl000");
        driver.findElement(By.name("password2")).sendKeys("jkl000");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    //html tags check
    public void textFieldTest3() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys("<b>hahaha</b>");
        driver.findElement(By.name("email")).sendKeys("jane.stone@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("jkl000");
        driver.findElement(By.name("password2")).sendKeys("jkl000");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    public void textFieldTest4() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys("Jane001");
        driver.findElement(By.name("email")).sendKeys("jane.stone@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("jkl000");
        driver.findElement(By.name("password2")).sendKeys("jkl000");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    public void textFieldTest5() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys("Джейн");
        driver.findElement(By.name("email")).sendKeys("jane.stone@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("jkl000");
        driver.findElement(By.name("password2")).sendKeys("jkl000");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    public void emailFieldTest1() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys("Jane");
        driver.findElement(By.name("email")).sendKeys("jane.stone@@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("jkl000");
        driver.findElement(By.name("password2")).sendKeys("jkl000");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    public void emailFieldTest2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys("Jane");
        driver.findElement(By.name("email")).sendKeys("jane.stone@gmail");
        driver.findElement(By.name("password1")).sendKeys("jkl000");
        driver.findElement(By.name("password2")).sendKeys("jkl000");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    //boundaries check ( value to check: 3)
    public void passwordFieldTest1() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys("Jane");
        driver.findElement(By.name("email")).sendKeys("jane.stone@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("111");
        driver.findElement(By.name("password2")).sendKeys("111");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    //boundaries check ( value to check: 4)
    public void passwordFieldTest2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys("Jane");
        driver.findElement(By.name("email")).sendKeys("jane.stone@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("1234");
        driver.findElement(By.name("password2")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    //boundaries check ( value to check: 5)
    public void passwordFieldTest3() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys("Jane");
        driver.findElement(By.name("email")).sendKeys("jane.stone@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    public void passwordConfirmationTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys("Jane");
        driver.findElement(By.name("email")).sendKeys("jane.stone@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("12345ui%");
        driver.findElement(By.name("password2")).sendKeys("54321rt!");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    public void alreadyRegisteredUserToSignUpTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys("Jane");
        driver.findElement(By.name("email")).sendKeys("jane.stone@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("56789ooo");
        driver.findElement(By.name("password2")).sendKeys("56789ooo");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=75201");
        driver.findElement(By.name("first_name")).sendKeys("Jane");
        driver.findElement(By.name("email")).sendKeys("jane.stone@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
    }




}
