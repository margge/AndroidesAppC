package com.androidesappc.main

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivitySplash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_splash)
        val games:TextView = findViewById(R.id.textViewGames)
        games.typeface = Typeface.createFromAsset(assets, "fonts/earwig.ttf")








    }
}