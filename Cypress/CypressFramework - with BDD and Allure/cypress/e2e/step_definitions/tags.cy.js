import { Given, When, Then } from '@badeball/cypress-cucumber-preprocessor'

const LoginPage = require('../../pages/LoginPage')

Given('A web browser is at the saucelabs login page - tag demo', () => {
	cy.visit('https://www.saucedemo.com')
})

When(
	'A user enters the username {string}, the password {string}, and clicks on the login button - tag demo',
	(username, password) => {
		LoginPage.submitLogin(username, password)
	}
)

When(
	'A user provides incorrect credentials, and clicks on the login button - tag demo',
	table => {
		table.hashes().forEach(row => {
			cy.log(row.username)
			cy.log(row.password)
			LoginPage.submitLogin(row.username, row.password)
		})
	}
)
Then('the url will contains the inventory subdirectory - tag demo', () => {
	cy.url().should('contains', '/inventory.html')
})
Then('The error message {string} is displayed - tag demo', errorMessage => {
	LoginPage.elements.errorMessage().should('have.text', errorMessage)
})
