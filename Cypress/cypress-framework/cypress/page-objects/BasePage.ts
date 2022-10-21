import { homepage_url } from "../config";

export default class Basepage {
  static pause(ms) {
    cy.wait(ms);
  }
  static logInfo(message) {
    cy.log(message);
  }

  static setMobileViewPort() {
    cy.viewport("iphone-x");
  }

  static setTabletViewPort() {
    cy.viewport("ipad-2");
  }

  static setDesktopViewPort() {
    cy.viewport("macbook-15");
  }

  static setLargeDesktopViewPort() {
    cy.viewport(1980, 1080);
  }

  static visit() {
    cy.visit(homepage_url);
  }
}
