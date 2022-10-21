import Basepage from "../BasePage";

export default class LoginPage extends Basepage {
  static login(username: string, password: string) {
    cy.login(username, password);
  }

  static clickForgotPasswordLink() {
    cy.contains("Forgot your password ?").click();
  }

  static displayerrorMessage() {
    /*     cy.get(".alert-error").should("be.visible") */
    cy.isVisible(".alert-error");
  }
}
