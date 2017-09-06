package com.example.invitado.eva1_practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main extends AppCompatActivity {

    EditText editText_nombre;
    TextView textView_nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_nombre = (EditText)findViewById(R.id.editText_nombre);
        textView_nombre = (TextView)findViewById(R.id.textView_nombre);

    }

    public void showName(View v){
        textView_nombre.setText(editText_nombre.getText());
    }

}
