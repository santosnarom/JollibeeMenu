package com.app.jollibeemenu;

public class Side extends MenuItem {

    public static final Side[] sides = {
            new Side("Buttered Corn", "Golden yellow corn kernels with butter", R.drawable.butteredcorn),
            new Side("Peach Mango Pie", "Golden brown, flaky, slightly sweet crust with a pleasant blend of diced peaches and mango filling in thick sauce.", R.drawable.peachmangopie),
            new Side("Jolly Crispy Fries", "Light to golden brown crispy potato strips, made from choice potatoes.", R.drawable.jollycrispyfries),
            new Side("Macaroni Soup", "A hearty cream of chicken soup with macaroni noodles, carrots, chicken chunks, bits of ham, and corn.", R.drawable.macaronisoup)
    };

    private Side(String name, String description, int imageResourceId){
        super(name,description,imageResourceId);
    }
}
