package com.example.examplecanvas.Artifacts

import android.graphics.Canvas
import android.graphics.Paint

abstract class DrawArtifact {
    protected var paint: Paint = Paint()
    abstract fun onDraw(canvas: Canvas)
}