package com.example.examplecanvas.Artifacts

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF

class RoundedFillArtifact(context: Context, colorForFillArtifact: Int, val radius: Float) : DrawArtifact(context) {

    init
    {
        paint.apply {
            color = colorForFillArtifact
            style = Paint.Style.FILL
        }
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawRoundRect(RectF(0f,0f, canvas.width.toFloat(), canvas.height.toFloat()), radius, radius, paint)
        super.onDraw(canvas)
    }
}