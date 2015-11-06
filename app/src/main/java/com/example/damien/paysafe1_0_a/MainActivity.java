package com.example.damien.paysafe1_0_a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button new_user_button = (Button) findViewById(R.id.new_user_button);
        new_user_button.setOnClickListener((OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        Log.i("clicks", "You Clicked New User");
        Intent i=new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);
    }

}
