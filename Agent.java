package com.company;

public class Agent {
    public static void main(String[] args) {
        AgentToString ag = new AgentToString("Akash", 25);

        System.out.println(ag);
        //it is like System.out.println(ag.toString()); sout calls ob.toString() always.
     }
}
