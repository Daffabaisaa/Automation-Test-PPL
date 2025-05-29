Feature: Logout dari aplikasi Zaidan Educare School

  Scenario: User berhasil logout
    Given user telah login sebagai "bendahara" dengan password "admin123"
    When user mengklik tombol logout
    And user mengonfirmasi logout dengan memilih "Ya"
    Then user diarahkan ke halaman login
