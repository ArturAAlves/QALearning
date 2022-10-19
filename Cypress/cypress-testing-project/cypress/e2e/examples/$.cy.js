describe("cypress.$", () => {
	it("should open website ", () => {
		cy.visit("https://devexpress.github.io/testcafe/example/")
	})

	it("Jquery selectors", () => {
		const item = Cypress.$("#populate")

        
        cy.log(item)
	})
})
