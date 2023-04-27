package com.danielflorez11cortez;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etValorHora;
    private EditText etHorasTrabajadas;
    private Button btnCalcular;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValorHora = findViewById(R.id.etValorHora);
        etHorasTrabajadas = findViewById(R.id.etHorasTrabajadas);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Leer los valores ingresados por el usuario
                float valorHora = Float.parseFloat(etValorHora.getText().toString());
                float horasTrabajadas = Float.parseFloat(etHorasTrabajadas.getText().toString());

                // Calcular el valor total a pagar
                float totalPagar = valorHora * horasTrabajadas;

                // Mostrar la notificación Toast con el valor total a pagar
                NotificationUtils.showNotification(MainActivity.this, "Total a pagar: $" + totalPagar);
            }
        });
    }
}
