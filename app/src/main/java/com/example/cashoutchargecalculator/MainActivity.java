package com.example.cashoutchargecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).setTitle("গেইটওয়ে সিলেক্ট করুন");
    }

    public void nextPage(View v) {
        Intent intent = new Intent(MainActivity.this, charges_calculator.class);

        if (v.getId() == R.id.bkash_btn) {
            intent.putExtra("gateway_name", "BKASH");
        } else if (v.getId() == R.id.nagad_btn) {
            intent.putExtra("gateway_name", "NAGAD");
        } else if (v.getId() == R.id.rocket_btn) {
            intent.putExtra("gateway_name", "ROCKET");
        } else {
            finish();
        }

        startActivity(intent);
    }
}