package com.example.android.foodfatafat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Homepage extends AppCompatActivity {
    int count = 0;
    int [] itemcount = {0,0,0,0,0,0,0,0};
    String username;
    int phonenumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        username = getIntent().getStringExtra("username");
    }

    public void addKajukatli(View view) {
        int k = 0;
        Log.i("Add Info","Add button tapped!");
        itemcount[k]++;
        count++;
        Toast.makeText(this, count+" Items added", Toast.LENGTH_SHORT).show();
    }
    public void addBesanladoo(View view) {
        int k = 1;
        Log.i("Add Info","Add button tapped!");
        itemcount[k]++;
        count++;
        Toast.makeText(this, count+" Items added", Toast.LENGTH_SHORT).show();
    }

    public void addGulaabjamun(View view) {
        int k = 2;
        Log.i("Add Info","Add button tapped!");
        itemcount[k]++;
        count++;
        Toast.makeText(this, count+" Items added", Toast.LENGTH_SHORT).show();
    }

    public void addKheer(View view) {
        int k = 3;
        Log.i("Add Info","Add button tapped!");
        itemcount[k]++;
        count++;
        Toast.makeText(this, count+" Items added", Toast.LENGTH_SHORT).show();
    }

    public void addBadaamhalwa(View view) {
        int k = 4;
        Log.i("Add Info","Add button tapped!");
        itemcount[k]++;
        count++;
        Toast.makeText(this, count+" Items added", Toast.LENGTH_SHORT).show();
    }

    public void addRasgulla(View view) {
        int k = 5;
        Log.i("Add Info","Add button tapped!");
        itemcount[k]++;
        count++;
        Toast.makeText(this, count+" Items added", Toast.LENGTH_SHORT).show();
    }

    public void addGujiya(View view) {
        int k=6;
        Log.i("Add Info","Add button tapped!");
        itemcount[k]++;
        count++;
        Toast.makeText(this, count+" Items added", Toast.LENGTH_SHORT).show();
    }

    public void addChamcham(View view) {
        int k = 7;
        Log.i("Add Info","Add button tapped!");
        itemcount[k]++;
        count++;
        Toast.makeText(this, count+" Items added", Toast.LENGTH_SHORT).show();
    }

    public void confirmOrder(View view) {
        Intent orderIntent = new Intent(this,orderActivity.class);
        orderIntent.putExtra("itemcount",itemcount);
        orderIntent.putExtra("username",username);

        startActivity(orderIntent);

    }
}