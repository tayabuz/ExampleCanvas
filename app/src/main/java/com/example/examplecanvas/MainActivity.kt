package com.example.examplecanvas

import android.graphics.Color
import android.graphics.Rect
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.examplecanvas.Artifacts.ArtifactDrawer
import com.example.examplecanvas.Artifacts.FillArtifact
import com.example.examplecanvas.Artifacts.RectFillArtifact


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fill = FillArtifact(this, Color.GREEN)
        val rect = RectFillArtifact(this, Color.BLACK, Rect(40, 40, 200,  200))
        var art = ArtifactDrawer(arrayOf(fill,rect))
       // var art = ArtifactDrawer()
       // art.AddAll(listOf(fill, rect))


        var layout = findViewById<ConstraintLayout>(R.id.layout)
        art.Artifacts.forEach{ (layout.addView(it))}

    }
}