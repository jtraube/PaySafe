package com.example.damien.paysafe1_0_a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login_button = (Button) findViewById(R.id.login_button);
        login_button.setOnClickListener((OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        Log.i("clicks", "You Clicked Login");
        Intent i=new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);
    }

}
