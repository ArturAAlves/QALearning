/// <reference types="Cypress" />
// Import commands.js using ES2015 syntax:
import "./commands"
import "./utils"
import "@percy/cypress"

import { addMatchImageSnapshotCommand } from "cypress-image-snapshot/command"

addMatchImageSnapshotCommand({
	failureTreshold: 0.0,
	failureTresholdType: "percent",
	customDiffConfig: { treshold: 0.0 },
	capture: "viewport",
})
