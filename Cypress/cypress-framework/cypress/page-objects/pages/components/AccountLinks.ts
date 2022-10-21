import LoginPage from "../LoginPage";

export default class AccountLinks {
  static clickSummary() {
    cy.get("#account_summary_link").click();
  }

  static clickSummaryTab() {
    cy.get("#account_summary_tab").click();
  }

  static clickActivityTab() {
    cy.get("#ccount_activity_tab").click();
  }

  static clickTranferfundsTab() {
    cy.get("#transfer_funds_tab").click();
  }

  static clickPayBillsTab() {
    cy.get("#pay_bills_tab").click();
  }

  static clickMoneymapTab() {
    cy.get("#money_map_tab").click();
  }

  static clickOnlineStatmentsTab() {
    cy.get("#online_statements_tab").click();
  }
}
