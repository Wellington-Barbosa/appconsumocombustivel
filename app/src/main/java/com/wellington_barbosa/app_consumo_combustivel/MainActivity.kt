package com.wellington_barbosa.app_consumo_combustivel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnCalcular(view: View) {
        //recupera valores digitados
        val precoEtanol = txtEtanol.text.toString()
        val precoGasolina = txtGasolina.text.toString()

        calcularMelhorPreco(precoEtanol, precoGasolina)
    }

    fun calcularMelhorPreco (precoEtanol: String, precoGasolina: String) {
        //converte valores string para números
        val valorEtanol = precoEtanol.toDouble()
        val valorGasolina = precoGasolina.toDouble()

        /* Para calcular utilizaremos (valorEtanol / valorGasolina)
        * Se o resultado >= 0.7 melhor utilizar gasolina
        * senão melhor utilizar Etanol
        * */
        val resultadoPreco = valorEtanol / valorGasolina

        if (resultadoPreco >= 0.7) {
            txtResultado.setText("Melhor utilizar gasolina")
        } else {
            txtResultado.setText("Melhor utilizar Etanol")
        }

    }
}