package MyStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {

    WebDriver driver;
    @Given("User go to demoQA select menu")
    public void userGoToDemoQASelectMenu() {
        System.out.println("Enter");
        String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver");
        driver.get("https://demoqa.com/select-menu");
        driver = new ChromeDriver();
    }

    @When("User in “select menu” page")
    public void user_in_select_menu_page() {
        driver.findElement(By.xpath("//*[@id=\"withOptGroup\"]/div")).click();

    }

    @And("User choose select value “Another root option”")
    public void user_choose_select_value_another_root_option() {
        driver.findElement(By.xpath("//*[@id=\"react-select-2-input\"]")).click();
        driver.findElement(By.name("Another root option")).click();

    }

    @And("User choose select one “Other”")
    public void user_choose_select_one_other() {
        driver.findElement(By.xpath("//*[@id=\"selectOne\"]/div/div[1]/div[1]")).click();
        driver.findElement(By.name("Other")).click();
    }

    @And("User choose old style select menu “Aqua”")
    public void user_choose_old_style_select_menu_aqua() {
        driver.findElement(By.xpath("//*[@id=\"oldSelectMenu\"]")).click();
        driver.findElement(By.name("Aqua")).click();
    }

    @And("User choose multi select drop down “all color”")
    public void user_choose_multi_select_drop_down_all_color() {
        driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[1]/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[2]/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[3]/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[4]/div/div[1]")).click();
    }

    @Then("User success input all select menu")
    public void user_success_input_all_select_menu() {
        driver.close();
        driver.quit();

    }

    @Given("User go to page book store")
    public void userGoToPageBookStore() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver");
        driver.get("https://demoqa.com/books");
        driver = new ChromeDriver();

    }

    @When("User in “Book Store” page")
    public void userInBookStorePage() {
       WebElement getDisplayText = (WebElement) driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div"));
       String DisplayText = getDisplayText.getText();
       System.out.println(DisplayText);
       //to validate in correct page
        if ("Book Store".equals(DisplayText)) {
            System.out.println("correct page");
        } else {
            System.out.println("Incorrect page");;
        }

    }

    @And("User search book “qa engineer”")
    public void userSearchBookQaEngineer() {
        WebElement BookName = (WebElement) driver.findElements(By.xpath("//*[@id=\"searchBox\"]"));
        BookName.sendKeys("qa engineer");

    }

    @Then("User see “No rows found”")
    public void userSeeNoRowsFound() {
        WebElement getResult = (WebElement) driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[3]"));
        String Result = getResult.getText();
    }

    @And("User search book “Git Pocket Guide”")
    public void userSearchBookGitPocketGuide() {
        WebElement BookName = (WebElement) driver.findElements(By.xpath("//*[@id=\"searchBox\"]"));
        BookName.sendKeys("Git Pocket Guide");

    }

    @And("User click book “Git Pocket Guide”")
    public void userClickBookGitPocketGuide() {
        driver.findElement(By.xpath("//*[@id=\"see-book-Git Pocket Guide\"]/a")).click();
    }

    @Then("User see “Git Pocket Guide”")
    public void userSeeGitPocketGuide() {
        WebElement getTitle = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/label"));
        String Title = getTitle.getText();
        System.out.println("Title: " + getTitle);

        WebElement getAuthor = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/label"));
        String Author = getAuthor.getText();
        System.out.println("Author: " + getAuthor);

        WebElement getPublisher = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/label"));
        String Publisher = getPublisher.getText();
        System.out.println("Publisher: " + getPublisher);

    }
}