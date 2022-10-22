# RestAssured Automation

REST Assured is a Java DSL for simplifying testing of REST based services built on top of HTTP Builder. It supports POST, GET, PUT, DELETE, OPTIONS, PATCH and HEAD requests and can be used to validate and verify the response of these requests.

This test project using https://gorest.co.in/ GoRest API for testing.

## Getting started

### Step by step guide for the setup of Rest Assured.io
Step 1) Install Java

Step 2) Download an IDE to begin: eclipse or Visual Studio Code

Step 3) InstallMaven and set up your IDE.

Step 4) Make sure your following artifact dependencies in pom.xml

## Command Line - Maven

```bash
mvn clean verify -Dcucumber.filter.tags="<scenario-tag-name>" -Dtoken=<gorest-access-token>
```

## Serenity HTML Report
When you use a CucumberWithSerenity runner - after the execution of each feature, an HTML report is output to the target/site/serenity folder and the full path will be printed to the console.
```
html report: (paste into browser to view)
-----------------------------------------
file:///projects/myproject/target/site/serenity/serenity-summary.html
file:///projects/myproject/target/site/serenity/index.html
```

## Usage

To use Rest-assured, Serenity provides class SerenityRest:

```bash
import net.serenitybdd.rest.SerenityRest;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
```
and assertion capabilities by hamcrest matchers.
```bash
import static org.hamcrest.Matchers.*;
```

Please read more here [Serenity and Cucumber!](https://johnfergusonsmart.com/getting-started-with-rest-api-testing-with-serenity-and-cucumber/)