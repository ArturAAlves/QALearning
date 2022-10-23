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

/* failureTreshold: 0.0,
	failureTresholdType: "percent",
	customDiffConfig: { treshold: 0.0 },
	capture: "viewport", */


/* Cypress.Commands.add("goTo", (website, incluededText) => {
	cy.visit(website)
	if (!incluededText) {
		cy.url().should("include", website)
	} else {
		cy.url().should("include", incluededText)
	}
})
 */