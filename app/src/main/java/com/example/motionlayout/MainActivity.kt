package com.example.motionlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = CustomAdapter(
            arrayOf(
                "Long Long Long Text 1",
                "Long Long Long Text 2",
                "Long Long Long Text 3",
                "Long Long Long Text 4",
                "Long Long Long Text 5",
                "Long Long Long Text 6",
                "Long Long Long Text 7",
                "Long Long Long Text 8",
                "Long Long Long Text 9",
                "Long Long Long Text 10",
                "Long Long Long Text 11",
                "Long Long Long Text 12",
                "Long Long Long Text 13",
                "Long Long Long Text 14",
                "Long Long Long Text 15",
                "Long Long Long Text 16",
            )
        )
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}