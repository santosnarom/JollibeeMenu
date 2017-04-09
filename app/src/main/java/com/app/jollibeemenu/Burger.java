package com.app.jollibeemenu;


public class Burger {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Burger[] burgers = {
            new Burger("Yum!", "Made with 100% pure beef patty served with our very own special burger dressing all in a soft bun.", R.drawable.regularyum)
    };

    private Burger(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public String toString(){
        return name;
    }
}
