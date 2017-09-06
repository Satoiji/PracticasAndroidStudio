package com.example.invitado.eva1_6_practica6;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    RadioGroup comida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        comida = (RadioGroup)findViewById(R.id.radioGroup_comida);
        comida.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        if(checkedId == R.id.radioButton_hamburguesas)
            Toast.makeText(this, "Hmaburguesas", Toast.LENGTH_SHORT).show();
        else if(checkedId == R.id.radioButton_montados)
            Toast.makeText(this, "Montados", Toast.LENGTH_SHORT).show();
        else if(checkedId == R.id.radioButton_tortas)
            Toast.makeText(this, "Tortas", Toast.LENGTH_SHORT).show();
        else if(checkedId == R.id.radioButton_otro)
            Toast.makeText(this, "Otra comida", Toast.LENGTH_SHORT).show();
    }
}
