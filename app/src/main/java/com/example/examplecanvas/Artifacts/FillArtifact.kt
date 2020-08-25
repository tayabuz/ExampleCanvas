package com.example.examplecanvas.Artifacts

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint

class FillArtifact(context: Context, colorForFillArtifact: Int) : DrawArtifact(context) {

    init
    {
        paint.apply {
            color = colorForFillArtifact
            style = Paint.Style.FILL
        }
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawPaint(paint)
        super.onDraw(canvas)
    }
}