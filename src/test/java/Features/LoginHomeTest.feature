Feature: Login
#  Scenario Outline: Login to application verifiy Home Page
#    Given user launched application
#    When user logged in with username "<UserName>" and "<Password>"
#    When user verify Home Page title "<pagetitle>"
#
#    Examples:
#      | UserName | Password | pagetitle |
#      | admin    | admin123 | Dashboard |

  Scenario Outline: Add admin user
    Given user launched application
    When user logged in with username "<UserName>" and "<Password>"
    When user verify Home Page title "<pagetitle>"
    When user click on admin section
    When user click on add button

    Examples:
      | UserName | Password | pagetitle |
      | admin    | admin123 | Dashboard |
