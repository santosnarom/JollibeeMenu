package com.app.jollibeemenu;

public class Drink extends MenuItem {

    public static final Drink [] drinks = {
            new Drink("Coke Float", "Creamy vanilla twirl on ice-cold coke with choco syrup.", R.drawable.cokefloat),
    };

    private Drink(String name, String description, int imageResourceId){
        super(name,description,imageResourceId);
    }
}
