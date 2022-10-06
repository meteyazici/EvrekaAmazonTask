package com.cydeo.EvrekaTask;

import com.cydeo.EvrekaTask.page.PagesOfAmazonTask;
import org.openqa.selenium.Keys;

public class Amazon {

    public static void main(String[] args) throws InterruptedException {


        PagesOfAmazonTask pagesOfAmazonTask = new PagesOfAmazonTask();

        //Go to website
        Driver.getDriver().get("https://www.amazon.com.tr");

        //Cookies removed
        pagesOfAmazonTask.clickCookie.click();

        //Writed expected words
        pagesOfAmazonTask.searchBox.sendKeys("iphone 13 512", Keys.ENTER);

        //sponsors removed
        pagesOfAmazonTask.sendByAmazonRadioButtom.click();

        //The element at the top of the page was clicked
        pagesOfAmazonTask.topPageElement.click();

        //Output for 512gb phone
        System.out.println(pagesOfAmazonTask.iphone13.getText()+ "   Size:" + pagesOfAmazonTask.size.getText());
        System.out.println("Color:"+pagesOfAmazonTask.color.getText() + "     Price:"+pagesOfAmazonTask.priceFirst.getText()+
                "," + pagesOfAmazonTask.priceMiddle.getText()+pagesOfAmazonTask.priceLast.getText());
        System.out.println("Stock:"+pagesOfAmazonTask.stock.getText());

        //256gb button clicked and waited 1 second for correct data
        pagesOfAmazonTask.size256gb.click();
        Thread.sleep(1000);

        //Output for 256gb phone
        System.out.println(pagesOfAmazonTask.iphone13.getText()+ "   Size:" + pagesOfAmazonTask.size.getText());
        System.out.println("Color:"+pagesOfAmazonTask.color.getText()+ "     Price:"+pagesOfAmazonTask.priceFirst.getText()+
                "," + pagesOfAmazonTask.priceMiddle.getText()+pagesOfAmazonTask.priceLast.getText());
        System.out.println("Stock:"+pagesOfAmazonTask.stock.getText());

        //128gb button clicked and waited 1 second for correct data
        pagesOfAmazonTask.size128gb.click();
        Thread.sleep(1000);

        //Output for 128gb phone
        System.out.println(pagesOfAmazonTask.iphone13.getText()+ "   Size:" + pagesOfAmazonTask.size.getText());
        System.out.println("Color:"+pagesOfAmazonTask.color.getText()+ "     Price:"+pagesOfAmazonTask.priceFirst.getText()+
                "," + pagesOfAmazonTask.priceMiddle.getText()+pagesOfAmazonTask.priceLast.getText());
        System.out.println("Stock:"+pagesOfAmazonTask.stock.getText());


    }
}