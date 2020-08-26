package com.example.examplecanvas.Artifacts

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF

class RoundedRectArtifact(
    val colorForFillArtifact: Int,
    val radius: Float,
    val rect: RectF,
    val mStrokeWidth: Float
) :
    DrawArtifact() {

    init {
        paint.apply {
            color = colorForFillArtifact
            style = Paint.Style.FILL
            strokeWidth = mStrokeWidth
        }
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawRoundRect(rect, radius, radius, paint)
    }
}