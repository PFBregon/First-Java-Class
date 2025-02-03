package dev.patriciafb.javatypes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void testConstructor() {
        Person person = new Person ("Patricia", "Fernandez", "123456", "41");

        assertEquals("Patricia", person.getName());
        assertEquals("Fernandez", person.getSurname());
        assertEquals("123456", person.getDocumentId());
        assertEquals("41", person.getAge());
    }

void testSetters() {
    Person person = new Person("Patricia", "Fernandez", "123456", "41");

    person.setName("Carlos");
    person.setSurname("Gómez");
    person.setDocumentId("87654321");
    person.setAge("38");

    assertEquals("Carlos", person.getName());
    assertEquals("Gómez", person.getSurname());
    assertEquals("87654321", person.getDocumentId());
    assertEquals(38, person.getAge());
}
}
