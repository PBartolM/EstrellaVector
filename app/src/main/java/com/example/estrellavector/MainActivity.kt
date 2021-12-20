package com.example.estrellavector

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img_estrella = findViewById(R.id.imageView) as ImageView
//        img_estrella.setImageResource(R.drawable.ic_estrella_24dp)

        img_estrella.setOnClickListener {
                img_estrella.setImageResource(R.drawable.ic_estrella_24dp)
                val cambiar = getDrawable(R.drawable.ad_animaciones) as AnimatedVectorDrawable
                img_estrella.setImageDrawable(cambiar)
                cambiar.start()
            }
    }
}