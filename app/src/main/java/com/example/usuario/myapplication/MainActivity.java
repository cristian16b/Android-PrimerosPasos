package com.example.usuario.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numeroI;
    private EditText numeroII;
    private TextView resultadoSuma;
    private RadioButton radioRestar,radioMultiplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instancio los elementos
        numeroI = (EditText)findViewById(R.id.primerNumero);
        numeroII = (EditText)findViewById(R.id.segundoNumero);
        resultadoSuma = (TextView)findViewById(R.id.resultadoSuma);
        radioMultiplicar = (RadioButton)findViewById(R.id.radioMultiplicar);
        radioRestar = (RadioButton)findViewById(R.id.radioRestar);
    }

    //metodo asociado al <sumar>
    public void sumar(View view) {

        try {
            String primerNumero = numeroI.getText().toString();
            String segundoNumero = numeroII.getText().toString();
            int nro1 = Integer.parseInt(primerNumero);
            int nro2 = Integer.parseInt(segundoNumero);
            int suma = nro1 + nro2;
            String Suma =  Integer.toString(suma);

            resultadoSuma.setText("El resultado es " +  Suma);
        }
        catch (Exception e) {
            resultadoSuma.setText("ERROR");
        }
    }

    //metodo asociado al <operar>
    public void operar(View view) {
        try {
            String primerNumero = numeroI.getText().toString();
            String segundoNumero = numeroII.getText().toString();
            int nro1 = Integer.parseInt(primerNumero);
            int nro2 = Integer.parseInt(segundoNumero);

            if(radioRestar.isChecked()) {
                resultadoSuma.setText("El resultado es " + Integer.toString(nro1-nro2));
            }
            if(radioMultiplicar.isChecked()) {
                resultadoSuma.setText("El resultado es " + Integer.toString(nro1*nro2));
            }
        }
        catch (Exception e) {

        }
    }
}
