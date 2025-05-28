Feature: Login ke aplikasi Zaidan Educare School

#  Scenario: Login dengan data user yang valid
#    Given User sudah membuka web browser
#    And User berada pada halaman login aplikasi Zaidan Educare School
#    When user memasukkan username "bendahara" dan password "admin123"
#    And user menekan tombol login
#    Then user diarahkan ke halaman dasbor
#    And user dapat melihat side bar bendahara

  Scenario: Login dengan data user yang invalid
    Given User sudah membuka web browser
    And User berada pada halaman login aplikasi Zaidan Educare School
    When user memasukkan username "indra" dan password "admin123"
    And user menekan tombol login
    Then User dapat melihat pesan "Username atau password salah"