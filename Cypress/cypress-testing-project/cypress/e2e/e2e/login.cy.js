describe("Login / loggout test", () => {
	before(() => {
        cy.goTo("http://zero.webappsecurity.com/")


		cy.get("#signin_button").click()
	})

	it("should try to login with invalid data", () => {
		cy.get("#user_login").type("aaa")
		cy.get("#user_password").type("aaa")
		cy.contains("Sign in").click()
	})

	it("should display error message", () => {
		cy.get(".alert-error").should("contain", "Login and/or password are wrong.")
	})

	it("should login to application sucessfully", () => {
		cy.fixture("user").then(user => {
			cy.login(user.id, user.password)
		})
	})

	it("should logout from application", () => {
		cy.xpath("(//a[normalize-space()='username'])[1]").click()
		cy.wait(200)
		cy.get("#logout_link").click()
	})
})
