package com.charmist.swipetwoway

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.charmist.swipetwoway.model.Header
import com.charmist.swipetwoway.model.ItemType

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rvAndroidVersion: RecyclerView = findViewById(R.id.rvAndroidVersion)
        val adapter = Adapter(true)
        rvAndroidVersion.layoutManager = LinearLayoutManager(this)
        rvAndroidVersion.adapter = adapter
        adapter.setList(genData())
 /*       val callback = TimelineItemTouchHelperCallback(adapter)
        val itemTouchHelper = ItemTouchHelper(callback)
        itemTouchHelper.attachToRecyclerView(rvAndroidVersion)*/
    }

    private fun genData(): MutableList<ItemType> {
        val listItem = mutableListOf<ItemType>()
        listItem.add(Header("ss", Adapter.HEADER))
        listItem.add(Header("ss", Adapter.DEPOSIT))
        listItem.add(Header("ss", Adapter.WITHDRAW))
        listItem.add(Header("ss", Adapter.OWNER))
        listItem.add(Header("ss", Adapter.HEADER))
        listItem.add(Header("ss", Adapter.DEPOSIT))
        listItem.add(Header("ss", Adapter.DEPOSIT))
        listItem.add(Header("ss", Adapter.DEPOSIT))
        listItem.add(Header("ss", Adapter.WITHDRAW))
        listItem.add(Header("ss", Adapter.DEPOSIT))
        listItem.add(Header("ss", Adapter.WITHDRAW))
        listItem.add(Header("ss", Adapter.DEPOSIT))
        listItem.add(Header("ss", Adapter.WITHDRAW))
        listItem.add(Header("ss", Adapter.DEPOSIT))
        listItem.add(Header("ss", Adapter.WITHDRAW))
        listItem.add(Header("ss", Adapter.DEPOSIT))
        listItem.add(Header("ss", Adapter.WITHDRAW))
        listItem.add(Header("ss", Adapter.DEPOSIT))
        listItem.add(Header("ss", Adapter.WITHDRAW))
        listItem.add(Header("ss", Adapter.DEPOSIT))
        listItem.add(Header("ss", Adapter.WITHDRAW))
        listItem.add(Header("ss", Adapter.DEPOSIT))
        listItem.add(Header("ss", Adapter.WITHDRAW))
        listItem.add(Header("ss", Adapter.DEPOSIT))
        listItem.add(Header("ss", Adapter.WITHDRAW))
        listItem.add(Header("ss", Adapter.DEPOSIT))
        listItem.add(Header("ss", Adapter.WITHDRAW))
        listItem.add(Header("ss", Adapter.DEPOSIT))
        listItem.add(Header("ss", Adapter.WITHDRAW))
        return listItem
    }
}