package com.example.santander_devweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val medicamento = Medicamento("Teste 1", "2x ao dia")
    }

    /* ------------------- Testes para familiarização com o Kotlin ---------------

   //Declaração de variáveis
   //val - valor estático (não muda)
   //var - mutável

   var cont : Int = 10
   cont = 11

   val cont2 : Int = 11;

   //Segurança Nula
   val languageName: String? = null

   //Condicionais
   var idade = 20
   val minhaIdade = if(idade > 18) {
       println("Você é maior de idade")
   } else {
       println("Você é menor de idade")
   }


   //when
   var idade = 20
   val minhaIdade = when {
       idade > 18 -> "Você é maior de idade"
       else -> "Você é menor de idade"
   }
   --------------------------------------------------------------------------*/


}