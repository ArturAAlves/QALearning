describe("custom commands", () => {
	it("Should login to application using custmo cypress commands", () => {
		cy.visit("http://zero.webappsecurity.com/login.html")
		cy.login("username", "password")
	})
})
