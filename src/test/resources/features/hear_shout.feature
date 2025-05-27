#Feature: Hear Shout
#
#  Scenario: Lucy is within range
#    Given Lucy is located 15 meters from Sean
#    When Sean shouts "Free bagels at Sean's"
#    Then Lucy hears Sean's message
#
#  Scenario: Larry is out of range
#    Given Larry is located 150 meters from Sean
#    When Sean shouts "Free bagels at Sean's"
#    Then Larry does not hear any message
#
#  Scenario: Multiple listeners within range
#    Given Lucy is located 20 meters from Sean
#    And Mike is located 80 meters from Sean
#    When Sean shouts "Don't miss the concert!"
#    Then Lucy hears Sean's message
#    And Mike hears Sean's message
#
#  Scenario: One person hears, another doesn’t
#    Given Alice is located 30 meters from Sean
#    And Bob is located 130 meters from Sean
#    When Sean shouts "Final exam is cancelled!"
#    Then Alice hears Sean's message
#    And Bob does not hear any message
