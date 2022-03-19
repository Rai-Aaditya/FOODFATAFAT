package com.example.android.foodfatafat;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    int dataEntered = 0;
    public void login(View view){
        EditText name = (EditText) findViewById(R.id.usernameEditTextPersonName);
        String username = name.getText().toString();
        EditText password = (EditText) findViewById(R.id.passwordEditTextPassword);

        if (!username.isEmpty() && !password.getText().toString().isEmpty() && password.getText().toString().length()>=8){

            dataEntered=1;
        }
        if(dataEntered==1) {
            Intent homeIntent = new Intent(this, Homepage.class);
            homeIntent.putExtra("username", username);
            startActivity(homeIntent);
        }
        else{
            if(username.isEmpty()){
                Toast.makeText(this,"Please Enter complete Data before login",Toast.LENGTH_SHORT).show();
            }
            else if (password.getText().toString().length()<8){
                Toast.makeText(this,"Password must contain atleast 8 letter!",Toast.LENGTH_SHORT).show();
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

