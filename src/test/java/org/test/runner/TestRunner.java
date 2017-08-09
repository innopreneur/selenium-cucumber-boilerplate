package org.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = false, 
glue = {"org.test.testcases"},
features = {"src/test/features/"},
plugin = { "pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json" },
tags = {"@positive"}
)
public class TestRunner {}
