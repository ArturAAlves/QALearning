const { test, expect } = require("@playwright/test");

test.only("My first test", async ({ browser, page }) => {
  const data = { satandardUser: "standard_user", password: "secret_sauce" };
  const url = "https://www.saucedemo.com/";
  const inventoryUrl = "https://www.saucedemo.com/inventory.html";
  /* const context = await browser.newContext();
  const page = await context.newPage(); */
  const userNameField = page.locator("#user-name");
  const inputField = page.locator("#password");
  const loginBtn = page.locator("#login-button");
  const productNameList = page.locator(".inventory_item_name");
  const inventoryItemCard = page.locator(".inventory_item");

  await page.goto(url);

  await userNameField.type(data.satandardUser);
  await inputField.type(data.password);
  await loginBtn.click();
  await expect(page).toHaveURL(/.*inventory/);
  let teste = await productNameList.first();

  console.log(teste);
});
