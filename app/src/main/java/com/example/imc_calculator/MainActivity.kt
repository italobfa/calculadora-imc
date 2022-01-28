package com.example.imc_calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        calcularBTN?.setOnClickListener {
            calcularIMC(peso.text.toString(), altura.text.toString())
        }
    }

    private fun calcularIMC(peso:String, altura:String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()

        if(peso != null && altura != null){
            val imc = peso / (altura*altura)
            val resultado = Intent(this, ResultActivity::class.java)
            resultado.putExtra("resultado", imc)
            startActivity(resultado)
        }
    }
}