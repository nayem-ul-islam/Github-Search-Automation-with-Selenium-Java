package pages.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.WebPage;
import pages.components.impl.SearchComponent;


public class HomePage extends WebPage {

    private static final By SEARCH_COMPONENT_SELECTOR = By.cssSelector("[name='q']");
    public HomePage(WebDriver driver){
        super(driver);
    }
    public SearchComponent searchComponent(){
        return new SearchComponent(findElement(SEARCH_COMPONENT_SELECTOR));
    }
}
