import { Given, When, Then } from 'cypress-cucumber-preprocessor/steps'

Given('I open login page', () => {
	cy.visit('http://zero.webappsecurity.com/')
})
When('I submit login', () => {
	cy.visit('http://zero.webappsecurity.com/')
})

Then('I should see logout button', () => {
	cy.visit('http://zero.webappsecurity.com/')
})
