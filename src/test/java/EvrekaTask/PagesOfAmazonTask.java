package EvrekaTask.page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagesOfAmazonTask {

    public PagesOfAmazonTask(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // Can be used in the accept.cookie method
    @FindBy(xpath = "//input[@id='sp-cc-accept']")
    public WebElement clickCookie;

    //Location of the search box
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchBox;

    //Goal is without Sponsors result
    @FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[2]")
    public WebElement sendByAmazonRadioButtom;

    //Reaching the top element of the objective page
    @FindBy(xpath = "//img[@src='https://m.media-amazon.com/images/I/718mGZebybL._AC_UL320_.jpg']")
    public WebElement topPageElement;

    //Goal is iphone 13 text control
    @FindBy(xpath = "//div[@class='content-grid-block']/h3")
    public WebElement iphone13;

    //Accessing the target phone's memory
    @FindBy(xpath = "(//span[@class='selection'])[1]")
    public WebElement size;

    //Accessing the target phone's color
    @FindBy(xpath = "(//span[@class='selection'])[2]")
    public WebElement color;

    //Accessing the target phone's price
    @FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
    public WebElement priceFirst;

    //Accessing the target phone's price
    @FindBy(xpath = "(//span[@class='a-price-fraction'])[1]")
    public WebElement priceMiddle;

    //Accessing the target phone's price
    @FindBy(xpath = "(//span[@class='a-price-symbol'])[1]")
    public WebElement priceLast;

    //Accessing the target phone's stock situation
    @FindBy(xpath = "//span[@class='a-size-medium a-color-success']")
    public WebElement stock;

    //Goal is 256 gb button for the click
    @FindBy(xpath = "//li[@title='256 GB öğesini seçmek için tıklayın']")
    public WebElement size256gb;

    //Goal is 128 gb button for the click
    @FindBy(xpath = "//li[@title='128 GB öğesini seçmek için tıklayın']")
    public WebElement size128gb;
}