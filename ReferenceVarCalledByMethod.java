package com.company;

public class ReferenceVarCalledByMethod {
    public static void main(String[] args) {

        Person3 p1 = new Person3("Akash");
        //p1 is reference to object created by constructor Person3.
        System.out.println(p1);
        youThen(p1);
        System.out.println(p1);
        Person3 p2 = p1; //p2 also became reference for object which
        //p1 was referring to. thus it can to be used to mutate object.
        youThen(p2);
        System.out.println(p1);

    }
    //reference to object created by Constructor is copied to method
    //youthen
    //thus the object can be mutatedand value of ref var p1 is changed.
    public static void youThen(Person3 person){
        person.setBirthYear(person.getBirthYear()+1);
    }
}
