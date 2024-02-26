package com.inspired.weatherapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.inspired.weatherapp.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnShowToast = findViewById<Button>(R.id.btnShowToast)
        val btnToSentText = findViewById<Button>(R.id.btnToSentText)
        val etUserMessage = findViewById<EditText>(R.id.etUserMessage)
        val btmRecyclerViewDemo = findViewById<Button>(R.id.btmRecyclerViewDemo)


        btnShowToast.setOnClickListener(){
            Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT,).show();
        }
        btnToSentText.setOnClickListener(){

            val message :String = etUserMessage.text.toString();
            Toast.makeText(this,message,Toast.LENGTH_SHORT,).show();
            val intent =Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message",message)
            startActivity(intent)
        }
        btmRecyclerViewDemo.setOnClickListener(){
            val intent =Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}