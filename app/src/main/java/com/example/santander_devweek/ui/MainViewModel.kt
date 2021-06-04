package com.example.santander_devweek.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.santander_devweek.data.Conta
import com.example.santander_devweek.data.local.FakeData

class MainViewModel : ViewModel(){

    private val mutableLiveData: MutableLiveData<Conta> = MutableLiveData()

    //Trafegar dados que poderão ser observados no futuro
    fun buscarContaCliente() : LiveData<Conta> {
        mutableLiveData.value = FakeData().getLocalData()

        return mutableLiveData
    }

}