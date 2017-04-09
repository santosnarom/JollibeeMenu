package com.app.jollibeemenu;

import android.app.ListActivity;;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listCategory = getListView();
        ArrayAdapter<Burger> listAdapter = new ArrayAdapter<Burger>(this, android.R.layout.simple_list_item_1, Burger.burgers);
        listCategory.setAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(CategoryActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_BURGERNO, (int)id);
        startActivity(intent);
    }
}
