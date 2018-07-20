package SerenityCucumberDasBootTest.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("http://localhost:8080/index.html#/")
public class DictionaryPage extends PageObject {

    @FindBy(name="search")
    private WebElementFacade searchTerms;

    @FindBy(linkText="Click Here! »")
    private WebElementFacade lookupButton;

    @FindBy(xpath = "#/shipwrecks/1/view")
    private WebElementFacade U869btn;

    @FindBy(xpath = "#/shipwrecks/2/view")
    private WebElementFacade thistlegormbtn;



    public void enter_keywords(String keyword) {
        searchTerms.type(keyword);
    }

    public void lookup_terms() {
        lookupButton.click();
    }

    public void lookup_u869(){
        U869btn.click();
    }

    public void lookup_thistlegorm(){
        thistlegormbtn.click();
    }

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("tr"));
        List<WebElement> results = definitionList.findElements(By.tagName("td"));
        return convert(results, toStrings());
    }


    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
}