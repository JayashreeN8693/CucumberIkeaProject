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
  "status": "passed"
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
        "j",
        "@12345"
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
formatter.embedding("image/png", "embedded2.png");
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
formatter.embedding("image/png", "embedded3.png");
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
  "name": "User enter the inValid username \"j\"and invalid password\"@12345\"",
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
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "status": "passed"
});
});