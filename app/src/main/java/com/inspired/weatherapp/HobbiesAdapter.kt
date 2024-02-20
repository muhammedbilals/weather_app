package com.inspired.weatherapp

import android.content.Context
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class HobbiesAdapter(val context: Context,val hobby: List<Hobby>) : RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val txvTitle = itemView.findViewById<TextView>(R.id.txvTitle)


        fun setData(hobby: Hobby?,position: Int){
            txvTitle.text = hobby?.title?.let { Editable.Factory.getInstance().newEditable(it) }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
      val view= LayoutInflater.from(this.context).inflate(R.layout.list_item,parent,false)
        return  MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val hobby =hobby[position]
        holder.setData(hobby,position)
    }

    override fun getItemCount(): Int {
       return  hobby.size;
    }
}