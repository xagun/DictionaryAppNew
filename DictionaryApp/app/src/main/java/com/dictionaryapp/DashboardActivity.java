package com.dictionaryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnApp, btnAddCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnAddCountry = findViewById(R.id.btnAddCountry);
        btnApp = findViewById(R.id.btnApp);
    }

    @Override
    public void onClick(View v) {


       // Intent intent =

    }
}
