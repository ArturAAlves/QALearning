describe("scrolls on the page", () => {
	
    it("Should login to application using custmo cypress commands", () => {
		cy.visit("https://devexpress.github.io/testcafe/example/")
        cy.wait(500)
		cy.get("#submit-button").scrollIntoView()
        cy.wait(500)
        cy.get("header").scrollIntoView()
	})

})
