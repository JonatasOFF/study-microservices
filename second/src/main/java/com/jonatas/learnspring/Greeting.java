package com.jonatas.learnspring;

public class Greeting {

    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Greeting(long id, String name) {
        this.id = id;
        this.name = name;
    }

}
