package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
        lateinit var number1: EditText
        lateinit var number2: EditText
        lateinit var add1: Button
        lateinit var minus1: Button
        lateinit var multiply1: Button
        lateinit var divition1: Button
        lateinit var theResult: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number1 = findViewById(R.id.num1)
        number2 = findViewById(R.id.num2)
        add1 = findViewById(R.id.add)
        minus1 = findViewById(R.id.minus)
        multiply1 = findViewById(R.id.multiply)
        divition1 = findViewById(R.id.divition)
        theResult = findViewById((R.id.result))


        add1.setOnClickListener { addFunction() }
        minus1.setOnClickListener { minusFunction()}
        multiply1.setOnClickListener { multiplyFunction()}
        divition1.setOnClickListener {  divitionFunction()}

    }

    fun addFunction(){

       var n1 =  number1.text.toString().toInt()
        var n2 = number2.text.toString().toInt()
        var r = n1 + n2
        theResult.text = r.toString()
    }
    fun minusFunction(){

        var n1 =  number1.text.toString().toInt()
        var n2 = number2.text.toString().toInt()
        var r = n1-n2
        theResult.text = r.toString()
    }
    fun multiplyFunction(){

        var n1 =  number1.text.toString().toInt()
        var n2 = number2.text.toString().toInt()
        var r = n1*n2
        theResult.text = r.toString()
    }
    fun divitionFunction(){

        var n1 =  number1.text.toString().toInt()
        var n2 = number2.text.toString().toInt()
        val r = n1/n2
        theResult.text = r.toString()
    }

}