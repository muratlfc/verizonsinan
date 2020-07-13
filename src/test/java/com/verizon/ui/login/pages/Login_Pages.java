package com.verizon.ui.login.pages;

import com.verizon.ui.login.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Pages {



    public Login_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@aria-expanded='false'])[1]")
    public WebElement Phoneshoverover;

    @FindBy(xpath = "//a[@id='thirdLevel00']")
    public WebElement Smartphones;


    //@FindBy(xpath = "//div[text()='$7.49/mo']")
    //public WebElement samsungGalaxyA11;

    //@FindBy(xpath = "(//div[@class= 'textAlignRight'])[15]" )
    //public WebElement samsungNotePrice;

    //@FindBy(xpath = "//div[@style= 'background-color: rgb(215, 215, 215);']")
    //public WebElement colour;






}
