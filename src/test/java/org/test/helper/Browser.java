package org.test.helper;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.test.config.BrowserConfiguration;

public class Browser {



    public WebDriver getBrowser(BrowserConfiguration config){
        if(config.getBrowser().equalsIgnoreCase("firefox")){
            //instantiate new firefox druiver
        }
        else{
            return getChromeBrowser(config); 
        }
        return null;
    }


    private WebDriver getChromeBrowser(BrowserConfiguration config){
        //System.setProperty("webdriver.chrome.driver", config.getDriverPath());
        ChromeOptions options = new ChromeOptions();
        options.setBinary((String) config.getChrome().get("binary"));

        if(config.getChrome().get("parameters") instanceof List){
            List<String> params = (List<String>) config.getChrome().get("parameters");
            if(null != params){
                for(String arg : params){
                    options.addArguments(arg);
                }
            } 
        }
       

        return new ChromeDriver(options);
    }

}
