package stepdefs;

import io.cucumber.java.en.*;
import java.util.*;
import static org.junit.Assert.*;
import helper.Person;

public class HearShoutSteps {
    private Map<String, Person> people = new HashMap<>();
    private static final int HEARING_DISTANCE = 100;

    @Given("{word} is located {int} meters from {word}")
    public void person_is_located_meters_from_person(String listenerName, int distance, String shouterName) {
        Person listener = people.computeIfAbsent(listenerName, Person::new);
        Person shouter = people.computeIfAbsent(shouterName, Person::new);

        listener.setLocation(distance);
        shouter.setLocation(0); // asumsi shouter selalu di titik 0
    }

    @When("{word} shouts {string}")
    public void person_shouts_message(String shouterName, String message) {
        Person shouter = people.get(shouterName);
        for (Person listener : people.values()) {
            if (!listener.getName().equals(shouterName)) {
                int distance = Math.abs(listener.getLocation() - shouter.getLocation());
                if (distance <= HEARING_DISTANCE) {
                    listener.hear(message);
                }
            }
        }
    }

    @Then("{word} hears {word}'s message")
    public void listener_hears_shouter_message(String listenerName, String shouterName) {
        Person listener = people.get(listenerName);
        String messageHeard = listener.getMessageHeard();
        assertNotNull(listenerName + " should hear a message but heard null", messageHeard);
    }

    @Then("{word} does not hear any message")
    public void listener_does_not_hear_any_message(String listenerName) {
        Person listener = people.get(listenerName);
        assertNull(listener.getMessageHeard());
    }
}

