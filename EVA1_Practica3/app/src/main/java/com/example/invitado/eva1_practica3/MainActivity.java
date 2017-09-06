package com.example.invitado.eva1_practica3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView_mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_mensaje = (TextView)findViewById(R.id.textView_pruebaMensaje);
        textView_mensaje.setText("No he hecho la tarea de martina D:");
    }
}
