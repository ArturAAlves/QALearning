/* describe("My First Test", () => {
	it("Does not do much!", () => {
		expect(true).to.equal(true)
	})

	it("5 should be 5", () => {
		expect(5).to.equal(5)
	})
}) */

/* describe("browser actions", () => {
	it("should load corrent url", () => {
		cy.visit("http://example.com", { timeout: 10000 })
	})
	it("should check corret url", () => {
		cy.url().should("include", "example.com")
	})
	it("should check for correct element on the page", () => {
		cy.get("h1").should("be.visible")
	})
	it("should check for correct element on the page", () => {
		cy.get("h6").should("be.visible")
	})

	it("should wait for 3 secounds", () => {
		cy.wait(3000).get("h5").should('be.visible')
	})
})
 */

/* describe("browse actions", () => {
	it("should load books website", () => {
		cy.visit("http://books.toscrape.com/index.html"), { timeout: 1000 }
		cy.url().should("include", "books.toscrape.com")
	})
	it("should click on travel category button", () => {
		cy.get("a").contains("Travel").click()
	})

	it("should conatin tittle travel", () => {
		cy.get("h1").contains("Travel")
	})

	it("should display correct number of books", () => {
		cy.get(".product_pod").its("length").should("eq", 11)
	})
}) */

/* describe("check olio book price correspondes to 23.88", () => {
	it("should load books website", () => {
		cy.visit("http://books.toscrape.com/index.html"), { timeout: 1000 }
		cy.url().should("include", "books.toscrape.com")
		cy.reload()
	})
	it("should click on Poetry button", () => {
		cy.get("a").contains("Poetry").click()
	})

	it("should click on olio book", () => {
		cy.get("a").contains("Olio").click()
	})

	it("check if price is 23.88", () => {
		cy.get(".price_color").contains("23.88")
	})
}) */

describe("login validation in form", () => {
	it("open http://zero.webappsecurity.com/login.html", () => {
		cy.visit("http://zero.webappsecurity.com/login.html")
	})
})
