package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.login_select.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun showRegistrationForm(){
        registerPage_layout.visibility = View.VISIBLE
        loginPage_layout.visibility = View.GONE
        login_select.visibility = View.GONE
    }

    private fun showLoginForm(){
        registerPage_layout.visibility = View.GONE
        loginPage_layout.visibility = View.VISIBLE
        login_select.visibility = View.GONE
    }
}
