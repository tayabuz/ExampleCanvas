package com.example.examplecanvas.Artifacts

import android.content.Context
import android.graphics.*
import androidx.core.graphics.drawable.RoundedBitmapDrawable
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import androidx.core.graphics.drawable.toBitmap

class RoundedImageArtifact(context: Context, val bitmap: Bitmap, val point: Point, val radius: Float): DrawArtifact(context) {

    constructor(context: Context, resourceID: Int, point: Point,  radius: Float) : this(context, BitmapFactory.decodeResource(context.resources, resourceID), point, radius)

    override fun onDraw(canvas: Canvas) {
        var roundBitmap = RoundedBitmapDrawableFactory.create(context.resources, bitmap)
        roundBitmap.cornerRadius = radius
        extraCanvas.drawBitmap(roundBitmap.toBitmap(), null, Rect(point.x, point.y, width, height), paint)
        super.onDraw(canvas)
    }
}