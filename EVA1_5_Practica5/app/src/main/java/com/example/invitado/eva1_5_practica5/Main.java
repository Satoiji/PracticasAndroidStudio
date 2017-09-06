package com.example.invitado.eva1_5_practica5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main extends AppCompatActivity implements View.OnClickListener{


    Button listener,anonima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listener = (Button)findViewById(R.id.button_listener);
        anonima = (Button)findViewById(R.id.button_anonima);

        listener.setOnClickListener(this);
        anonima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main.this, "Hola mundo anonimo", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void click(View v){
        Toast.makeText(this, "Hola mundo", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Hola mundo listener", Toast.LENGTH_SHORT).show();

    }
}
