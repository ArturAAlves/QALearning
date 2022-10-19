describe("Write /read data to JSON / text file", () => {
	it("should write data into JSON", () => {
		cy.writeFile("log.json", { name: "mike", age: 25 })
	})

	it("should write data into text file", () => {
		cy.writeFile("log.txt", "hello , how are yout")
	})

	it("should data from json file", () => {
		cy.readFile("log.json").its("age").should("eq", 25)
	})

	it("should data from log.txt", () => {
		cy.readFile("log.txt").should("eq", "hello , how are yout")
	})
})

describe("validate browser document content ", () => {
	it("should visit devexpress", () => {
		cy.visit("https://devexpress.github.io/testcafe/example/")
		cy.wait(2000)
		cy.document().its("contentType").should("eq", "text/html")
		cy.document().should("have.property", "charset").and("eq", "UTF-8")
	})
})
