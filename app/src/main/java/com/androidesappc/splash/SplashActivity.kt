package com.androidesappc.splash

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.androidesappc.main.R

class SplashActivity : AppCompatActivity() {

    lateinit var topAnim: Animation
    lateinit var botAnim: Animation
    lateinit var fan: ImageView
    lateinit var games : TextView
    lateinit var sub: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
         games = findViewById(R.id.textViewGames)
         fan = findViewById(R.id.imageView)
        sub = findViewById(R.id.TVsubheading)
        games.typeface = Typeface.createFromAsset(assets, "fonts/earwig.ttf")

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation)

        botAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        loadAnimation ()
    }
    private fun loadAnimation() {
        fan.animation = topAnim
        games.animation = botAnim
        sub.animation = topAnim

    }




}