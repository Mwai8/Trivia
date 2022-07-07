package com.example.trivia.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.trivia.MainActivity
import com.example.trivia.QuestionActivity
import com.example.trivia.R
import com.example.trivia.model.AlphaChar

class AlphaAdapters(var context: Context, var arrayList: ArrayList<AlphaChar>) :
    RecyclerView.Adapter<AlphaAdapters.ItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val itemHolder = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_layout_list_item,parent, false)
 return ItemHolder(itemHolder)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var alphaChar:AlphaChar = arrayList.get(position)

        holder.alphas.text = alphaChar.alphaChar

        holder.alphas.setOnClickListener {
            Toast.makeText(context, alphaChar.alphaChar, Toast.LENGTH_LONG).show()

        }

    }
    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var alphas: TextView = itemView.findViewById<TextView>(R.id.text_view)


    }

    override fun getItemCount(): Int {
      return arrayList.size

    }

}