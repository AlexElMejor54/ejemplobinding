package com.example.ejemplobinding

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numero1 = findViewById<EditText>(R.id.numero1)
        val numero2 = findViewById<EditText>(R.id.numero2)
        val resultado = findViewById<TextView>(R.id.resultado)

        val sumar = findViewById<Button>(R.id.sumar)
        val restar = findViewById<Button>(R.id.restar)
        val multiplicar = findViewById<Button>(R.id.multiplicar)
        val dividir = findViewById<Button>(R.id.dividir)

        sumar.setOnClickListener {
            val n1 = numero1.text.toString().toDoubleOrNull()
            val n2 = numero2.text.toString().toDoubleOrNull()
            if (n1 != null && n2 != null) {
                resultado.text = "Resultado: ${n1 + n2}"
            } else {
                resultado.text = "Ingrese números válidos"
            }
        }

        restar.setOnClickListener {
            val n1 = numero1.text.toString().toDoubleOrNull()
            val n2 = numero2.text.toString().toDoubleOrNull()
            if (n1 != null && n2 != null) {
                resultado.text = "Resultado: ${n1 - n2}"
            } else {
                resultado.text = "Ingrese números válidos"
            }
        }

        multiplicar.setOnClickListener {
            val n1 = numero1.text.toString().toDoubleOrNull()
            val n2 = numero2.text.toString().toDoubleOrNull()
            if (n1 != null && n2 != null) {
                resultado.text = "Resultado: ${n1 * n2}"
            } else {
                resultado.text = "Ingrese números válidos"
            }
        }

        dividir.setOnClickListener {
            val n1 = numero1.text.toString().toDoubleOrNull()
            val n2 = numero2.text.toString().toDoubleOrNull()
            if (n1 != null && n2 != null && n2 != 0.0) {
                resultado.text = "Resultado: ${n1 / n2}"
            } else {
                resultado.text = "Ingrese números válidos o no divida entre cero"
            }
        }
    }
}
