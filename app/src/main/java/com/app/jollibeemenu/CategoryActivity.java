package com.app.jollibeemenu;

import android.app.ListActivity;;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class CategoryActivity extends ListActivity {

    private int itemType;
    private SQLiteDatabase db;
    private Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listCategory = getListView();

        ListView listBurgers = getListView();

//        int position = (Integer) getIntent().getExtras().get("Position");
//        itemType = position;
//        MenuItem[] items = null;
//
//        if(position == 0){
//            items = Burger.burgers;
//        }
//        else if(position == 1){
//            items = Dessert.desserts;
//        }
//        else if(position == 2){
//            items = Drink.drinks;
//        }
//        else if(position == 3){
//            items = Meal.meals;
//        }
//        else if(position == 4){
//            items = Pasta.pastas;
//        }
//        else if(position == 5){
//            items = Side.sides;
//        }
//
//        ArrayAdapter<MenuItem> listAdapter = new ArrayAdapter<MenuItem>(this, android.R.layout.simple_list_item_1, items);
//        listCategory.setAdapter(listAdapter);

        try{
            SQLiteOpenHelper jollibeeDatabaseHelper = new JollibeeDatabaseHelper(this);
            db = jollibeeDatabaseHelper.getReadableDatabase();

            cursor = db.query("BURGER", new String[] {"_id", "NAME"}, null, null, null, null, null);

            CursorAdapter listAdapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_1,
                    cursor, new String[] {"NAME"}, new int[] {android.R.id.text1}, 0);
            listBurgers.setAdapter(listAdapter);
        }catch(SQLiteException e){}
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        cursor.close();
        db.close();
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(CategoryActivity.this, DetailActivity.class);
        intent.putExtra("Coordinates", new int[]{itemType,(int)id});
        startActivity(intent);
    }
}
