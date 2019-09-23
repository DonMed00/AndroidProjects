package com.iessaladillo.mena.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtName;
    private CheckBox chkPolite;
    private Button btnGreet;
    private TextView lblMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
    }

    private void setupViews() {
        txtName = ActivityCompat.requireViewById(this,R.id.txtName);
        chkPolite = ActivityCompat.requireViewById(this, R.id.chkPolite);
        btnGreet = ActivityCompat.requireViewById(this, R.id.btnGreet);
        lblMessage = ActivityCompat.requireViewById(this, R.id.lblMessage);
        btnGreet.setOnClickListener(v -> devolverText());
    }

    private void devolverText(){
        if (chkPolite.isChecked()) {

            lblMessage.setText("Hola señor " +txtName.getText().toString() );
        }else{
            lblMessage.setText("Hola tio " +txtName.getText().toString() );
        }
    }

}
