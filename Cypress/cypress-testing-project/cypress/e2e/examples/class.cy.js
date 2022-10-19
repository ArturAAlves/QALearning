class BasePage {
	static loadHomePage() {
		cy.visit("https://devexpress.github.io/testcafe/example/")
	}

	static wait(number) {
		cy.wait(number)
	}
}

class HomePage extends BasePage {
	static scrollIntoView() {
		cy.get("#submit-button").scrollIntoView()
	}
	static scrollToBottom() {
		cy.get("header").scrollIntoView()
	}
}

describe("Abstraction with classes", () => {
	before(() => {
		HomePage.loadHomePage()
	})
	after(() => {
		//test cleaner
		//clean local storage
		
	})

	beforeEach(() => {
		//runs before each IT
	})

	afterEach(() => {
		//runs after each IT
	})

	it.skip("1st it", () => {
		HomePage.wait(2000)
		HomePage.scrollIntoView()
		HomePage.wait(2000)
		HomePage.scrollToBottom()
	})

	it.only("2nd it", () => {
		HomePage.wait(2000)
		HomePage.scrollIntoView()
		HomePage.wait(2000)
		HomePage.scrollToBottom()
	})
})
