package com.example.activity8d_17022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Cari extends AppCompatActivity {

    EditText form_cari;
    Button batal, reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cari);
        batal=findViewById(R.id.keluar);
        reset=findViewById(R.id.reset);
        form_cari=findViewById(R.id.form_cari);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                form_cari.setText("");
            }
        });

        batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}