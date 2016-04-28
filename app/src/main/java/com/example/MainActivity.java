package com.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.youth.template.LoginTemplateView;

public class MainActivity extends AppCompatActivity {
    LoginTemplateView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view=new LoginTemplateView(this);
        setContentView(view);
        //设置点击事件
        view.setLoginListener(new LoginTemplateView.LoginListener() {
            @Override
            public void login(View v) {
                Toast.makeText(getApplicationContext(),view.getUsername(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
