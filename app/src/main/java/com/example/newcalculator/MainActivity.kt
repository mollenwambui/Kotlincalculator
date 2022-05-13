package com.example.newcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
 lateinit var etNumber1:EditText
 lateinit var etNumber2:EditText
 lateinit var btnAdd:Button
 lateinit var btnMinus:Button
 lateinit var btnModulus:Button
 lateinit var btnDivision:Button
 lateinit var tvResult:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNumber1=findViewById(R.id.etNumber1)
        etNumber2=findViewById(R.id.etNumber2)
        btnAdd=findViewById(R.id.btnAdd)
        btnDivision=findViewById(R.id.btnDivision)
        btnMinus=findViewById(R.id.btnMinus)
        btnModulus=findViewById(R.id.btnModulus)
        tvResult=findViewById(R.id.tvResults)
        btnAdd.setOnClickListener {
            var number1=etNumber1.text.toString().toInt()
            var number2=etNumber2.text.toString().toInt()
            addition(number1, number2)
        }
        btnMinus.setOnClickListener {
            var number1=etNumber1.text.toString().toInt()
            var number2=etNumber2.text.toString().toInt()
            minus(number1,number2)
        }
      btnModulus.setOnClickListener {
          var number1=etNumber1.text.toString().toInt()
          var number2=etNumber2.text.toString().toInt()
            modulus(number1, number2)
      }
        btnDivision.setOnClickListener {
            var number1=etNumber1.text.toString().toInt()
            var number2=etNumber2.text.toString().toInt()
            division(number1, number2)
        }

    }
    fun addition(number1:Int,number2:Int){
        var sum=number1+number2
        tvResult.text=sum.toString()
    }
    fun minus(number1: Int,number2: Int){
        var subtract=number1-number2
        tvResult.text=subtract.toString()
    }
    fun modulus(number1: Int,number2: Int){
        var remainder=number1%number2
        tvResult.text=remainder.toString()
    }
    fun division(number1: Int,number2: Int){
        var divide=number1/number2
        tvResult.text=divide.toString()
    }
}
