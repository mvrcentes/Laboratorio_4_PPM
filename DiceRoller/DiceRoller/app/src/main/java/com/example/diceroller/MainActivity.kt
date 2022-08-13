package com.example.diceroller

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.reflect.typeOf

class MainActivity : AppCompatActivity() {
    val imageView : ImageView? = null;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun girar(view: View){
        
        val lados = findViewById<EditText>(R.id.editTextNumber)
        val dado = Dice(Integer.parseInt(lados.getText().toString()))

//        val img =  findViewById(R.id.imageView)

        println("lados:\t ${lados.getText()}")
        imageView?.setImageResource(R.drawable.dado_2);

        if(dado.roll() == 1){
            println("lados:\t ${dado.roll()}")
            imageView?.setImageResource(R.drawable.dado);
        }else if(dado.roll() == 2){
            println("lados:\t ${dado.roll()}")
            imageView?.setImageResource(R.drawable.dado_2);
        }else if(dado.roll() == 2){
            println("lados:\t ${dado.roll()}")
            imageView?.setImageResource(R.drawable.dado_3);
        }else if(dado.roll() == 3){
            println("lados:\t ${dado.roll()}")
            imageView?.setImageResource(R.drawable.dado_4);
        }else if(dado.roll() == 4){
            println("lados:\t ${dado.roll()}")
            imageView?.setImageResource(R.drawable.dado_5);
        }else if(dado.roll() == 5){
            println("lados:\t ${dado.roll()}")
            imageView?.setImageResource(R.drawable.dado_6);
        }else {
            println("lados:\t ${dado.roll()}")
            imageView?.setImageResource(R.drawable.dado_infinito);
        }
    }
}