package dev.patriciafb.javatypes;


public class Person {

    String name;
    String surname;
    String documentId;
    String age;


public Person (String name, String surname, String documentId, String age) {
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

public String getAge() {
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
public void setAge(String age) {
        this.age = age;
}


public void mostrarInformacion() {
    System.out.println("Nombre: " + name);
    System.out.println("Apellido: " + surname);
    System.out.println("Documento: " + documentId);
    System.out.println("Edad: " + age);
}

}