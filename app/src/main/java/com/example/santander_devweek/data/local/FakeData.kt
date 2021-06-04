package com.example.santander_devweek.data.local

import com.example.santander_devweek.data.Cartao
import com.example.santander_devweek.data.Cliente
import  com.example.santander_devweek.data.Conta

class FakeData {
    fun getLocalData() : Conta {
        val cliente = Cliente("Eric")
        val cartao = Cartao("491655813302")
        return Conta(
            "445632-7",
            "6553",
            "2.532,75",
            "5.162,30",
            cliente,
            cartao
        );
    }
}