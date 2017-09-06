package com.example.invitado.eva1_7_practica7;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    EditText editText_nombre, editText_apellido, editText_edad;
    TextView textView_nombre, textView_apellido, textView_edad;
    RadioGroup radioGroup_idioma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_nombre = (EditText)findViewById(R.id.editText_nombre);
        editText_apellido = (EditText)findViewById(R.id.editText_apellido);
        editText_edad = (EditText)findViewById(R.id.editText_edad);

        textView_nombre = (TextView) findViewById(R.id.textView_nombre);
        textView_apellido = (TextView)findViewById(R.id.textView_apellido);
        textView_edad = (TextView)findViewById(R.id.textView_edad);

        radioGroup_idioma = (RadioGroup)findViewById(R.id.radioGroup_idioma);
        radioGroup_idioma.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        if(checkedId == R.id.radioButton_espanol){
            editText_nombre.setHint(R.string.hint_nombre_es);
            editText_apellido.setHint(R.string.hint_apellido_es);
            editText_edad.setHint(R.string.hint_edad_es);

            textView_nombre.setText(R.string.view_nombre_es);
            textView_apellido.setText(R.string.view_apellido_es);
            textView_edad.setText(R.string.view_edad_es);
        } else {
            editText_nombre.setHint(R.string.hint_nombre_en);
            editText_apellido.setHint(R.string.hint_apellido_en);
            editText_edad.setHint(R.string.hint_edad_en);

            textView_nombre.setText(R.string.view_nombre_en);
            textView_apellido.setText(R.string.view_apellido_en);
            textView_edad.setText(R.string.view_edad_en);
        }
    }
}
