describe('empty spec', () => {
	it('passes', () => {
		cy.visit('https://devexpress.github.io/testcafe/example/')
    cy.get("#developer-name").type(("text"))
    cy.get("#macos").click()
    cy.get("#preferred-interface").select("JavaScript API")
	})
})
