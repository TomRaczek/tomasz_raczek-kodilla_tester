Feature: Cash Withdrawal
  Scenario: Successful withdrawal form a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Unsuccessful withdrawal form a wallet in credit
      Given I have deposited $10 in my wallet
      When I request $30
      Then $30 should not be dispensed

  Scenario: Successful complete withdrawal form a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $200
    Then $200 should be dispensed

  Scenario: Successful? withdrawal of nothing in credit
    Given I have deposited $0 in my wallet
    When I request $0
    Then $0 should be dispensed