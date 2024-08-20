package com.example.first_project

import android.app.Activity

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import com.example.first_project.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    var number: Int=0
    var opr:String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityMainBinding.inflate(layoutInflater)
        findViewById<TextView>(R.id.result)
        setContentView((binding.root))



        binding.button0.setOnClickListener(){
            binding.result.text= binding.result.text.toString() + "0"
        }

        binding.button1.setOnClickListener(){
            binding.result.text= binding.result.text.toString() + "1"
        }
        binding.button2.setOnClickListener(){
            binding.result.text= binding.result.text.toString() + "2"
        }
        binding.button3.setOnClickListener(){
            binding.result.text= binding.result.text.toString() + "3"
        }

        binding.button4.setOnClickListener(){
            binding.result.text= binding.result.text.toString() + "4"
        }
        binding.button5.setOnClickListener(){
            binding.result.text= binding.result.text.toString() + "5"
        }

        binding.button6.setOnClickListener(){
            binding.result.text= binding.result.text.toString() + "6"
        }

        binding.button7.setOnClickListener(){
            binding.result.text= binding.result.text.toString() + "7"
        }

        binding.button8.setOnClickListener(){
            binding.result.text= binding.result.text.toString() + "8"
        }

        binding.button9.setOnClickListener(){
            binding.result.text= binding.result.text.toString() + "9"
        }

        binding.buttonPlus.setOnClickListener(){
            number= binding.result.text.toString().toInt()
            opr="+"
            binding.result.text=""
        }


        binding.buttonMinus.setOnClickListener(){
            number= binding.result.text.toString().toInt()
            opr="-"
            binding.result.text=""
        }

        binding.buttonMultipley.setOnClickListener(){
            number= binding.result.text.toString().toInt()
            opr="*"
            binding.result.text=""
        }

        binding.buttonqusma.setOnClickListener(){
            number= binding.result.text.toString().toInt()
            opr="/"
            binding.result.text=""
        }

        binding.buttonClear.setOnClickListener(){
            number= 0
            opr=""
            binding.result.text=""
        }


        binding.buttonEqule.setOnClickListener {
            when(opr) {
                "+" -> binding.result.text =
                    (number + binding.result.text.toString().toInt()).toString()

                "-" -> binding.result.text =
                    (number - binding.result.text.toString().toInt()).toString()

                "*" -> binding.result.text =
                    (number * binding.result.text.toString().toInt()).toString()

                "/" -> binding.result.text =
                    (number / binding.result.text.toString().toInt()).toString()


            }}



    }

}