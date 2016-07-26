/**
 * 動態按鈕數量控制
 */

package com.example.hsinwei.my0726_1;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button btn = new Button(MainActivity.this);

        //btn.setText("點我");

        //setContentView(btn);
        final LinearLayout.LayoutParams Lpara = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                1.0f);
        final LinearLayout LLay= new LinearLayout(MainActivity.this);
        setContentView(LLay);
        Button btn1 = new Button(MainActivity.this);
        btn1.setLayoutParams(Lpara);
        btn1.setText("Btn1");
        LLay.addView(btn1);
        //setContentView(LLay);

        Button btn2 = new Button(MainActivity.this);
        btn2.setLayoutParams(Lpara);
        btn2.setText("Btn2");
        LLay.addView(btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LLay.removeViewAt(LLay.getChildCount()-1);
                //LLay.getBaseline()
            }
        });

        Button btn3 = new Button(MainActivity.this);
        btn3.setLayoutParams(Lpara);
        btn3.setText("Btn3");
        LLay.addView(btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("T0726",""+LLay.getChildCount());
                Button btn = new Button(MainActivity.this);
                btn.setLayoutParams(Lpara);
                btn.setText("Btn+");
                LLay.addView(btn);
            }
        });
    }

}
