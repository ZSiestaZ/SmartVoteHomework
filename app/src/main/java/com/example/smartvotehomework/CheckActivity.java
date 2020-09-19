package com.example.smartvotehomework;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CheckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        Button check = findViewById(R.id.checkBut);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText citizenNum = findViewById(R.id.citizenNumTextView);
                String textCitizenNum = citizenNum.getText().toString();
                CheckCitizenNum(textCitizenNum);
            }
        });
    }
    public void CheckCitizenNum(String num){
        String citNum1 = "1111111111111" ;
        String citnum2 = "2222222222222" ;
        if (num.length() == 0|| num.length() > 13|| num.length() < 13){
            Toast t = Toast.makeText(CheckActivity.this,"กรุณากรอกหมายเลขบัตรประชาชน13หลัก",Toast.LENGTH_LONG);
            t.show();
        }else if(num.equals(citNum1)  || num.equals(citnum2)  ){
            AlertDialog.Builder a = new AlertDialog.Builder(CheckActivity.this);
            a.setTitle("ผลการตรวจสอบสิทธิ์เลือกตั้ง");
            a.setMessage("คุณเป็นผู้มีสิทธิ์เลือกตั้ง");
            a.setPositiveButton("Ok", null);
            a.show();
        }else{
            AlertDialog.Builder a = new AlertDialog.Builder(CheckActivity.this);
            a.setTitle("ผลการตรวจสอบสิทธิ์เลือกตั้ง");
            a.setMessage("คุณไม่มีสิทธิ์เลือกตั้ง");
            a.setPositiveButton("Ok", null);
            a.show();
        }
    }
}