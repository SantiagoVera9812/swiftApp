package com.mycompany.app;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
// Generated by Selenium IDE
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BuscarPersonaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeEach
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterEach
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void buscarPersona() {
    driver.get("https://app.starmeup.com/home");
    driver.manage().window().setSize(new Dimension(1106, 966));
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement searchElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".main-search")));
searchElement.click();
    driver.findElement(By.cssSelector(".main-search__input")).click();
    driver.findElement(By.cssSelector(".main-search__input")).sendKeys("Carlos Sandoval");
    driver.findElement(By.cssSelector(".main-search-list-item:nth-child(2) .main-search-list-item__name")).click();
    driver.findElement(By.cssSelector(".profile-metric__link:nth-child(2) .profile-metric-content")).click();
    driver.findElement(By.cssSelector("div:nth-child(1) > div > .bg-white .suite-ui-card-section > .flex:nth-child(2)")).click();
  }
}