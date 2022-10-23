const pages = ["https://example.cypress.io"]
const sizes = ["iphone-6", "ipad-2", [1200, 800]]

describe("empty spec", () => {
	pages.forEach(page => {
		sizes.forEach(size => {
			it(`should visit page ${page} with ${size}`, () => {
				let currentTime = new Date(Date.UTC(2020, 1, 1)).getDate()
				cy.clock(currentTime)
				cy.setResolution(size)
				cy.visit(page)
				cy.matchImageSnapshot()
			})
		})
	})
})
