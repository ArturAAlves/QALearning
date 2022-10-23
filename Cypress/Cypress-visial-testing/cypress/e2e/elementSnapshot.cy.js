const pages = ["https://example.cypress.io"]

describe("element snapshot", () => {
	it("visit page and take snapshot", () => {
		cy.visit(pages[0])
		cy.get(".banner").matchImageSnapshot({
			failureThreshold: 10.0,
			failureThresholdType: "pixel",
		})
	})
})
