package com.app.jollibeemenu;

import android.app.ListActivity;;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CategoryActivity extends ListActivity {

    private int itemType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listCategory = getListView();

        int position = (Integer) getIntent().getExtras().get("Position");
        itemType = position;
        MenuItem[] items = null;

        if(position == 0){
            items = Burger.burgers;
        }
        else if(position == 1){
            items = Dessert.desserts;
        }
        else if(position == 2){
            items = Drink.drinks;
        }
        else if(position == 3){
            items = Meal.meals;
        }
        else if(position == 4){
            items = Pasta.pastas;
        }
        else if(position == 5){
            items = Side.sides;
        }

        ArrayAdapter<MenuItem> listAdapter = new ArrayAdapter<MenuItem>(this, android.R.layout.simple_list_item_1, items);
        listCategory.setAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(CategoryActivity.this, DetailActivity.class);
        intent.putExtra("Coordinates", new int[]{itemType,(int)id});
        startActivity(intent);
    }
}
