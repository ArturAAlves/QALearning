import { defineConfig } from "cypress";
const {
  addMatchImageSnapshotPlugin,
} = require("cypress-image-snapshot/plugin");

export default defineConfig({
  e2e: {
    setupNodeEvents(on, config) {
     
      // implement node event listeners here
    },
  },
  watchForFileChanges: false,
  chromeWebSecurity: false,
  waitForAnimations: true,
  animationDistanceThreshold: 20,
  defaultCommandTimeout: 5000,
  execTimeout: 60000,
  pageLoadTimeout: 5000,
  requestTimeout: 15000,
  responseTimeout: 15000,
});

module.exports = {
  projectId: "t94w12",
  // The rest of the Cypress config options go here...
};
