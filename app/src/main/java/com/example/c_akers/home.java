package com.example.c_akers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class home extends AppCompatActivity {

    int total=0;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageView next=findViewById(R.id.next);
        TextView user=findViewById(R.id.user_name);
        user.setText("Hello , "+getIntent().getStringExtra("user"));
        TextView popular=findViewById(R.id.popular);
        TextView bestseller=findViewById(R.id.bestseller);
        default_fragment(new popular(),0);
        popular.setTextColor(Color.parseColor("#000000"));
        bestseller.setTextColor(Color.parseColor("#a0a1a3"));
        TextView totl=findViewById(R.id.total);
        TextView qty=findViewById(R.id.qty);
        CheckBox chocolatecake=findViewById(R.id.checkBox);
        CheckBox hazelnutcake=findViewById(R.id.checkBox1);
        CheckBox oreocake=findViewById(R.id.checkBox2);
        CheckBox fudgecake=findViewById(R.id.checkBox7);
        CheckBox strawberrycake=findViewById(R.id.checkBox3);
        CheckBox farrerocake=findViewById(R.id.checkBox4);
        CheckBox italianpastry=findViewById(R.id.checkBox5);
        CheckBox redvelvetcake=findViewById(R.id.checkBox6);
        CheckBox chocolatechessecake=findViewById(R.id.checkBox12);
        CheckBox rasmalaicake=findViewById(R.id.checkBox8);
        CheckBox oreocheesecake=findViewById(R.id.checkBox9);
        CheckBox pinntacake=findViewById(R.id.checkBox10);
        CheckBox nutellacake=findViewById(R.id.checkBox15);
        CheckBox vanillacake=findViewById(R.id.checkBox11);
        chocolatecake.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chocolatecake.isChecked()){
                    total+=300;
                    count+=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
                else{
                    total-=300;
                    count-=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
            }
        });
        hazelnutcake.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(hazelnutcake.isChecked()){
                    total+=500;
                    count+=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
                else{
                    total-=500;
                    count-=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
            }
        });
        oreocake.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(oreocake.isChecked()){
                    total+=400;
                    count+=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
                else{
                    total-=400;
                    count-=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
            }
        });
        fudgecake.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(fudgecake.isChecked()){
                    total+=180;
                    count+=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
                else{
                    total-=180;
                    count-=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
            }
        });
        strawberrycake.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(strawberrycake.isChecked()){
                    total+=210;
                    count+=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
                else{
                    total-=210;
                    count-=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
            }
        });
        farrerocake.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(farrerocake.isChecked()){
                    total+=650;
                    count+=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
                else{
                    total-=650;
                    count-=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
            }
        });
        italianpastry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(italianpastry.isChecked()){
                    total+=260;
                    count+=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
                else{
                    total-=260;
                    count-=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
            }
        });
        redvelvetcake.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(redvelvetcake.isChecked()){
                    total+=450;
                    count+=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
                else{
                    total-=450;
                    count-=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
            }
        });
        chocolatechessecake.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chocolatechessecake.isChecked()){
                    total+=400;
                    count+=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
                else{
                    total-=400;
                    count-=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
            }
        });
        rasmalaicake.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(rasmalaicake.isChecked()){
                    total+=550;
                    count+=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
                else{
                    total-=550;
                    count-=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
            }
        });
        oreocheesecake.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(oreocheesecake.isChecked()){
                    total+=210;
                    count+=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
                else{
                    total-=210;
                    count-=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
            }
        });
        pinntacake.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(pinntacake.isChecked()){
                    total+=500;
                    count+=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
                else{
                    total-=500;
                    count-=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
            }
        });
        nutellacake.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(nutellacake.isChecked()){
                    total+=540;
                    count+=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
                else{
                    total-=540;
                    count-=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
            }
        });
        vanillacake.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(vanillacake.isChecked()){
                    total+=150;
                    count+=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
                else{
                    total-=150;
                    count-=1;
                    totl.setText("Total : "+total);
                    qty.setText("Quantity : "+count);
                }
            }
        });
        bestseller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_fragment_right(new bestseller(),0);
                popular.setTextColor(Color.parseColor("#a0a1a3"));
                bestseller.setTextColor(Color.parseColor("#000000"));
                popular.setClickable(true);
                bestseller.setClickable(false);
            }
        });
        popular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_fragment_left(new popular(),0);
                popular.setTextColor(Color.parseColor("#000000"));
                bestseller.setTextColor(Color.parseColor("#a0a1a3"));
                popular.setClickable(false);
                bestseller.setClickable(true);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intnt=new Intent(getApplicationContext(),bill.class);
                intnt.putExtra("total",total);
                intnt.putExtra("quantity",count);
                startActivity(intnt);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }

    private void open_fragment_left(Fragment fragment,int flag) {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.setCustomAnimations(R.anim.slide_in_left,R.anim.slide_out_right,R.anim.slide_in_right,R.anim.slide_out_left);
        ft.replace(R.id.frame,fragment,"popular").commit();
        fm.popBackStack("popular",0);
    }

    private void open_fragment_right(Fragment fragment,int flag) {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.setCustomAnimations(R.anim.slide_in_right,R.anim.slide_out_left,R.anim.slide_in_left,R.anim.slide_out_right);
        ft.replace(R.id.frame,fragment,"bestseller").commit();
        fm.popBackStack("bestseller",0);
    }

    private void default_fragment(Fragment fragment,int flag) {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame,fragment,"popular").commit();
        fm.popBackStack("popular",0);
    }
}