package dev.patriciafb.javatypes;

public class App {
    public static void main (String[] args) {
    Person person1 = new Person("Patricia", "Fernandez", 123456, age:"41");

    extracted(person1);
}

    private static void extracted(Person person1) {
        person1.mostrarInformacion();
    }

}

