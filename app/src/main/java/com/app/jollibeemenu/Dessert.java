package com.app.jollibeemenu;

public class Dessert extends MenuItem {

    public static final Dessert[] desserts = {
            new Dessert("Creamy Shakes - Strawberry", "Sarap to the last drop! (Strawberry flavor)", R.drawable.creamyshakestrawberry),
            new Dessert("Creamy Shakes - Chocolate", "Sarap to the last drop! (Chocolate flavor)", R.drawable.creamyshakechocolate),
            new Dessert("Mix-ins", "Made with Nestle KitKat.", R.drawable.kitkatmixins),
            new Dessert("Strawberry Sundae", "Vanilla soft serve topped with strawberry syrup and strawberry bits.", R.drawable.strawberrysundae),
            new Dessert("Chocolate Sundae", "Creamy vanilla soft serve topped with luxurious chocolate fudge.", R.drawable.chocolatesundae),
            new Dessert("Cone Twirl Krunchy Chocolate", "Creamy vanilla soft serve dipped in chocolate-flavored coating sprinkled with rice crispies.\n", R.drawable.chocolateconetwirl),
            new Dessert("Cone Twirl Vanilla", "Creamy vanilla soft serve on a cone.", R.drawable.vanillaconetwirl)
    };

    private Dessert(String name, String description, int imageResourceId){
        super(name,description,imageResourceId);
    }
}
