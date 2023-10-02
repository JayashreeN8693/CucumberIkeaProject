$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FeatureFile/Ikea.feature");
formatter.feature({
  "name": "Validate the Shopping Functionality of IKEA",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@All"
    }
  ]
});
formatter.background({
  "name": "User should Launch Browser and Load the Url",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the Shopping Functionality by adding a prodruct to Cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@All"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User should should Click Products option from the page",
  "keyword": "When "
});
formatter.match({
  "location": "IkeaSteps.user_should_should_Click_Products_option_from_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click Storage and organization from dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "IkeaSteps.user_should_click_Storage_and_organization_from_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click Cabinets and Cupboards from options",
  "keyword": "And "
});
formatter.match({
  "location": "IkeaSteps.user_should_click_Cabinets_and_Cupboards_from_options()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click Storage units and Cabinets",
  "keyword": "And "
});
formatter.match({
  "location": "IkeaSteps.user_should_click_Storage_units_and_Cabinets()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click storage units and cabinets for home",
  "keyword": "And "
});
formatter.match({
  "location": "IkeaSteps.user_should_click_storage_units_and_cabinets_for_home()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should scrolldown and click the product",
  "keyword": "And "
});
formatter.match({
  "location": "IkeaSteps.user_should_scrolldown_and_click_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Use should click Add to Bag option",
  "keyword": "Then "
});
formatter.match({
  "location": "IkeaSteps.use_should_click_Add_to_Bag_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click continue to bag and click continue to checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "IkeaSteps.user_should_click_continue_to_bag_and_click_continue_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click guest login",
  "keyword": "Then "
});
formatter.match({
  "location": "IkeaSteps.user_should_click_guest_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter valid details in all fields",
  "keyword": "Then "
});
formatter.match({
  "location": "IkeaSteps.user_should_enter_valid_details_in_all_fields()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d117.0.5938.132)\nBuild info: version: \u00274.10.0\u0027, revision: \u0027c14d967899\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_371\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [8f2ee3e754f212a57879a3e67a78b8a9, sendKeysToElement {id\u003d1E5B5C8383A4B89B75C5B77A399781E5_element_137, value\u003d[Ljava.lang.CharSequence;@108531c2}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 117.0.5938.132, chrome: {chromedriverVersion: 117.0.5938.92 (67649b10b92b..., userDataDir: C:\\Users\\HP\\AppData\\Local\\T...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:51274}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:51274/devtoo..., se:cdpVersion: 117.0.5938.132, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nElement: [[ChromeDriver: chrome on windows (8f2ee3e754f212a57879a3e67a78b8a9)] -\u003e xpath: //input[@inputmode\u003d\u0027numeric\u0027]]\nSession ID: 8f2ee3e754f212a57879a3e67a78b8a9\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:199)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:132)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:51)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:196)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:171)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:531)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:242)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:111)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy21.sendKeys(Unknown Source)\r\n\tat org.SourceClass.UtilityClass.FilltextBox(UtilityClass.java:83)\r\n\tat org.IkeaStepDefrnition.IkeaSteps.user_should_enter_valid_details_in_all_fields(IkeaSteps.java:129)\r\n\tat ✽.User should enter valid details in all fields(src/test/resources/FeatureFile/Ikea.feature:16)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User should Launch Browser and Load the Url",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the search functionality of IKEA",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@All"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user should enter the Searchtext in Search Textbox",
  "keyword": "When "
});
formatter.match({
  "location": "IkeaSteps.user_should_enter_the_Searchtext_in_Search_Textbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select the item from the page",
  "keyword": "And "
});
formatter.match({
  "location": "IkeaSteps.user_should_select_the_item_from_the_page()"
});
formatter.result({
  "error_message": "junit.framework.AssertionFailedError: expected:\u003cfalse\u003e but was:\u003ctrue\u003e\r\n\tat junit.framework.Assert.fail(Assert.java:57)\r\n\tat junit.framework.Assert.failNotEquals(Assert.java:329)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:78)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:174)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:181)\r\n\tat org.IkeaStepDefrnition.IkeaSteps.user_should_select_the_item_from_the_page(IkeaSteps.java:156)\r\n\tat ✽.User should select the item from the page(src/test/resources/FeatureFile/Ikea.feature:21)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validate the login functionality of IKEA",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User Launch the Browser and Load the Url",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter the inValid username \"\u003cUserName\u003e\"and invalid password\"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should click continue button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ]
    },
    {
      "cells": [
        "jayashreen8693@gmail.com",
        "Jaiikea@8693"
      ]
    },
    {
      "cells": [
        "sabari",
        "sabari@123"
      ]
    },
    {
      "cells": [
        "jayashreen8693@gmail.com",
        "12345"
      ]
    }
  ]
});
formatter.background({
  "name": "User should Launch Browser and Load the Url",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the login functionality of IKEA",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@All"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User Launch the Browser and Load the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "IkeaSteps.user_Launch_the_Browser_and_Load_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the inValid username \"jayashreen8693@gmail.com\"and invalid password\"Jaiikea@8693\"",
  "keyword": "When "
});
formatter.match({
  "location": "IkeaSteps.user_enter_the_inValid_username_and_invalid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click continue button",
  "keyword": "And "
});
formatter.match({
  "location": "IkeaSteps.user_should_click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User should Launch Browser and Load the Url",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the login functionality of IKEA",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@All"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User Launch the Browser and Load the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "IkeaSteps.user_Launch_the_Browser_and_Load_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the inValid username \"sabari\"and invalid password\"sabari@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "IkeaSteps.user_enter_the_inValid_username_and_invalid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click continue button",
  "keyword": "And "
});
formatter.match({
  "location": "IkeaSteps.user_should_click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User should Launch Browser and Load the Url",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the login functionality of IKEA",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@All"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User Launch the Browser and Load the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "IkeaSteps.user_Launch_the_Browser_and_Load_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the inValid username \"jayashreen8693@gmail.com\"and invalid password\"12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "IkeaSteps.user_enter_the_inValid_username_and_invalid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click continue button",
  "keyword": "And "
});
formatter.match({
  "location": "IkeaSteps.user_should_click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});