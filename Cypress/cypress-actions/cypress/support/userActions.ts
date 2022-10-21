declare namespace Cypress {
	interface Chainable {
		/**
		 *
		 *@param username - username or id info
		 *@param password - user password info
		 *
		 */
		login(username: string, password: string): Chainable<Element>

		/**
		 *
		 * @param name - takes name of the message author
		 * @param email - takes email of the message author
		 * @param subject - takes subject of the message
		 * @param message - body of the message
		 */
		submitFeedback(
			name: string,
			email: string,
			subject: string,
			message: string
		): Chainable<Element>
	}
}

Cypress.Commands.add('login', (username, password) => {
	cy.get('#user_login').type(username)
	cy.get('#user_password').type(password)
	cy.contains('Sign in').click()
})

Cypress.Commands.add('submitFeedback', (name, email, subject, message) => {
	cy.get('#name').type(name)
	cy.get('#email').type(email)
	cy.get('#subject').type(subject)
	cy.get('#comment').type(message)
	cy.contains('Send Message').click()
})
