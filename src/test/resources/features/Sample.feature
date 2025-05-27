Feature: Menampilkan Hello

  Scenario: Menampilkan hello di terminal
    Given saya punya program hello
    When saya menjalankannya
    Then saya melihat output "Hello World"
