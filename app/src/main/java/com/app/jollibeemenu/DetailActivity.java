package com.app.jollibeemenu;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int[] coordinates = (int[]) getIntent().getExtras().get("Coordinates");

        try{
            SQLiteOpenHelper jollibeeDatabaseHelper = new JollibeeDatabaseHelper(this);
            SQLiteDatabase db = jollibeeDatabaseHelper.getReadableDatabase();

            Cursor cursor = db.query("BURGER", new String[]{"NAME", "DESCRIPTION", "IMAGE_RESOURCE_ID"},
                    "_id = ?", new String[] {Integer.toString(coordinates[1])}, null, null, null);

            if(cursor.moveToFirst()){
                String nameText = cursor.getString(0);
                String descriptionText = cursor.getString(1);
                int photoId = cursor.getInt(2);

                TextView name = (TextView) findViewById(R.id.name);
                name.setText(nameText);

                TextView description = (TextView) findViewById(R.id.description);
                description.setText(descriptionText);

                ImageView photo = (ImageView) findViewById(R.id.photo);
                photo.setImageResource(photoId);
                photo.setContentDescription(nameText);
            }

            Toast toast = Toast.makeText(this, "Database success", Toast.LENGTH_LONG);
            toast.show();

            cursor.close();
            db.close();
        }catch(SQLiteException e){}



//        MenuItem item = null;
//
//        if(coordinates[0] == 0){
//            item = Burger.burgers[coordinates[1]];
//        }
//        else if(coordinates[0] == 1){
//            item = Dessert.desserts[coordinates[1]];;
//        }
//        else if(coordinates[0] == 2){
//            item = Drink.drinks[coordinates[1]];;
//        }
//        else if(coordinates[0] == 3){
//            item = Meal.meals[coordinates[1]];;
//        }
//        else if(coordinates[0] == 4){
//            item = Pasta.pastas[coordinates[1]];;
//        }
//        else if(coordinates[0] == 5){
//            item = Side.sides[coordinates[1]];;
//        }

//        ImageView photo = (ImageView) findViewById(R.id.photo);
//        photo.setImageResource(item.getImageResourceId());
//        photo.setContentDescription(item.getName());
//
//        TextView name = (TextView) findViewById(R.id.name);
//        name.setText(item.getName());
//
//        Typeface typeface = Typeface.createFromAsset(getAssets(), "Insaniburger.ttf");
//        name.setTypeface(typeface);
//
//        TextView description = (TextView) findViewById(R.id.description);
//        description.setText(item.getDescription());
    }
}
