package com.example.examplecanvas

import android.graphics.Color
import android.graphics.Rect
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.examplecanvas.Artifacts.ArtifactDrawer
import com.example.examplecanvas.Artifacts.FillArtifact
import com.example.examplecanvas.Artifacts.RectFillArtifact
import com.example.examplecanvas.Artifacts.RoundedRectArtifact


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fill = FillArtifact(this, Color.GREEN)
        val rect = RectFillArtifact(this, Color.BLACK, Rect(40, 40, 200,  200))
        val roundRect = RoundedRectArtifact(this, Color.RED, 20F, Rect(220, 40, 450,  200))
        val art = ArtifactDrawer(arrayOf(fill, rect, roundRect))
       // var art = ArtifactDrawer()
       // art.AddAll(listOf(fill, rect))


        val layout = findViewById<ConstraintLayout>(R.id.layout)
        art.Artifacts.forEach{ (layout.addView(it))}

    }
}