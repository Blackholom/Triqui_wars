package com.example.kevin.triqui_wars;

import android.content.Intent;
import android.media.Image;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_inicio);

        empire=(ImageButton) findViewById(R.id.empire);
        rebels=(ImageButton) findViewById(R.id.rebels);
        title=(TextView) findViewById(R.id.title);
        side="";

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
