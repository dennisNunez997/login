package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String name="dennis";
    private String pass="1234";
    private EditText et1;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.user_name);
        password = (EditText) findViewById(R.id.password);


    }

    public void login(View view)
    {
        String palabra = et1.getText().toString();
        String con = password.getText().toString();



        if((palabra.equals(name)) && (con.equals(pass))){
            Intent i = new Intent(this, ingreso_exitoso.class);
            startActivity(i);
        }else
        {
            Intent o = new Intent(this, ingreso_fallido.class);
            startActivity(o);
        }

    }
}
