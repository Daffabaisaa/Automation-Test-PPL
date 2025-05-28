Feature: Login ke aplikasi Zaidan Educare School

  Scenario: Login dengan data user yang valid
    Given user memasukkan username "bendahara" dan password "admin123"
    When user menekan tombol login
    Then user diarahkan ke halaman dasbor
    And user dapat melihat side bar bendahara

  Scenario: Login dengan data user yang invalid
    Given user memasukkan username "indra" dan password "admin123"
    When user menekan tombol login
    Then User dapat melihat pesan "un-successful login"