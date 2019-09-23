package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView lblHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();

    }

    private void setupViews() {
        lblHello = ActivityCompat.requireViewById(this,R.id.lblHello);
        lblHello.setText("Bienvenido a PMDMO");
        Button btnGreet = ActivityCompat.requireViewById(this, R.id.btnGreet);
        btnGreet.setOnClickListener(v -> lblHello.setText("Me has pulsado")
        );

    }
}
