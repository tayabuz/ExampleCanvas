package com.example.examplecanvas.Artifacts

import android.content.Context
import android.graphics.*
import android.view.View

abstract class DrawArtifact(context: Context) : View(context) {
    protected var paint: Paint = Paint()
}