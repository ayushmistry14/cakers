package com.example.c_akers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigin);
        TextView signup=findViewById(R.id.textView7);
        TextView forgot=findViewById(R.id.textView6);
        EditText user=findViewById(R.id.username);
        EditText paswd=findViewById(R.id.Password);
        String usernm=getIntent().getStringExtra("username");
        String password=getIntent().getStringExtra("password");
        String usernme=getIntent().getStringExtra("usernme");
        String newpassword=getIntent().getStringExtra("newpassword");
        Button btn=findViewById(R.id.signin);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user.getText().toString().equals("")){
                    Toast tost= Toast.makeText(getApplicationContext(),"Enter username....!",Toast.LENGTH_LONG);
                    tost.setGravity(Gravity.CENTER|Gravity.BOTTOM,0,0);
                    tost.show();
                }
                else if(paswd.getText().toString().equals("")){
                    Toast tost= Toast.makeText(getApplicationContext(),"Enter password....!",Toast.LENGTH_LONG);
                    tost.setGravity(Gravity.CENTER|Gravity.BOTTOM,0,0);
                    tost.show();
                }
                else if(user.getText().toString().equals(usernm)&&paswd.getText().toString().equals(password)){
                    Intent intnt= new Intent(getApplicationContext(), home.class);
                    intnt.putExtra("user",user.getText().toString());
                    startActivity(intnt);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
                else if(user.getText().toString().equals(usernme)&&paswd.getText().toString().equals(newpassword)){
                    Intent intnt= new Intent(getApplicationContext(), home.class);
                    intnt.putExtra("user",user.getText().toString());
                    startActivity(intnt);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
                else{
                    Toast tost= Toast.makeText(getApplicationContext(),"Please signup...!",Toast.LENGTH_LONG);
                    tost.setGravity(Gravity.CENTER|Gravity.BOTTOM,0,0);
                    tost.show();
                }
            }
        });
        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intnt=new Intent(getApplicationContext(),forgot.class);
                intnt.putExtra("usernm",usernm);
                intnt.putExtra("password",password);
                startActivity(intnt);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);

            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intnt=new Intent(getApplicationContext(),com.example.c_akers.signup.class);
                startActivity(intnt);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}