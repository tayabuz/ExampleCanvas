package com.example.examplecanvas

import android.graphics.BitmapFactory
import android.graphics.Color
import android.graphics.Point
import android.graphics.Rect
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.examplecanvas.Artifacts.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fill = FillArtifact(this, Color.GREEN)
        val rect = RectFillArtifact(this, Color.BLACK, Rect(40, 40, 200,  200))
        val roundRect = RoundedRectArtifact(this, Color.RED, 20F, Rect(220, 40, 450,  200))
        //val img = ImageArtifact(this,  BitmapFactory.decodeResource(resources, R.drawable.rubix_cube), Point(0,0))
        val img = ImageArtifact(this, R.drawable.rubix_cube, Point(0,0))
        val imgRound = RoundedImageArtifact(this, R.drawable.sample, Point(0, 250), 100f)
        val art = ArtifactDrawer(arrayOf(fill, rect, roundRect, img, imgRound))
       // var art = ArtifactDrawer()
       // art.AddAll(listOf(fill, rect))



        art.Artifacts.forEach{ (constLayout.addView(it))}

    }
}