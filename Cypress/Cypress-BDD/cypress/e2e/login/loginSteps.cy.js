import { Given, When, Then } from 'cypress-cucumber-preprocessor/steps'
import LoginPage from './loginPage.cy'

Given('I open login page', () => {
	LoginPage.visit()
})

When('I fill username with {string}', username => {
	cy.log(username)
})

When('I fill password with {string}', password => {
	cy.log(password)
})

Then('I should see logout button', () => {
	cy.visit('http://zero.webappsecurity.com/')
})
