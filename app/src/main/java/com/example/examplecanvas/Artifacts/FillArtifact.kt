package com.example.examplecanvas.Artifacts

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint

class FillArtifact(context: Context, colorForFillArtifact: Int) : DrawArtifact(context) {
    init {
        paint = Paint().apply {
            color = colorForFillArtifact
            style = Paint.Style.FILL
        }
    }
    override fun onDraw(canvas: Canvas) {
        extraCanvas.drawPaint(paint)
        super.onDraw(canvas)
    }
}