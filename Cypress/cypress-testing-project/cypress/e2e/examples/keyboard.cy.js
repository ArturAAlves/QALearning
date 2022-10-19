describe("Keyboard press simulation", () => {
	it("should subit pressing enter", () => {
		cy.visit("http://zero.webappsecurity.com/")
		cy.get("#searchTerm").type("just some text {enter}")
	})
})
