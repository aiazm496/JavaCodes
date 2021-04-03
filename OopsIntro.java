package com.company;
//Creating object of class Person

public class OopsIntro {
    public static void main(String[] args) {
        Person person = new Person("Akash");
        Person person2 = new Person("Shilp");
        Person person3 = new Person("Ramesh");

        person.printPerson();
        person2.printPerson();
        person3.printPerson();

        person.growOlder();
        person.growOlder();

        person.printPerson();
        person2.printPerson();
        person3.printPerson();


        int sumOfAge = person.returnAge() + person2.returnAge() + person3.returnAge();
        System.out.println(sumOfAge);
    }
}
