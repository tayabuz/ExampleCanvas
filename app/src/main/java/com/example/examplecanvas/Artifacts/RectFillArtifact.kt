package com.example.examplecanvas.Artifacts

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect

class RectFillArtifact(
    context: Context, colorForFillArtifact: Int, val rect: Rect) : DrawArtifact(context) {
    init{
        paint = Paint().apply {
            color = colorForFillArtifact
            style = Paint.Style.FILL
        }
    }
    override fun onDraw(canvas: Canvas) {
        extraCanvas.drawRect(rect, paint)
        super.onDraw(canvas)
    }
}