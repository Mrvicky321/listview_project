package com.example.listview_project

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val listView = findViewById<ListView>(R.id.listview)

        val names = arrayOf("Mango","Apple","Cherry","Guava","Grape","Apricot","Avocado","Blueberry","Papaya","Strawberry","Watermelon","Coconut","Fig","Lemon","Pineapple","Custard Apple","Kiwi","Pear","Plum","Blackberry")

        val arrayAdapter : ArrayAdapter<String> =ArrayAdapter (
            this, android.R.layout.simple_list_item_1,names

        )

        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            var i = 0
            Toast.makeText(this,"Item Selected"+ names[i],Toast.LENGTH_LONG)
                .show()
        }
    }
}