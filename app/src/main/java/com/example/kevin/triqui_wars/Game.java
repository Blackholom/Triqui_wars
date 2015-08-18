package com.example.kevin.triqui_wars;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Game extends AppCompatActivity {

    private ImageButton btn00,btn01,btn02,btn10,btn11,btn12,btn20,btn21,btn22;
    private String side;
    private String mode;
    private JuegoTriqui mundo;
    private TextView txtTriqui;
    private TextView txtPlay;
    private TextView txtTriquiWinner;
    private TextView txtWinner;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mundo = new JuegoTriqui();

        btn00 = (ImageButton)findViewById(R.id.but00);
        btn01 = (ImageButton)findViewById(R.id.but01);
        btn02 = (ImageButton)findViewById(R.id.but02);
        btn10 = (ImageButton)findViewById(R.id.but10);
        btn11 = (ImageButton)findViewById(R.id.but11);
        btn12 = (ImageButton)findViewById(R.id.but12);
        btn20 = (ImageButton)findViewById(R.id.but20);
        btn21 = (ImageButton)findViewById(R.id.but21);
        btn22 = (ImageButton)findViewById(R.id.but22);

        //Inicializo las variables de tipo TextView para hacer el cambio de fuente.
        txtTriqui = (TextView)findViewById(R.id.txtTriquiGame);
        txtPlay = (TextView)findViewById(R.id.txtPlay2);
        txtTriquiWinner = (TextView) findViewById(R.id.txtTriquiWinner);
        txtWinner = (TextView) findViewById(R.id.txtWinner);

        changeFont();

    }

    public void changeFont(){

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Starjedi.ttf");

        //title.setTypeface(custom_font);
        txtTriqui.setTypeface(custom_font);
        txtPlay.setTypeface(custom_font);
        txtTriquiWinner.setTypeface(custom_font);
        txtWinner.setTypeface(custom_font);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
        return true;
    }

    public void repintar()
    {

    }

    public void switchEvent(){
        btn00.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    mundo.generarMarca(0,0);
                } catch (TerminoException e)
                {
                    e.printStackTrace();
                }
            }
        });
        btn01.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn02.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn10.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn11.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn12.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn20.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn21.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn22.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
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
}
