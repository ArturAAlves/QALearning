import Basepage from "cypress/page-objects/BasePage";
import FeedbackPage from "cypress/page-objects/pages/FeedbackPage";
import Navbar from "../page-objects/pages/components/Navbar";

describe("Fill form", () => {
  before(() => {
    FeedbackPage.visit();
  });

  it("should fill the form and submit", () => {
    FeedbackPage.fillForm();
    FeedbackPage.submitForm();
  });

  it("should display message confirming message was sent", () => {
    FeedbackPage.confirmSubmition();
  });


});
