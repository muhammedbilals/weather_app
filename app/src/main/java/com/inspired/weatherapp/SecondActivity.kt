package com.inspired.weatherapp

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle : Bundle? =intent.extras
        val msg = bundle!!.getString("user_message")

        val showMessage =findViewById<TextView>(R.id.txvUserMessage)

        if(msg!=null){
            showMessage.text =msg

            Toast.makeText(this , msg,Toast.LENGTH_SHORT).show()
        }
        else {
            showMessage.text ="Did not recive a message"
        }

    }
}