package com.company;

public class TextMessage implements Readable {
    private String message;
    private String sender;

    public TextMessage(String sender,String message){
        this.sender = sender;
        this.message = message;
    }

    public String read(){
        return this.message;
    }

}
