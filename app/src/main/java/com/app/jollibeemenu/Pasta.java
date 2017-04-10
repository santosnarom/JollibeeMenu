package com.app.jollibeemenu;

public class Pasta extends MenuItem {
    public static final Pasta[] pastas = {
            new Pasta("Spaghetti", "Jollibee's sweet style spaghetti sauce - now the tastiest and meatiest ever from Jollibee! With the chunkiest slices of savory ham and sausages, loaded with ground beef, served over premium quality noodles and topped with lots of cheese. Jollibee Spaghetti - the Spaghettiest!", R.drawable.spaghetti),
            new Pasta("Palabok", "Premium bihon noodles served with mouth-watering palabok sauce and toppings of pork chicharon bits, tinapa flakes, sauteed pork, shrimps, and slices of egg.", R.drawable.palabok)
    };

    private Pasta(String name, String description, int imageResourceId){
        super(name, description, imageResourceId);
    }
}
