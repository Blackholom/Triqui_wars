package com.example.kevin.triqui_wars;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Activity_inicio extends AppCompatActivity {
    private ImageButton empire;
    private ImageButton rebels;
    private String side;
    private TextView title;
    private TextView triqui;
    private TextView choose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_inicio);

        empire=(ImageButton) findViewById(R.id.empire);
        rebels=(ImageButton) findViewById(R.id.rebels);
        title=(TextView) findViewById(R.id.title);
        triqui =(TextView) findViewById(R.id.triqui);
        choose = (TextView) findViewById(R.id.choose);

        changeFont();


        //switchImage();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_inicio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Método encargado de hacer el cambio de las fuentes de los text view elegidos
     *
     */
    public void changeFont(){

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Starjedi.ttf");

        //title.setTypeface(custom_font);
        triqui.setTypeface(custom_font);
        choose.setTypeface(custom_font);


    }
    public void game_mode(){
        Intent intent = new Intent(this, Game.class);
        


    }
    public void switchImage(){
        empire.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
               }
        });
    }
}
