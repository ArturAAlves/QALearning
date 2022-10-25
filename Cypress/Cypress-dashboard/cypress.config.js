const { defineConfig } = require('cypress')

module.exports = defineConfig({
	projectId: 't94w12',
	e2e: {
		setupNodeEvents(on, config) {
			// implement node event listeners here
		},
	},
})
