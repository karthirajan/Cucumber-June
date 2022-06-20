$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/MobilePurchase.feature");
formatter.feature({
  "name": "Mobile Purchase",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_launches_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user able to login flipkart with credentials",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_able_to_login_flipkart_with_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Mobile list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user search mobiles and choose by one dim list",
  "rows": [
    {
      "cells": [
        "iPhone",
        "SAMSUNG",
        "realme"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_search_mobiles_and_choose_by_one_dim_list(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user add mobile to addToCart and doing payment",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_add_mobile_to_addToCart_and_doing_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_validates_confirmation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});