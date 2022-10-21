import Basepage from "cypress/page-objects/BasePage";
import { login_username, login_password } from "../config";
import Navbar from "../page-objects/pages/components/Navbar";
import LoginPage from "../page-objects/pages/LoginPage";

describe("login Failed Test", () => {
  before(() => {
    Basepage.visit();
    Navbar.clickSignInBtn();
  });

  it("should try to login using wrong credentials", () => {
    LoginPage.login("dsds", "dsads");
  });

  it("should return error ", () => {
    LoginPage.displayerrorMessage();
  });
});

describe("should login sucessfully", () => {
  before(() => {
    Basepage.visit();
    Navbar.clickSignInBtn();
  });

  it("should Login sucessfully", () => {
    LoginPage.login(login_username, login_password);
  });

  it("should logout", () => {
    Navbar.logout();
  });

  it("should contain Sign in Btn", () => {
    Navbar.checkSignInBtn();
  });
});
