package com.example.examplecanvas.Artifacts

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.RectF

class RoundedRectArtifact(context: Context, colorForFillArtifact: Int, val radius: Float, val rect: Rect) : DrawArtifact(context) {

    init
    {
        paint.apply {
            color = colorForFillArtifact
            style = Paint.Style.FILL
        }
    }
    override fun onDraw(canvas: Canvas) {
        extraCanvas.drawRoundRect(RectF(rect), radius, radius, paint)
        super.onDraw(canvas)
    }
}