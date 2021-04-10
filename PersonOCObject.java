package com.company;

public class PersonOCObject {
    public static void main(String[] args) {
        PersonOverloadingConstructor p = new PersonOverloadingConstructor("Akash");
        System.out.println(p); //0 yrs
        PersonOverloadingConstructor p2 = p;
        p2.setAge(4);
        System.out.println(p); // age will be 4 since both p and p2 refers to same obj.
        p = new PersonOverloadingConstructor("Ravi");
        //p is now referring to a new object.
        //p and p2 are now referring to new objects.
        System.out.println(p);
        p2 = null; // p2 now refers to nothing.
        System.out.println(p2);
        //the object whose name is Akash is referred to by nobody and is called garbage.
        //this object will be cleared by Java garbage collector after execution of program.
        System.out.println(p2.getAge());
        //Nullpointerexception - as we calling a method on ref variable whose value is null.
        //or is pointing to nothing/null.
        //String s = null;
        //System.out.println(s.length());


    }

}
