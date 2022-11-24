package com.riyaldi.temperatureconverter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat.recreate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var bool:Boolean=true
    fun AllBtn(view:View){
        val btn=view as Button
        if (bool){
            btn.text="X"
        }else{
            btn.text="O"
        }
        btn.isEnabled=false
        bool=!bool
        win()
    }
    fun Enable(){
        val button1:Button=findViewById(R.id.btn1)
        val button2:Button=findViewById(R.id.btn2)
        val button3:Button=findViewById(R.id.btn3)
        val button4:Button=findViewById(R.id.btn4)
        val button5:Button=findViewById(R.id.btn5)
        val button6:Button=findViewById(R.id.btn6)
        val button7:Button=findViewById(R.id.btn7)
        val button8:Button=findViewById(R.id.btn8)
        val button9:Button=findViewById(R.id.btn9)
        button1.isEnabled=false
        button2.isEnabled=false
        button3.isEnabled=false
        button4.isEnabled=false
        button5.isEnabled=false
        button6.isEnabled=false
        button7.isEnabled=false
        button8.isEnabled=false
        button9.isEnabled=false
    }
    fun Play(){
        var textV:TextView=findViewById(R.id.textView)
        if(bool){
            textV.text="O is the winner"
            Enable()
        }else{
            textV.text="X is the winner"
            Enable()
        } }
    fun win(){
        val button1:Button=findViewById(R.id.btn1)
        val button2:Button=findViewById(R.id.btn2)
        val button3:Button=findViewById(R.id.btn3)
        val button4:Button=findViewById(R.id.btn4)
        val button5:Button=findViewById(R.id.btn5)
        val button6:Button=findViewById(R.id.btn6)
        val button7:Button=findViewById(R.id.btn7)
        val button8:Button=findViewById(R.id.btn8)
        val button9:Button=findViewById(R.id.btn9)
        if(button1.text==button2.text && button2.text==button3.text && !button1.isEnabled){
            Play()
        }
        else
            if(button4.text==button5.text && button5.text==button6.text&& !button4.isEnabled)
                Play()
            else
                if(button7.text==button8.text && button8.text==button9.text&& !button7.isEnabled)
                    Play()
                else
                    if(button1.text==button4.text && button4.text==button7.text&& !button1.isEnabled)
                        Play()
                    else
                        if(button2.text==button5.text && button5.text==button8.text&& !button2.isEnabled)
                            Play()
                        else
                            if(button3.text==button6.text && button6.text==button9.text&& !button3.isEnabled)
                                Play()
                            else
                                if(button1.text==button5.text && button5.text==button9.text&& !button1.isEnabled)
                                    Play()
                                else
                                    if(button3.text==button5.text && button5.text==button7.text&& !button3.isEnabled)
                                        Play()
    }
}