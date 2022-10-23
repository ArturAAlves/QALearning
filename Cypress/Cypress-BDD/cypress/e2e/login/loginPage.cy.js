const url = 'http://zero.webappsecurity.com/'
export default class LoginPage {
	static visit() {
		cy.visit(url)
	}
}
