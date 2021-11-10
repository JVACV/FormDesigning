package com.example.formdeigning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btnl);
        btn2=(Button)findViewById(R.id.btnr);
        btn3=(Button)findViewById(R.id.btns);
        btn4=(Button)findViewById(R.id.btnp);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnl:
                Intent intent=new Intent(MainActivity.this,Linear_layout.class);
                startActivity(intent);
                break;
            case R.id.btnr:
                startActivity(new Intent(MainActivity.this,RelativeLayout.class));
                break;
            case R.id.btns:
                startActivity(new Intent(MainActivity.this,Li_Layout.class));
                break;
            case R.id.btnp:
                startActivity(new Intent(MainActivity.this,FrameLayout.class));
                break;
            default:
                break;
        }

    }
}
