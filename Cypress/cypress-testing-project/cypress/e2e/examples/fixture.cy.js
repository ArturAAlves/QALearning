describe("Login with Fixtures Data", () => {
	it("Should try to Login", () => {
		cy.visit("http://zero.webappsecurity.com/login.html")
		cy.fixture("user").then(user => {
			const username = user.username
			const password = user.password
			cy.get("#user_login").type(username)
			cy.get("#user_password").type(password)
           
		})
        cy.get("#user_remember_me").click()
	})
})
