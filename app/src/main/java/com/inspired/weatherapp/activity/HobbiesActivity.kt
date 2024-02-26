package com.inspired.weatherapp.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.inspired.weatherapp.adapters.HobbiesAdapter
import com.inspired.weatherapp.R
import com.inspired.weatherapp.Supplier

class HobbiesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        val recyclerView =findViewById<RecyclerView>(R.id.recyclerViewList)

        val layoutManager =LinearLayoutManager(this)
        layoutManager.orientation =LinearLayoutManager.VERTICAL
        recyclerView.layoutManager =layoutManager

        val adapter= HobbiesAdapter(this, Supplier.hobbies)
        recyclerView.adapter = adapter
    }
}