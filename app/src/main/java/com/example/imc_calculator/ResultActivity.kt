package com.example.imc_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.trimmedLength
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val dados = intent.extras
        val valorCalculado = dados?.getFloat("resultado")

        resultado.text = (valorCalculado.toString())
    }
}