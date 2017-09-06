package com.example.invitado.eva1_8_practica8;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    RadioButton americano,capuchino,expreso;
    EditText cantidad;
    CheckBox azucar,crema;
    TextView descripcion;
    RadioGroup cafes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        americano = (RadioButton) findViewById(R.id.radioButton_americano);
        capuchino = (RadioButton) findViewById(R.id.radioButton_capuchino);
        expreso = (RadioButton) findViewById(R.id.radioButton_expreso);

        cantidad = (EditText) findViewById(R.id.editText_cantidad);

        azucar = (CheckBox) findViewById(R.id.checkBox_azucar);
        crema = (CheckBox) findViewById(R.id.checkBox_crema);

        descripcion = (TextView)findViewById(R.id.textView_descripcion);

        cafes = (RadioGroup)findViewById(R.id.radioGroup_cafes);
        cafes.setOnCheckedChangeListener(this);
    }

    public void button_click(View v){
        int total = 0;
        total += americano.isChecked() ? 20 : 0;
        total += capuchino.isChecked() ? 48 : 0;
        total += expreso.isChecked() ? 30 : 0;
        try {
            if (Integer.parseInt(cantidad.getText().toString()) > 0) {
                total *= Integer.parseInt(cantidad.getText().toString());

                total += azucar.isChecked() ? 1 : 0;
                total += crema.isChecked() ? 1 : 0;

                Toast.makeText(this, "Costo: " + total, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Ingrese una cantidad mayor a 0", Toast.LENGTH_SHORT).show();
            }
        } catch(Exception e){ Toast.makeText(this, "Ingrese una cantidad", Toast.LENGTH_SHORT).show(); }
    }

    public void checkbox_click(View v){

        descripcion.setText(generateDesc());
    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        descripcion.setText(generateDesc());
    }

    public String generateDesc(){
        String descripcion = "";
        descripcion += americano.isChecked() ? "Cafe americano" : "";
        descripcion += capuchino.isChecked() ? "Cafe capuchino" : "";
        descripcion += expreso.isChecked() ? "Cafe expreso" : "";

        descripcion += azucar.isChecked() ? ", azucar" : "";
        descripcion += crema.isChecked() ? ", azucar" : "";

        return descripcion;
    }
}
