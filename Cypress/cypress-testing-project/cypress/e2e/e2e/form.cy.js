describe("Requesting new password", () => {
	before(() => {
		cy.visit("http://zero.webappsecurity.com/")
	})
	it("should display feedback page", () => {
		cy.get("#feedback").click()
		cy.url().should("contain", "feedback.html")
	})

	it("should load feedback form ", () => {
		cy.contains("form").should("be.visible")
	})

	it("should fill feedback form", () => {
		cy.get("#name").type("a")
		cy.get("#email").type("a@gmail.com")
		cy.get("#subject").type("complain")
		cy.get("#comment").type("complaining alot")
	})

	it("should submit feedback form", () => {
		cy.get("input").contains("Send Message").click()
	})

	it("should display feedback message", () => {
		cy.get("div").should("contain", "Thank you for your comments")
	})
})
