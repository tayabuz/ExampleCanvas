package com.example.examplecanvas.Artifacts

import android.graphics.Canvas
import android.graphics.Paint

class FillArtifact(colorForFillArtifact: Int) : DrawArtifact() {

    init {
        paint.apply {
            color = colorForFillArtifact
            style = Paint.Style.FILL
        }
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawPaint(paint)
    }
}