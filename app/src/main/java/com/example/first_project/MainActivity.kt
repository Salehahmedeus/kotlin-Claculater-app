package com.example.first_project

import android.app.Activity

import android.os.Bundle
import android.widget.Button
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




        BtnNumber(binding.button0,"0")
        BtnNumber(binding.button1,"1")
        BtnNumber(binding.button2,"2")
        BtnNumber(binding.button3,"3")
        BtnNumber(binding.button4,"4")
        BtnNumber(binding.button5,"5")
        BtnNumber(binding.button6,"6")
        BtnNumber(binding.button7,"7")
        BtnNumber(binding.button8,"8")
        BtnNumber(binding.button9,"9")

        BtnOper(binding.buttonPlus,"+")
        BtnOper(binding.buttonMinus,"-")
        BtnOper(binding.buttonMultipley,"*")
        BtnOper(binding.buttonqusma,"/")
        BtnOper(binding.buttonClear,"",isClear = true)




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

            }
        }




    }

    fun BtnNumber(button: Button ,S:String){
        button.setOnClickListener(){
            binding.result.text= binding.result.text.toString() + S
        }
    }
    fun BtnOper(button: Button ,S:String,isClear:Boolean = false){
        button.setOnClickListener(){
            if(isClear){
                number=0
            }else{
                number= binding.result.text.toString().toInt()
            }
            opr=S
            binding.result.text=""
        }
    }

}