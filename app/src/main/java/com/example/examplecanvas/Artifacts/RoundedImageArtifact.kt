package com.example.examplecanvas.Artifacts

import android.content.Context
import android.graphics.*
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import androidx.core.graphics.drawable.toBitmap

class RoundedImageArtifact(val context: Context, val bitmap: Bitmap, val point: Point, val radius: Float): DrawArtifact() {

    constructor(context: Context, resourceID: Int, point: Point,  radius: Float) : this(context, BitmapFactory.decodeResource(context.resources, resourceID), point, radius)

    override fun onDraw(canvas: Canvas) {
        var roundBitmap = RoundedBitmapDrawableFactory.create(context.resources, bitmap)
        roundBitmap.cornerRadius = radius
        canvas.drawBitmap(roundBitmap.toBitmap(), null, Rect(point.x, point.y, canvas.width, canvas.height), paint)
    }
}