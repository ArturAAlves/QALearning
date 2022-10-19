describe("testing xpath", () => {
	it("should open website ", () => {
		cy.visit("https://devexpress.github.io/testcafe/example/")
	})

    it('should select input box', () => {
        cy.xpath("(//input[@id='developer-name'])[1]").type("hello world")
    });

})
