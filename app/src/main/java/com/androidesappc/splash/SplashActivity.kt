package com.androidesappc.splash

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.widget.TextView
import com.androidesappc.main.R

class SplashActivity : AppCompatActivity() {

    lateinit var topAnim: Animation
    lateinit var bottonAnim: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val games:TextView = findViewById(R.id.textViewGames)
        games.typeface = Typeface.createFromAsset(assets, "fonts/earwig.ttf")








    }
}