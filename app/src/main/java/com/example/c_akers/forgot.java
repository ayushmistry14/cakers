package com.example.c_akers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class forgot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
        EditText user=findViewById(R.id.user);
        EditText newpassword=findViewById(R.id.new_pass);
        EditText reenterpassword=findViewById(R.id.re_pass);
        Button btn=findViewById(R.id.setpassword);
        String usernm=getIntent().getStringExtra("usernm");
        String password=getIntent().getStringExtra("password");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user.getText().toString().equals("")){
                    Toast tost= Toast.makeText(getApplicationContext(),"Enter username....!",Toast.LENGTH_LONG);
                    tost.setGravity(Gravity.CENTER|Gravity.BOTTOM,0,0);
                    tost.show();
                }
                else if(newpassword.getText().toString().equals("")){
                    Toast tost= Toast.makeText(getApplicationContext(),"Enter new password....!",Toast.LENGTH_LONG);
                    tost.setGravity(Gravity.CENTER|Gravity.BOTTOM,0,0);
                    tost.show();
                }
                else if(reenterpassword.getText().toString().equals("")){
                    Toast tost= Toast.makeText(getApplicationContext(),"Enter re-enter new password....!",Toast.LENGTH_LONG);
                    tost.setGravity(Gravity.CENTER|Gravity.BOTTOM,0,0);
                    tost.show();
                }
                else if(!user.getText().toString().equals(usernm)){
                    Toast tost= Toast.makeText(getApplicationContext(),"Enter valid username....!",Toast.LENGTH_LONG);
                    tost.setGravity(Gravity.CENTER|Gravity.BOTTOM,0,0);
                    tost.show();
                }
                else if(!reenterpassword.getText().toString().equals(newpassword.getText().toString())){
                    Toast tost= Toast.makeText(getApplicationContext(),"Re-Enter correct new password....!",Toast.LENGTH_LONG);
                    tost.setGravity(Gravity.CENTER|Gravity.BOTTOM,0,0);
                    tost.show();
                }
                else if(reenterpassword.getText().toString().equals(password)){
                    Toast tost= Toast.makeText(getApplicationContext(),"Enter valid new password....!",Toast.LENGTH_LONG);
                    tost.setGravity(Gravity.CENTER|Gravity.BOTTOM,0,0);
                    tost.show();
                }
                else{
                    Intent intnt=new Intent(getApplicationContext(), signin.class);
                    intnt.putExtra("usernme",usernm);
                    intnt.putExtra("newpassword",reenterpassword.getText().toString());
                    startActivity(intnt);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            }
        });
    }
}