$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/deeksha/eclipse-workspace/CucumberPOM/src/main/java/com/qa/features/shopDemoQA.feature");
formatter.feature({
  "line": 1,
  "name": "Shop Demo QA POM Feature",
  "description": "",
  "id": "shop-demo-qa-pom-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 42129352108,
  "status": "passed"
});
formatter.before({
  "duration": 64490647132,
  "status": "passed"
});
formatter.before({
  "duration": 55373267653,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Shop Demo QA Landing page scenario",
  "description": "",
  "id": "shop-demo-qa-pom-feature;shop-demo-qa-landing-page-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Title of Home page is Shop Demo QA",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User moves to login page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.title_of_page_is_Shop_Demo_QA()"
});
formatter.result({
  "duration": 145998775,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.user_is_redirected_to_login_page()"
});
formatter.result({
  "duration": 2470887109,
  "status": "passed"
});
formatter.before({
  "duration": 88147753983,
  "status": "passed"
});
formatter.before({
  "duration": 60641671996,
  "status": "passed"
});
formatter.before({
  "duration": 63710258089,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Shop Demo QA Register scenario",
  "description": "",
  "id": "shop-demo-qa-pom-feature;shop-demo-qa-register-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Title of Register page is My Account",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enter register details username and email_address and password",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User redirects",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterPageStepDef.title_of_page_is_My_Account()"
});
formatter.result({
  "duration": 8577225,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageStepDef.user_enter_register_details_username_and_email_address_and_password()"
});
formatter.result({
  "duration": 19467768347,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.before({
  "duration": 58203010790,
  "status": "passed"
});
formatter.before({
  "duration": 100686012699,
  "status": "passed"
});
formatter.before({
  "duration": 78094718689,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Shop Demo QA Login scenario",
  "description": "",
  "id": "shop-demo-qa-pom-feature;shop-demo-qa-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Title of Login page is My Account",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User enter login details username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDef.title_of_page_is_My_Account()"
});
formatter.result({
  "duration": 16647214,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDef.user_enter_login_details_username_and_passwords()"
});
formatter.result({
  "duration": 181860006,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#username\"}\n  (Session info: chrome\u003d83.0.4103.116)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Administrators-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:1c62:d754:18c6:9888%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14\u0027, java.version: \u002711.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: /var/folders/td/l7znmbyn38g...}, goog:chromeOptions: {debuggerAddress: localhost:51457}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: ef94fd54a5f0e2aabf7f2db2f445fc32\n*** Element info: {Using\u003did, value\u003dusername}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy17.sendKeys(Unknown Source)\n\tat com.qa.pages.LoginPage.logIn(LoginPage.java:35)\n\tat com.qa.StepDefinitions.LoginPageStepDef.user_enter_login_details_username_and_passwords(LoginPageStepDef.java:45)\n\tat ✽.Then User enter login details username and password(/Users/deeksha/eclipse-workspace/CucumberPOM/src/main/java/com/qa/features/shopDemoQA.feature:14)\n",
  "status": "failed"
});
});