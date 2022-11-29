package com.cucumber_demo.Hungama;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\KIIT\\eclipse-workspace\\Hungama\\Features", glue={"com.cucumber_demo.Hungama"} , publish=true)
public class Runner {

}
