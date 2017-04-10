package com.app.jollibeemenu;

public abstract class MenuItem {

    protected String name;
    protected String description;
    protected int imageResourceId;

    protected MenuItem(String name, String description, int imageResourceId){
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
