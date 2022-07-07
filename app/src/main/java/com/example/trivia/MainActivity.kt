package com.example.trivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trivia.adapters.AlphaAdapters
import com.example.trivia.model.AlphaChar

class MainActivity : AppCompatActivity() {

    private var recyclerView:RecyclerView ? = null
    private var gridLayoutManager: GridLayoutManager? =null
    private var arrayList:ArrayList<AlphaChar> ? = null
    private var alphaAdapters:AlphaAdapters ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.my_recycler_view)
        gridLayoutManager =
            GridLayoutManager(applicationContext, 2, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList = setDataInList()
        alphaAdapters = AlphaAdapters(applicationContext,arrayList!!)
        recyclerView?.adapter = alphaAdapters


    }

    private fun setDataInList():ArrayList<AlphaChar>{
        var items:ArrayList<AlphaChar> = ArrayList()

        items.add(AlphaChar("Science"))
        items.add(AlphaChar("Entertainment"))
        items.add(AlphaChar("Sports"))
        items.add(AlphaChar("Tech"))
        items.add(AlphaChar("History"))
        items.add(AlphaChar("Religion"))
        return  items


        }



    }
