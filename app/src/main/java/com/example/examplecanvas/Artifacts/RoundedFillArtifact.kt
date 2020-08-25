package com.example.examplecanvas.Artifacts

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF

class RoundedFillArtifact(colorForFillArtifact: Int, val radius: Float) : DrawArtifact() {

    init
    {
        paint.apply {
            color = colorForFillArtifact
            style = Paint.Style.FILL
        }
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawRoundRect(RectF(0f,0f, canvas.width.toFloat(), canvas.height.toFloat()), radius, radius, paint)
    }
}