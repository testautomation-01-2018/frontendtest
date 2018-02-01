Feature: Test login page

  @Login @Notification
  Scenario: Sprawdz czy uzytkownik sie zalogowal
    Given User jest na wordpress website "http://wordpress.com/"
    When User clicks to login button
    Then User is on first login page
    When User enter login and press <Continue>
    Then User is on password page
    When User enter password and press <LogIn>
    Then User is on main login page
    When User press avatar
    Then user is on personal page
    When User clicks notification link
    Then User is on notification page
    When User clicks checkbox
    Then Checkbox is unselected