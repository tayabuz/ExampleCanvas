package com.example.examplecanvas.Artifacts

import android.content.Context
import android.graphics.*
import android.view.View

abstract class DrawArtifact(context: Context) : View(context) {
    private lateinit var extraBitmap: Bitmap
    protected lateinit var extraCanvas: Canvas
    protected lateinit var paint: Paint

    override fun onDraw(canvas: Canvas) {
        canvas.drawBitmap(extraBitmap, 0f, 0f, null)
        super.onDraw(canvas)
    }
    override fun onSizeChanged(width: Int, height: Int, oldWidth: Int, oldHeight: Int) {
        super.onSizeChanged(width, height, oldWidth, oldHeight)

        if (::extraBitmap.isInitialized) extraBitmap.recycle()
        extraBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        extraCanvas = Canvas(extraBitmap)
    }
}