package com.example.invitado.eva1_9_practica9;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    EditText fechaNacimiento;
    RadioButton desarrollada, americaLatina, asia, africa, hombre, mujer;
    RadioGroup regiones, genero;
    TextView vida, deceso;

    int[][] datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fechaNacimiento = (EditText)findViewById(R.id.editText_fechaNacimiento);

        desarrollada = (RadioButton)findViewById(R.id.radioButton_desarrollada);
        americaLatina = (RadioButton)findViewById(R.id.radioButton_americaLatina);
        asia = (RadioButton)findViewById(R.id.radioButton_asia);
        africa = (RadioButton)findViewById(R.id.radioButton_africa);
        hombre = (RadioButton)findViewById(R.id.radioButton_hombre);
        mujer = (RadioButton)findViewById(R.id.radioButton_mujer);

        regiones = (RadioGroup)findViewById(R.id.radioGroup_regiones);
        genero = (RadioGroup)findViewById(R.id.radioGroup_genero);
        regiones.setOnCheckedChangeListener(this);
        genero.setOnCheckedChangeListener(this);

        vida = (TextView)findViewById(R.id.textView_vida);
        deceso = (TextView)findViewById(R.id.textView_deceso);

        datos = new int[6][5];

        datos[0][0] = 75;
        datos[0][1] = 60;
        datos[0][2] = 45;
        datos[0][3] = 35;
        datos[0][4] = 10;

        datos[1][0] = 75;
        datos[1][1] = 65;
        datos[1][2] = 50;
        datos[1][3] = 45;
        datos[1][4] = 9;

        datos[2][0] = 80;
        datos[2][1] = 70;
        datos[2][2] = 65;
        datos[2][3] = 55;
        datos[2][4] = 8;

        datos[3][0] = 80;
        datos[3][1] = 75;
        datos[3][2] = 65;
        datos[3][3] = 60;
        datos[3][4] = 7;

        datos[4][0] = 85;
        datos[4][1] = 75;
        datos[4][2] = 60;
        datos[4][3] = 55;
        datos[4][4] = 6;

        datos[5][0] = 90;
        datos[5][1] = 70;
        datos[5][2] = 65;
        datos[5][3] = 60;
        datos[5][4] = 4;
    }

    public void actualizacion(){
        try {
            if (Integer.parseInt(fechaNacimiento.getText().toString()) >= 1950 || Integer.parseInt(fechaNacimiento.getText().toString()) <= 2010) {
                int nacimiento = Integer.parseInt(fechaNacimiento.getText().toString());
                int base = (nacimiento - 1950) / 10;
                int expectativa = desarrollada.isChecked() ? datos[base][0] : americaLatina.isChecked() ? datos[base][1] : asia.isChecked() ? datos[base][2] : datos[base][3];
                expectativa += hombre.isChecked() ? -(datos[base][4] / 2) : (datos[base][4] / 2);
                vida.setText("" + expectativa);
                deceso.setText("" + (nacimiento = expectativa));
            }
        } catch(Exception e){}
    }

    public void fecha_Change(View v){
        actualizacion();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        actualizacion();
    }
}
