package com.example.examplecanvas.Artifacts

import android.content.Context
import android.graphics.*

class ImageArtifact(private val bitmap: Bitmap, private val rect: RectF) : DrawArtifact() {

    constructor(
        context: Context,
        resourceID: Int,
        rect: RectF
    ) : this(BitmapFactory.decodeResource(context.resources, resourceID), rect)

    override fun onDraw(canvas: Canvas) {
        canvas.drawBitmap(bitmap, null, rect, paint)
    }
}
