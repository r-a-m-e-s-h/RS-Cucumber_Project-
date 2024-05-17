Feature: Login Feature

Background:


When launch the browser
And hit the URL of Testing site

  @Regression 
  Scenario: Login Sceanrio for Demo
    Given user is on login page
    When user enters the credentials username "DemoUser" and password as "Demo"
    And user click on the Login Btn
    Then user is on Home Page

  @Sanity @DataDriven
  Scenario: Login Sceanrio for Admin
    Given user is on login page
    When user enters the credentials username "AdminUser" and password as "Admin"
    And user click on the Login Btn
    Then user is on Home Page

  @Smoke @Regression @DataDriven
  Scenario Outline: Login Sceanrio for LocalUser
    Given user is on login page
    When user enters the credentials username <UserName> and password as "<Password>" combination
    And user click on the Login Btn
    Then user is on Home Page
    

    Examples: 
      | UserName  |  | Password   |
      | LocalUser |  | HelloWorld |
      | Admin     |  | WorldHello |

  @Smoke @Regression
  Scenario: New User Sign-up Page
    Given user is on Sign-up page
    When user enters the details
      | Tom           |
      | Smasher       |
      | tom@gmail.com |
      |    1234567890 |
    And user click on the next Btn
    Then user is on Home Page
