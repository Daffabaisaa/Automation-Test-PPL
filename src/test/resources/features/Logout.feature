Feature: Logout dari aplikasi Zaidan Educare School
  Scenario: User brerhasil logout
    Given User telah berhasil login sebagai "bendahara" dengan password "admin123"
    And User berada di halaman Dasbor aplikasi Manajemen Pembayaran Dana Pendidikan untuk Zaidan Educare School
    When User mengklik tombol logout
    And User mengklik tombol ya pada pop up konfirmasi logout
    Then User diarahkan ke halaman login