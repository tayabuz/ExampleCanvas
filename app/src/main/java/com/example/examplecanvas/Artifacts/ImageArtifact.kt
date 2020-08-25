package com.example.examplecanvas.Artifacts

import android.content.Context
import android.graphics.*

class ImageArtifact(val bitmap:Bitmap, val point: Point): DrawArtifact() {

    constructor(context: Context, resourceID: Int, point: Point) : this(BitmapFactory.decodeResource(context.resources, resourceID), point)

    override fun onDraw(canvas: Canvas) {
        canvas.drawBitmap(bitmap, null, Rect(point.x, point.y, canvas.width, canvas.height), paint)
    }
}
