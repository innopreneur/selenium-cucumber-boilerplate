package org.test.config;

import java.util.List;
import java.util.Map;

public class BrowserConfiguration {

    private String browser;
    private Map<String, Object> chrome;
    public String getBrowser() {
        return browser;
    }
    public void setBrowser(String browser) {
        this.browser = browser;
    }
    public Map<String, Object> getChrome() {
        return chrome;
    }
    public void setChrome(Map<String, Object> chrome) {
        this.chrome = chrome;
    }

}
