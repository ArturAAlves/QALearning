describe('empty spec', () => {
	it('check application.json', () => {
		cy.request('https://pokeapi.co/api/v2/pokemon/25').as('pokemon')
		cy.get('@pokemon')
			.its('headers')
			.its('content-type')
			.should('include', 'application/json; charset=utf-8')
	})

	it('checkstatus', () => {
		cy.request('https://pokeapi.co/api/v2/pokemon/25').as('response')
		cy.get('@response').its('status').should('equal', 200)
	})

	it('checkstatus with then', () => {
		cy.request('https://pokeapi.co/api/v2/pokemon/25').then(resp => {
			expect(resp.status).to.eq(200)
		})
	})

	it('Validate Name Value', () => {
		cy.request('https://pokeapi.co/api/v2/pokemon/25').as('response')
		cy.get('@response').its('body').should('include', { name: 'pikachu' })
	})

	it('check negative status', () => {
		cy.request({
			method: 'GET',
			url: 'https://pokeapi.co/api/v2/pokemon/21000',
			failOnStatusCode: false,
		}).as('response')
		cy.get('@response').its('status').should('equal', 404)
	})
  
  it('check negative status', () => {
		cy.request({
			method: 'GET',
			url: 'https://pokeapi.co/api/v2/pokemon/21000',
			failOnStatusCode: false,
		}).then(resp => {
			expect(resp.status).to.eq(404)
		})
	})
})
