export default class NavBar {
  static clickOnLogo() {
    cy.get(".brand").click();
  }
  static search(text: string) {
    cy.get("#searchTerm").type(`${text} {enter}`);
  }
  static clickSignInBtn() {
    cy.get("#signin_button").click();
  }
  static checkSignInBtn() {
    cy.isVisible("#signin_button");
  }

  static clickSettings() {
    cy.contains("stettings").click();
  }

  static logout() {
    cy.contains("username").click();
    cy.contains("Logout").click();
  }
}
