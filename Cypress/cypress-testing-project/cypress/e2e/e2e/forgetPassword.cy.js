describe("Requesting new password", () => {
	before(() => {
		cy.visit("http://zero.webappsecurity.com/")
	})

	it("should click on sign in button and land on login page", () => {
		cy.get("#signin_button").click()
		cy.url().should("contain", "http://zero.webappsecurity.com/login.html")
	})

	it("should click sign in button and land on forget password page", () => {
		cy.get("input").contains("Sign in").click()
		cy.get("a").contains("Forgot your password ?").click()
	})
	it("should click submit send password", () => {
		cy.get("input").contains("Send Password").click()
		cy.get("div").contains("Your password will be sent to the following email:")
	})
})
