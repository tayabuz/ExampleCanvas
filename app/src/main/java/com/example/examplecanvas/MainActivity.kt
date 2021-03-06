package com.example.examplecanvas

import android.graphics.*
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.examplecanvas.Artifacts.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fill = FillArtifact(Color.GREEN)
        val rect = RectFillArtifact(Color.BLACK, Rect(40, 40, 200, 200))
        val roundRect = RoundedRectArtifact(Color.RED, 20F, RectF(220f, 40f, 450f, 200f), 10f)
        //val img = ImageArtifact(this,  BitmapFactory.decodeResource(resources, R.drawable.rubix_cube), Point(0,0))
        val img = ImageArtifact(this, R.drawable.rubix_cube, RectF(0f, 0f, 100f, 100f))
        val imgRound = RoundedImageArtifact(this, R.drawable.sample, RectF(0f, 250f, 500f, 500f), 100f)
        val text = StringArtifact(
            Point(150, 50),
            "Hello World!!! Hello World!!! Hello World!!! Hello World!!! Hello World!!! Hello World!!! Hello World!!! Hello World!!!",
            Typeface.create("Arial", Typeface.BOLD),
            Color.GRAY,
            45f
        )
        val roundedFillArtifact = RoundedFillArtifact(Color.LTGRAY, 50f)
        val fittedInRectStringArtifact = FittedInRectStringArtifact(
            Rect(50, 50, 800, 200), "Qwerty!!!",
            Typeface.create("Arial", Typeface.BOLD), Color.BLACK
        )
        val centeredStringArtifact = CenteredStringArtifact(
            Rect(250, 250, 900, 500),
            "Q",
            Typeface.create("Arial", Typeface.BOLD),
            Color.BLACK
        )

        val art = ArtifactDrawer(
            arrayOf(
                fill,
                rect,
                roundRect,
                img,
                imgRound,
                text,
                roundedFillArtifact,
                fittedInRectStringArtifact,
                centeredStringArtifact
            )
        )
        // var art = ArtifactDrawer()
        // art.AddAll(listOf(fill, rect))

        imageview.setImageBitmap(art.drawInBitmap(1500, 1500))
    }


}