package com.example.labo11

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.example.labo11.network.retrofit.RetrofitInstance
import com.example.labo11.repository.CredentialsRepository

class RetrofitApplication : Application() {

    private val prefs: SharedPreferences by lazy {
        getSharedPreferences("Retrofit", Context.MODE_PRIVATE)
    }

    private fun getAPIService() = with(RetrofitInstance) {
        setToken(getToken())
        getLoginService()
    }

    fun getToken(): String = prefs.getString(USER_TOKEN, "")!!

    val credentialsRepository: CredentialsRepository by lazy {
        CredentialsRepository(getAPIService())
    }

    fun saveAuthToken(token: String) {
        val editor = prefs.edit()
        editor.putString(USER_TOKEN, token)
        editor.apply()
    }


    companion object {
        const val USER_TOKEN = "user_token"
    }
}