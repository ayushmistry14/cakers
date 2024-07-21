package com.example.c_akers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class bill extends AppCompatActivity {

    int sub=50,gst=0;
    String bill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
        bill=getIntent().getStringExtra("total");
        TextView bil=findViewById(R.id.textView2);
        TextView qun=findViewById(R.id.quan);
        TextView total=findViewById(R.id.textView);
        TextView gt=findViewById(R.id.gst);
        LottieAnimationView animationView= findViewById(R.id.lotte);
        Button btn=findViewById(R.id.button2);
        bil.setText("₹ "+bill);
        qun.setText(getIntent().getStringExtra("quantity"));
        gst= (int) (getIntent().getIntExtra("totl",0)*0.18);
        sub=getIntent().getIntExtra("totl",0)+gst+sub;
        total.setText("₹ "+sub);
        gt.setText("₹ "+gst);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationView.playAnimation();
                Toast toast=Toast.makeText(getApplicationContext(),"Payment Successful...!",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER|Gravity.BOTTOM,0,0);
                toast.show();
            }
        });
    }
}