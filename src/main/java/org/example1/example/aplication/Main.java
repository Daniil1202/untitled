package org.example1.example.aplication;

import com.google.gson.Gson;
import org.example1.example.domain.Person;


public class Main {
    public static void main(String[] args) {
        Person person1 =  new Person("Nikolai","Serdykov",34);
        Gson gson = new Gson();
        String jeson = gson.toJson(person1);
        System.out.println(jeson);
        String jesonPerson = "{\"firstName\":\"Petr\",\"lastName\":\"Petrov\",\"age\":34}";
        Person person2 = gson.fromJson(jesonPerson, Person.class);
        System.out.println(person2);

    }
}