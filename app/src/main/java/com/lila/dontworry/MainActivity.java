package com.lila.dontworry;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.widget.Toolbar myToolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);


        getSupportActionBar().setDisplayShowTitleEnabled(false);
        String name = "Dila";
        String nameHello = getText(R.string.hello) + " " + name + "!";
        TextView t=(TextView)findViewById(R.id.hello);
        t.setText(nameHello);
        addListenerOnButton();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    public void addListenerOnButton() {

        final Context context = this;
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.questionsmark);
        ImageButton imageButton = (ImageButton) findViewById(R.id.bulb);

        imageButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // Intent is what you use to start another activity
                Intent intent = new Intent(context, QuestionActivity.class);
                startActivity(intent);

            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // Intent is what you use to start another activity
                Intent intent = new Intent(context, HintActivity.class);
                startActivity(intent);

            }
        });
    }
};