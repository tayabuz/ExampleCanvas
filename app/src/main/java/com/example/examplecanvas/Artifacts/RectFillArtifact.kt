package com.example.examplecanvas.Artifacts

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect

class RectFillArtifact(colorForFillArtifact: Int, val rect: Rect) : DrawArtifact() {

    init {
        paint.apply {
            color = colorForFillArtifact
            style = Paint.Style.FILL
        }
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawRect(rect, paint)
    }
}