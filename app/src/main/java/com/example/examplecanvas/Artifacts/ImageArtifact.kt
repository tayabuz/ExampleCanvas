package com.example.examplecanvas.Artifacts

import android.content.Context
import android.graphics.*

class ImageArtifact(context: Context, val bitmap:Bitmap, val point: Point): DrawArtifact(context) {

    constructor(context: Context, resourceID:Int, point: Point) : this(context, BitmapFactory.decodeResource(context.resources, resourceID), point)

    override fun onDraw(canvas: Canvas) {
        extraCanvas.drawBitmap(bitmap,null, Rect(point.x, point.y, width, height), paint)
        super.onDraw(canvas)
    }
}
