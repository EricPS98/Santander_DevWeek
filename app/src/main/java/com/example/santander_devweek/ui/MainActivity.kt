package com.example.santander_devweek.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.santander_devweek.R
import com.example.santander_devweek.data.Conta

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        buscarContaCliente()

    }

    private fun buscarContaCliente(){
    mainViewModel.buscarContaCliente().observe(this, Observer { result ->
        bindOnView(result)
        })
    }

    private fun bindOnView(conta: Conta){
        findViewById<TextView>(R.id.tv_usuario_value).text = conta.cliente.nome
        findViewById<TextView>(R.id.tv_agencia_value).text = conta.agencia
        findViewById<TextView>(R.id.tv_conta_corrente_value).text = conta.numero
        findViewById<TextView>(R.id.tv_saldo_value).text = conta.saldo
        findViewById<TextView>(R.id.tv_limite_value).text = conta.limite
        findViewById<TextView>(R.id.tv_cartao_final_value).text = conta.cartao.numeroCartao
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.main_menu, menu) // R = Resources, o "inflate" esta buscando o caminho do layout do menu
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) { //quando o identificador do menu for acionado
            R.id.item1 -> {
                Log.d("Click", "Click no item 1")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}