describe("Device Test", () => {
	it("720p", () => {
		cy.viewport(1280, 720)
		cy.visit("http://www.example.com")
	})

	it("1080p", () => {
		cy.viewport(1980, 1080)
		cy.visit("http://www.example.com")
	})

	it("Iphone x", () => {
		cy.viewport("iphone-x")
		cy.visit("http://www.example.com")
	})

	it("Ipad mini", () => {
		cy.viewport("ipad-mini")
		cy.visit("http://www.example.com")
	})
})
