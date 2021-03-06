package com.app.jollibeemenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> listView, View view, int position, long id) {
                        Intent intent = new Intent(MainActivity.this, CategoryActivity.class);
                        intent.putExtra("Position",(int) position);
                        startActivity(intent);
                    }
                };
        ListView listView = (ListView) findViewById(R.id.menuList);
        listView.setOnItemClickListener(itemClickListener);
    }
}
