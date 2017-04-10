package com.app.jollibeemenu;


public class Burger extends MenuItem{

    public static final Burger[] burgers = {
            new Burger("Yum!", "Made with 100% pure beef patty served with our very own special burger dressing all in a soft bun.", R.drawable.regularyum),
            new Burger("Yum! with Cheese", "Made with 100% pure beef patty with cheese served with our own special burger dressing all in a soft bun.", R.drawable.yumwithcheese),
            new Burger("Yum! with TLC", "Made with 100% pure beef patty served with mayo, a slice of fresh tomato, crisp lettuce, and creamy cheese all in a soft sesame seed bun.", R.drawable.yumwithtlc),
            new Burger("Cheesy Bacon Mushroom Yum", "Your favorite Yumburger patty topped with bacon, cheese sauce and mushrooms, in a new sesame seed bun!", R.drawable.cheesybaconmushroomyum),
            new Burger("Champ", "Made with 100% pure beef, fresh lettuce and tomatoes, creamy cheese, catsup, and mayo served in soft sesame seed bun.", R.drawable.regularchamp),
            new Burger("Cheesy Bacon Mushroom Champ", "Made with 1/3 pound, 100% pure beef Champ patty, smothered with delicious cheese sauc, bacon strips, and mushrooms. Extraordinary langhap-sarap!", R.drawable.cheezybaconmushroomchamp)
    };

    private Burger(String name, String description, int imageResourceId){
        super(name, description, imageResourceId);
    }
}
