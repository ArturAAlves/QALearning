import { defineConfig } from "cypress";
const {
  addMatchImageSnapshotPlugin,
} = require("cypress-image-snapshot/plugin");

module.exports = {
  projectId: "t94w12",
  e2e: {
    setupNodeEvents(on, config) {
      addMatchImageSnapshotPlugin(on, config);
      // implement node event listeners here
    },
  },
  video: true,
  watchForFileChanges: false,
  chromeWebSecurity: false,
  waitForAnimations: true,
  animationDistanceThreshold: 20,
  defaultCommandTimeout: 5000,
  execTimeout: 60000,
  pageLoadTimeout: 5000,
  requestTimeout: 15000,
  responseTimeout: 15000,
};
