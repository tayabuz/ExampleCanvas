package com.example.examplecanvas

import android.graphics.Color
import android.graphics.Point
import android.graphics.Rect
import android.graphics.Typeface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
        val text = StringArtifact(this,
            Point(150,50),"Hello World!!! Hello World!!! Hello World!!! Hello World!!! Hello World!!! Hello World!!! Hello World!!! Hello World!!!", Typeface.create("Arial",Typeface.BOLD), Color.GRAY, 45f)
        val roundedFillArtifact = RoundedFillArtifact(this, Color.LTGRAY, 50f)
        val fittedInRectStringArtifact = FittedInRectStringArtifact(this,
            Rect(50,50, 800, 200),"Qwerty!!!", Typeface.create("Arial", Typeface.BOLD), Color.BLACK)
        val centeredStringArtifact =  CenteredStringArtifact(this,
        Rect(250,250, 900, 500),"Q", Typeface.create("Arial", Typeface.BOLD), Color.BLACK)

        val art = ArtifactDrawer(arrayOf(fill, rect, roundRect, img, imgRound, text, roundedFillArtifact, fittedInRectStringArtifact, centeredStringArtifact))
       // var art = ArtifactDrawer()
       // art.AddAll(listOf(fill, rect))


        art.Artifacts.forEach{ (constLayout.addView(it))}
    }
}