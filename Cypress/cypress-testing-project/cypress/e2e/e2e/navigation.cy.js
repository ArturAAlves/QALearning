describe("Navigation test", () => {
	before(() => {
		cy.visit("http://zero.webappsecurity.com/")
	})

	it("should display onlineBanking content", () => {
		cy.get("#onlineBankingMenu").click()
		cy.url().should("contain", "online-banking.html")
		cy.get("h1").should("contain", "Online Banking")
	})
	it("should display feedback content", () => {
		cy.get("#feedback").click()
		cy.url().should("eq", "http://zero.webappsecurity.com/feedback.html")
		cy.get("h3").should("contain", "Feedback")
	})
	it("should display homepage content", () => {
		cy.get(".brand").click()
		cy.url().should("eq", "http://zero.webappsecurity.com/index.html")
		cy.get("h4").should("contain", "Online Banking")
	})
})
