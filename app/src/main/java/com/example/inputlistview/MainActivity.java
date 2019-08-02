package com.example.inputlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText bil1;
    private EditText bil2;
    private Button btnHasil;
    private EditText Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menghitung_activity);
        initActivity();
        initEvent();
    }

    public void initActivity(){
        btnHasil = (Button) findViewById(R.id.btn_hitungJumlah);
        Hasil = (EditText) findViewById(R.id.hitung_hasil);
        bil1 = (EditText) findViewById(R.id.hitungBil);
        bil2 = (EditText) findViewById(R.id.hitungBil2);

    }

    public void initEvent(){
        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getPenjumlahan();
            }
        });
    }

    public void getPenjumlahan(){
        int angka1 = Integer.parseInt(bil1.getText().toString());
        int angka2 = Integer.parseInt(bil2.getText().toString());
        int total = angka1 + angka2;
        Hasil.setText(total +" ");
    }

}
