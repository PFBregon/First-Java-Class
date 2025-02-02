package dev.patriciafb.javatypes;


public class Person {

    String name;
    String surname;
    String documentId;
    int age;


public Person (String name, String surname, String documentId, int age) {
    this.name = name;
    this.surname = surname;
    this.documentId = documentId;
    this.age = age;
}


public String getName() {
    return name;
}

public String getSurname() {
    return surname;
}

public String getDocumentId() {
    return documentId;
}

public int getAge() {
    return age;
}


public void setName(String name) {
    this.name = name;
}
public void setSurname(String surname) {
    this.surname = surname;
}
public void setDocumentId(String documentId) {
    this.documentId = documentId;
}
public void setAge(int age) {
    if (age > 0) {
        this.age = age;
    }
    else {
        System.out.println("La edad debe ser mayor que 0.");
    }
 }

public void mostrarInformacion() {
    System.out.println("Nombre: " + name);
    System.out.println("Apellido: " + surname);
    System.out.println("Documento: " + documentId);
    System.out.println("Edad: " + age);
}


}
