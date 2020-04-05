"use strict";

// var webdriver = require("selenium-webdriver");
const { Builder, By, Key, until } = require("selenium-webdriver");

async function example() {
  let driver = await new Builder().forBrowser("firefox").build();
  // let driver = await new Builder().forBrowser("chrome").build();
  try {
    await driver.get("http://www.google.com/ncr");
    await driver.getTitle().then(function (title) {
      console.log("The title is: " + title);
    });

    await driver
      .findElement(By.name("q"))
      .sendKeys("webdriver", Key.RETURN)
      .then(() => console.log("Typed it"));
    await driver
      .wait(until.titleIs("webdriver - Google Search"), 10000)
      .then(() => console.log("The title is correct"));
  } finally {
    await driver.quit();
  }
}
example();
console.log("DONE...");
function handleFailure(err, driver) {
  console.error("Something went wrong!\n", err.stack, "\n");
  driver.quit();
}
