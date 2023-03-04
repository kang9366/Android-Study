package com.sgkang.androidessential_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycerView = findViewById<RecyclerView>(R.id.recyclerView)
        val item = ArrayList<Data>()

        item.add(Data(getDrawable(R.drawable.image)!!, "ID", "Name"))
        item.add(Data(getDrawable(R.drawable.image)!!, "ID", "Name"))
        item.add(Data(getDrawable(R.drawable.image)!!, "ID", "Name"))
        item.add(Data(getDrawable(R.drawable.image)!!, "ID", "Name"))
        item.add(Data(getDrawable(R.drawable.image)!!, "ID", "Name"))
        item.add(Data(getDrawable(R.drawable.image)!!, "ID", "Name"))
        item.add(Data(getDrawable(R.drawable.image)!!, "ID", "Name"))
        item.add(Data(getDrawable(R.drawable.image)!!, "ID", "Name"))
        item.add(Data(getDrawable(R.drawable.image)!!, "ID", "Name"))
        item.add(Data(getDrawable(R.drawable.image)!!, "ID", "Name"))
        item.add(Data(getDrawable(R.drawable.image)!!, "ID", "Name"))
        item.add(Data(getDrawable(R.drawable.image)!!, "ID", "Name"))
        item.add(Data(getDrawable(R.drawable.image)!!, "ID", "Name"))
        item.add(Data(getDrawable(R.drawable.image)!!, "ID", "Name"))
        item.add(Data(getDrawable(R.drawable.image)!!, "ID", "Name"))
        item.add(Data(getDrawable(R.drawable.image)!!, "ID", "Name"))
        item.add(Data(getDrawable(R.drawable.image)!!, "ID", "Name"))
        item.add(Data(getDrawable(R.drawable.image)!!, "ID", "Name"))

        val adapter = Adapter(item)
        recycerView.adapter = adapter
    }
}