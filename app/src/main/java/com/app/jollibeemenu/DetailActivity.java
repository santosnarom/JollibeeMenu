package com.app.jollibeemenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_BURGERNO = "burgerNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int burgerNo = (Integer) getIntent().getExtras().get(EXTRA_BURGERNO);
        Burger burger = Burger.burgers[burgerNo];

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(burger.getImageResourceId());
        photo.setContentDescription(burger.getName());

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(burger.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(burger.getDescription());
    }
}
