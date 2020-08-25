package com.example.examplecanvas.Artifacts

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect

class RectFillArtifact(context: Context, colorForFillArtifact: Int, val rect: Rect) : DrawArtifact(context) {

    init
    {
        paint.apply {
            color = colorForFillArtifact
            style = Paint.Style.FILL
        }
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawRect(rect, paint)
        super.onDraw(canvas)
    }
}