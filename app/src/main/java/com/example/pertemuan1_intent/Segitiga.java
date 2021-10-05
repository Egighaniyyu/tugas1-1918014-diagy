package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alas = (EditText)findViewById(R.id.input_alas);
        final EditText tinggi = (EditText)findViewById(R.id.input_tinggi);
        final EditText luas = (EditText)findViewById(R.id.output_hasil);
        final Button proses = (Button)findViewById(R.id.btn_process);
        proses.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(alas.getText().toString());
                int b = Integer.parseInt(tinggi.getText().toString());
                int hasil  = (a*b) / 2;
                luas.setText(Integer.toString(hasil));
            }
        });
    }
}