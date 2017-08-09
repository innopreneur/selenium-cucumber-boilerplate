package org.test.testcases;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.test.config.BrowserConfiguration;
import org.yaml.snakeyaml.Yaml;

import cucumber.api.java.Before;

public class TestBase {
    private static BrowserConfiguration config;

    public static BrowserConfiguration getConfig() {
        System.out.println("Prop: " +  System.getProperty("webdriver.chrome.driver"));
        return config;
    }


    @Before
    public void setupTestEnvironment() throws IOException{
        InputStream input = null;
        Yaml yaml = new Yaml();  
        input = Files.newInputStream( Paths.get("config/TestProperties.yml")); 
             config = yaml.loadAs(input, BrowserConfiguration.class);
             System.setProperty("webdriver.chrome.driver", (String) config.getChrome().get("driverPath"));
    }
}
