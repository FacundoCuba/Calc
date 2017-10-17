package com.example.facu.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Calcular (View v){
        TextView total = (TextView) findViewById(R.id.numTotal);
        TextView porcentaje = (TextView) findViewById(R.id.numPorcentaje);
        String t = String.valueOf(total.getText());
        String p = String.valueOf(porcentaje.getText());
        Double nt = Double.parseDouble(t)+(Double.parseDouble(p)*Double.parseDouble(t)/100);
        TextView nuevoTotal = (TextView) findViewById(R.id.txtTotal);
        nuevoTotal.setText(nt.toString());
    }


}
