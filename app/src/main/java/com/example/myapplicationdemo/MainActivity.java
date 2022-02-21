package com.example.myapplicationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et_A= findViewById(R.id.editText_A);
        EditText et_B= findViewById(R.id.editText_B);
        Button bt_tong= findViewById(R.id.button_Tong);
        Button bt_hieu= findViewById(R.id.button_Hieu);
        Button bt_nhan= findViewById(R.id.button_Nhan);
        Button bt_chia= findViewById(R.id.button_Chia);
        TextView tv_kq= findViewById(R.id.textview_Ketqua);

        bt_tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a= Integer.parseInt(et_A.getText().toString());
                int b= Integer.parseInt(et_B.getText().toString());
                int c= a+b;
                tv_kq.setText("Kết quả: "+c);
            }
        });

        bt_hieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a= Integer.parseInt(et_A.getText().toString());
                int b= Integer.parseInt(et_B.getText().toString());
                int c= a-b;
                tv_kq.setText("Kết quả: "+c);
            }
        });

        bt_nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a= Integer.parseInt(et_A.getText().toString());
                int b= Integer.parseInt(et_B.getText().toString());
                int c= a*b;
                tv_kq.setText("Kết quả: "+c);
            }
        });

        bt_chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a= Float.parseFloat(et_A.getText().toString());
                float b= Float.parseFloat(et_B.getText().toString());
                float c= a/b;
                tv_kq.setText("Kết quả: "+c);
            }
        });
    }
}