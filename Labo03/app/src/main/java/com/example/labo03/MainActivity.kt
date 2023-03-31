package com.example.labo03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var fiveCent : ImageView;
    private lateinit var tenCent : ImageView;
    private lateinit var quarterCent : ImageView;
    private lateinit var oneDollar : ImageView;
    private lateinit var cashText : TextView;
    private var number = 0.00;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fiveCent = findViewById(R.id.five_ctn_img)
        tenCent = findViewById(R.id.ten_ctn_img)
        quarterCent = findViewById(R.id.quater_ctn_img)
        oneDollar = findViewById(R.id.one_dollar_img)
        cashText = findViewById(R.id.count_txt)

        fiveCent.setOnClickListener() {
            number += 0.05
            number = String.format("%.2f", number).toDouble()
            cashText.text = "$${number}"
        }

        tenCent.setOnClickListener() {
            number += 0.10
            number = String.format("%.2f", number).toDouble()
            cashText.text = "$${number}"
        }

        quarterCent.setOnClickListener(){
            number += 0.25
            number = String.format("%.2f", number).toDouble()
            cashText.text = "$${number}"
        }

        oneDollar.setOnClickListener() {
            number += 1.00
            number = String.format("%.2f", number).toDouble()
            cashText.text = "$${number}"
        }
    }
}