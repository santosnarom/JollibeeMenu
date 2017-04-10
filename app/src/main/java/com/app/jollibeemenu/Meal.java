package com.app.jollibeemenu;

public class Meal extends MenuItem {

    public static final Meal[] meals = {
            new Meal("Chickenjoy", "The Best Fried Chicken! Crispylicious, Juicylicious! Jollibee's perfectly seasoned fried chicken that's crispy on the outside; tender and juicy on the inside.", R.drawable.chickenjoy),
            new Meal("2 pc Chickenjoy", "The Best Fried Chicken! Crispylicious, Juicylicious! Jollibee's perfectly seasoned fried chicken that's crispy on the outside; tender and juicy on the inside.", R.drawable.twopcchickenjoy),
            new Meal("Spicy Chickenjoy","Your favorite Chickenjoy, seasoned with a dash of spiciness for that added twist!", R.drawable.spicychickenjoy),
            new Meal("Garlic Pepper Beef", "Juicy Beef Strips topped with flavorful pepper sauce and garlic bits.", R.drawable.garlicpepperbeef),
            new Meal("Ultimate Burger Steak", "Made from 100% pure beef goodness of a 1/3 pound CHAMP patty, served on top of tasty fries, and poured with savory mushroom gravy that's sprinkled with toasted garlic bits. A sunny-side egg on steamed rice completes this satisfying meal experience.", R.drawable.ultimateburgersteak),
            new Meal("Garlic Bangus", "Marinated bangus seasoned with special ingredients fried to a light crisp, topped with garlic sauce and toasted garlic bits, served with a slice of tomato and plain rice.", R.drawable.garlicbangus),
            new Meal("5 pc Shanghai Rolls", "5 pieces of your favorite crispy-sarap shanghai rolls.", R.drawable.shanghairolls),
            new Meal("Burger Steak", "100% pure beef patties that come with a hearty serving of our flavorful mushroom gravy and steamed rice.", R.drawable.burgersteak),
    };

    private Meal(String name, String description, int imageResourceId){
        super(name,description,imageResourceId);
    }

}
