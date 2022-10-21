declare namespace Cypress {
  interface Chainable {
    /**
     *Fill username and password input
     */
    login(username: string, password: string): Chainable<Element>;

    /**
     *Navigates to the home page of our application
     */
    visitHomepage(url: string): Chainable<Element>;

    /**
     * Checks if target @param selector is visible
     */
    isVisible(selector: string): Chainable<Element>;

    /**
     *Checks if target @param selector is exists
     */
    isHidden(selector: string): Chainable<Element>;

    /**
     *@param seconds - how many seconds should the execution wait
     */
    waitForSeconds(seconds: number): Chainable<Element>;

    /**
     *Sets target @param setResolution by array of hight and with or name (ex:"Iphone X")
     */
    setResolution(selector: any): Chainable<Element>;
  }
}

Cypress.Commands.add("visitHomepage", (url) => {
  cy.visit(url);
});

Cypress.Commands.add("login", (username, password) => {
  cy.get("#user_login").type(username);
  cy.get("#user_password").type(password);
  cy.contains("Sign in").click();
});

Cypress.Commands.add("isVisible", (selector) => {
  cy.get(selector).should("be.visible");
});

Cypress.Commands.add("isHidden", (selector) => {
  cy.get(selector).should("not.exist");
});

Cypress.Commands.add("setResolution", (size) => {
  if (Cypress._.isArray(size)) {
    cy.viewport(size[0], size[1]);
  } else {
    cy.viewport(size);
  }
});
