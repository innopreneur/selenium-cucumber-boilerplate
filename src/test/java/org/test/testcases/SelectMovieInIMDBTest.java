package org.test.testcases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.test.helper.Browser;
import org.testng.Assert;

import cucumber.api.java8.En;

public class SelectMovieInIMDBTest implements En {

    Logger log = LoggerFactory.getLogger(SelectMovieInIMDBTest.class);
    Browser browser = new Browser();
    WebDriver driver;
    WebElement movie,input;
    
    public SelectMovieInIMDBTest(){

        Given("^User opens browser$", () -> {
            driver = browser.getBrowser(TestBase.getConfig());
            log.info("Opened browser...");
            driver.manage().window().maximize();
        });

        When("^User navigates to IMDb using \"([^\"]*)\"$", (String arg1) -> {
            driver.get(arg1);
            log.info("Navigated to IMDb...");
        });

        Then("^User is able to see IMDb homepage with title \"([^\"]*)\"$", (String arg1) -> {
            assertTrue(driver.getTitle().contains(arg1));
            log.info("Title contains - " + arg1);
        });

        When("^User searches for movie \"([^\"]*)\"$", (String arg1) -> {
            input = driver.findElement(By.name("q"));
            input.clear();
            input.sendKeys(arg1);
            input.submit();
            log.info("Searched for movie - " + arg1);
        });

        Then("^User should see link to the movie$", () -> {
            movie = driver.findElement(By.xpath("//*[@id='main']/div/div[2]/table/tbody/tr[1]/td[2]/a"));
            assertTrue(movie.isDisplayed());
            log.info("Searched movie is displayed in the search results..");
        });

        When("^User clicks on the link to the movie$", () -> {
            movie.click();
            log.info("Searched movie is clicked..");
        });

        Then("^User should be navigated to the movie with title \"([^\"]*)\"$", (String arg1) -> {
            Assert.assertTrue(driver.getTitle().contains(arg1));
            log.info("Movie page contains title with - " + arg1);
            driver.quit();
        });

    }
}
