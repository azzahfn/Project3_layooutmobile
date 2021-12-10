package com.azzahfn.layout3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var photoAdapter: PhotoAdapter
    private var dataList = mutableListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(applicationContext, 2)
        photoAdapter = PhotoAdapter(applicationContext)
        recyclerView.adapter = photoAdapter

        dataList.add(DataModel("Title","Desc",R.drawable.gambar1))
        dataList.add(DataModel("Title","Desc",R.drawable.gambar2))
        dataList.add(DataModel("Title","Desc",R.drawable.gambar3))
        dataList.add(DataModel("Title","Desc",R.drawable.gambar4))
        dataList.add(DataModel("Title","Desc",R.drawable.gambar5))
        dataList.add(DataModel("Title","Desc",R.drawable.gambar6))
        photoAdapter.setDataList(dataList)

    }
}