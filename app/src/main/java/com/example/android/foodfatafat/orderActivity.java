package com.example.android.foodfatafat;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class orderActivity extends AppCompatActivity {
    int [] item;
    String username;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

         item = getIntent().getIntArrayExtra("itemcount");
         username = getIntent().getStringExtra("username");
        TextView item0 = (TextView) findViewById(R.id.item0TextView);
        TextView item1 = (TextView) findViewById(R.id.item1TextView);
        TextView item2 = (TextView) findViewById(R.id.item2TextView);
        TextView item3 = (TextView) findViewById(R.id.item3TextView);
        TextView item4 = (TextView) findViewById(R.id.item4TextView);
        TextView item5 = (TextView) findViewById(R.id.item5TextView);
        TextView item6 = (TextView) findViewById(R.id.item6TextView);
        TextView item7 = (TextView) findViewById(R.id.item7TextView);
         if(item[0]!=0){
             item0.setText("Kaju katli: "+item[0]);
         }
          else{
              item0.setAlpha(0);
         }
         if(item[1]!=0){
            item1.setText("Besan Laddoo: "+item[1]);
        }
         else{
             item1.setAlpha(0);
         }

         if(item[2]!=0){
            item2.setText("Gulab Jamun: " +item[2]);
        }
         else{
             item2.setAlpha(0);
         }if(item[3]!=0){
            item3.setText("Kheer: "+item[3]);
        }
         else{
            item3.setAlpha(0);

        }
         if(item[4]!=0){
            item4.setText("Badaam Halwa: "+item[4]);
        }
         else{
             item4.setAlpha(0);
        }
         if(item[5]!=0){
            item5.setText("Rasgulla: "+item[5]);
        }
         else{
             item5.setAlpha(0);
        }
         if(item[6]!=0){
            item6.setText("Gujiya: "+item[6]);
        }
         else{
             item6.setAlpha(0);
        }
         if(item[7]!=0){
            item7.setText("Cham cham: "+item[7]);
        }
        else{
             item7.setAlpha(0);
         }

        TextView textView12 = (TextView) findViewById(R.id.textView12);
        textView12.setText("\t\t\t\t\t\t\t\t\tHurray! "+ username + "\nYour order has been placed!");
    }

}