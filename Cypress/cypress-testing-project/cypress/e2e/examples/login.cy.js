describe("login validation in form", () => {
	it("should override the current time", () => {
		const date = new Date(2020, 3, 10).getTime()
		cy.clock(date)
		cy.log(date)
	})

	it("should open http://zero.webappsecurity.com/login.html", () => {
		cy.visit("http://zero.webappsecurity.com/login.html")
		cy.clearCookie("your item", { log: true })
		cy.clearLocalStorage("your item", { log: true })
		cy.title().should("include", "Zero - Log in")
	})

	it("should fill the username", () => {
		cy.get("#user_login").as("username")
		cy.get("@username").clear().type("hello"), { delay: 200 }
	})

	it("should fill the password", () => {
		cy.get("#user_password").clear().type("hello"), { delay: 255 }
	})

	it("should mark checkbox", () => {
		cy.get("#user_remember_me").click()
		cy.wait(2000)
	})

	it("should submit login form", () => {
		cy.contains("Sign in").click()
	})

	it("should display error message", () => {
		cy.get(".alert-error")
			.should("be.visible")
			.and("contain", "Login and/or password are wrong")
	})
})
