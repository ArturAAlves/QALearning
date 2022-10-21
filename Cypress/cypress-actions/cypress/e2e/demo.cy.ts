describe('open page', () => {
	it('open url', () => {
		cy.waitForSeconds(3)
		cy.visitLoginpage()

		cy.fixture('loginData').then(({ username, password }) => {
			cy.login(username, password)
		})
	})
	it('submitfeedback', () => {
		cy.visitFeedbackpage()
		cy.submitFeedback('josé', 'a@adas.pt', 'pepetas', 'yaayay')
	})
})
