package com.app.jollibeemenu;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class JollibeeDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "jollibee";
    private static final int DB_VERSION = 1;

    JollibeeDatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE BURGER("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "NAME TEXT,"
                + "DESCRIPTION TEXT,"
                + "IMAGE_RESOURCE_ID INTEGER);");

        insertBurger(db, "Yum", "Regular Yum", R.drawable.regularyum);
        insertBurger(db, "Yum with Cheese", "Yum plus Cheese", R.drawable.yumwithcheese);
        insertBurger(db, "Yum with TLC", "Yum + TLC", R.drawable.yumwithtlc);
    }

    private static void insertBurger(SQLiteDatabase db, String name, String description, int resourceId){
        ContentValues burgerValues = new ContentValues();
        burgerValues.put("NAME", name);
        burgerValues.put("DESCRIPTION", description);
        burgerValues.put("IMAGE_RESOURCE_ID", resourceId);

        db.insert("BURGER", null, burgerValues);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
}
