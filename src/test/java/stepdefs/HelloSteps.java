package stepdefs;

import io.cucumber.java.en.*;


public class HelloSteps {

    @Given("saya punya program hello")
    public void saya_punya_program_hello() {
        System.out.println("Program hello disiapkan");
    }

    @When("saya menjalankannya")
    public void saya_menjalankannya() {
        System.out.println("Program dijalankan");
    }

    @Then("saya melihat output {string}")
    public void saya_melihat_output(String output) {
        System.out.println("Output: " + output);
    }
}
