package com.example.c_akers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        EditText user=findViewById(R.id.usernm);
        EditText password=findViewById(R.id.password);
        EditText email=findViewById(R.id.email);
        Button btn=findViewById(R.id.signup);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user.getText().toString().equals("")){
                    Toast tost= Toast.makeText(getApplicationContext(),"Enter username....!",Toast.LENGTH_LONG);
                    tost.setGravity(Gravity.CENTER|Gravity.BOTTOM,0,0);
                    tost.show();
                }
                else if(email.getText().toString().equals("")){
                    Toast tost= Toast.makeText(getApplicationContext(),"Enter E-Mail ID....!",Toast.LENGTH_LONG);
                    tost.setGravity(Gravity.CENTER|Gravity.BOTTOM,0,0);
                    tost.show();
                }
                else if(password.getText().toString().equals("")){
                    Toast tost= Toast.makeText(getApplicationContext(),"Enter password....!",Toast.LENGTH_LONG);
                    tost.setGravity(Gravity.CENTER|Gravity.BOTTOM,0,0);
                    tost.show();
                }
                else{
                    Intent intnt=new Intent(getApplicationContext(), signin.class);
                    intnt.putExtra("username",user.getText().toString());
                    intnt.putExtra("password",password.getText().toString());
                    startActivity(intnt);
                    overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
                }
            }
        });
    }
}