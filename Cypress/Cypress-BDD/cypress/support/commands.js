// ***********************************************
// This example commands.js shows you how to
// create various custom commands and overwrite
// existing commands.
//
// For more comprehensive examples of custom
// commands please read more here:
// https://on.cypress.io/custom-commands
// ***********************************************
//
//
// -- This is a parent command --
// Cypress.Commands.add('login', (email, password) => { ... })
//
//
// -- This is a child command --
// Cypress.Commands.add('drag', { prevSubject: 'element'}, (subject, options) => { ... })
//
//
// -- This is a dual command --
// Cypress.Commands.add('dismiss', { prevSubject: 'optional'}, (subject, options) => { ... })
//
//
// -- This will overwrite an existing command --
// Cypress.Commands.overwrite('visit', (originalFn, url, options) => { ... })

/* Cypress.Commands.add("login", (username, password) => {
	cy.clearCookies()
	cy.clearLocalStorage()
	cy.get("#user_login").type(username)
	cy.get("#user_password").type(password)
    cy.get("#user_remember_me").click()
    cy.contains("Sign in").click()
}) */

Cypress.Commands.add("goTo", (website, incluededText) => {
	cy.visit(website)
	if (!incluededText) {
		cy.url().should("include", website)
	} else {
		cy.url().should("include", incluededText)
	}
})

Cypress.Commands.add("login", (username, password) => {
	cy.fixture("user").then(user => {
		cy.login(user.id, user.password)
	})
	cy.contains("Sign in").click()
})
