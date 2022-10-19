describe("cypress.$", () => {
	before(() => {
		cy.visit("http://zero.webappsecurity.com/")
	})

	it("should type into search box and submit with enter key", () => {
		cy.get("#searchTerm").type("hello world {enter}")
	})

	it("should show results page", () => {
        cy.get("h2").should("contain","Search Results:")

    })
})
