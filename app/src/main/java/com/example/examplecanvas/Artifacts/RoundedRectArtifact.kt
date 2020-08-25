package com.example.examplecanvas.Artifacts

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.RectF

class RoundedRectArtifact(colorForFillArtifact: Int, val radius: Float, val rect: Rect) : DrawArtifact() {

    init
    {
        paint.apply {
            color = colorForFillArtifact
            style = Paint.Style.FILL
        }
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawRoundRect(RectF(rect), radius, radius, paint)
    }
}