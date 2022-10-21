import Basepage from "../BasePage";
import { feedbackpage_url } from "../../config";

export default class FeedbackPage extends Basepage {
  static visit() {
    cy.visit(feedbackpage_url);
  }

  static fillForm() {
    cy.fixture("form").then(({ formData }) => {
      cy.get("#name").type(formData.name);
      cy.get("#email").type(formData.email);
      cy.get("#subject").type(formData.subject);
      cy.get("#comment").type(formData.body);
    });
  }

  static submitForm() {
    cy.contains("Send Message").click();
  }

  static confirmSubmition() {
    cy.get("div").should(
      "contain",
      "Thank you for your comments, Using fixtures to represent data."
    );
  }
}
